package com.richard.navigationcomponent.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.richard.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    // This runs when the fragment view is completely created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.view_transactions_btn.setOnClickListener(this)
        view.send_money_btn.setOnClickListener(this)
        view.view_balance_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) { // v cannot be null
            R.id.view_transactions_btn -> navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment)
            R.id.send_money_btn -> navController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
            R.id.view_balance_btn -> navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }
}