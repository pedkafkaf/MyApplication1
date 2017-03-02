package comsci.ped.myapplication1;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View ผูก view ที่หน้า ui ให้รู้จักกับตัวแปล java
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView DetailtxtView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView detailimageView = (ImageView)findViewById(R.id.imvlmageDetail);
        Button button = (Button)findViewById(R.id.btnBack);

        //show data from MainActivity (get information from mainactivity to show on detail

        titleTextView.setText(getIntent().getStringExtra("tITIL"));
        DetailtxtView.setText(getIntent().getStringExtra("detail"));
        detailimageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

    }     //main method

    public void clickBack(View view) {
        finish();

    }

}      //main Class
