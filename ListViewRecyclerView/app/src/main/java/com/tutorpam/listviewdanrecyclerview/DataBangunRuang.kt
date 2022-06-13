package com.tutorpam.listviewdanrecyclerview

object DataBangunRuang {
    private val NamaBangunRuang = arrayOf("BALOK",
    "KUBUS",
    "BOLA",
    "KERUCUT",
    "TABUNG",
    "LIMAS")

    private val PenjelasanBangunRuang = arrayOf("Balok adalah bangun ruang tiga dimensi yang dibentuj oeh tiga pasang" +
    " persegi atau persegi panjang, dengan paling tidak satu pasang di antarnya berukuran berbeda." +
    " Balok memiliki 6 sisi, 12 rusuk dan 8 titik sudut. Balok yang dibentuk oleh enam persegi sama dan " +
    "sebangun disebut sebagai kubus,", "Dalam geometri, kubus adalah bangun runag tiga dimensi yang dibatasi oleh" +
    " enam bidang sisi yang kongruen berbentuk bujur sangkar. Kubus memiliki 6 sisi, 12 rusuk, dan 8 titik sudut. " +
    "Kubus juga disebut dengan Bidang enam beraturan, selain itu kubus juga merupakan bentuk khusus dalam " +
    "prisma segi empat", "Bangun dengan sisi lengkung yang tersusun dari lingkaran yang tidak terhingga." +
    " Lingkaran ini berpusat di satu titik, yaitu titik pusat bangun runag bola.", "Dalam geometri," +
    " keucut adalah sebuah limas istimewa yang beralas lingkaran. Kerucut memiliki 2 sisi, 1 ruduk dan 1 titik sudut." +
    " Sisi tegak kerucut tidak berupa segitiga tapi berupa bidang miring yang disebut selimut kerucut.", "tabung atau" +
    " dan sebuah persegi panjang yang mengelilingi kedua lingkatan tersebut. Tabung memiliki 3 sisi dan 2 rusuk.", "Dalam geometri" +
    " limas adalah bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n dan sisi-sisi tegak" +
    " berbentuk segitiga. Limas memiliki n + 1 sisi, 2n rusuk dan n + 1 titik sudut")

    private val GambarBangunRuang = intArrayOf(R.drawable.balok,
        R.drawable.kubus,
        R.drawable.bola,
        R.drawable.kerucut,
        R.drawable.tabung,
        R.drawable.limas)

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