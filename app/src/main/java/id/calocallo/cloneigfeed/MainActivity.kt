package id.calocallo.cloneigfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import id.calocallo.cloneigfeed.databinding.ActivityTesBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tabLayoutImg


        setupWithTab(binding.vpImg)
    }

    private fun setupWithTab(vpImg: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.populateFragment(PostImgFragment(), "Post")
        adapter.populateFragment(TaggedImgFragment(), "Tagged")
        vpImg.adapter = adapter
        binding.tabLayoutImg.setupWithViewPager(vpImg)
    }
}