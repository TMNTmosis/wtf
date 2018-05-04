package whattofood.whattofood;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class View2Fragment extends Fragment
{
    DodajActivity activity;
    EditText ImeSastojka;
    EditText KolicinaSastojka;
    Button DodajSastojak;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (DodajActivity) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState)
    {
        View view = inflater.inflate(R.layout.view2, container, false);

        ImeSastojka = view.findViewById(R.id.tbxSastojak);
        KolicinaSastojka = view.findViewById(R.id.)

        return view;
    }


}
