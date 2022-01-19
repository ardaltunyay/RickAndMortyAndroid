plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = Configs.compileSdk

    defaultConfig {
        minSdk = Configs.minSdk
        targetSdk = Configs.targetSdk

        testInstrumentationRunner = Configs.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName(BuildTypes.DEBUG) {

        }
        getByName(BuildTypes.RELEASE) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeVersion
    }

}

dependencies {
    api(Dependencies.coreKtx)
    api(Dependencies.appCompat)
    api(Dependencies.material)
    api(Dependencies.composeUi)
    api(Dependencies.composeMaterial)
    api(Dependencies.composeUiToolingPreview)
    api(Dependencies.lifecycleRuntimeKtx)
    api(Dependencies.activityCompose)
    testApi(Dependencies.jUnit)
    androidTestApi(Dependencies.jUnitExt)
    androidTestApi(Dependencies.espressoCore)
    androidTestApi(Dependencies.composeUiJUnit)
    debugApi(Dependencies.composeUiTooling)

}