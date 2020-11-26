package com.example.androidopencv.adapter

import android.content.Intent
import com.allen.library.SuperTextView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.androidopencv.R

/**
 * Created by xuzhenhui on 2020/11/26.
 * e-mail: sleepym09@163.com
 */
class ActivityAdapter : BaseQuickAdapter<ActivityAdapter.ActivityItem, BaseViewHolder>(R.layout.item_activity) {
    data class ActivityItem(val activity: Class<out Any>)

    override fun convert(holder: BaseViewHolder, item: ActivityItem) {
        val act = holder.getView<SuperTextView>(R.id.act_name)
        act.setCenterString(item.javaClass.simpleName)
        act.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, item.activity))
        }
    }
}