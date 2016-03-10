package m.mimavima;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginBtn;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button)findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        pd = ProgressDialog.show(this, "Please Wait...", "Loading Application..", false, true);

        if (v.getId() == R.id.login_btn) {
            final String userName = ((EditText) findViewById(R.id.user_name)).getText().toString();
            final String password = ((EditText) findViewById(R.id.user_password)).getText().toString();


    }
}
}
