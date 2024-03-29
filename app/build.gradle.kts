plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.daybuddyai"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.daybuddyai"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.airbnb.android:lottie:3.7.0")

    implementation ("com.aallam.openai:openai-client:3.0.0")
    implementation ("io.ktor:ktor-client-android:2.2.4")

    implementation ("com.squareup.okhttp3:okhttp:4.9.0")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    //recycle view
    implementation ("androidx.recyclerview:recyclerview:1.3.0")
    //splashscreen
    implementation ("androidx.core:core-splashscreen:1.1.0-alpha02")

}