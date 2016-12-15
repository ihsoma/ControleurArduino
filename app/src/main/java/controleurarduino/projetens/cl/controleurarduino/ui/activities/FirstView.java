package controleurarduino.projetens.cl.controleurarduino.ui.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import controleurarduino.projetens.cl.controleurarduino.R;

public class FirstView extends AppCompatActivity {

    ListView mListView;
    String[] options = new String[]{
            "Allumer Led",
            "Utiliser serveau Moteur",
            "ok",
            "ok",
            "ok",
            "ok",
            "ok","ok","ok",
            "ok","ok","ok","ok","ok"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_act_first_view);

        //LinearLayout l =(LinearLayout)findViewById(R.id.ui_act_first_view);

        //l.setBackgroundColor(Color.TRANSPARENT);
        mListView = (ListView) findViewById(R.id.listView1);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FirstView.this,
                android.R.layout.simple_list_item_1, options);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String option =(String) adapterView.getItemAtPosition(i);


                if(i==0)
                {
                    Intent s=new Intent(view.getContext(),Led1View.class);
                    startActivity(s);
                }
                /*if(i==1)
                {
                    Intent s=new Intent(view.getContext(),ServoMoteurView.class);
                    startActivity(s);
                }*/
            }

        });


    }
}
