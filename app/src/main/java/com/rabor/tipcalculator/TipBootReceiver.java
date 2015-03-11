package com.rabor.tipcalculator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TipBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Tip Calculator", "Boot Complete");

        Intent service = new Intent(context, TipCalculatorActivity.class);
        context.startService(service);
    }
}
