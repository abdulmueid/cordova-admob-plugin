var Admob = {
	initAd : function(adUnitID) {
		cordova.exec(null, null, "Admob", "initAd", [adUnitID]);
	},
	showAd : function() {
		cordova.exec(null, null, "Admob", "showAd", []);
	},
	hideAd : function() {
		cordova.exec(null, null, "Admob", "hideAd", []);
	}
}
module.exports = Admob;