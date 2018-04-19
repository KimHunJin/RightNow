package dxmnd.com.rightnow.main.root.view

import android.support.v4.app.Fragment
import dxmnd.com.rightnow.main.root.RootContract

class RootFragment : Fragment(), RootContract.View {
    override lateinit var presenter: RootContract.Presenter

    companion object {
        fun newInstance(): RootFragment {
            return RootFragment()
        }
    }
}