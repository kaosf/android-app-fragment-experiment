package net.kaosfield.app;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ActionBar actionBar = getActionBar();
    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

    ActionBar.TabListener tabListener = new ActionBar.TabListener() {
      public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // show the given tab
        Log.d("kaosfield", "onTabSelected");
      }

      public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // hide the given tab
        Log.d("kaosfield", "onTabUnselected");
      }

      public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // probably ignore this event
        Log.d("kaosfield", "onTabReselected");
      }
    };

    // Add 3 tabs, specifying the tab's text and TabListener
    for (int i = 0; i < 3; i++) {
      actionBar.addTab(
        actionBar.newTab()
          .setText("Tab " + (i + 1))
          .setTabListener(tabListener)
      );
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
