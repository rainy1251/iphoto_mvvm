package com.zhuyi.iphoto.ui.dashboard

import com.zhuyi.iphoto.base.BaseFragment
import com.zhuyi.iphoto.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>(
    FragmentDashboardBinding::inflate,DashboardViewModel::class.java) {
    override fun initFragment(binding: FragmentDashboardBinding, viewModel: DashboardViewModel?) {
        val banner = viewModel?.getBanner()
        banner?.observe(viewLifecycleOwner){
            binding.textDashboard.text=it.size.toString()
        }
    }
}
//viewModel.text.observe(viewLifecycleOwner) {
//    binding.textDashboard.text = it
//}

