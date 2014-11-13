package com.princecoder.viewpagerproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author prinzlyngotoum
 */
public class FragmentA extends Fragment {
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        System.out.println("onAttach");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)
        {
            System.out.println("onCreate FIRST TIME");
        }
        else
        {
            System.out.println("onCreate SUBSEQUENT TIME");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        System.out.println("onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("onActivityCreated");

    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume");

    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("onPause");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println("onSaveInstanceState");

    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("onStop");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("onDestroyView");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("onDetach");

    }
}
