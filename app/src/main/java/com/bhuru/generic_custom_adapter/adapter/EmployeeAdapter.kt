package com.bhuru.generic_custom_adapter.adapter

import android.content.Context
import android.widget.Toast
import com.bhuru.generic_custom_adapter.R
import com.bhuru.generic_custom_adapter.databinding.LayoutEmployeeBinding
import com.bhuru.generic_custom_adapter.genericrecycleview.GenericRecyclerViewAdapter
import com.bhuru.generic_custom_adapter.model.EmployeModel

class EmployeeAdapter(context: Context, sizeList: ArrayList<EmployeModel>) :
    GenericRecyclerViewAdapter<EmployeModel, LayoutEmployeeBinding>(context, sizeList) {
    override val layoutResId: Int
        get() = R.layout.layout_employee

    override fun onItemClick(model: EmployeModel, position: Int) {

        Toast.makeText(context, "$position", Toast.LENGTH_SHORT).show()

        Toast.makeText(context, model.name, Toast.LENGTH_SHORT).show()
    }

    override fun onBindData(
        model: EmployeModel,
        position: Int,
        dataBinding: LayoutEmployeeBinding
    ) {
        dataBinding.tvCardName.text = model.name

        dataBinding.imgProfileToolbar.setImageResource(model.img)
    }
}