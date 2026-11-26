plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.android.compat"
    compileSdk = 36

    defaultConfig {
        minSdk = 36
    }

    buildFeatures {
        compose = true
        aidl = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // Compile-time-only AOSP framework (hidden APIs). Downloaded by CI / local setup.
    compileOnly(files("${projectDir.parentFile}/libs/android-all.jar"))

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("androidx.preference:preference-ktx:1.2.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.10.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.10.0")
    implementation("androidx.compose.runtime:runtime:1.10.0")
    implementation("androidx.compose.ui:ui:1.10.0")
    implementation("androidx.compose.animation:animation:1.10.0")
    implementation("com.google.android.material:material:1.13.0")
}
