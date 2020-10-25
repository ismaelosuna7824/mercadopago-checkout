/**
 */
package com.hbaigorria;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import com.mercadopago.core.MercadoPagoCheckout;
import com.mercadopago.preferences.CheckoutPreference;

import java.util.Date;

public class Mercadopago extends CordovaPlugin {
  private static final String TAG = "Mercadopago";
  private String key;
  private String preference;

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Inicializando Mercadopago");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("pagar")){
      preference = args.getString(0);
      key = args.getString(1);
      CheckoutPreference checkoutPreference = new CheckoutPreference(preference);
      startMercadoPagoCheckout(checkoutPreference);
    }
    return true;
  }

  private void startMercadoPagoCheckout(CheckoutPreference checkoutPreference) {
    new MercadoPagoCheckout.Builder()
            .setActivity(this.cordova.getActivity())
            .setPublicKey(key)
            .setCheckoutPreference(checkoutPreference)
            .startForPayment();
  }


}
