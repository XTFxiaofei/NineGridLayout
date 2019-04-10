package com.hmy.ninegridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.hmy.ninegridlayout.model.NineGridTestModel;
import com.hmy.ninegridlayout.view.ListViewExampleActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private List<NineGridTestModel> mList = new ArrayList<>();
    private String[] mUrls = new String[]{
            "http://img3.imgtn.bdimg.com/it/u=1752243568,253651337&fm=26&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1986179278,1118313821&fm=26&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=234634259,4236876085&fm=26&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1979198230,3799788659&fm=26&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=2644422079,4250545639&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1444023808,3753293381&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=882039601,2636712663&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=4119861953,350096499&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=2437456944,1135705439&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=3251359643,4211266111&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3590069947,3609584061&fm=26&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1717647885,4193212272&fm=21&gp=0.jpg",
            "http://img5.imgtn.bdimg.com/it/u=2024625579,507531332&fm=21&gp=0.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData() {
        initListData();
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.btn_RecyclerViewExample:
                RecyclerViewExampleActivity.startActivity(this, mList);
                break;
            case R.id.btn_ListViewExample:
                ListViewExampleActivity.startActivity(this, mList);
                break;
        }
    }

    private void initListData() {
        NineGridTestModel model1 = new NineGridTestModel();
        model1.urlList.add(mUrls[0]);
        mList.add(model1);

        NineGridTestModel model2 = new NineGridTestModel();
        model2.urlList.add(mUrls[1]);
        mList.add(model2);

        NineGridTestModel model3 = new NineGridTestModel();
        model3.urlList.add(mUrls[2]);
        mList.add(model3);

        NineGridTestModel model4 = new NineGridTestModel();
        for (int i = 0; i < mUrls.length; i++) {
            model4.urlList.add(mUrls[i]);
        }
        model4.isShowAll = false;
        mList.add(model4);

        NineGridTestModel model5 = new NineGridTestModel();
        for (int i = 0; i < mUrls.length; i++) {
            model5.urlList.add(mUrls[i]);
        }
        model5.isShowAll = true;//显示全部图片
        mList.add(model5);

        NineGridTestModel model6 = new NineGridTestModel();
        for (int i = 0; i < 9; i++) {
            model6.urlList.add(mUrls[i]);
        }
        mList.add(model6);

        NineGridTestModel model7 = new NineGridTestModel();
        for (int i = 3; i < 7; i++) {
            model7.urlList.add(mUrls[i]);
        }
        mList.add(model7);

        NineGridTestModel model8 = new NineGridTestModel();
        for (int i = 3; i < 6; i++) {
            model8.urlList.add(mUrls[i]);
        }
        mList.add(model8);
    }
}
