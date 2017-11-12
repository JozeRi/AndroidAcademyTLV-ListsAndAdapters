package heroapps.com.listsandadapters.model;

import java.util.ArrayList;

/**
 * Created by Refael Ozeri on 12/11/2017.
 */

public class Friend {
  private boolean isAStarWarsLover;
  private String mName, mImageUrl;

  public Friend(boolean isAStarWarsLover, String mName, String mImageUrl) {
    this.isAStarWarsLover = isAStarWarsLover;
    this.mName = mName;
    this.mImageUrl = mImageUrl;
  }

  public boolean isAStarWarsLover() {
    return isAStarWarsLover;
  }

  public void setAStarWarsLover(boolean AStarWarsLover) {
    isAStarWarsLover = AStarWarsLover;
  }

  public String getName() {
    return mName;
  }

  public void setName(String mName) {
    this.mName = mName;
  }

  public String getImageUrl() {
    return mImageUrl;
  }

  public void setImageUrl(String mImageUrl) {
    this.mImageUrl = mImageUrl;
  }

  public static ArrayList<Friend> generateDummyFriendList() {
    ArrayList<Friend> friends = new ArrayList<>();
    friends.add(new Friend(true, "Yonatan V. Levin", "https://image.ibb.co/djN3nb/yonatan.jpg"));
    friends.add(new Friend(false, "Britt Barak", "https://image.ibb.co/cHGkHb/britt.jpg"));
    friends.add(new Friend(false, "Yossi Segev", "https://image.ibb.co/eZkZAw/yossi.jpg"));
    friends.add(new Friend(false, "Refael Ozeri", "https://image.ibb.co/h0J4yG/refael_pic.jpg"));
    friends.add(new Friend(false, "Yishai Levenglick", "https://preview.ibb.co/evb2xb/yishai.jpg"));
    friends.add(new Friend(false, "Yossi Elkrief", "https://image.ibb.co/fx62xb/yossi_e.jpg"));
    friends.add(new Friend(false, "Dor Samet", "https://image.ibb.co/j1wfiG/dor.jpg"));
    friends.add(new Friend(false, "Shahar Barsheshet", "https://image.ibb.co/hjavHb/shahar.jpg"));
    friends.add(new Friend(false, "Aviv Afriat", "https://image.ibb.co/nL06OG/aviv.jpg"));
    friends.add(new Friend(false, "Roman Smirnov", "https://image.ibb.co/mJSZcb/roman.jpg"));
    friends.add(new Friend(false, "Eden Bugdary", "https://image.ibb.co/dz3hxb/eden.jpg"));
    friends.add(new Friend(false, "Alexandre Gherschon", "https://image.ibb.co/gAPBqw/alex.jpg"));
    friends.add(new Friend(false, "Kobi Shasha", "https://image.ibb.co/gHmhVw/shasha.jpg"));
    return friends;
  }
}
