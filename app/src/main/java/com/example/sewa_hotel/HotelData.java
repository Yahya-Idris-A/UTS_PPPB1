package com.example.sewa_hotel;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class HotelData {
    private static String [] hotelName = {
            "Mahali Mzuri",
            "Nayara Tented Camp",
            "The Opposite House",
            "Capella Bangkok",
            "Capella Ubud",
            "Grace Santorini Hotel",
            "Kamalame Cay",
            "The Oberoi Udaivilas",
            "The Temple House",
            "The Oberoi New Delhi",
            "Hotel Paracas",
            "Taj Holiday Village Resort & Spa"
    };

    private static String [] hotelPrice = {
            "Rp 27.00.000/kamar/malam",
            "Rp 18.000.000/kamar/malam",
            "Rp 6.000.000/kamar/malam",
            "Rp 11.500.000/kamar/malam",
            "Rp 13.600.000/kamar/malam",
            "Rp 13.000.000/kamar/malam",
            "Rp 4.300.000/kamar/malam",
            "Rp 8.000.000/kamar/malam",
            "Rp 19.000.000/kamar/malam",
            "Rp 2.700.000/kamar/malam",
            "Rp 7.000.000/kamar/malam",
            "Rp 4.000.000/kamar/malam"
    };

    public static String [] hotelDesc = {
            "Terletak strategis di Narok yang merupakan bagian Narok, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Properti bintang-5 ini dilengkapi dengan berbagai fasilitas untuk menunjang kualitas dan kenyamanan selama Anda menginap.",
            "Terletak strategis di Palma yang merupakan bagian La Fortuna, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik.",
            "Awali liburan Anda dengan luar biasa dengan menginap di properti ini, yang menawarkan Wi-Fi gratis di semua kamar. Terletak strategis di Jalan Sanlitun Bar & Area Kedutaan Besar, memungkinkan Anda akses dan jarak yang dekat ke atraksi dan objek wisata lokal. Jangan pulang dulu sebelum berkunjung ke Tembok Cina (Mu Tian Yu) yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke pusat kebugaran, kolam renang dalam ruangan dan restoran untuk para tamu di properti.",
            "Terletak strategis di Bangkok Riverside yang merupakan bagian Bangkok, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Properti bintang-5 ini dilengkapi dengan berbagai fasilitas untuk menunjang kualitas dan kenyamanan selama Anda menginap.",
            "Selain standar dari Indonesia Care, semua tamu akan mendapatkan Wi-Fi gratis di semua kamar dan parkir gratis jika tiba dengan mobil. Terletak strategis di Ubud yang merupakan bagian Bali, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Jangan pulang dulu sebelum berkunjung ke Sacred Monkey Forest Sanctuary yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke pemandian mata air panas, kolam renang luar ruangan dan pijat untuk para tamu di properti.",
            "Awali liburan Anda dengan luar biasa dengan menginap di properti ini, yang menawarkan Wi-Fi gratis di semua kamar. Terletak strategis di Imerovigli, memungkinkan Anda akses dan jarak yang dekat ke atraksi dan objek wisata lokal. Jangan pulang dulu sebelum berkunjung ke Bandara Nasional Santorini yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke pemandian mata air panas, kolam renang luar ruangan dan pijat untuk para tamu di properti.",
            "Selain standar dari SHA Plus, semua tamu akan mendapatkan Wi-Fi gratis di semua kamar dan parkir gratis jika tiba dengan mobil. Terletak strategis di Kamala yang merupakan bagian Phuket, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Jangan pulang dulu sebelum berkunjung ke Bangla Road yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke ruang uap, kolam renang luar ruangan dan pijat untuk para tamu di properti.",
            "Rasakan pengalaman menginap di vila resort yang sempurna di The Oberoi Udaivilas Udaipur Hotel. Terletak strategis di Lake City yang merupakan bagian Udaipur, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Jangan pulang dulu sebelum berkunjung ke City Palace of Udaipur yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke kolam renang luar ruangan, pijat dan pusat kebugaran untuk para tamu di properti.",
            "Parkir mobil dan Wi-Fi selalu gratis, sehingga Anda dapat terus terhubung serta datang dan pergi kapan saja. Terletak strategis di Area Komersial Chunxi Road, memungkinkan Anda akses dan jarak yang dekat ke atraksi dan objek wisata lokal. Jangan pulang dulu sebelum berkunjung ke Giant Panda Breeding Research Base (Xiongmao Jidi) yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke pemandian mata air panas, ruang uap dan pijat untuk para tamu di properti.",
            "Terletak strategis di Delhi Pusat yang merupakan bagian New Delhi dan NCR, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Properti bintang-5 ini dilengkapi dengan berbagai fasilitas untuk menunjang kualitas dan kenyamanan selama Anda menginap.",
            "Parkir mobil dan Wi-Fi selalu gratis, sehingga Anda dapat terus terhubung serta datang dan pergi kapan saja. Terletak strategis di El Golf yang merupakan bagian Paracas, properti ini menempatkan Anda dekat dengan atraksi dan opsi restoran menarik. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke ruang uap, kolam renang luar ruangan dan pijat untuk para tamu di properti.",
            "Awali liburan Anda dengan luar biasa dengan menginap di properti ini, yang menawarkan Wi-Fi gratis di semua kamar. Terletak strategis di Candolim, memungkinkan Anda akses dan jarak yang dekat ke atraksi dan objek wisata lokal. Jangan pulang dulu sebelum berkunjung ke Pantai Baga yang terkenal. Memiliki peringkat bintang-5, properti berkelas ini menyediakan akses ke ruang uap, kolam renang luar ruangan dan pijat untuk para tamu di properti."
    };

    public static String [] hotelFitur = {
            "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Pijat\n" +
                    "Sauna\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Layanan kamar\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "Concierge\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Penitipan barang\n" +
                    "Teras\n" +
                    "Tersedia bukti bayar\n" +
                    "Ruang keluarga\n" +
                    "Kamar bebas asap rokok\n" +
                    "Resepsionis 24 jam\n" +
                    "Shuttle bandara",
            "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Bilyar\n" +
                    "Dartboard\n" +
                    "Hiburan di properti\n" +
                    "Kamar uap\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang permainan\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Aplikasi layanan kamar hotel\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Happy hour\n" +
                    "Kedai kopi\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Properti bebas asap rokok\n" +
                    "Teras\n" +
                    "Tersedia bukti bayar\n" +
                    "Toko serba ada\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Ruang keluarga\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di luar properti\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas alergi\n" +
                    "Kamar bebas asap rokok\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir mobil gratis",
            "Akses kursi roda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kolam renang dalam ruangan\n" +
                    "Layanan tiket\n" +
                    "Pusat kebugaran\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "disinfeksi harian\n" +
                    "Disinfeksi harian di semua kamar\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "masker gratis\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Penutup wajah bagi staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Dapur\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar 24 jam\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan perawatan hewan\n" +
                    "Layanan pos\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pemanas ruangan di area umum\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penjaga pintu\n" +
                    "Penukaran mata uang\n" +
                    "Properti bebas asap rokok\n" +
                    "Teras\n" +
                    "Tersedia bukti bayar\n" +
                    "Toko\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "Check-in/check-out ekspres\n" +
                    "Check-in/check-out pribadi\n" +
                    "Check-in 24 jam\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Kamar kedap suara\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan taksi\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir di dekat properti\n" +
                    "Tempat parkir di properti\n" +
                    "Tempat parkir mobil dengan biaya tambahan\n" +
                    "Tempat parkir mobil gratis\n" +
                    "Tempat pengisian listrik mobil\n" +
                    "Penyewaan sepeda",
            "Akses kursi roda\n" +
                    "Sepeda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Arena bowling\n" +
                    "Hiburan di properti\n" +
                    "Kamar uap\n" +
                    "Klub malam\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Lapangan golf mini\n" +
                    "Lapangan squash\n" +
                    "Lapangan tenis\n" +
                    "Layanan tiket\n" +
                    "Memancing\n" +
                    "Mendaki\n" +
                    "Menunggang kuda\n" +
                    "Menyelam\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang permainan\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Snorkeling\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Aplikasi layanan kamar hotel\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Layanan sanitasi kelas profesional\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Sekat pelindung di area umum\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Fasilitas BBQ\n" +
                    "Happy hour\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan perawatan hewan\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Properti bebas asap rokok\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Tersedia bukti bayar\n" +
                    "Lapangan golf (dalam 3 km)\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Ruang keluarga\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Check-in/check-out ekspres\n" +
                    "Check-in/check-out pribadi\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas alergi\n" +
                    "Kamar bebas asap rokok\n" +
                    "Kamar kedap suara\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Tempat parkir mobil gratis",
            "Sepeda\n" + "Layanan Internet\n" + "WiFi di tempat umum\n" + "WiFi gratis di semua kamar\n" +
                    "Bilyar\n" +
                    "Fasilitas rekreasi outdoor\n" +
                    "Hiburan di properti\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dalam ruangan\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Layanan tiket\n" +
                    "Memancing\n" +
                    "Mendaki\n" +
                    "Menyelam\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Snorkeling\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Aplikasi layanan kamar hotel\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "disinfeksi harian\n" +
                    "Disinfeksi harian di semua kamar\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Layanan sanitasi kelas profesional\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Penutup wajah bagi staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sekat pelindung di area umum\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Pemandian air panas\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Dapur\n" +
                    "Fasilitas BBQ\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar 24 jam\n" +
                    "Restoran\n" +
                    "Sarapan gratis\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan pos\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Perapian\n" +
                    "Perpustakaan\n" +
                    "Teras\n" +
                    "Tersedia bukti bayar\n" +
                    "Toko suvenir\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Ruang keluarga\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Check-in/check-out ekspres\n" +
                    "Check-in/check-out pribadi\n" +
                    "Check-in 24 jam\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan shuttle\n" +
                    "Layanan taksi\n" +
                    "Parkir sepeda\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir di dekat properti\n" +
                    "Tempat parkir di properti\n" +
                    "Tempat parkir mobil gratis\n" +
                    "Penyewaan sepeda\n" +
                    "AC\n" +
                    "AC terpisah\n" +
                    "Air mineral kemasan\n" +
                    "Akses WiFi gratis\n" +
                    "Bak mandi\n" +
                    "Balkon/teras\n" +
                    "Bar mini\n" +
                    "Brankas\n" +
                    "Cermin\n" +
                    "Hand sanitizer\n" +
                    "Handuk\n" +
                    "Jaring anti nyamuk\n" +
                    "Kamar mandi pribadi\n" +
                    "Kipas angin\n" +
                    "Kolam renang pribadi\n" +
                    "Kopi instan\n" +
                    "Layanan kebersihan harian\n" +
                    "Meja\n" +
                    "Mesin pembuat teh/kopi\n" +
                    "Minuman selamat datang\n" +
                    "Pancuran\n" +
                    "Pengering rambut\n" +
                    "Penggunaan sepeda gratis\n" +
                    "Perlengkapan mandi\n" +
                    "Sandal dalam kamar\n" +
                    "Sofa\n" +
                    "Teh\n" +
                    "Telepon\n" +
                    "Tempat menyimpan laptop\n" +
                    "Tirai kedap cahaya",
            "Penyewaan WiFi portabel\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Layanan tiket\n" +
                    "Memancing\n" +
                    "Mendaki\n" +
                    "Menyelam\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang yoga\n" +
                    "Snorkeling\n" +
                    "Spa\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "masker gratis\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Pemandian air panas\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Layanan kamar 24 jam\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan pos\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pemanas ruangan di area umum\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Perpustakaan\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Alarm kebakaran\n" +
                    "Check-in/check-out ekspres\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Properti khusus dewasa\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan shuttle\n" +
                    "Layanan taksi\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir di dekat properti\n" +
                    "Tempat parkir mobil gratis\n" +
                    "Penyewaan sepeda",
            "Menghadap Pantai\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Bilyar\n" +
                    "Kamar uap\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dalam ruangan\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan tenis\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang permainan\n" +
                    "Ruang yoga\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "disinfeksi harian\n" +
                    "Disinfeksi harian di semua kamar\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Penutup wajah bagi staf\n" +
                    "peralatan sterilisasi\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Sekat pelindung di area umum\n" +
                    "sertifikasi kebersihan\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Buah/camilan\n" +
                    "Fasilitas BBQ\n" +
                    "Happy hour\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar\n" +
                    "Minuman beralkohol\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan pos\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penjaga pintu\n" +
                    "Penukaran mata uang\n" +
                    "Perpustakaan\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Toko\n" +
                    "Toko serba ada\n" +
                    "Toko suvenir\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan shuttle\n" +
                    "Layanan taksi\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir di dekat properti\n" +
                    "Tempat parkir di properti\n" +
                    "Tempat parkir mobil gratis\n" +
                    "AC\n" +
                    "Air mineral kemasan\n" +
                    "Akses internet - WiFi\n" +
                    "Akses WiFi gratis\n" +
                    "Fasilitas setrika",
            "Akses kursi roda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Hiburan di properti\n" +
                    "Kolam renang luar ruangan\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Aplikasi layanan kamar hotel\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Sekat pelindung di area umum\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Fasilitas BBQ\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar 24 jam\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan perawatan hewan\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Perpustakaan\n" +
                    "Properti bebas asap rokok\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Toko\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Ruang keluarga\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Check-in/check-out ekspres\n" +
                    "Check-in/check-out pribadi\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan shuttle\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir mobil gratis\n" +
                    "AC\n" +
                    "Air mineral kemasan\n" +
                    "Akses internet - LAN\n" +
                    "Akses internet LAN di kamar (dengan biaya tambahan)\n" +
                    "Akses internet - WiFi\n" +
                    "Area tempat duduk\n" +
                    "Bak mandi\n" +
                    "Bak mandi dan pancuran terpisah\n" +
                    "Bar mini\n" +
                    "Bebas asap rokok\n" +
                    "Brankas\n" +
                    "Jam weker\n" +
                    "Jubah mandi\n" +
                    "Kedap suara\n" +
                    "Kipas angin\n" +
                    "Koran harian\n" +
                    "Layanan dibangunkan tidur\n" +
                    "Meja\n" +
                    "Mesin pembuat teh/kopi\n" +
                    "Pancuran\n" +
                    "Pemutar DVD/CD\n" +
                    "Pengering rambut\n" +
                    "Penghangat ruangan\n" +
                    "Telepon\n" +
                    "Tirai kedap cahaya\n" +
                    "TV layar datar\n" +
                    "WiFi dengan biaya tambahan",
            "Akses kursi roda\n" +
                    "Sepeda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kamar uap\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dalam ruangan\n" +
                    "Layanan tiket\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Sauna\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "disinfeksi harian\n" +
                    "Disinfeksi harian di semua kamar\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Penutup wajah bagi staf\n" +
                    "peralatan sterilisasi\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "sertifikasi kebersihan\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Pemandian air panas\n" +
                    "Bar\n" +
                    "Dapur\n" +
                    "Fasilitas BBQ\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar 24 jam\n" +
                    "Pengiriman bahan makanan\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan perawatan hewan\n" +
                    "Layanan pos\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pemanas ruangan di area umum\n" +
                    "Penarikan uang tunai\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Perpustakaan\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Toko\n" +
                    "Toko suvenir\n" +
                    "Ruang keluarga\n" +
                    "Anjing diperbolehkan\n" +
                    "Check-in/check-out ekspres\n" +
                    "Check-in/check-out pribadi\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Kamar kedap suara\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Layanan taksi\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Tempat parkir di properti\n" +
                    "Tempat parkir mobil gratis\n" +
                    "AC\n" +
                    "Air mineral kemasan\n" +
                    "Area tempat duduk\n" +
                    "Bak mandi\n" +
                    "Bar mini\n" +
                    "Brankas\n" +
                    "Fasilitas setrika\n" +
                    "Handuk\n" +
                    "Jam weker\n" +
                    "Jubah mandi\n" +
                    "Kamar ganti\n" +
                    "Kamar mandi pribadi\n" +
                    "Kedap suara\n" +
                    "Kulkas\n" +
                    "Lantai karpet\n" +
                    "Lantai kayu/parket\n" +
                    "Layanan dibangunkan tidur\n" +
                    "Lemari pakaian\n" +
                    "Linen\n" +
                    "Meja\n" +
                    "Mesin pembuat teh/kopi\n" +
                    "Pancuran\n" +
                    "Pengering rambut\n" +
                    "Perlengkapan mandi\n" +
                    "Produk pembersih\n" +
                    "Rak pakaian\n" +
                    "Sandal dalam kamar\n" +
                    "Sofa\n" +
                    "Telepon\n" +
                    "Tempat tidur ekstra panjang\n" +
                    "TV satelit/kabel\n" +
                    "Whirlpool",
            "Akses kursi roda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kolam renang luar ruangan\n" +
                    "Pusat kebugaran\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Aplikasi layanan kamar hotel\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Sekat pelindung di area umum\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Fasilitas BBQ\n" +
                    "Layanan kamar\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan perawatan hewan\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pemanas ruangan di area umum\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Properti bebas asap rokok\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Lapangan golf (dalam 3 km)\n" +
                    "Layanan penitipan anak\n" +
                    "Menu khusus anak\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Check-in/check-out ekspres\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas alergi\n" +
                    "Kamar bebas asap rokok\n" +
                    "Kamar kedap suara\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir mobil gratis",
            "Akses difabel di beberapa ruang pertemuan\n" +
                    "Akses kamar dan suite melalui koridor luar\n" +
                    "Akses semua kamar melalui koridor dalam\n" +
                    "Akses TTY/TTD di beberapa kamar\n" +
                    "Alarm suara di semua kamar dan suite tamu\n" +
                    "Alarm suara di semua lorong umum\n" +
                    "Alarm visual di semua kamar dan suite tamu\n" +
                    "Alarm visual di semua lorong umum\n" +
                    "Beberapa kamar dengan fasilitas untuk gangguan pendengaran\n" +
                    "Dudukan bak mandi di beberapa kamar\n" +
                    "Dudukan toilet setinggi kursi roda – beberapa kamar\n" +
                    "Fasilitas untuk mobilitas terbatas di beberapa kamar\n" +
                    "Gagang pintu di semua kamar tamu\n" +
                    "Jendela kamar yang dapat dibuka\n" +
                    "Kamar akses difabel dengan pintu yang dapat dibuka 32 inch\n" +
                    "Kunci kamar elektronik\n" +
                    "Kunci kedua di semua jendela kamar\n" +
                    "Kunci pintu di semua kamar dan suite tamu\n" +
                    "Lift\n" +
                    "Lift otomatis ke beberapa kolam renang hotel\n" +
                    "Meja concierge dengan akses difabel\n" +
                    "Meja resepsionis dengan akses difabel\n" +
                    "Meja rias khusus tamu difabel di beberapa kamar\n" +
                    "Parkir mandiri khusus tamu difabel di properti\n" +
                    "Pintu masuk dengan akses difabel ke beberapa kolam renang\n" +
                    "Pintu masuk ke pusat bisnis\n" +
                    "Pintu masuk ke pusat kebugaran\n" +
                    "Pintu masuk ke spa\n" +
                    "Pintu tutup otomatis di semua kamar dan suite tamu\n" +
                    "Pintu utama\n" +
                    "Rantai dan/atau kait pengaman di beberapa pintu kamar tamu\n" +
                    "Restoran / lounge dengan akses difabel\n" +
                    "Roll-in shower di beberapa kamar\n" +
                    "Rute dengan akses difabel ke meja resepsionis\n" +
                    "Rute khusus ke kamar tamu difabel\n" +
                    "Soket listrik rendah di beberapa kamar\n" +
                    "Telepon dengan jam alarm di semua kamar\n" +
                    "TV dengan teks bantu\n" +
                    "Sepeda\n" +
                    "Layanan Internet\n" +
                    "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Hiburan di properti\n" +
                    "Kamar uap\n" +
                    "Kolam air panas\n" +
                    "Kolam renang dalam ruangan\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Layanan tiket\n" +
                    "Mendaki\n" +
                    "Naik kano\n" +
                    "Olahraga air (tanpa mesin)\n" +
                    "Pantai pribadi\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang permainan\n" +
                    "Ruang yoga\n" +
                    "Sauna\n" +
                    "Selancar angin\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "disinfeksi harian\n" +
                    "Disinfeksi harian di semua kamar\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "kotak P3K\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Penutup wajah bagi staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sarapan di dalam kamar\n" +
                    "Sekat pelindung di area umum\n" +
                    "sertifikasi kebersihan\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Dapur\n" +
                    "Layanan kamar 24 jam\n" +
                    "Penyiapan makanan khusus\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan kebersihan harian\n" +
                    "Layanan setrika\n" +
                    "Pemanas ruangan di area umum\n" +
                    "Penarikan uang tunai\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penjaga pintu\n" +
                    "Penukaran mata uang\n" +
                    "Properti bebas asap rokok\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Toko\n" +
                    "Toko suvenir\n" +
                    "Lapangan golf (dalam 3 km)\n" +
                    "Kolam renang anak\n" +
                    "Menu khusus anak\n" +
                    "Ruang keluarga\n" +
                    "Taman bermain\n" +
                    "Tempat main anak\n" +
                    "Alarm kebakaran\n" +
                    "CCTV di area umum\n" +
                    "CCTV di luar properti\n" +
                    "Check-in/check-out ekspres\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Kamar kedap suara\n" +
                    "Keamanan 24 jam\n" +
                    "Resepsionis 24 jam\n" +
                    "Tabung pemadam api\n" +
                    "Layanan shuttle\n" +
                    "Parkir valet\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir di properti\n" +
                    "Tempat parkir mobil gratis\n" +
                    "Penyewaan sepeda\n" +
                    "AC\n" +
                    "AC terpisah\n" +
                    "Adaptor\n" +
                    "Air mineral kemasan\n" +
                    "Bak mandi dan pancuran terpisah\n" +
                    "Bar mini\n" +
                    "Board game/puzzle\n" +
                    "Brankas\n" +
                    "Buku/DVD/musik untuk anak-anak\n" +
                    "Fasilitas kolam renang\n" +
                    "Fitur keselamatan/keamanan\n" +
                    "Hand sanitizer\n" +
                    "Handuk\n" +
                    "Jam weker\n" +
                    "Jubah mandi\n" +
                    "Kamar ganti\n" +
                    "Kamar mandi pribadi\n" +
                    "Kedap suara\n" +
                    "Lemari pakaian\n" +
                    "Linen\n" +
                    "Meja\n" +
                    "Mesin pembuat teh/kopi\n" +
                    "Pancuran\n" +
                    "Pendeteksi asap\n" +
                    "Pengering rambut\n" +
                    "Perlengkapan kenyamanan tidur\n" +
                    "Perlengkapan mandi\n" +
                    "Radio\n" +
                    "Rak pakaian\n" +
                    "Sandal dalam kamar\n" +
                    "Soket dekat kasur\n" +
                    "Telepon\n" +
                    "Telepon di kamar mandi\n" +
                    "Tempat menyimpan laptop\n" +
                    "Tempat sampah\n" +
                    "Timbangan\n" +
                    "TV satelit/kabel",
            "WiFi di tempat umum\n" +
                    "WiFi gratis di semua kamar\n" +
                    "Kamar uap\n" +
                    "Kolam renang dengan pemandangan\n" +
                    "Kolam renang luar ruangan\n" +
                    "Lapangan golf di properti\n" +
                    "Lapangan golf mini\n" +
                    "Lapangan squash\n" +
                    "Lapangan tenis\n" +
                    "Pijat\n" +
                    "Pusat kebugaran\n" +
                    "Ruang permainan\n" +
                    "Sauna\n" +
                    "Spa\n" +
                    "Taman\n" +
                    "Tenis meja\n" +
                    "Tur\n" +
                    "Alat tulis ditiadakan\n" +
                    "Dapur dan peralatan makan steril\n" +
                    "dokter/perawat panggilan\n" +
                    "hand sanitizer\n" +
                    "Jarak fisik minimal 1 meter\n" +
                    "Kamar dikunci setelah sterilisasi\n" +
                    "kotak P3K\n" +
                    "Layanan pembayaran non-tunai\n" +
                    "Layanan sanitasi kelas profesional\n" +
                    "Layanan sarapan bawa pulang\n" +
                    "masker gratis\n" +
                    "Opsi makanan dibungkus terpisah\n" +
                    "Pencucian seprai dan pakaian dengan air panas\n" +
                    "Pengaturan tempat makan yang aman\n" +
                    "pengecekan suhu tubuh untuk tamu dan staf\n" +
                    "Produk kebersihan anti virus\n" +
                    "Sekat pelindung di area umum\n" +
                    "Staf terlatih untuk protokol keselamatan\n" +
                    "Sterilisasi kamar sebelum tamu check-in\n" +
                    "termometer tubuh\n" +
                    "Tersedia opsi tidak mensterilkan kamar\n" +
                    "Bar\n" +
                    "Bar tepi kolam\n" +
                    "Kedai kopi\n" +
                    "Layanan kamar 24 jam\n" +
                    "Restoran\n" +
                    "AC di area umum\n" +
                    "Area merokok\n" +
                    "Check-in/check-out bebas kontak\n" +
                    "Concierge\n" +
                    "Cuci kering\n" +
                    "Fasilitas rapat/perjamuan\n" +
                    "Fasilitas untuk tamu disabilitas\n" +
                    "Kotak penyimpanan barang berharga\n" +
                    "Laundry\n" +
                    "Layanan setrika\n" +
                    "Lift\n" +
                    "Pengantaran makanan\n" +
                    "Penitipan barang\n" +
                    "Penukaran mata uang\n" +
                    "Salon\n" +
                    "Teras\n" +
                    "Toko\n" +
                    "Kolam renang anak\n" +
                    "Layanan penitipan anak\n" +
                    "Ruang keluarga\n" +
                    "Tempat main anak\n" +
                    "Hewan peliharaan diperbolehkan\n" +
                    "Kamar bebas asap rokok\n" +
                    "Resepsionis 24 jam\n" +
                    "Layanan shuttle\n" +
                    "Parkir valet\n" +
                    "Penyewaan mobil\n" +
                    "Shuttle bandara\n" +
                    "Tempat parkir mobil gratis\n" +
                    "AC\n" +
                    "Air mineral kemasan\n" +
                    "Akses internet - WiFi\n" +
                    "Akses WiFi gratis\n" +
                    "Area tempat duduk\n" +
                    "Bar mini\n" +
                    "Bebas asap rokok\n" +
                    "Fasilitas setrika\n" +
                    "Kipas angin\n" +
                    "Meja\n" +
                    "Mesin pembuat teh/kopi\n" +
                    "Pancuran\n" +
                    "Pengering rambut\n" +
                    "TV satelit/kabel"

    };

    private static int [] hotelImage = {
            R.drawable.mahali_mzuri,
            R.drawable.nayara_tented_camp,
            R.drawable.the_opposite_house,
            R.drawable.capella_bangkok,
            R.drawable.capella_ubud,
            R.drawable.grace_hotel,
            R.drawable.kamalame_cay,
            R.drawable.the_oberoi_udaivilas,
            R.drawable.the_temple_house_chengdu,
            R.drawable.the_oberoi_new_delhi,
            R.drawable.hotel_paracas,
            R.drawable.taj_holiday_village
    };

    @NonNull
    static ArrayList<Hotel> getListData(){
        ArrayList<Hotel> list = new ArrayList<>();
        for (int position = 0; position < hotelName.length; position++) {
            Hotel hotel = new Hotel();
            hotel.setNama(hotelName[position]);
            hotel.setHarga(hotelPrice[position]);
            hotel.setDeskripsi(hotelDesc[position]);
            hotel.setFasilitas(hotelFitur[position]);
            hotel.setPhoto(hotelImage[position]);
            list.add(hotel);
        }
        return list;
    }
}