package io.dwak.holohackernews.app.network.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vishnu on 5/3/14.
 */
public class NodeHNAPIComment {
    @SerializedName("id") private Long mId;
    @SerializedName("level") private int mLevel;
    @SerializedName("user") private String mUser;
    @SerializedName("time_ago") private String mTimeAgo;
    @SerializedName("content") private String mContent;
    @SerializedName("comments") private List<NodeHNAPIComment> mChildNodeHNAPIComments;

    public long getId() {
        return mId;
    }

    public int getLevel() {
        return mLevel;
    }

    public String getUser() {
        return mUser;
    }

    public String getTimeAgo() {
        return mTimeAgo;
    }

    public String getContent() {
        return mContent;
    }

    public List<NodeHNAPIComment> getChildNodeHNAPIComments() {
        return mChildNodeHNAPIComments;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "mId=" + mId +
                ", mLevel=" + mLevel +
                ", mUser='" + mUser + '\'' +
                ", mTimeAgo='" + mTimeAgo + '\'' +
                ", mContent='" + mContent + '\'' +
                ", mChildComments=" + mChildNodeHNAPIComments +
                '}';
    }
}
