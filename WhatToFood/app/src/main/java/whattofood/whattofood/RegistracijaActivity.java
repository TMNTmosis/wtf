package whattofood.whattofood;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RegistracijaActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registracija);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string
                .navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Muski");
        lista.add("Zenski");
        lista.add("Neopredeljen");
        final Spinner spinner = (Spinner) findViewById(R.id.cmbxPol);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout
                .simple_spinner_item, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        Button btnPotvrdi = findViewById(R.id.btnPotvrdi);
        btnPotvrdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //final String P;
                String Pol = spinner.getSelectedItem().toString();
                EditText tbxIme = findViewById(R.id.tbxIme);
                EditText tbxPrezime = findViewById(R.id.tbxPrezime);
                EditText tbxKorisnickoIme = findViewById(R.id.tbxKorisnickoIme);
                EditText tbxLozinka = findViewById(R.id.tbxLozinka);
                EditText tbxEmail = findViewById(R.id.tbxEmail);
                Korisnik k = new Korisnik(tbxIme.getText().toString(), tbxPrezime.getText()
                        .toString(), tbxKorisnickoIme.getText().toString(), tbxLozinka.getText()
                        .toString(), tbxEmail.getText().toString(), Pol);

                Korisnici korisnici = Korisnici.GetKorisnici();
                korisnici.Add(k);

                String muda = Korisnici.GetKorisnici().GetListu().get(0).Ime;

                Toast.makeText(RegistracijaActivity.this,muda, Toast
                        .LENGTH_SHORT).show();

                /*spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position,
                    long id)
                    {
                        TextView TV = (TextView)view;
                        P = TV.getText().toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });*/


            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pocetna, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.prijava)
        {
            Intent intent = new Intent(this, PrijavaActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.pocetna)
        {
            Intent intent = new Intent(this, Pocetna.class);
            startActivity(intent);
        }
        else if (id == R.id.o_aplikaciji)
        {
            Intent intent = new Intent (this,OnamaActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.prijava) {
            Intent intent = new Intent(this, PrijavaActivity.class);
            startActivity(intent);
        } else if (id == R.id.o_aplikaciji) {

        } else if (id == R.id.pocetna) {
            Intent intent = new Intent(this, Pocetna.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
