# 🧮 MyBigNumber - Cộng số lớn (Java Core)

## 📌 Giới thiệu

Project này cài đặt thuật toán **cộng hai số rất lớn** bằng cách xử lý chuỗi (`String`), mô phỏng cách học sinh Tiểu học thực hiện phép cộng từng chữ số.

Không sử dụng `BigInteger`, toàn bộ phép cộng được xử lý thủ công từng digit và biến nhớ (carry).

---

## 🚀 Chức năng

* Cộng hai số lớn dạng chuỗi
* Xử lý số có độ dài khác nhau
* Xử lý phép cộng có nhớ
* Ghi log từng bước tính toán

---

## 🏗️ Cấu trúc project

```text
Add2Num/
│── src/
│   ├── Main.java          ⭐ file chạy chính
│   └── MyBigNumber.java   ⭐ xử lý logic
|   |___MyBigNumberUnitTest.java **xử lý Test case
│── README.md
```

---

## ⚙️ Yêu cầu

* Java 11 trở lên
* IntelliJ IDEA (khuyến nghị)

---

# ▶️ Cách chạy (IntelliJ - 1 lần setup duy nhất) ⭐

## Bước 1: Mở project và clone code

* Mở IntelliJ
* Chọn **File → Open**
* Chọn folder của bạn đã tạo trước
* Sau đó chạy git clone -b core --single-branch https://github.com/LeThanhThien2k4/Add2Num.git

---

## Bước 2: Cấu hình (QUAN TRỌNG - chỉ cần làm 1 lần)

* Click phải vào thư mục `src`
* Chọn:

```text
Mark Directory as → Sources Root
```

---

## Bước 3: Chạy chương trình

* Mở file `Main.java`
* Click **Run** hoặc:
* Right click → **Run 'Main.main()'**

---

## ✅ Kết quả

* Chương trình sẽ chạy ngay, ví dụ:
* thg 4 19, 2026 5:04:36 CH MyBigNumber sum
* INFO: Bước 1: 4 + 8 = 12 → ghi 2, nhớ 1
* thg 4 19, 2026 5:04:37 CH MyBigNumber sum
* INFO: Bước 2: 3 + 7 + 1 = 11 → ghi 1, nhớ 1
* thg 4 19, 2026 5:04:37 CH MyBigNumber sum
* INFO: Bước 3: 2 + 6 + 1 = 9 → ghi 9, nhớ 0
* thg 4 19, 2026 5:04:37 CH MyBigNumber sum
* INFO: Bước 4: 1 + 5 = 6 → ghi 6, nhớ 0
* Kết quả: 6912

---
## ✅ chạy UnitTest
* chạy toàn bộ testcases:
* click chuột phải MyBigNumberUnitTest => Run
* chạy từn testcase:
* click Run vào từng hàm test trong MyBigNumberUnitTest

## ⚠️ Lỗi thường gặp

### ❌ Không chạy được / ClassNotFound

👉 Nguyên nhân: chưa mark `src`

✔ Cách fix:

```text
Click phải src → Mark Directory as → Sources Root
```

---

## 🏷️ Version

* `v0.0.2` – phiên bản đầu tiên

---

## 👨‍💻 Tác giả

Lê Thanh Thiện

---
