package com.merio.actors_and_films.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.merio.actors_and_films.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class HomeFragment: DaggerFragment(){

    @Inject
    lateinit var text: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       view.findViewById<TextView>(R.id.txtString).text = text
    }
}
