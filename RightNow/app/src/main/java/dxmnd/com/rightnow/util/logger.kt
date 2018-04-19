package dxmnd.com.rightnow.util

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


fun log(any : Any) {
    Logger.addLogAdapter(AndroidLogAdapter())

    when (any) {
        is Throwable -> Logger.e(any.message.toString())
        else -> Logger.d(any.toString())
    }
}