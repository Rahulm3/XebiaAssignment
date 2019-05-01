package com.rahul.sample.xebia.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rahul.sample.xebia.R;
import com.rahul.sample.xebia.databinding.ActivityNyNewsDetailsBinding;
import com.rahul.sample.xebia.models.ResultsItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

public class NyNewsDetailActivity extends AppCompatActivity {

    private ActivityNyNewsDetailsBinding binding;
    private static ResultsItem newsdetails;

    /**
     * This method is to open the CustomerDetailsActivity. This method is call from different activity.
     *
     * @param mActivity
     * @return:CustomerDetailsActivity:screen.
     */
    public static void startActivity(Activity mActivity, ResultsItem customerListModel) {
        Intent intent = new Intent(mActivity, NyNewsDetailActivity.class);
        newsdetails = customerListModel;
        mActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ny_news_details);
        getToolbar();
        iniView();
    }

    /**
     * Set toolbar for CustomerDetailsActivity screen.
     */
    private void getToolbar() {
        setSupportActionBar((Toolbar) binding.toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(getResources().getString(R.string.news_list_details));
        (binding.toolbar).setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void iniView() {
        if (newsdetails != null) {
            binding.setDataItems(newsdetails);
        }

    }
}
