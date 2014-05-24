cordova-admob-plugin
====================

Admob plugin for Cordova, using Google Play Framework

Installing Google Play Services
-------------------------------
1. Copy `google-play-services_lib` from SDK to `platform/android`
2. Update library in `platform/android/google-play-services_lib`
> `android update project -s -t <target> -p .`
3. Add Play Services library to the project in `platform/android`
> `android update project -s -t <target> -p . -l google-play-services_lib`
4. Add the below line to `platform/android/AndroidManifest.xml` within `<application>` tag
> `<meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />`

Installing Plugin
-----------------
> `cordova plugin add https://github.com/abdulmueid/cordova-admob-plugin`

Using Plugin
------------

1. Initialize the plugin on `deviceready` event. Replace `publisher_ID` with your publisher ID.
> `Admob.initAd(publisher_ID);`
2. Show Ad by calling
> `Admob.showAd()`
3. Hide Ad by calling
> `Admob.hideAd()`