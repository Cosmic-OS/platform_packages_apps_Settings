/*
 * Copyright (C) 2017-2019 Cosmic-OS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;

import androidx.preference.PreferenceScreen;

import com.android.settings.R;
import com.android.settingslib.core.AbstractPreferenceController;
import com.android.settingslib.widget.LayoutPreference;

public class CosmicHeaderPreferenceController extends AbstractPreferenceController {

    private static final String KEY_COSMIC_HEADER = "cosmic_header";

    public CosmicHeaderPreferenceController(Context context) {
        super(context);
    }

    @Override
    public void displayPreference(PreferenceScreen screen) {
        super.displayPreference(screen);
        final LayoutPreference cosmicHeaderPreference = screen.findPreference(KEY_COSMIC_HEADER);
        final TextView version = (TextView) cosmicHeaderPreference.findViewById(R.id.version);
        final TextView versionCode = (TextView) cosmicHeaderPreference.findViewById(R.id.version_code);
        version.setText(Build.COSMIC.VERSION);
        versionCode.setText(Build.COSMIC.VERSION_CODE);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public String getPreferenceKey() {
        return KEY_COSMIC_HEADER;
    }

}
