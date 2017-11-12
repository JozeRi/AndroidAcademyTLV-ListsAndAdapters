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

public class FriendsBaseAdapterWithVH extends BaseAdapter {

  private Context mContext;
  private LayoutInflater mInflater;
  private ArrayList<Friend> mFriends;
  private boolean mIsGrid;

  public FriendsBaseAdapterWithVH(Context context, ArrayList<Friend> friends, boolean isGrid) {
    mContext = context;
    mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    mFriends = friends;
    mIsGrid = isGrid;
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
    ViewHolder holder;
    if (convertView == null) {
      if (mIsGrid) {
        convertView = mInflater.inflate(R.layout.grid_friend, parent, false);
      } else {
        convertView = mInflater.inflate(R.layout.li_friend, parent, false);
      }

      holder = onCreateViewHolder(convertView);
    } else {
      holder = (ViewHolder) convertView.getTag();
    }

    // Getting the data for this specific row!
    Friend friend = getItem(position);

    onBindViewHolder(holder, friend);

    return convertView;
  }

  private ViewHolder onCreateViewHolder(View convertView) {
    ViewHolder holder = new ViewHolder();
    holder.img = convertView.findViewById(R.id.li_friend_img);
    holder.name = convertView.findViewById(R.id.li_name_tv);
    holder.vader = convertView.findViewById(R.id.li_starwars_img);
    convertView.setTag(holder);
    return holder;
  }

  private void onBindViewHolder(ViewHolder holder, Friend friend) {
    holder.name.setText(friend.getName());
    Picasso.with(mContext).load(friend.getImageUrl()).into(holder.img);
    if (friend.isAStarWarsLover()) {
      holder.vader.setVisibility(View.VISIBLE);
    } else {
      holder.vader.setVisibility(View.GONE);
    }
  }

  private static class ViewHolder {
    public ImageView img, vader;
    public TextView name;
  }
}
