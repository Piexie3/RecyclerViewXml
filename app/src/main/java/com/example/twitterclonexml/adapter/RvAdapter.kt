package com.example.twitterclonexml.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.twitterclonexml.R
import com.example.twitterclonexml.databinding.PostListItemBinding
import com.example.twitterclonexml.model.TweetItem

class RvAdapter(val tweets: ArrayList<TweetItem>) : RecyclerView.Adapter<RvAdapter.TweetViewHolder>() {

    inner class TweetViewHolder(val tweet: PostListItemBinding) :
        RecyclerView.ViewHolder(tweet.root) {
        fun bind(tweetItem: TweetItem) {
            Glide.with(itemView).load(R.drawable.a).into(tweet.profileImage)
            tweet.tvUserName.text = tweetItem.userName
            tweet.tvUserTag.text = tweetItem.userTag
            tweet.tvPostDescription.text = tweetItem.tweetDesc

            Glide.with(itemView).load(R.drawable.c).into(tweet.ivPost)

            tweet.tvReply.text = tweetItem.replyCount.toString()
            tweet.tvRetweet.text = tweetItem.retweetCount.toString()
            tweet.tvLike.text = tweetItem.likeCount.toString()
            tweet.tvChart.text = tweetItem.chartCount.toString()
            tweet.tvShare.text = tweetItem.shareCount.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        return TweetViewHolder((PostListItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)))
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        holder.bind(tweets[position])
    }

    override fun getItemCount(): Int {
        return tweets.size
    }
}