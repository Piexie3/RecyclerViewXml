package com.example.twitterclonexml.model

import com.example.twitterclonexml.R

class Data {
    companion object{
        fun getTweets(): ArrayList<TweetItem>{
            return arrayListOf<TweetItem>(
                TweetItem(
                   profileImage = R.drawable.a,
                    userName = "piexie",
                    userTag = "@Piexie",
                    tweetDesc = "This has been an awesome session let's keep it up and also we should be doing our practices at home",
                    postImage = R.drawable.b,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.d,
                    userName = "Ezzo Dan",
                    userTag = "@Ezzo.dan",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.c,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.e,
                    userName = "Jonte",
                    userTag = "@jonte",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.f,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.g,
                    userName = "Panways",
                    userTag = "@panways",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.h,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.i,
                    userName = "Jeff",
                    userTag = "@jeffKent",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.a,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.b,
                    userName = "Brayo",
                    userTag = "@brayobett",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.c,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.d,
                    userName = "mantos",
                    userTag = "@mantos",
                    tweetDesc = "how is the design",
                    postImage = R.drawable.e,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                ),
                TweetItem(
                    profileImage = R.drawable.f,
                    userName = "Mallow",
                    userTag = "@mallow",
                    tweetDesc = "What a wonderfull",
                    postImage = R.drawable.g,
                    replyCount = 12,
                    retweetCount = 131,
                    likeCount = 600,
                    shareCount = 46,
                    chartCount = 34,
                )

            )
        }
    }
}