package com.example.madlevel3task1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_rating.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class RatingFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rating, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnToSummary.setOnClickListener {
            navigateToSummary()
        }

        showRandomAssessableGame()
    }

    /**
     * Store the game rating and navigate to the summary fragment.
     */
    private fun navigateToSummary() {
        val args = Bundle()

        args.putFloat(ARG_GAME_RATING, rbGame.rating)
        args.putString(ARG_GAME_NAME, tvGame.text.toString())

        findNavController().navigate(R.id.action_RatingFragment_to_SummaryFragment, args)
    }

    /**
     * Method to change the textView for the game rating to a random game listed in the array below.
     */
    private fun showRandomAssessableGame() {
        val randomGame = listOf(
            "Star wars: Jedi Fallen Order",
            "Factorio",
            "Shadow of the Tombraider",
            "Age Of Empires",
            "Rimworld",
            "Among us"
        ).random()

        tvGame.text = randomGame
    }
}