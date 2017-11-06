package dhyanlabs.prj_uts_diankurniawan1542019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button login;
    EditText usr, pswd;
    String stuser, stpswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    pswd = (EditText) findViewById(R.id.edpswd);

        login = (Button) findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                usr = (EditText) findViewById(R.id.user);
                pswd = (EditText) findViewById(R.id.edpswd);

                stuser = usr.getText().toString();
                stpswd = pswd.getText().toString();

                if ((stuser.equals("dian")) && (stpswd.equals("15421019"))){
                    Intent kirim = new Intent(login.this, menu.class);

                    kirim.putExtra("username", stuser);
                    kirim.putExtra("pswd", stpswd);
                    Toast.makeText(login.this, "Anda Berhasil Login", Toast.LENGTH_LONG).show();
                    startActivity(kirim);
                }

                else {Toast.makeText(login.this, "Maaf field Masih Kosong atau Salah",Toast.LENGTH_LONG).show();}

            }
        });

    }
}
