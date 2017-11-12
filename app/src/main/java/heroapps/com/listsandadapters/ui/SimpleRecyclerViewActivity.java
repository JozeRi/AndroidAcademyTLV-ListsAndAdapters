package heroapps.com.listsandadapters.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import heroapps.com.listsandadapters.R;
import heroapps.com.listsandadapters.adapters.FriendsRecyclerViewAdapter;
import heroapps.com.listsandadapters.model.Friend;

public class SimpleRecyclerViewActivity extends AppCompatActivity {

  private RecyclerView mRecyclerView;
  private RecyclerView.Adapter mAdapter;
  private RecyclerView.LayoutManager mLayoutManager;

  private ArrayList<Friend> mFriends;

  public static Intent getIntent(Context context) {
    return new Intent(context, SimpleRecyclerViewActivity.class);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_recycler_view);
    initRecyclerView();
  }

  private void initRecyclerView() {
    mFriends = Friend.generateDummyFriendList();

    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    mLayoutManager = new LinearLayoutManager(this);
    mRecyclerView.setLayoutManager(mLayoutManager);
    mAdapter = new FriendsRecyclerViewAdapter(this, mFriends);
    mRecyclerView.setAdapter(mAdapter);
  }
}
