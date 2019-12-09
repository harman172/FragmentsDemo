package com.example.fragmentsdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class PositionTitleFragment extends ListFragment {

    String[] titles;
    ListClick listClick;

    public PositionTitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        listClick = (ListClick) inflater.getContext();
        Log.i("LAyoutInflater", "onCreateView: " + inflater.getContext());

        titles = new String[Position.positions.length];
        for (int i = 0; i < titles.length; i++){
            titles[i] = Position.positions[i].getTitle();
        }

        ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(), android.R.layout.simple_list_item_1, titles);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        listClick.onClick(position);
//        Log.i("Positions", "onListItemClick: " + titles[position]);
    }
}


interface ListClick{
    void onClick(int position);

}
