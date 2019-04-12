package com.fesiacindy99.sharedpreferences.Fragment;


import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.fesiacindy99.sharedpreferences.R;

public class SettingFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }

}
