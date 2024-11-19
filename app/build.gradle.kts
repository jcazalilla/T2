plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "moreno.cazalilla.jesusmaria.t2"
    compileSdk = 34

    defaultConfig {
        applicationId = "moreno.cazalilla.jesusmaria.t2"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures  {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(libs.core.splashscreen)
    implementation(libs.recyclerview)
    implementation(libs.cardview)
    implementation (libs.navigation.fragment.ktx)
    implementation (libs.navigation.ui.ktx)

    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.preference)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


}