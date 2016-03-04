package edu.macalester.comp255.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import net.sf.supercollider.android.SCAudio;
import net.sf.supercollider.android.ScService;

public class SuperCollider extends CordovaPlugin {
    public static final String dllDirStr = "libs";
    SCAudio superCollider;

    protected void pluginInitialize() {
        superCollider = new SCAudio(dllDirStr);
        superCollider.start();
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
        return true;
    }
}
