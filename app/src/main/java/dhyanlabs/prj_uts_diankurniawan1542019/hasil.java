package dhyanlabs.prj_uts_diankurniawan1542019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class hasil extends AppCompatActivity {

    String stnama, stnpm, sta, stgr, stket;
    Button kembali;
    Intent nama, npm, nilaia, grade, keterrangan, kembli;
    TextView txnm, txnpm, txnilai, txgr,txket;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama= getIntent();
        npm= getIntent();
        nilaia= getIntent();
        grade = getIntent();
        keterrangan=getIntent();

        stnama= nama.getStringExtra("uname");
        stnpm= npm.getStringExtra("npm");
        sta= nilaia.getStringExtra("nilaiakhir");
        stgr= grade.getStringExtra("grade");
        stket=keterrangan.getStringExtra("ket");

        txnm =(TextView) findViewById(R.id.edtxnma);
        txnpm =(TextView) findViewById(R.id.edtxnpm);
        txnilai =(TextView) findViewById(R.id.edtxna);
        txgr =(TextView) findViewById(R.id.edtxgrade);
        txket =(TextView) findViewById(R.id.edtxket);

        txnm.setText(stnama);
        txnpm.setText(stnpm);
        txket.setText(stket);
        txgr.setText(stgr);
        txnilai.setText(sta);


        kembali = (Button) findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kembli = new Intent(hasil.this, login.class);
                startActivity(kembli);
            }
        });

    }
}
