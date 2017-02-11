package com.androidxu.androidbottomnavigationbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ItemFourFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ItemFourFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ItemFourFragment extends Fragment {

    public ItemFourFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ItemFourFragment.
     */

    public static ItemFourFragment newInstance() {
        ItemFourFragment fragment = new ItemFourFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item_four, container, false);
    }


}
