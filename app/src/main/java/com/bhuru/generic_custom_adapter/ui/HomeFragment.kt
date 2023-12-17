package com.bhuru.generic_custom_adapter.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bhuru.generic_custom_adapter.R
import com.bhuru.generic_custom_adapter.adapter.EmployeeAdapter
import com.bhuru.generic_custom_adapter.databinding.FragmentHomeBinding
import com.bhuru.generic_custom_adapter.model.EmployeModel


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private var employeeList = ArrayList<EmployeModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        addDataIntoRecycler()

        return binding.root
    }


    fun addDataIntoRecycler() {
        employeeList.add(EmployeModel("sajid", R.drawable.ic_launcher_foreground))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))
        employeeList.add(EmployeModel("Codein", R.drawable.codein))


        val adapter = EmployeeAdapter(requireContext(), employeeList)
        binding.rcvEmployeeDetails.adapter = adapter
    }

}