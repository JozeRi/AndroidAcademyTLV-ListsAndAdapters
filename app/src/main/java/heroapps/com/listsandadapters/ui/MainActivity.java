package heroapps.com.listsandadapters.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import heroapps.com.listsandadapters.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.simple_listview_btn).setOnClickListener(this);
    findViewById(R.id.simple_listview_viewholder_btn).setOnClickListener(this);
    findViewById(R.id.simple_grid_view_btn).setOnClickListener(this);
    findViewById(R.id.simple_recyclerview_btn).setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.simple_listview_btn:
        startActivity(SimpleListViewActivity.getIntent(MainActivity.this));
        break;
      case R.id.simple_listview_viewholder_btn:
        startActivity(SimpleListViewVHActivity.getIntent(MainActivity.this));
        break;
      case R.id.simple_grid_view_btn:
        startActivity(SimpleGridViewActivity.getIntent(MainActivity.this));
        break;
      case R.id.simple_recyclerview_btn:
        startActivity(SimpleRecyclerViewActivity.getIntent(MainActivity.this));
        break;
    }
  }
}
