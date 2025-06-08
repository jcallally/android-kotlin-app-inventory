<!--Título-->
<!--# Negocio Pro - Administración Integral de Negocios-->
<h1 align="center">Negocio Pro - Administración Integral de Negocios</h1>

<!--Banner-->
<img src="https://i.imgur.com/XyXtTng.gif">

## Descripción

>[!NOTE]
> Negocio Pro es una aplicación Android desarrollada en Kotlin para la gestión completa de un negocio. Permite registrar ventas, productos, clientes, gastos y usuarios, visualizar reportes financieros con gráficos estadísticos y respaldar/restaurar la base de datos. Incluye funcionalidades como autenticación, escaneo de códigos de barras, carga de imágenes, búsqueda dinámica, alertas y navegación entre módulos. Está diseñada con una interfaz intuitiva basada en RecyclerView, CardView, SearchView, FloatingActionButton y gráficos de MPAndroidChart.

## Capturas de Pantalla

>[!NOTE]
> A continuación, se muestran algunas capturas representativas de las funcionalidades principales de la aplicación.
> <br>
>
>### Inicio
>
>| Splash | Login | Registro | Recuperar contraseña |
>|--------|-------|----------|----------------------|
> | <img src="https://imgur.com/mDwrinD.jpg" alt="Splash" width="170px"> | <img src="https://imgur.com/LsvuKOk.jpg" alt="Login" width="170px"> | <img src="https://imgur.com/C47jOLa.jpg" alt="Registro" width="170px"> | <img src="https://imgur.com/gNUCTjC.jpg" alt="Recuperar contraseña" width="170px"> |
>
>### Dashboard y Configuración
>
>| Dashboard | Configuración | Respaldar BD | Restaurar BD |
>|-----------|---------------|--------------|--------------|
> | <img src="https://imgur.com/5eVQeZT.jpg" alt="Dashboard" width="170px"> | <img src="https://imgur.com/UEy9eKm.jpg" alt="Configuración" width="170px"> | <img src="https://imgur.com/LEcMwwe.jpg" alt="Respaldar BD" width="170px"> | <img src="https://imgur.com/qSEiI7k.jpg" alt="Restaurar BD" width="170px"> |
>
>### Ventas
>
>| Lista de Ventas | Agregar Producto | Elegir comprobante | Comprobante |
>|-----------------|------------------|--------------------|-------------|
> | <img src="https://imgur.com/ZlbkkrN.jpg" alt="Lista de Ventas" width="170px"> | <img src="https://imgur.com/Yi2z452.jpg" alt="Agregar Producto" width="170px"> | <img src="https://imgur.com/BsfWAhh.jpg" alt="Lista de Ventas" width="170px"> | <img src="https://imgur.com/woKPaiD.jpg" alt="Comprobante" width="170px"> |
>
>### Productos
>
>| Registrar Categoría | Registrar Producto | Lista Productos | Editar Producto |
>|---------------------|--------------------|-----------------|-----------------|
> | <img src="https://imgur.com/RREneYN.jpg" alt="Registrar Categoría" width="170px"> | <img src="https://imgur.com/ZeHwOZx.jpg" alt="Registrar Producto" width="170px"> | <img src="https://imgur.com/UjG6IkK.jpg" alt="Lista Productos" width="170px"> | <img src="https://imgur.com/t0ZqI2E.jpg" alt="Editar Producto" width="170px"> |
>
>### Clientes y Usuarios
>
>| Clientes | Actualizar Cliente | Usuarios | Crear Usuario |
>|----------|--------------------|----------|---------------|
> | <img src="https://imgur.com/78r78Fh.jpg" alt="Clientes" width="170px"> | <img src="https://imgur.com/6XDHe9Q.jpg" alt="Actualizar Cliente" width="170px"> | <img src="https://imgur.com/tuudlKu.jpg" alt="Usuarios" width="170px"> | <img src="https://imgur.com/RMNoKvT.jpg" alt="Crear Usuario" width="170px"> |
>
>### Finanzas y Reportes
>
>| Ganancias | Gastos por Producto | Resumen Financiero |Reporte Financiero |
>|-----------|---------------------|--------------------|-------------------|
> | <img src="https://imgur.com/jMz9PeS.jpg" alt="Ganancias" width="170px"> | <img src="https://imgur.com/9rQnABH.jpg" alt="Gastos por Producto" width="170px"> | <img src="https://imgur.com/7dnI8dy.jpg" alt="Resumen Financiero" width="170px"> | <img src="https://imgur.com/ylhzdtr.jpg" alt="Reporte Financiero" width="170px"> |
>
>### Negocio
>
>| Actualizar Negocio |
>|--------------------|
> | <img src="https://imgur.com/HGWSKt9.jpg" alt="Actualizar Negocio" width="170px"> |

## Características

>[!NOTE]
> - Gestión de ventas con comprobantes (creación, impresión, envío y firma digital).
> - Administración de productos y categorías con imágenes.
> - Registro y edición de clientes y usuarios con fotos.
> - Reportes financieros detallados (día, mes, año) con gráficos.
> - Visualización y control de gastos e ingresos por producto.
> - Navegación estructurada por módulos desde el dashboard.
> - Respaldo y restauración de base de datos desde la app.
> - SharedPreferences para almacenamiento local seguro.
> - Búsquedas rápidas con SearchView y filtros avanzados.
> - AlertDialogs, PopupMenus y componentes táctiles interactivos.

## Tecnologías Utilizadas

>[!NOTE]
> - Kotlin
> - Android SDK
> - Bibliotecas:
>   - Gson (serialización de datos)
>   - Glide (carga de imágenes)
>   - MPAndroidChart (gráficos estadísticos)
>   - ZXing (escaneo/generación de códigos QR y barras)
>   - SignaturePad (firma digital)
>   - ImagePicker (galería y cámara)
>   - BCrypt (cifrado de contraseñas)
>   - CircleImageView, ViewPager2, SplashScreen, entre otras.

## Instalación

>[!TIP]
> Para descargar y configurar el proyecto en tu entorno local:
>
> 1. Clona este repositorio en tu máquina.
> 2. Abre el proyecto en Android Studio.
> 3. Verifica y sincroniza las dependencias de Gradle.
> 4. Compila y ejecuta el proyecto en un emulador o dispositivo Android.

## Uso

>[!TIP]
> Una vez instalada la app:
>
> 1. Regístrate e inicia sesión con tu cuenta.
> 2. Navega por los módulos desde el dashboard.
> 3. Registra productos, ventas, gastos o clientes.
> 4. Genera, comparte o imprime comprobantes de venta desde la app.
> 5. Accede a reportes financieros gráficos y detallados.
> 6. Usa el menú de configuración para respaldar o restaurar la base de datos.

## Gradle

>[!TIP]
> Asegúrate de incluir las siguientes dependencias en tu archivo `build.gradle`:
>
> ```gradle
> dependencies {
>     implementation 'com.google.code.gson:gson:2.10'
>     implementation 'com.github.PhilJay:MPAndroidChart:v3.1.0'
>     implementation 'com.github.bumptech.glide:glide:4.16.0'
>     implementation 'com.github.dhaval2404:imagepicker:2.1'
>     implementation 'com.github.gcacace:signature-pad:1.3.1'
>     implementation 'com.journeyapps:zxing-android-embedded:4.3.0'
>     implementation 'org.mindrot:jbcrypt:0.4'
>     implementation 'de.hdodenhof:circleimageview:3.1.0'
>     implementation 'androidx.viewpager2:viewpager2:1.1.0'
>     implementation 'androidx.core:core-splashscreen:1.0.1'
>     // ... otras necesarias según tu implementación
> }
> ```

## Contribución

>[!NOTE]
> ¡Gracias por interesarte en contribuir! Para colaborar:
>
> 1. Crea un "Issue" si encuentras errores o tienes sugerencias.
> 2. Realiza cambios en una rama separada.
> 3. Envía una Pull Request para revisión.

## Licencia

>[!IMPORTANT]
> Este proyecto se encuentra bajo la Licencia Apache 2.0.
> Consulta el archivo [LICENSE](https://github.com/jcallally/android-kotlin-app-inventory-sharedpreferences/blob/main/LICENSE) para más detalles.
>
> ```
>    Copyright (c) 2025 Javier Callally
>    
>    Licensed under the Apache License, Version 2.0 (the "License");
>    you may not use this file except in compliance with the License.
>    You may obtain a copy of the License at
>    
>    http://www.apache.org/licenses/LICENSE-2.0
>    
>    Unless required by applicable law or agreed to in writing, software
>    distributed under the License is distributed on an "AS IS" BASIS,
>    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
>    See the License for the specific language governing permissions and
>    limitations under the License.
> ```

## Versión Completa

>[!IMPORTANT]
> Esta es una versión incompleta del proyecto **Negocio Pro**, publicada únicamente con fines informativos y de demostración.  
>
> La versión completa incluye todas las funcionalidades activadas, soporte técnico y futuras actualizaciones. Está disponible solo para clientes registrados que hayan adquirido la aplicación.  
>
> 📩 Si deseas obtener la versión completa, por favor contacta directamente con el autor. 

## Contacto

>[!IMPORTANT]
> Si tienes preguntas o deseas más información:
>
> - Nombre: Javier Callally
> - Correo Electrónico: jcallally@gmail.com
