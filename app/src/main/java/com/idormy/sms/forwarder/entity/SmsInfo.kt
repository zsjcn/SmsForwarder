package com.idormy.sms.forwarder.entity

import com.google.gson.annotations.SerializedName
import com.idormy.sms.forwarder.R
import java.io.Serializable

data class SmsInfo(
    // 联系人姓名
    var name: String = "",
    // 联系人号码
    var number: String = "",
    // 短信内容
    var content: String = "",
    // 短信时间
    var date: Long = 0L,
    // 短信类型: 1=接收, 2=发送
    var type: Int = 1,
    // 卡槽ID： 1=Sim1, 2=Sim2, -1=获取失败
    @SerializedName("sim_id")
    var simId: Int = -1,
) : Serializable {

    val typeImageId: Int = R.drawable.ic_sms

    val simImageId: Int
        get() {
            return when (simId) {
                1 -> R.drawable.ic_sim1
                2 -> R.drawable.ic_sim2
                else -> R.drawable.ic_sim
            }
        }
}
