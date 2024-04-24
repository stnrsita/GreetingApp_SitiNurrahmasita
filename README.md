# GreetingApp

**GreetingApp** merupakan aplikasi Android sederhana yang interaktif. Aplikasi ini akan menampilkan pesan sambutan yang menyapa pengguna dengan nama yang dimasukkan. Jika nama tidak dimasukkan, aplikasi akan menampilkan pesan meminta pengguna untuk memasukkan namanya terlebih dahulu.

**Dalam tugas ini, terdapat dua tes, yaitu tes instrumental dan local test.**

## 1. Instrumental Test

Local test ada pada file "MainActivityUnitTest". Di dalamnya terdapat 2 test case, yaitu:
  - testEditTextNotEmpty(): Test case untuk memastikan bahwa EditText tidak kosong dan menguji interaksi saat teks dimasukkan.
  - testGreetButton(): Test case untuk memastikan bahwa tombol Greet berfungsi dengan benar saat EditText kosong.

Dokumentasi hasil instrumental test:
![image](https://github.com/stnrsita/GreetingApp_SitiNurrahmasita/assets/101649065/e6f9f320-a86c-49c8-a48e-a046ab343622)

## 2. Local Test

Instrumental test terdapat pada file "InstrumentalTest". Di dalamnya terdapat 2 test case, yaitu:
  - generateGreetingNotEmpty(): Test case untuk memverifikasi pembuatan pesan salam yang tidak kosong. Pengujian dilakukan dengan menggunakan nama "John Doe".
  - generateGreetingEmpty(): Test case untuk memverifikasi pembuatan pesan salam saat nama kosong. Pengujian dilakukan dengan menggunakan nama kosong ("").

Dokumentasi hasil local test:
![image](https://github.com/stnrsita/GreetingApp_SitiNurrahmasita/assets/101649065/87e9bc5b-23fc-4978-ad02-d51f04392e63)
