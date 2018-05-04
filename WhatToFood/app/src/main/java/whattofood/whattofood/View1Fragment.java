package whattofood.whattofood;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public class View1Fragment extends Fragment {
    private Button btnGalerija;
    private Button btnCamera;
    private ImageView imageviewPic;

    private Spinner spinnerTip;
    private Spinner spinnerVreme;
    private EditText tbxImeRecepta;

    private DodajActivity activity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (DodajActivity) activity;
    }

    public void VratiSliku(Bitmap image) {
        imageviewPic.setImageBitmap(image);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] Slika = baos.toByteArray();
        activity.SetSlika(Slika);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.view1, container, false);

        tbxImeRecepta = view.findViewById(R.id.tbxImeRecepta);
        tbxImeRecepta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s)
            {
                String ImeRecepta = tbxImeRecepta.getText().toString();
                activity.SetImeRecepta(ImeRecepta);
            }
        });

        spinnerTip = view.findViewById(R.id.spinnerTip);
        spinnerVreme = view.findViewById(R.id.spinnerVreme);

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Glavna jela");
        lista.add("Predjela");
        lista.add("Supe i čorbe");
        lista.add("Salate");
        lista.add("Brza hrana");
        lista.add("Pite i peciva");
        lista.add("Grickalice");
        lista.add("Dezert");

        ArrayAdapter<String> adapterTip = new ArrayAdapter<>(activity.getApplicationContext(), android.R.layout
                .simple_spinner_item, lista);
        adapterTip.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTip.setAdapter(adapterTip);
        spinnerTip.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String TipRecepta = spinnerTip.getSelectedItem().toString();
                activity.SetTipRecepta(TipRecepta);
            }
        });

        lista = new ArrayList<>();
        lista.add("0min - 15min");
        lista.add("15min - 30min");
        lista.add("30min - 45min");
        lista.add("45min - 1h");
        lista.add("1h - 1:30h");
        lista.add("1:30h - 2h");
        lista.add("2h - 4h");

        ArrayAdapter<String> adapterVreme = new ArrayAdapter<>(activity.getApplicationContext(), android.R.layout
                .simple_spinner_item, lista);
        adapterVreme.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerVreme.setAdapter(adapterVreme);
        spinnerVreme.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String VremeRecepta = spinnerVreme.getSelectedItem().toString();
                activity.SetVremeRecepta(VremeRecepta);
            }
        });

        btnGalerija = view.findViewById(R.id.btnGalerija);
        btnCamera = view.findViewById(R.id.btnCamera);
        imageviewPic = view.findViewById(R.id.imageviewPic);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                activity.PozoviIntentZaCameru(intent);
            }
        });

        btnGalerija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                File picfile = Environment.getExternalStoragePublicDirectory(Environment
                        .DIRECTORY_PICTURES);
                String picpath = picfile.getPath();
                Uri data = Uri.parse(picpath);
                intent.setDataAndType(data, "image/*");
                activity.PozoviIntentZagalery(intent);
            }
        });


        return view;
    }
}
