package com.example.fragmentsdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {


    public DescriptionFragment() {
        // Required empty public constructor
    }

    private long position_id;

    public void setPosition_id(long position_id) {
        this.position_id = position_id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if (view != null){
            TextView titleText = view.findViewById(R.id.title_position);
            TextView descriptionText = view.findViewById(R.id.description_position);

            Position position = Position.positions[(int) position_id];

            titleText.setText(position.getTitle());
            descriptionText.setText(position.getDescription());
        }
    }
}
