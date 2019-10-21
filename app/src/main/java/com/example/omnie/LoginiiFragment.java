package com.example.omnie;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link logini.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link logini#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginiiFragment extends Fragment {
    private LOmnieAdapter adapteri;


    public LoginiiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adapteri=new LOmnieAdapter(getActivity());


        adapteri.notifyDataSetChanged();
    }
}
