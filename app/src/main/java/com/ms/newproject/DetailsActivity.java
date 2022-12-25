package com.ms.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ms.newproject.Models.NewsHeadLine;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadLine headLins;
    TextView txt_title,txt_auther,txt_time,txt_detail,txt_content;
    ImageView ima_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txt_title=findViewById(R.id.text_details_title);
        txt_auther=findViewById(R.id.text_details_auther);
        txt_time=findViewById(R.id.text_details_time);
        txt_detail=findViewById(R.id.text_details_deatils);
        txt_content=findViewById(R.id.text_details_content);
        ima_news=findViewById(R.id.img_details_news);
        headLins= (NewsHeadLine) getIntent().getSerializableExtra("data");
        txt_title.setText((headLins.getTitle()));
        txt_auther.setText(headLins.getAuthor());
        txt_detail.setText(headLins.getDescription());
        txt_time.setText(headLins.getPublishedAt());
        txt_content.setText(headLins.getContent());
        Picasso.get().load(headLins.getUrlToImage()).into(ima_news);
    }
}