package com.example.communityeye.ui

class IssueModel(var issue_name: String, var imgid: Int) {

    fun getIssue_name(): String {
        return issue_name
    }

    fun setIssue_name(issue_name: String) {
        this.issue_name = issue_name
    }

    fun getImgid(): Int {
        return imgid
    }

    fun setImgid(imgid: Int) {
        this.imgid = imgid
    }
}
