package sdn.trafficoffloadingapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by nhm on 2016-03-30.
 */
public class TouchReveiver extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("touch_event_has_occured"))
        {
            Log.d("Touch", "Touch at receiver");
        }
    }

}