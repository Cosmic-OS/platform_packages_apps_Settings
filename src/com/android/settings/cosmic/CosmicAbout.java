package com.android.settings.cosmic;

import android.content.Context;
import android.os.Bundle;

import com.android.internal.logging.MetricsProto.MetricsEvent;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class CosmicAbout extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.cosmic_about_info);
	getActivity().getActionBar().setTitle("About Cosmic-OS");
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.GALAXY;
    }
}
