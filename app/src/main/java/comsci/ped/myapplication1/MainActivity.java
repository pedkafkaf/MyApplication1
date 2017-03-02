package comsci.ped.myapplication1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Explicit
    ListView listView;
    private int[] ints = new int[]{R.drawable.traffic_01,R.drawable.traffic_02,
            R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
            R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,
            R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,
            R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,
            R.drawable.traffic_15,R.drawable.traffic_16,R.drawable.traffic_17,
            R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};

    private String[] titelstrings,deitailStrings,shortStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intital View ผูกตัวแปรกับไอดีของ view
        listView = (ListView) findViewById(R.id.livTraffic);

        // get value .xml File by My_content.xml to display
        titelstrings = getResources().getStringArray(R.array.title);
        deitailStrings = getResources().getStringArray(R.array.detail);

        //subString detailString ตัดคำใน detailString เพื่อห้มีข้อความไม่เกิน 30 char

        shortStrings = new String[deitailStrings.length]; //books spacs in memory String
          for (int i = 0; i<deitailStrings.length; i++) {
              shortStrings[i]=deitailStrings[i].substring(0,29) + ".....";
          }  //end for


        //create Listview
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,ints,titelstrings,shortStrings);
        listView.setAdapter(myAdapter);
    }// main methot onCreate

    public void onClickMoreInfo(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dlt.go.th/th/dlt-knowledge/view.php?_did=111"));
        startActivity(intent);
    }// main methot onClickMoreInfo

}// main class