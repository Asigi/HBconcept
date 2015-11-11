package io.arsh.hbconcept;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {




    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActionBar().hide();

        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(TheColorUtil.getMainColor());

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //check SQLite for whether or not there is pre-loaded data. 
        //if not, then call loadPreData(); 




    }

    //private void loadPreData() {
    //  put a ton of stuff into SQLite


}
