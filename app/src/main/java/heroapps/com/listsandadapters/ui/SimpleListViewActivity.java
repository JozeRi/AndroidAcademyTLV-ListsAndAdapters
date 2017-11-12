package heroapps.com.listsandadapters.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import heroapps.com.listsandadapters.R;
import heroapps.com.listsandadapters.adapters.FriendsBaseAdapter;
import heroapps.com.listsandadapters.model.Friend;

public class SimpleListViewActivity extends AppCompatActivity {

  private ArrayList<Friend> mFriends;

  private ListView mListView;
  private FriendsBaseAdapter mAdapter;

  public static Intent getIntent(Context context) {
    return new Intent(context, SimpleListViewActivity.class);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_list_view);

    mListView = (ListView) findViewById(R.id.listview);

    loadData();
  }

  private void loadData() {
    mFriends = Friend.generateDummyFriendList();
    mAdapter = new FriendsBaseAdapter(this, mFriends);
    mListView.setAdapter(mAdapter);
  }

}
