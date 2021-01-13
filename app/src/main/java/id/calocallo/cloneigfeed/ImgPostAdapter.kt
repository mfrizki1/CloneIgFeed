package id.calocallo.cloneigfeed

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_img.view.*

class ImgPostAdapter(val context: Context, val list: List<Int>) :
    RecyclerView.Adapter<ImgPostAdapter.ImgPostHolder>() {
    inner class ImgPostHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(v: Int) {
            with(itemView) {
                Glide.with(context)
                    .load(v)
                    .into(img_item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImgPostHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_img, parent, false)
        return ImgPostHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ImgPostHolder, position: Int) {
        holder.bind(list[position])
    }
}