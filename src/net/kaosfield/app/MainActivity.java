package net.kaosfield.app;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.d("kaosf-app", "onCreate, savedInstanceState: " + savedInstanceState);
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
      setContentView(R.layout.activity_main);
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
