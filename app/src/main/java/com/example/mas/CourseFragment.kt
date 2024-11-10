package com.example.mas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CourseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CourseFragment : Fragment() {
    private lateinit var courses: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_course, container, false)

        // Get the ListView and set the adapter
        val listView: ListView = view.findViewById(R.id.course_list_view)
        listView.adapter =
            ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, courses)
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedCourse = courses[position]
            CartManager.addItem(cartItem(selectedCourse, 1)) // Add item to cart with quantity 1
            Toast.makeText(requireContext(), "$selectedCourse added to cart", Toast.LENGTH_SHORT).show()
        }
        return view
    }

    companion object {
        fun newInstance(courses: Array<String>): CourseFragment {
            val fragment = CourseFragment()
            val args = Bundle()
            args.putStringArray("courses", courses)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            courses = it.getStringArray("courses") ?: arrayOf()
        }
    }
}