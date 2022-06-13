package com.belajar.aplikasisederhana

object BeachData {
    private  val beachName = arrayOf(
        "Pink Beach-Lombok",
        "Pantai Novagio- Yunani",
        "Pantai Ora-Maluku Tengah, Indonesia",
        "Pantai Phi-Phi -Thailand",
        "Pantai Railay- Thailand",
        "Pantai Los Roques-Venezuela",
        "La Ventana – Meksiko",
        "Florida Keys",
        "Waikiki",
        "Hawai Beach"
    )

    private  val beachDetails = arrayOf(
        "Pantai yang terkenal dengan pasir merah muda ini terletak di Lombok. Pantai ini begitu diminati oleh para wisatawan, baik Wisatawan Nusantara (Wisnus), maupun Wisatawan Mancanegara (Wisman).",
        "Pantai ini adalah sebuah pantai yang terletak di pulau Zakynthos, Kepulauan Ionia, Yunani. Pantai Navagio awalnya dikenal dengan nama Agios Georgios.",
        "Pantai indah berikutnya berada di kepulauan Maluku, tepatnya pulau Seram di Maluku Tengah. Pantai Ora memiliki karakteristik pantai yang berpasir putih dengan air yang sangat jernih dan tenang dengan kekayaan terumbu karang, ikan dan aneka ragam biota laut lainnya.",
        "Pulau Phi-Phi terkenal akan panorama pantai yang cantik. Wisata pantai ini sangat terkenal di kalangan wisatawan.",
        "Masih di Thailand, pantai Railay terkenal keeksotisannya. Railay dalam bahasa Thailand sendiri itu dikenal dengan sebutan Rai Leh.",
        "Los Roques merupakan sebuah kepulauan yang berada di Karibia yang terletak di lepas pantai Venezuela. Pulau-pulau Los Roques ditetapkan sebagai taman nasional pada tahun 1972, bertujuan untuk melindungi ekosistem laut di sana, termasuk terumbu karang dan hutan bakaunya.",
        "Lautan yang nyaris berpendar biru kontras dengan pemandangan pantai yang gersang, tempat bagi pohon-pohon palem dan lebih dari seratus spesies kaktus. La Ventana merupakan sebuah desa nelayan kecil di Meksiko.",
        "Florida keys adalah kumpulan pulau karang yang terletak di lepas pantai selatan florida yang telah menjadi destinasi wisata di USA",
        "Waikiki adalah rumah bagi pantai terkenal di hawaii karena merupakan persilangan antara surga tropis dan kota modern"
    )

    private val beachImages = intArrayOf(
        R.drawable.b1,
        R.drawable.b2,
        R.drawable.b3,
        R.drawable.b4,
        R.drawable.b5,
        R.drawable.b6,
        R.drawable.b7,
        R.drawable.b8,
        R.drawable.b9,
        R.drawable.b10,
    )

    val listData : ArrayList<Beach>
        get() {
            val list = arrayListOf<Beach>()
            for(position in beachName.indices){
                val beach = Beach()
                beach.name = beachName[position]
                beach.detail = beachDetails[position]
                beach.photo = beachImages[position]
                list.add(beach)
            }
            return list
        }
}