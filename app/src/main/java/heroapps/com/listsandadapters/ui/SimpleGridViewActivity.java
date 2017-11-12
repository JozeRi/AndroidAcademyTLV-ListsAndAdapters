package heroapps.com.listsandadapters.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import heroapps.com.listsandadapters.R;
import heroapps.com.listsandadapters.adapters.FriendsBaseAdapterWithVH;
import heroapps.com.listsandadapters.model.Friend;

public class SimpleGridViewActivity extends AppCompatActivity {

  private ArrayList<Friend> mFriends;

  private GridView mGridView;
  private FriendsBaseAdapterWithVH mAdapter;

  public static Intent getIntent(Context context) {
    return new Intent(context, SimpleGridViewActivity.class);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_grid_view);

    mGridView = (GridView) findViewById(R.id.grid_view);

    loadData();
  }

  private void loadData() {
    mFriends = Friend.generateDummyFriendList();
    mAdapter = new FriendsBaseAdapterWithVH(this, mFriends, true);
    mGridView.setAdapter(mAdapter);
  }
}
