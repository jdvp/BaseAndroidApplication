package me.jdvp.baseandroidapplication.fragment



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import me.jdvp.baseandroidapplication.R

class MainFragment : DaggerFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val contentView = inflater.inflate(R.layout.fragment_main, container, false)
        return contentView
    }
}