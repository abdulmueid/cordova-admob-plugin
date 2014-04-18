package com.google.admob;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import android.widget.LinearLayout;


/**
 * This class echoes a string called from JavaScript.
 */
public class Admob extends CordovaPlugin {

	private AdView adView;
	private AdRequest request;
	private LinearLayout layout;
	private String adID;
	
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		
		// AdView
		adView = new AdView(cordova.getActivity().getApplicationContext());
		request = new AdRequest.Builder().build();
		layout = (LinearLayout) webView.getParent();
		adView.setAdSize(AdSize.SMART_BANNER);
		layout.addView(adView);
	}
	
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("initAd")) {
			adID = args.getString(0);
			this.initAd();
		}
		if (action.equals("showAd")) {
			this.showAd();
			return true;
		}
		if (action.equals("hideAd")) {
			this.hideAd();
			return true;
		}
		return false;
	}
	
	public void initAd() {
		cordova.getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				adView.setAdUnitId(adID);
				adView.loadAd(request);
			}
		});
	}

	private void showAd() {
		cordova.getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				adView.setVisibility(AdView.VISIBLE);
			}
		});
	}
	
	private void hideAd() {
		cordova.getActivity().runOnUiThread(new Runnable() {
			@Override
			public void run() {
				adView.setVisibility(AdView.GONE);
			}
		});
	}
}