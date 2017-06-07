package com.example.room304.tutorial2eaxmple;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private boolean showToast = false;

    public MainActivityFragment() {
    }


    public static MainActivityFragment newInstance(boolean showToast){
        MainActivityFragment fragment = new MainActivityFragment();
        Bundle argument = new Bundle();
        argument.putBoolean("showToast", showToast);
        fragment.setArguments(argument);

        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null){
            showToast = getArguments().getBoolean("showToast");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_main, container, false);

        if(showToast){
            Toast.makeText(getActivity().getBaseContext(), "Main Fragment", Toast.LENGTH_LONG).show();
        }

        return view;
    }
}
