package com.example.menunavegable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link enviado.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link enviado#newInstance} factory method to
 * create an instance of this fragment.
 */
public class enviado extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enviado, container, false);
    }

}
