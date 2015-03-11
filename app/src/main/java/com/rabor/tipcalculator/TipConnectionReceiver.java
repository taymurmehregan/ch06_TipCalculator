package com.rabor.tipcalculator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;


public class TipConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Tip Calculator", "Connectivity Changed");

        ConnectivityManager connectManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = connectManager.getActiveNetworkInfo();

        Intent service = new Intent(context, TipCalculatorActivity.class);

        if(netInfo != null && netInfo.isConnected()){
            Log.d("Tip Calculator", "Connected");
            context.startService(service);
        }
        else{
            Log.d("Tip Calculator", "Not Connected");
            context.startService(service);
        }

    }
}
