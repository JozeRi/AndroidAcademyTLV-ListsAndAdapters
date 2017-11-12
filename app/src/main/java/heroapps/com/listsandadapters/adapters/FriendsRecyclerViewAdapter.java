package heroapps.com.listsandadapters.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import heroapps.com.listsandadapters.R;
import heroapps.com.listsandadapters.model.Friend;

/**
 * Created by Refael Ozeri on 12/11/2017.
 */

public class FriendsRecyclerViewAdapter extends RecyclerView.Adapter<FriendsRecyclerViewAdapter.ViewHolder> {

  private Context mContext;
  private ArrayList<Friend> mFriends;

  public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView img, vader;
    public TextView name;

    public ViewHolder(View itemView) {
      super(itemView);
      img = itemView.findViewById(R.id.li_friend_img);
      name = itemView.findViewById(R.id.li_name_tv);
      vader = itemView.findViewById(R.id.li_starwars_img);
    }
  }

  public FriendsRecyclerViewAdapter(Context context, ArrayList<Friend> friends) {
    mContext = context;
    mFriends = friends;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // create a new view
    LayoutInflater inflater = LayoutInflater.from(parent.getContext());
    View view = inflater.inflate(R.layout.li_friend, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    // get our custom object from our dataset at this position
    final Friend friend = mFriends.get(position);

    // Fill our views with our data!
    holder.name.setText(friend.getName());
    Picasso.with(mContext).load(friend.getImageUrl()).into(holder.img);
    if (friend.isAStarWarsLover()) {
      holder.vader.setVisibility(View.VISIBLE);
    } else {
      holder.vader.setVisibility(View.GONE);
    }

  }

  @Override
  public int getItemCount() {
    return mFriends.size();
  }
}
