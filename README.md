# 🧮 MyBigNumber - Cộng số lớn (Java Core)

## 📌 Giới thiệu

Project này cài đặt thuật toán **cộng hai số rất lớn** bằng cách xử lý chuỗi (`String`), mô phỏng cách học sinh Tiểu học thực hiện phép cộng từng chữ số.

Không sử dụng các thư viện có sẵn như `BigInteger`, thay vào đó xử lý thủ công từng digit từ phải sang trái và quản lý biến nhớ (carry).

---

## 🚀 Chức năng

* Cộng hai số lớn dạng chuỗi
* Xử lý số có độ dài khác nhau
* Xử lý phép cộng có nhớ (carry)
* Ghi log từng bước tính toán bằng `java.util.logging`
* Có Unit Test kiểm tra các trường hợp

---

## 🏗️ Cấu trúc project

```id="r9u7pz"
MyAdd2Number/
│── src/
│   ├── MyBigNumber.java
│   └── MyBigNumberUnitTest.java
│── README.md
```

---

## ⚙️ Yêu cầu môi trường

* Java 8 trở lên
* (Tuỳ chọn) Maven để chạy test

---

## ▶️ Cách biên dịch và chạy chương trình

### 1. Biên dịch

```bash id="btf74h"
javac src/MyBigNumber.java
```

### 2. Chạy chương trình

```bash id="y1zwrs"
java -cp src MyBigNumber
```

---

## 📌 Ví dụ output

```id="cl5x9k"
Bước 1: 4 + 7 = 11 → ghi 1, nhớ 1
Bước 2: 3 + 9 + 1 = 13 → ghi 3, nhớ 1
Bước 3: 2 + 8 + 1 = 11 → ghi 1, nhớ 1
Bước 4: 1 + 0 + 1 = 2 → ghi 2, nhớ 0
Kết quả: 2131
```

---

## 🧪 Chạy Unit Test

### Cách 1: Dùng IntelliJ IDEA

* Click chuột phải vào file `MyBigNumberTest`
* Chọn **Run**

---

### Cách 2: Dùng Maven

```bash id="0cxfv3"
mvn test
```

---

## 📋 Các test case đã kiểm tra

* Cộng bình thường: `1234 + 5678 = 6912`
* Có nhớ: `999 + 1 = 1000`
* Khác độ dài: `12345 + 678 = 13023`
* Trường hợp đặc biệt: `0 + 0 = 0`

---

## 🧠 Giải thích thuật toán

1. Duyệt 2 chuỗi từ phải sang trái
2. Chuyển ký tự thành số
3. Cộng từng chữ số + biến nhớ
4. Lưu chữ số kết quả
5. Cập nhật biến nhớ
6. Lặp lại đến khi hết dữ liệu
7. Đảo chuỗi kết quả (hoặc dùng char[] để tối ưu)

---

## ⏱️ Độ phức tạp

* Time Complexity: **O(n)**
* Space Complexity: **O(n)**

---

## 📈 Ghi chú tối ưu

Có 2 cách triển khai:

* `StringBuilder + reverse()`
  → Dễ đọc, dễ maintain (khuyến nghị)

* `char[]`
  → Tối ưu hơn một chút, không cần reverse

---

## 🏷️ Phiên bản

* `v0.0.2` – Phiên bản đầu tiên:

  * Cài đặt thuật toán cộng số lớn
  * Thêm logging
  * Viết unit test

---

## 👨‍💻 Tác giả

Lê Thanh Thiện

---

## 📬 Liên hệ

* Email: [lethanhthien2210@gmail.com](mailto:lethanhthien2210@gmail.com)
* GitHub: https://github.com/LeThanhThien2k4
