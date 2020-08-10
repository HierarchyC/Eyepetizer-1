package com.example.module_home.net

import com.example.base.network.base.response.BaseResponse

/**
 * create by apple
 * create on 2020/8/10
 * description
 */
data class DailyResponse(var itemList: ArrayList<DailyItemBean>) : BaseResponse() {

    data class DailyItemBean(
            var adIndex: Int,
            var `data`: Data,
            var id: Int,
            var tag: Any,
            var type: String
    )

    data class Data(
            var adTrack: Any,
            var content: Content,
            var dataType: String,
            var header: Header
    )

    data class Content(
            var adIndex: Int,
            var `data`: DataX,
            var id: Int,
            var tag: Any,
            var type: String
    )

    data class Header(
            var actionUrl: String,
            var followType: String,
            var icon: String,
            var iconType: String,
            var id: Int,
            var issuerName: String,
            var labelList: Any,
            var showHateVideo: Boolean,
            var tagId: Int,
            var tagName: Any,
            var time: Long,
            var topShow: Boolean
    )

    data class DataX(
            var addWatermark: Boolean,
            var area: String,
            var checkStatus: String,
            var city: String,
            var collected: Boolean,
            var consumption: Consumption,
            var cover: Cover,
            var createTime: Long,
            var dataType: String,
            var description: String,
            var height: Int,
            var id: Int,
            var ifMock: Boolean,
            var latitude: Int,
            var library: String,
            var longitude: Int,
            var owner: Owner,
            var privateMessageActionUrl: Any,
            var reallyCollected: Boolean,
            var recentOnceReply: RecentOnceReply,
            var releaseTime: Long,
            var resourceType: String,
            var selectedTime: Long,
            var status: Int,
            var tags: List<Tag>,
            var title: String,
            var uid: Int,
            var updateTime: Long,
            var url: String,
            var urls: List<String>,
            var urlsWithWatermark: List<String>,
            var varidateResult: String,
            var varidateStatus: String,
            var width: Int
    )

    data class Consumption(
            var collectionCount: Int,
            var realCollectionCount: Int,
            var replyCount: Int,
            var shareCount: Int
    )

    data class Cover(
            var blurred: Any,
            var detail: String,
            var feed: String,
            var homepage: Any,
            var sharing: Any
    )

    data class Owner(
            var actionUrl: String,
            var area: Any,
            var avatar: String,
            var birthday: Long,
            var city: String,
            var country: String,
            var cover: String,
            var description: String,
            var expert: Boolean,
            var followed: Boolean,
            var gender: String,
            var ifPgc: Boolean,
            var job: String,
            var library: String,
            var limitVideoOpen: Boolean,
            var nickname: String,
            var registDate: Long,
            var releaseDate: Long,
            var uid: Int,
            var university: String,
            var userType: String
    )

    data class RecentOnceReply(
            var actionUrl: String,
            var contentType: Any,
            var dataType: String,
            var message: String,
            var nickname: String
    )

    data class Tag(
            var actionUrl: String,
            var adTrack: Any,
            var bgPicture: String,
            var childTagIdList: Any,
            var childTagList: Any,
            var communityIndex: Int,
            var desc: String,
            var haveReward: Boolean,
            var headerImage: String,
            var id: Int,
            var ifNewest: Boolean,
            var name: String,
            var newestEndTime: Any,
            var tagRecType: String
    )
}