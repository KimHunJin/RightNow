package dxmnd.com.rightnow.main.info.view

import android.support.v4.app.Fragment
import dxmnd.com.rightnow.main.info.InfoContract

class InfoFragment : Fragment(), InfoContract.View {

    override lateinit var presenter: InfoContract.Presenter

    companion object {
        fun newInstance(): InfoFragment {
            return InfoFragment()
        }
    }
}