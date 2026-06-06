package com.del_sudo.gamecloner;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CloneAdminReceiver extends DeviceAdminReceiver {
    @Override
    public void onProfileProvisioningComplete(Context context, Intent intent) {
        Toast.makeText(context, "Clone Profile Environment Ready!", Toast.LENGTH_SHORT).show();
    }
}
