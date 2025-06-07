plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.inventariostock"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.inventariostock"
        minSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // BCrypt para almacenar la contraseña cifrada
    implementation ("org.mindrot:jbcrypt:0.4")

    // SplashScreen
    implementation("androidx.core:core-splashscreen:1.0.1")

    // viewPager2
    implementation("androidx.viewpager2:viewpager2:1.1.0")

    // Convierte objetos Java en su representación Json y viceversa
    //implementation("com.google.code.gson:gson:2.8.6")
    implementation("com.google.code.gson:gson:2.10")

    //ProgressDialog https://github.com/techinessoverloaded/progress-dialog
    implementation("com.github.techinessoverloaded:progress-dialog:1.5.1")

    // Crear imágenes circulares con "CircleImageView"
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("androidx.activity:activity:1.9.0")

    // “ImagePicker” para seleccionar una imagen de la galería o tomar una foto con la cámara.
    implementation("com.github.dhaval2404:imagepicker:2.1")

    // "Glide" para cargar imágenes
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    // "SignaturePad" para dibujar firma en un pad
    implementation("com.github.gcacace:signature-pad:1.3.1")

    // "MPAndroidChart" para crear gráficos estadísticos
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")

    // "ZXing" para crear lector de código de barras
    implementation ("com.journeyapps:zxing-android-embedded:4.3.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}