package com.richard.navigationcomponent.fragments

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.richard.navigationcomponent.Money
import com.richard.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_confirmation.view.*
import java.math.BigDecimal

class ConfirmationFragment : Fragment() {

    lateinit var  recipient: String
    lateinit var money: Money

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recipient = requireArguments().getString("recipient")!!
        money = requireArguments().getParcelable<Money>("amount")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val amount = money.amount
        val confirmationMessage = "You have sent $$amount to $recipient"

        view.confirmation_message.text = confirmationMessage
    }


}