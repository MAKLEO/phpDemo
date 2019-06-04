package manish.khullar.phponlinedatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class InsertData extends AppCompatActivity {
    EditText e_name, e_email, e_contact, e_password;
    String name, email, contact, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
        e_name = findViewById(R.id.name);
        e_email = findViewById(R.id.email);
        e_contact = findViewById(R.id.contact);
        e_password = findViewById(R.id.password);
    }

    public void reguser(View view) {
        name = e_name.getText().toString();
        email = e_email.getText().toString();
        contact = e_contact.getText().toString();
        password = e_password.getText().toString();
        String method = "register";

        InsertDataBackgroundTask backgroundTask = new InsertDataBackgroundTask(this);
        backgroundTask.execute(method, name, email, contact, password);
        finish();

    }
}
