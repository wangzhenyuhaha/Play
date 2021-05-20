package com.wang.play.ui.fragment.main.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.wang.mylibrary.util.MyApplicationLogUtil
import com.wang.play.databinding.FragmentFirstBinding
import com.wang.play.databinding.FragmentThirdBinding
import com.wang.play.ui.fragment.main.first.FirstViewModel

class ThirdFragment : Fragment() {

    private val  thirdViewModel: ThirdViewModel by viewModels()
    private lateinit var binding: FragmentThirdBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        binding =
            FragmentThirdBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        MyApplicationLogUtil.d("TestNowAAAThird", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        MyApplicationLogUtil.d("TestNowAAAThird", "onDestroy")
    }


    override fun onDetach() {
        super.onDetach()
        MyApplicationLogUtil.d("TestNowAAAThird", "onDetach")
    }


}