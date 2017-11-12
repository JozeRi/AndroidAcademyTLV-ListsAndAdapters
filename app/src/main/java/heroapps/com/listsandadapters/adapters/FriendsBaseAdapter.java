package heroapps.com.listsandadapters.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import heroapps.com.listsandadapters.R;
import heroapps.com.listsandadapters.model.Friend;

/**
 * Created by Refael Ozeri on 12/11/2017.
 */
public class FriendsBaseAdapter extends BaseAdapter {

  private Context mContext;
  private LayoutInflater mInflater;
  private ArrayList<Friend> mFriends;

  public FriendsBaseAdapter(Context context, ArrayList<Friend> friends) {
    mContext = context;
    mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    mFriends = friends;
  }

  @Override
  public int getCount() {
    return mFriends.size();
  }

  @Override
  public Friend getItem(int position) {
    return mFriends.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    // Inflate our row and find our views!
    View rowItem = mInflater.inflate(R.layout.li_friend, parent, false);
    ImageView img = rowItem.findViewById(R.id.li_friend_img);
    TextView name = rowItem.findViewById(R.id.li_name_tv);
    ImageView vader = rowItem.findViewById(R.id.li_starwars_img);

    // Getting the data for this specific row!
    Friend friend = getItem(position);

    name.setText(friend.getName());
    Picasso.with(mContext).load(friend.getImageUrl()).into(img);
    if (friend.isAStarWarsLover()) {
      vader.setVisibility(View.VISIBLE);
    }

    return rowItem;
  }
}
