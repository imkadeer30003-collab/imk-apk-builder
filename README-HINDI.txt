IMK APK BUILDER — FREE STARTER (PHASE 1)

Is package mein GitHub Actions par Android WebView APK build karne ka starter project hai.
Cloudflare Worker abhi deploy/connected nahi hai. Pehle ek test APK build karna hai.

MOBILE SE SETUP:
1. github.com par sign in karke New repository banayein: imk-apk-builder
2. Repository ko Public rakhein agar GitHub-hosted Actions ko free mein chalana hai.
   Public repo mein source code sabko dikhega. Koi password, API key, private URL ya secret file commit na karein.
3. Is ZIP ke andar ke saare folders/files repository ke root mein upload karein.
4. GitHub repo > Actions tab > "Build Website APK" workflow > Run workflow.
5. Build complete hone par workflow run kholein > Artifacts > imk-debug-apk download karein.
6. ZIP extract karke app-debug.apk milega. Ye TEST/debug APK hai, Play Store release APK nahi.

BUILD WEBSITE URL:
app/build.gradle.kts mein buildConfigField ke andar DEFAULT_WEBSITE_URL badlein.
Har naye URL ke liye abhi isi line ko badal kar commit karein. User-facing dynamic builder aur Cloudflare API next phase mein jodenge.

IMPORTANT:
- Ye starter APK WebView wrapper hai, universal converter nahi. Login, payment, downloads, camera, notifications aur kuch websites ke liye extra native integration chahiye.
- Permissions jaan-boojhkar minimum rakhe gaye hain (Internet only). Camera/location/microphone bina zarurat enable na karein.
- AdMob abhi wired nahi hai. AdMob App ID/ad unit IDs aur SDK integration next phase mein add honge; demo ads ya fake ad slots nahi hain.
- APK signing key is starter mein nahi hai. Debug APK ko public release ke liye use na karein.
- GitHub Actions free usage ki limits/conditions account aur repo visibility par depend karti hain; usage limit hit ho to build ruk sakta hai.
