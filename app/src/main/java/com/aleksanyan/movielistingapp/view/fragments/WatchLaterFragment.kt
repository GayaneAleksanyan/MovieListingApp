package com.aleksanyan.movielistingapp.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aleksanyan.movielistingapp.databinding.FragmentWatchLaterBinding
import com.aleksanyan.movielistingapp.utils.AnimationHelper
import kotlinx.android.synthetic.main.fragment_watch_later.*

class WatchLaterFragment : Fragment() {
    private lateinit var binding: FragmentWatchLaterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWatchLaterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AnimationHelper.performFragmentCircularRevealAnimation(
            watch_later_fragment_root,
            requireActivity(),
            3
        )
    }
}