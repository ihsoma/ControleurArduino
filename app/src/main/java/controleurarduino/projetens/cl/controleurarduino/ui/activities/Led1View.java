package controleurarduino.projetens.cl.controleurarduino.ui.activities;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import controleurarduino.projetens.cl.controleurarduino.R;

public class Led1View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_act_led1_view);

      //TextView mat = (TextView) findViewById(R.id.textMat);
       /* mat.setText(
                " Arduino Uno\n" +
                        " Cable USB\n" +
                        " Cable OTG\n" +
                        " Un LED\n");*/


        TextView cab = (TextView) findViewById(R.id.textCab);








        final Button btnTelecharger = (Button)findViewById(R.id.telecharger);

        btnTelecharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        /*final Button btnAllumer = (Button)findViewById(R.id.allumer);
        btnAllumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  Boolean status = null;
                //on fait l'action Open et Send on cliquant sur le boutton

                status = !status;
                if (status)
                    btnAllumer.setText(R.string.all);
                else
                    btnAllumer.setText(R.string.ete);*/

           /* }
        });*/


    }
}
