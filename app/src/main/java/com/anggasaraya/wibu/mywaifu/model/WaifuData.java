package com.anggasaraya.wibu.mywaifu.model;

import com.anggasaraya.wibu.mywaifu.R;

import java.util.ArrayList;

public class WaifuData {
    private static int[] waifuImages = {
            R.drawable.kuriyama,
            R.drawable.shinoa,
            R.drawable.reina,
            R.drawable.miko,
            R.drawable.tomori,
            R.drawable.emilia,
            R.drawable.hinata,
            R.drawable.asuna,
            R.drawable.kaguya,
            R.drawable.ai
    };

    private static String[] waifuNames = {
            "Kuriyama Mirai",
            "Shinoa Hiragi",
            "Izumi Reina",
            "Iino Miko",
            "Nao Tomori",
            "Emilia",
            "Hinata Hyuga",
            "Yuuki Asuna",
            "Kaguya Shinomia",
            "Hayasaka Ai"
    };

    private static String[] waifuAnime = {
            "Kyoukai no Kanata",
            "Owari no Seraph",
            "Musaigen no Phantom World",
            "Kaguya-Sama wa Kokurasaetai",
            "Charlotte",
            "Re:Zero",
            "Naruto Shippuden",
            "Sword Art Online",
            "Kaguya-Sama wa Kokurasaetai",
            "Kaguya-Sama wa Kokurasaetai"
    };

    private static String[] waifuBirth = {
            "31 Maret",
            "25 Desember",
            "3 Maret",
            "5 Mei",
            "8 Mei",
            "23 September",
            "27 Desember",
            "30 September",
            "1 Januari",
            "2 April"
    };

    private static String[] waifuZodiak = {
            "Aries",
            "Capricorn",
            "Pisces",
            "Taurus",
            "Taurus",
            "Libra",
            "Capricorn",
            "Libra",
            "Capricorn",
            "Aries"
    };

    private static String[] waifuAges = {
            "14 tahun",
            "15 tahun",
            "15 tahun",
            "16 tahun",
            "18 tahun",
            "15 tahun",
            "19 tahun",
            "16 tahun",
            "18 tahun",
            "17 tahun"
    };

    private static String[] waifuBloods = {
            "A",
            "AB",
            "A",
            "O",
            "-",
            "-",
            "AB",
            "-",
            "AB",
            "AB"
    };

    private static String[] waifuHeightBody = {
            "152 cm",
            "150 cm",
            "157 cm",
            "147 cm",
            "154 cm",
            "164 cm",
            "163 cm",
            "168 cm",
            "156 cm",
            "-"
    };

    private static String[]  waifuAbout = {
            "Mirai Kuriyama (栗山 未来, Kuriyama Mirai) adalah deuteragonis dari serial Kyoukai no Kanata. " +
                    "Dia adalah siswa tahun pertama dan anggota Klub Sastra sekolah. " +
                    "Dia berasal dari garis keturunan Prajurit Dunia Roh yang memiliki kemampuan manipulasi darah. " +
                    "Namun, karena kemampuan ini dianggap sesat di antara klan Spirit World Warrior, dia dijauhi.",
            "Shinoa Hīragi (柊 シノア, Hīragi Shinoa) adalah protagonis wanita utama dari serial manga Seraph of the End: Vampire Reign dan adik dari Mahiru Hīragi. " +
                    "Dia berasal dari Keluarga Hīragi yang bergengsi dan kaya dan ditunjuk sebagai supervisor Yūichirō Hyakuya selama skorsingnya. " +
                    "Dia adalah seorang sersan dari Tentara Iblis Kekaisaran Jepang dan pemimpin Pasukan Shinoa (シ ノ ア 隊, Shinoa-tai) Di Perusahaan Setan Bulan. " +
                    "Dia akhirnya dirasuki oleh Shikama Dōji yang menghancurkan kemanusiaannya.",
            "Reina Izumi (和 泉 玲奈, Izumi Reina) Adalah seorang gadis yang dipindahkan ke Akademi Hosea pada bulan April. Dia adalah seorang gadis yang memiliki kemampuan khusus, " +
                    "yang kemudian bergabung dengan klub Haruhiko: klub pemburu phantom, Tim E. Dia adalah salah satu karakter utama dari seri Musaigen no Phantom World.",
            "Miko Iino (伊井野 ミコ, Iino Miko) adalah semi-heroine dalam serial Kaguya-sama wa Kokurasetai. Dia adalah siswi sekolah menengah tahun pertama di Akademi Shuchi'in, " +
                    "anggota Komite Moral Publik, dan auditor Dewan Mahasiswa saat ini.\n\n" +
                    "Miko adalah seorang gadis muda bertubuh pendek mungil dengan mata coklat dan rambut coklat panjang yang ditata dengan kuncir longgar, dengan poni menutupi dahinya. " +
                    "Ketika berseragam SMA Akademi Shuchi'in, dia memakai stoking hitam dan ban lengan kuning di lengan kirinya untuk membedakan dirinya sebagai anggota Komite Kedisiplinan.",
            "Nao Tomori (友 利 奈 緒, Tomori Nao) adalah salah satu karakter utama Charlotte. Dia adalah siswa tahun pertama dan ketua OSIS Akademi Hoshinoumi. Nao sering menggunakan camcordernya " +
                    "untuk merekam kekuatan kemampuan pengguna sebagai bukti dan merupakan penggemar berat ZHIEND, band favorit kakak laki-lakinya.\n\n" +
                    "Nao adalah seorang gadis muda dengan rambut abu-abu panjang yang kadang-kadang muncul pirang pucat atau putih sepanjang episode. " +
                    "Rambutnya diikat menjadi dua ekor dengan ikat rambut berwarna gelap dan bermata biru besar. " +
                    "Ia sering terlihat mengenakan seragamnya yang terdiri dari blazer merah dengan dasi kupu-kupu kuning, " +
                    "dan rok lipit berwarna coklat kemerahan. Seragam sekolahnya juga terdiri dari kaus kaki selutut abu-abu dengan sepatu bot coklat.",
            "Emilia (エ ミ リ ア) adalah tokoh utama dari seri Re: Zero kara Hajimeru Isekai Seikatsu. Dia adalah Half Elf dan kandidat untuk menjadi Raja Lugnica ke-42. " +
                    "Setelah Arc 4, Subaru resmi menjadi knightnya.\n\n" +
                    "Emilia adalah Half-Elf cantik dengan rambut perak panjang dan mata biru keunguan. Dia mengenakan pakaian putih dan ungu bersama dengan bunga putih di rambutnya. " +
                    "Sepanjang seri, dia menata rambutnya dengan berbagai cara.",
            "Hinata Uzumaki (うずまきヒナタ, Uzumaki Hinata; née Hyūga (日向, Hyūga)) adalah anggota klan Hyūga dan Uzumaki dari Konohagakure. Karena cenderung lemah lembut, kurangnya kepercayaan diri Hinata yang tercermin dalam kemampuannya " +
                    "— sifat yang menyebabkan ayahnya menganggap bahwa ia tidak cocok untuk posisinya sebagai pewaris klan. Dia selalu mengamati Naruto Uzumaki, Hinata telah menemukan sebuah contoh untuk diikuti agar menjadi lebih tegas, " +
                    "dan juga seseorang untuk dicintai. Dalam keanggotaannya dengan Tim Kurenai, dia berusaha untuk menjadi cukup kuat agar mengubah dirinya sendiri, jika bahkan sedikit demi sedikit. Dengan selalu latihan bersama Neji Hyuga ia menjadi lebih kuat dengan semangat Naruto.",
            "Yuuki Asuna (結 城 明日 奈, Yūki Asuna) adalah putri dari mantan CEO RECT Inc. Asuna adalah salah satu dari 10.000 pemain yang terperangkap di Sword Art Online, di mana dia adalah sub-pemimpin dari guild Knights of the Blood (KoB). Keterampilannya dengan rapier membuatnya mendapatkan julukan The Flash (閃光, Senkō).\n\n" +
                    "Asuna memiliki rambut kastanye panjang berwarna oranye kecoklatan dan mata cokelat. Pada tingkat awal SAO, dia mengenakan tunik kulit merah tua dengan pelindung dada tembaga ringan dan celana kulit dengan sepatu bot sampai ke lutut bersama dengan jubah berkerudung. Setelah bergabung dengan Knights of the Blood, " +
                    "dia mengenakan seragam merah dan putih yang dipakai semua anggota KoB dan menggunakan rapier yang dibuat oleh Lisbeth, yang disebut Lambent Light. Setelah Insiden Ordinal Scale, Asuna mulai memakai cincin janji yang diberikan oleh Kazuto di jari manis kirinya.",
            "Kaguya Shinomiya (四 宮  か ぐ や, Shinomiya Kaguya) adalah salah satu protagonis dan karakter tituler dari seri Kaguya-sama wa Kokurasetai. Dia adalah siswi sekolah menengah tahun kedua di Akademi Shuchi'in, anggota Klub Panahan, " +
                    "dan Wakil ketua OSIS ke-67 dan ke-68.\n\n" +
                    "Kaguya adalah seorang gadis muda dengan rambut hitam panjang, kulit putih, tubuh langsing, mata merah, dan rambutnya selalu diikat dengan pita. Dulu sebelumnya, dia masuk OSIS dan selalu menggerai rambutnya tanpa pita merah ikonik. Kemudian, ketika menjadi lebih dekat dengan OSIS dan murid lain di sekolahnya, " +
                    "dia meminta pembantunya Hayasaka untuk membuatnya \"manis\". Pita adalah upayanya untuk membuat rambutnya tidak terlalu mencolok. Dia biasanya mengenakan seragam sekolah Shuchi'in.",
            "Ai Hayasaka (早坂 愛, Hayasaka Ai) adalah karakter pendukung dalam serial Kaguya-sama wa Kokurasetai. Dia adalah siswa tahun kedua di Akademi Shuchi'in dan mantan karyawan Grup Shinomiya, menjabat sebagai Kaguya Shinomiya pelayan.\n\n" +
                    "Ai adalah seorang gadis muda cantik dengan rambut pirang yang biasanya diikat di sisi kiri kepalanya dengan ikat rambut biru dan mata biru. Dia mengubah penampilan dan pilihan pakaiannya agar sesuai dengan peran yang berbeda dan menjalankan tugasnya sebagai pelayan Kaguya."

    };

    private static String[] animeDetail = {
            "Suatu hari, seorang pelajar SMU bernama Akihito Kanbara secara insting ingin berusaha menyelamatkan seorang siswi yang satu sekolah dengannya, Mirai Kuriyama, dari percobaan bunuh diri. " +
                "Ternyata, Mirai justru menusuk Akihito menggunakan pedang yang terbentuk dari darahnya. " +
                "Mirai sendiri terkejut, karena Akihito ternyata adalah seorang imortal \"setengah-youmu\", anak dari manusia dan sesosok makhluk supranatural youmu. " +
                "Setelah mengetahui bahwa Mirai adalah seorang Ksatria Dunia Arwah (Spirit World Warrior) dan merupakan yang terakhir dari klan keluarganya yang masih hidup, hidup keduanya menjadi terjalin. " +
                "Akihito membantu Mirai memperoleh kepercayaan dirinya untuk memburu youmu, sehingga akan dapat berhenti melakukan uji coba menusuk dirinya sebagai latihan.",
            "Pada tahun 2012, dunia diduga telah berakhir karena virus buatan manusia yang melanda penduduk dunia dan hanya menyisakan anak-anak berusia di bawah tiga belas tahun. " +
                    "Di saat yang sama vampir muncul. Mereka mengklaim telah menaklukkan dunia dan akan menjadi pelindung baru bagi manusia. " +
                    "\"Perlindungan\" ini harus dibayar dengan menyumbangkan darah kepada para vampir. " +
                    "Pada usia dua belas, Yuichiro, Mikaela dan teman-temannya dari Panti Asuhan Hyakuya berencana untuk melarikan diri dari para vampir. " +
                    "Namun, rencana ini gagal dan mengakibatkan kematian Mikaela dan lainnya yang mengorbankan diri agar Yuichiro dapat pergi. " +
                    "Kemudian Yuichiro diselamatkan oleh anggota Moon Demon Company, sebuah unit pemusnahan vampir milik Kekaisaran Iblis Tentara Jepang. " +
                    "Empat tahun kemudian, Yuichiro mendedikasikan hidupnya untuk menghancurkan vampir dan membalas dendam terhadap mereka untuk membunuh \"keluarga\" nya.",
            "Dunia sekarang berbeda dengan sebelumnya, hal-hal fiksi yang berada dalam imajinasi kini menjadi kenyataan hidup yang sekarang disebut sebagai “Phantom” " +
                    "yang berawal dari suatu kecelakaan yang membuat otak manusia mengalami banyak perubahan, hal ini menyebar ke seluruh manusia sampai sekarang dan akhirnya " +
                    "membuat para anak-anak yang baru lahir kemudian terjangkit dapat melihat dan berinteraksi dengan Phantom. Bercerita tentang seorang anak bernama Ichijou Haruhiko" +
                    " dan teman-temannya Izumi Reina, Kawakami Mai, Minase Koito, dan Kumamakura Kurumi yang tergabung dalam sebuah klub yang bertujuan untuk membasmi dan menyegel para " +
                    "Phantom yang sekiranya mengganggu kehidupan manusia.",
            "Kaguya Shinomiya dan Miyuki Shirogane, dua orang jenius anggota OSIS Akademi bergengsi, yang menjadikan mereka terelit di kalangan elit. Keduanya memiliki perasaan tertarik satu sama lain, " +
                    "Hanya saja ada satu masalah besar yang menghalangi jalan cinta kasih sayang mereka. Mereka berdua gengsi untuk menjadi orang pertama yang mengakui perasaan romantis mereka. Sehingga perang cinta antara mereka berdua pun dimulai.",
            "Remaja yang memiliki kemampuan spesial, jumlahnya sangat sedikit. " +
                    "Yuu Otosaka memanfaatkan kemapuannya untuk memuaskan dirinya di dalam kehidupan sekolah. " +
                    "Kemudian, dia bertemu dengan seorang gadis bernama Nao Tomori. " +
                    "Pertemuan mereka menjadi takdir pertemuan bagi para pemegang kekuatan spesial.",
            "Bercerita tentang Natsuki Subaru seorang NEET yang secara misterius terlempar ke dunia lain setelah keluar dari minimarket dekat rumahnya. " +
                    "Karena kepayahan dan kebodohan Subaru serta dirinya yang memang tak mempunyai kekuatan lain yang bisa digunakan untuk melindungi diri membuatnya beberapa kali merasakan kematian. " +
                    "Dan disinilah perjuangan Subaru, manusia tanpa kekuatan super yang hanya bisa bergantung dengan sikap pantang menyerah dan kemampuan mengulang kembali kematiannya ke suatu checkpoint dimulai!",
            "Lanjutan dari anime Naruto. Berkisah tentang Uzumaki Naruto yang sedang berusaha menyelamatkan Uchiha Sasuke dari Orochimaru. Setelah dua setengah tahun berlatih dengan Jiraiya-sensei, akhirnya Naruto kembali ke desa Konoha. " +
                    "Dengan ditemani oleh ninja Konoha lainnya, dia berjanji akan membawa pulang Sasuke. Akan tetapi dalam perjalanannya mereka harus menghadapi berbagai musuh yang lebih berbahaya, yaitu anggota organisasi Akatsuki.",
            "Sword Art Online (Sōdo Āto Onrain) adalah permainan VRMMORPG Online pertama yang di produksi lewat NerveGear dengan bantuan Kayaba Akihiko sebagai Ketua Developernya.\n" +
                    "\n" +
                    "Bersetting di dunia fantasi yang mempunyai sebuah kastil besar dengan ratusan anak tangga bernama Aincrad, semulanya nampak indah dan terlihat menakjubkan. Namun setelah tahap peluncuran pertama gamenya, sebanyak 10.000 pemain yang sudah login tak dapat kembali kedunia nyata lantaran tak tersedia tombol logout dan tak dapat keluar dari permainan.\n" +
                    "\n" +
                    "Masalah bukan hanya itu saja, jika pemain mati di game ini mereka juga akan mati didunia nyata, begitu juga jika NerveGear yang ada di dunia nyata dilepas.",
            "Kaguya Shinomiya dan Miyuki Shirogane, dua orang jenius anggota OSIS Akademi bergengsi, yang menjadikan mereka terelit di kalangan elit. Keduanya memiliki perasaan tertarik satu sama lain, " +
                    "Hanya saja ada satu masalah besar yang menghalangi jalan cinta kasih sayang mereka. Mereka berdua gengsi untuk menjadi orang pertama yang mengakui perasaan romantis mereka. Sehingga perang cinta antara mereka berdua pun dimulai.",
            "Kaguya Shinomiya dan Miyuki Shirogane, dua orang jenius anggota OSIS Akademi bergengsi, yang menjadikan mereka terelit di kalangan elit. Keduanya memiliki perasaan tertarik satu sama lain, " +
                    "Hanya saja ada satu masalah besar yang menghalangi jalan cinta kasih sayang mereka. Mereka berdua gengsi untuk menjadi orang pertama yang mengakui perasaan romantis mereka. Sehingga perang cinta antara mereka berdua pun dimulai."
    };

    public static ArrayList<Waifu> getListData() {
        ArrayList<Waifu> list = new ArrayList<>();
        for (int position = 0; position < waifuNames.length; position++) {
            Waifu waifu = new Waifu();
            waifu.setPhoto(waifuImages[position]);
            waifu.setName(waifuNames[position]);
            waifu.setAnime(waifuAnime[position]);
            waifu.setBirth(waifuBirth[position]);
            waifu.setZodiak(waifuZodiak[position]);
            waifu.setAge(waifuAges[position]);
            waifu.setBlood(waifuBloods[position]);
            waifu.setHeightBody(waifuHeightBody[position]);
            waifu.setAboutWaifu(waifuAbout[position]);
            waifu.setAnimeDetail(animeDetail[position]);
            list.add(waifu);
        }
        return list;
    }
}
