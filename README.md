cordova-admob-plugin
====================

Admob plugin for Cordova, using Google Play Framework

Installing Google Play Services
-------------------------------
- Copy `google-play-services_lib` from SDK to `platform/android`

- Update library in `platform/android/google-play-services_lib`

> `android update project -s -t <target> -p .`

- Add Play Services library to the project in `platform/android`

> `android update project -s -t <target> -p . -l google-play-services_lib`

- Add the below line to `platform/android/AndroidManifest.xml` within `<application>` tag

> `<meta-data android:name="com.google.android.gms.version" android:value="@integer/google_play_services_version" />`

Installing Plugin
-----------------
> `cordova plugin add https://github.com/abdulmueid/cordova-admob-plugin`

Using Plugin
------------

- Initialize the plugin on `deviceready` event. Replace `publisher_ID` with your publisher ID.

> `Admob.initAd(publisher_ID);`

- Show Ad by calling

> `Admob.showAd()`

- Hide Ad by calling

> `Admob.hideAd()`