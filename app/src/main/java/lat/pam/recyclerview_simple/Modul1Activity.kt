package lat.pam.recyclerview_simple

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Modul1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modul1)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel("Item $i"))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        Log.d("test string", "Jumlah data: ${data.size}")

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
