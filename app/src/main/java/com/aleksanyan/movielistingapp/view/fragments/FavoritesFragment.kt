package com.aleksanyan.movielistingapp.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.aleksanyan.movielistingapp.domain.Film
import com.aleksanyan.movielistingapp.view.rv_adapters.FilmListRecyclerAdapter
import com.aleksanyan.movielistingapp.view.rv_adapters.TopSpacingItemDecoration
import com.aleksanyan.movielistingapp.databinding.FragmentFavoritesBinding
import com.aleksanyan.movielistingapp.utils.AnimationHelper
import com.aleksanyan.movielistingapp.view.MainActivity
import kotlinx.android.synthetic.main.fragment_favorites.*


class FavoritesFragment : Fragment() {
    private lateinit var filmsAdapter: FilmListRecyclerAdapter
    private lateinit var binding: FragmentFavoritesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val favoritesList: List<Film> = emptyList()

        AnimationHelper.performFragmentCircularRevealAnimation(
            favorites_fragment_root,
            requireActivity(),
            2
        )

        binding.favoritesRecycler.apply {
            filmsAdapter =
                FilmListRecyclerAdapter(object : FilmListRecyclerAdapter.OnItemClickListener {
                    override fun click(film: Film) {
                        (requireActivity() as MainActivity).launchDetailsFragment(film)
                    }
                })
            adapter = filmsAdapter
            layoutManager = LinearLayoutManager(requireContext())
            val decorator = TopSpacingItemDecoration(8)
            addItemDecoration(decorator)
        }
        filmsAdapter.addItems(favoritesList)
    }
}