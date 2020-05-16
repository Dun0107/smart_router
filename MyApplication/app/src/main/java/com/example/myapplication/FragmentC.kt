package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.imageView
import kotlinx.android.synthetic.main.fragment_a.tv_fragment_name
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentC : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tv_fragment_name.text = "설명 3"
        imageView.setImageResource(R.drawable.sub_3)

        button1.setOnClickListener {
            val intent = Intent(getActivity(), MainActivity::class.java)
            getActivity()?.startActivity(intent)
        }

    }

}
