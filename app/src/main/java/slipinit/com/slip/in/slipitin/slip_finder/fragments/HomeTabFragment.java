package slipinit.com.slip.in.slipitin.slip_finder.fragments;


import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.zakariya.stickyheaders.SectioningAdapter;
import org.zakariya.stickyheaders.StickyHeaderLayoutManager;

import ca.barrenechea.widget.recyclerview.decoration.StickyHeaderDecoration;


import slipinit.com.slip.in.slipitin.R;
import slipinit.com.slip.in.slipitin.slip_finder.adapter.AdapterRecyclerView;
import slipinit.com.slip.in.slipitin.slip_finder.animation.DividerItemDecoration;
import slipinit.com.slip.in.slipitin.slip_finder.animation.VerticalSpaceItemDecoration;


    public class HomeTabFragment extends android.app.Fragment {
        private static final String ARG_PARAM1 = "param1";
        private static final String ARG_PARAM2 = "param2";
        private String mParam1;
        private String mParam2;
        private OnFragmentInteractionListener mListener;
        private RecyclerView recyclerView;
        private RecyclerView.LayoutManager layoutManager;
        private StickyHeaderLayoutManager stickyHeaderLayoutManager;
        private SectioningAdapter sectioningAdapter;
        private AdapterRecyclerView adapterRecyclerView;
        private Activity activity;
        private Integer Vertcal_Space_Height = 10;
        private StickyHeaderDecoration decor;


        public HomeTabFragment() {
            // Required empty public constructor
        }

        public static HomeTabFragment newInstance() {
            HomeTabFragment fragment = new HomeTabFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_home_tab, container, false);
            recyclerView = (RecyclerView) view.findViewById(R.id.id_RecyclerView);
            layoutManager = new LinearLayoutManager(getActivity());
            //    stickyHeaderLayoutManager=new StickyHeaderLayoutManager();
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);
            recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(Vertcal_Space_Height));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), null));
            adapterRecyclerView = new AdapterRecyclerView(activity);
            sectioningAdapter = new SectioningAdapter();
            recyclerView.setAdapter(adapterRecyclerView);
            return view;
        }


        public void onButtonPressed(Uri uri) {
            if (mListener != null) {
                mListener.onFragmentInteraction(uri);
            }
        }

        @Override
        public void onAttach(Activity activity_) {
            super.onAttach(activity_);
            activity = activity_;
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            if (context instanceof OnFragmentInteractionListener) {
                mListener = (OnFragmentInteractionListener) context;
            } else {
                throw new RuntimeException(context.toString()
                        + " must implement OnFragmentInteractionListener");
            }
        }

        @Override
        public void onDetach() {
            super.onDetach();
            mListener = null;
        }

        public interface OnFragmentInteractionListener {
            // TODO: Update argument type and name
            void onFragmentInteraction(Uri uri);
        }
    }

