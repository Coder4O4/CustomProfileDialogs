package com.social.apdn.nasne.profiledialogcs;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;


public    class SocialNasNeDialog {
    public static void dialog(Context context, boolean mode, GetUserData getUserData)
    {
        View profileView = LayoutInflater.from(context)
                .inflate(R.layout.dialog_show , null);
        AlertDialog alertDialog = new AlertDialog.Builder(context)
                .setCancelable(mode)
                .setView(profileView)
                .create();

        alertDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
        profileView.setBackgroundResource(R.color.transparent);

        ImageView profile = profileView.findViewById(R.id.profilePhoto);

        TextView username = profileView.findViewById(R.id.userName);
        TextView location = profileView.findViewById(R.id.location);

        ImageView liked = profileView.findViewById(R.id.profileLike);

        TextView bio = profileView.findViewById(R.id.userBio);

        TextView followers = profileView.findViewById(R.id.followers);
        TextView followings = profileView.findViewById(R.id.followings);

        TextView cancelDialogBtn = profileView.findViewById(R.id.cancelDiaBtn);

        Glide.with(context)
                .load("https://townsquare.media/site/442/files/2018/02/iron-man-tony-stark.png?w=980&q=75")
                .placeholder(R.drawable.avatar)
                .into(profile);


        if (getUserData.isUserLike() == true)
        {
           liked.setBackgroundResource(R.drawable.liked);
        }
        else
        {
            liked.setBackgroundResource(R.drawable.not_liked);
        }

        username.setText(getUserData.getName());
        location.setText(getUserData.getLocation());
        bio.setText(getUserData.getBio());

        followers.setText(Double.toString(getUserData.getFollowers()));
        followings.setText(Double.toString(getUserData.getFollowings()));

//        openProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                alertDialog.dismiss();
//            }
//        });
        cancelDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }
}

