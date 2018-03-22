package com.kuaidao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.tv_yysb)
    TextView tvYysb;
    @BindView(R.id.ll_root)
    LinearLayout llRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_yysb, R.id.ll_root})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_yysb:


                break;
            case R.id.ll_root:
                break;
        }
    }
}
