package com.hebin.horizontaldelete;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.hd_list)
    HorizontalSlideDeleteListView hdList;

    private List<String> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initData();
        HorizontalSlideAdapter adapter = new HorizontalSlideAdapter(this, mDataList);
        hdList.setAdapter(adapter);
    }

    private void initData() {
        mDataList = new ArrayList<>();
        mDataList.add("Test_1");
        mDataList.add("Test_2");
        mDataList.add("Test_3");
        mDataList.add("Test_4");
        mDataList.add("Test_5");
        mDataList.add("Test_6");
        mDataList.add("Test_7");
        mDataList.add("Test_8");
        mDataList.add("Test_9");
        mDataList.add("Test_10");
        mDataList.add("Test_11");
        mDataList.add("Test_12");
        mDataList.add("Test_13");
        mDataList.add("Test_14");
        mDataList.add("Test_15");
        mDataList.add("Test_16");
    }
}
