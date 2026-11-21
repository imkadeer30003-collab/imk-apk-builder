plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "in.imk.websiteapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "in.imk.websiteapp"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        buildConfigField(
            "String",
            "DEFAULT_WEBSITE_URL",
            "\"https://example.com\""
        )
    }

    buildFeatures {
        buildConfig = true
    }
}
