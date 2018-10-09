package com.example.administrator.piechartsview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.piechartsview.piechart.ArcBean;
import com.example.administrator.piechartsview.piechart.PieChartView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private PieChartView pieChartOne , pieChartTwo , pieChartThree , pieChartFour;
    private List<ArcBean> arcBeanList = new ArrayList<>();
    private List<ArcBean> arcBeanList2 = new ArrayList<>();
    private List<ArcBean> arcBeanList3 = new ArrayList<>();
    private List<ArcBean> arcBeanList4 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        ArcBean arcBean = new ArcBean();
        arcBean.setValue(1000);
        arcBean.setColor(R.color.black);
        arcBean.setRadius(60);
        ArcBean arcBean1 = new ArcBean();
        arcBean1.setValue(500);
        arcBean1.setColor(R.color.green);
        arcBean1.setRadius(60);
        ArcBean arcBean2 = new ArcBean();
        arcBean2.setValue(2000);
        arcBean2.setColor(R.color.colorAccent);
        arcBean2.setRadius(60);
        ArcBean arcBean3 = new ArcBean();
        arcBean3.setValue(6000);
        arcBean3.setColor(R.color.colorPrimary);
        arcBean3.setRadius(60);
        ArcBean arcBean4 = new ArcBean();
        arcBean4.setValue(4000);
        arcBean4.setColor(R.color.blue);
        arcBean4.setRadius(60);
        ArcBean arcBean5 = new ArcBean();
        arcBean5.setValue(1000);
        arcBean5.setColor(R.color.red);
        arcBean5.setRadius(60);
        arcBeanList.add(arcBean);
        arcBeanList.add(arcBean1);
        arcBeanList.add(arcBean2);
        arcBeanList.add(arcBean3);
        arcBeanList.add(arcBean4);
        arcBeanList.add(arcBean5);

        ArcBean arcBean6 = new ArcBean();
        arcBean6.setValue(1000);
        arcBean6.setColor(R.color.black);
        arcBean6.setRadius(100);
        ArcBean arcBean7 = new ArcBean();
        arcBean7.setValue(500);
        arcBean7.setColor(R.color.green);
        arcBean7.setRadius(100);
        ArcBean arcBean8 = new ArcBean();
        arcBean8.setValue(2000);
        arcBean8.setColor(R.color.colorAccent);
        arcBean8.setRadius(100);
        ArcBean arcBean9 = new ArcBean();
        arcBean9.setValue(6000);
        arcBean9.setColor(R.color.colorPrimary);
        arcBean9.setRadius(100);
        ArcBean arcBean10 = new ArcBean();
        arcBean10.setValue(4000);
        arcBean10.setColor(R.color.blue);
        arcBean10.setRadius(100);
        arcBeanList2.add(arcBean6);
        arcBeanList2.add(arcBean7);
        arcBeanList2.add(arcBean8);
        arcBeanList2.add(arcBean9);
        arcBeanList2.add(arcBean10);

        ArcBean arc6 = new ArcBean();
        arc6.setValue(1000);
        arc6.setColor(R.color.black);
        arc6.setRadius(100);
        ArcBean arc7 = new ArcBean();
        arc7.setValue(500);
        arc7.setColor(R.color.green);
        arc7.setRadius(90);
        ArcBean arc8 = new ArcBean();
        arc8.setValue(2000);
        arc8.setColor(R.color.colorAccent);
        arc8.setRadius(70);
        ArcBean arc9 = new ArcBean();
        arc9.setValue(6000);
        arc9.setColor(R.color.colorPrimary);
        arc9.setRadius(80);
        ArcBean arc10 = new ArcBean();
        arc10.setValue(4000);
        arc10.setColor(R.color.blue);
        arc10.setRadius(60);
        arcBeanList3.add(arc6);
        arcBeanList3.add(arc7);
        arcBeanList3.add(arc8);
        arcBeanList3.add(arc9);
        arcBeanList3.add(arc10);
    }

    private void initView() {
        mBtn = findViewById(R.id.mBtn);
        pieChartOne = findViewById(R.id.pieChartOne);
        pieChartTwo = findViewById(R.id.pieChartTwo);
        pieChartThree = findViewById(R.id.pieChartThree);
        pieChartFour = findViewById(R.id.pieChartFour);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pieChartOne.setData(arcBeanList , R.color.white , true);
                pieChartTwo.setData(arcBeanList2 , R.color.white , true);
                pieChartThree.setData(arcBeanList3 , R.color.white , true);
                pieChartFour.setData(arcBeanList , R.color.white , false);
            }
        });
    }
}
