package com.example.communityeye.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.communityeye.R

class IssueGVAdapter(context: Context, issueModelArrayList: ArrayList<IssueModel>) :
    ArrayAdapter<IssueModel?>(context, 0, issueModelArrayList as List<IssueModel?>) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listitemView = convertView
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false)
        }

        val issueModel: IssueModel? = getItem(position)
        val issueTV = listitemView!!.findViewById<TextView>(R.id.TVIssue)
        val issueIV = listitemView.findViewById<ImageView>(R.id.IVIssue)

        issueTV.setText(issueModel!!.getIssue_name())
        issueIV.setImageResource(issueModel.getImgid())
        return listitemView
    }
}

