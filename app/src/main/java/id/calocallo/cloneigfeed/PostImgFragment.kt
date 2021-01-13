package id.calocallo.cloneigfeed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_post_img.*


class PostImgFragment : Fragment() {
    private lateinit var adapter: ImgPostAdapter
    private var listImg =
        listOf<Int>(
            R.drawable.jesse_schoff_qvneortn06c_unsplash,
            R.drawable.ic_launcher_background,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4
        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_img, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        adapter = activity?.let { ImgPostAdapter(it, listImg) }!!
        rv_img_post.layoutManager = GridLayoutManager(activity, 3)
        rv_img_post.adapter = adapter

    }
}