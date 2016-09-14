package com.android.settings.cosmic;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.Utils;

public class SubstratumLaunch extends SettingsPreferenceFragment {

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.APPLICATION;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        PackageManager pm = getActivity().getPackageManager();
        i = pm.getLaunchIntentForPackage("projekt.substratum");
        i.addCategory(Intent.CATEGORY_LAUNCHER);
        startActivity(i);
        finish();
    }
}
