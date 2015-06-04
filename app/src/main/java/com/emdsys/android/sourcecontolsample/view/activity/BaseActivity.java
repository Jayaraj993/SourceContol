package com.emdsys.android.sourcecontolsample.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.emdsys.android.sourcecontolsample.R;

/**
 * Created by EMD029 on 6/4/2015.
 */
public class BaseActivity extends AppCompatActivity {

    protected Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createCustomBar();
    }

    /**
     * Purpose of this method is to create the toolbar and set this toolbar like as a action bar
     **/
    private void createCustomBar() {
        mToolbar = (Toolbar) findViewById(R.id.activity_custom_action_bar_view);
        if (mToolbar != null) {
            mToolbar.setTitle(getString(R.string.app_name));
            setSupportActionBar(mToolbar);
        }
    }
}
