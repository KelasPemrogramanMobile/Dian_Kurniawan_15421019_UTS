package dhyanlabs.prj_uts_diankurniawan1542019;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class menu extends AppCompatActivity {

    Intent nama;
    EditText nma, npm, tgs, quis, nuts,nuas;
    double itgs, iquis, iuts, iuas;
    Button btn;
    String stnma, stnpm, stnaa, stna , stgr, stket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nama = getIntent();
        nma =(EditText) findViewById(R.id.ednama);
        stnma = nama.getStringExtra("username");
        nma.setText(stnma);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nma = (EditText) findViewById(R.id.ednama);
                npm = (EditText) findViewById(R.id.ednpm);
                tgs = (EditText) findViewById(R.id.nt);
                nuts = (EditText) findViewById(R.id.nu);
                nuas = (EditText) findViewById(R.id.nuas);
                quis = (EditText) findViewById(R.id.nq);

                stnma = nma.getText().toString();
                stnpm = npm.getText().toString();
                iquis= Double.valueOf(quis.getText().toString());
                itgs = Double.valueOf(tgs.getText().toString());
                iuas = Double.valueOf(nuas.getText().toString());
                iuts = Double.valueOf(nuts.getText().toString());

                double nilai=(0.15*itgs)+(0.20*iquis)+(0.30*iuts)+(0.35*iuas);
                stnaa=Double.toString(nilai);

                if ((nilai >= 85) && (nilai<=100)) {
                    stgr="A";
                    stket="Lulus";
                    stna=stnaa;

                }
                else if ((nilai > 75) && (nilai <85)) {
                    stgr="B";
                    stket="Lulus";
                    stna=stnaa;
                }
                else if ((nilai > 65) && (nilai <75) ) {
                    stgr="C";
                    stket="Lulus";
                    stna=stnaa;

                }
                else if ((nilai > 50) && (nilai <65)) {
                    stgr="D";
                    stket="Tidak Lulus";
                    stna=stnaa;
                }
                else{
                    stgr="E";
                    stket="Tidak Lulus";
                    stna=stnaa;
                }


                Intent kirim = new Intent(menu.this, hasil.class);

                kirim.putExtra("uname", stnma);
                kirim.putExtra("npm", stnpm);
                kirim.putExtra("nilaiakhir", stna);
                kirim.putExtra("grade", stgr);
                kirim.putExtra("ket", stket);
                startActivity(kirim);
                finish();


            }});


    }
}
