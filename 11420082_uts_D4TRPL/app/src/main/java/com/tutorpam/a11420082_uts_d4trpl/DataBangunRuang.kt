package com.tutorpam.a11420082_uts_d4trpl

object DataBangunRuang {
    private val NamaBangunRuang = arrayOf("BALOK",
        "BOLA",
        "KERUCUT",
        "TABUNG")

    private val PenjelasanBangunRuang = arrayOf("Balok adalah bangun ruang tiga dimensi yang dibentuj oeh tiga pasang" +
            " persegi atau persegi panjang, dengan paling tidak satu pasang di antarnya berukuran berbeda." +
            " Balok memiliki 6 sisi, 12 rusuk dan 8 titik sudut. Balok yang dibentuk oleh enam persegi sama dan" +
            " sebangun disebut sebagai kubus,",
            "Bola sebagai bangun ruang adalah bangun dengan sisi lengkung yang" +
            " tersusun dari lingkaran yang tidak terhingga. Lingkaran ini berpusat di satu titik, yaitu titik pusat bangun ruang bola.",
            "Dalam geometri," +
            " keucut adalah sebuah limas istimewa yang beralas lingkaran. Kerucut memiliki 2 sisi, 1 rusuk dan 1 titik sudut." +
            " Sisi tegak kerucut tidak berupa segitiga tapi berupa bidang miring yang disebut selimut kerucut.",
                " Tabung atau silinder adalah bangun ruang tiga dimensi yang" +
                " dibentuk oleh dua buah lingkaran identik yang sejajar dan sebuah persegi panjang yang mengelilingi kedua lingkaran tersebut. Tabung" +
                " memiliki 3 sisi dan 2 rusuk.")

    private val GambarBangunRuang = intArrayOf(R.drawable.balok,
        R.drawable.bola,
        R.drawable.kerucut,
        R.drawable.tabung)

    val listData: ArrayList<BangunRuang>
        get(){
            val list = arrayListOf<BangunRuang>()
            for (position in NamaBangunRuang.indices){
                val bangun = BangunRuang()
                bangun.judul = NamaBangunRuang[position]
                bangun.penjelasan = PenjelasanBangunRuang[position]
                bangun.gambar = GambarBangunRuang[position]
                list.add(bangun)
            }
            return list
        }
}