package com.rahul.sample.xebia.view;


import android.os.Bundle;
import android.widget.Toast;


import com.rahul.sample.xebia.R;
import com.rahul.sample.xebia.adapter.NyNewsAdapter;
import com.rahul.sample.xebia.databinding.ActivityNewslistBinding;
import com.rahul.sample.xebia.listener.NyNewsItemClickListner;
import com.rahul.sample.xebia.listener.NyNewsListInterface;
import com.rahul.sample.xebia.models.NyResponse;
import com.rahul.sample.xebia.models.ResultsItem;
import com.rahul.sample.xebia.viewmodel.NYNewsViewModel;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * This class is base class for the app. Connect to the server through the API.
 * @param
 */

public class NyNewsActivity extends AppCompatActivity implements NyNewsListInterface, NyNewsItemClickListner {

    private ActivityNewslistBinding binding;
    private NYNewsViewModel nyNewsViewModel;
    public ArrayList<ResultsItem> mDataItems;
    private NyNewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_newslist);
        binding.setListSwipe(this);
        iniView();
        getToolBar();
        creteViewModel();
        attachObservers();
        nyNewsViewModel.getNewsFromServer();
    }
    /**
     * initialize view model
     */
    private void creteViewModel() {
        nyNewsViewModel=  ViewModelProviders.of(this).get(NYNewsViewModel.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        nyNewsViewModel.getNewsFromServer();
    }

    /**
     * Method to set observers on data managed by nyNewsViewModel class
     * for this activity.
     */
    private void attachObservers() {
        nyNewsViewModel.loading.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean aBoolean) {
                if(aBoolean) {
                    binding.swipeRefresh.setRefreshing(false);

                }
                else binding.swipeRefresh.setRefreshing(true);
            }
        });
        nyNewsViewModel.apiError.observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(Throwable throwable) {
                if (throwable instanceof Exception) {
                    Toast.makeText(NyNewsActivity.this,"network error",Toast.LENGTH_LONG).show();
                    return;
                }

                Toast.makeText(NyNewsActivity.this,"network error",Toast.LENGTH_LONG).show();
            }
        });

        nyNewsViewModel.newsResponse.observe(this, new Observer<NyResponse>() {
            @Override
            public void onChanged(NyResponse response) {
                if (response!=null){
                    if (!response.getResults().isEmpty()&&response.getResults().size()>0){
                        mDataItems= new ArrayList<>();
                        mDataItems.clear();
                        mDataItems.addAll(response.getResults());
                        adapter.addData(mDataItems);
                    }
                }
            }
        });
    }
    /**
     * Method to set initialise view and set adapter values
     * HashMap that will give advantage to set header and token at run time.
     * for this activity.
     */
    private void iniView() {
        adapter= new NyNewsAdapter(new ArrayList<ResultsItem>(),this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        binding.recyclerView.setLayoutManager(mLayoutManager);
        binding.recyclerView.setItemAnimator(new DefaultItemAnimator());
        binding.recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        binding.recyclerView.setAdapter(adapter);
        binding.swipeRefresh.setRefreshing(false);
    }
    /**
     * Method to set ToolBar tittle and Home Back button
     */
    private void getToolBar() {
        setSupportActionBar((Toolbar) binding.toolbar);
        getSupportActionBar().setTitle(getResources().getString(R.string.news_list_titel));

    }

    @Override
    public void onRefresh() {
        binding.swipeRefresh.setRefreshing(true);
        nyNewsViewModel.getNewsFromServer();
        binding.swipeRefresh.setRefreshing(false);
    }

    @Override
    public void onItemClick(ResultsItem item) {
        NyNewsDetailActivity.startActivity(this,item);
    }

    public int getSize(){
        return mDataItems.size();
    }
}
