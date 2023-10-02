package com.example.communityeye.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.GridView
import com.example.communityeye.R

class HomeFragment : Fragment() {
    private lateinit var issuesGV: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val IssueModelArrayList: ArrayList<IssueModel> = ArrayList<IssueModel>()

        IssueModelArrayList.add(IssueModel("DSA", R.drawable.home_icon))
        IssueModelArrayList.add(IssueModel("DSA", R.drawable.home_icon))
        IssueModelArrayList.add(IssueModel("DSA", R.drawable.home_icon))
        IssueModelArrayList.add(IssueModel("DSA", R.drawable.home_icon))
        IssueModelArrayList.add(IssueModel("DSA", R.drawable.home_icon))
        
        issuesGV.adapter = IssueGVAdapter(this, IssueModelArrayList)
    }
}