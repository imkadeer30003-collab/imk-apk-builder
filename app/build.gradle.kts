
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

        val websiteUrl = (project.findProperty("websiteUrl") as String?)
            ?: "https://www.imkoriginal.in"

        buildConfigField(
            "String",
            "DEFAULT_WEBSITE_URL",
            "\"${websiteUrl.replace("\"", "\\\"")}\""
        )
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        buildConfig = true
    }
}
