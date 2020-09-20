package com.example.madlevel3task1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_summary.*

const val ARG_GAME_NAME = "arg_game_name"
const val ARG_GAME_RATING = "arg_game_rating"

class SummaryFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gameName = arguments?.getString(ARG_GAME_NAME)
        val gameRating = arguments?.getFloat(ARG_GAME_RATING)

        tvSummary.text = String.format("You rated %s with %.1f stars! Thanks?", gameName, gameRating)

        btnStartOver.setOnClickListener {
            findNavController().navigate(R.id.action_SummaryFragment_to_StartFragment)
        }
    }
}