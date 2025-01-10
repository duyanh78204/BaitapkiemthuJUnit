Lê Duy Anh - BIT220011 - 22SE1

Bài tập kiểm thử nâng cao với JUnit

Đề bài: Kiểm thử thuật toán QuickSort với JUnit

## Mô tả
Dự án này triển khai thuật toán **QuickSort** trong Java, đồng thời sử dụng công cụ **JaCoCo** để đo lường mức độ bao phủ kiểm thử (test coverage).  
Mục tiêu của dự án là giúp hiểu rõ cách kiểm thử các thuật toán sắp xếp thông dụng và tối ưu hóa phạm vi kiểm tra mã nguồn.

---

## Thuật toán QuickSort
**QuickSort** là thuật toán sắp xếp nhanh dựa trên chiến lược "Chia để trị" (Divide and Conquer). Các bước chính:
1. Chọn một phần tử làm **pivot**.
2. Phân chia mảng thành hai phần:
- Phần tử nhỏ hơn hoặc bằng **pivot**.
- Phần tử lớn hơn **pivot**.
3. Đệ quy áp dụng QuickSort trên hai phần mảng.

Độ phức tạp:
- **Trung bình**: O(n log n).
- **Tệ nhất**: O(n²) (khi pivot chọn không tối ưu).

---

## Yêu cầu hệ thống
- **Java Development Kit (JDK)**: Phiên bản 8 trở lên.
- **Maven**: Phiên bản 3.6 trở lên.
- **JaCoCo**: Tích hợp qua Maven Plugin.

---
## Cấu trúc dự án
```plaintext
.
  ├── src
  │   ├── main
  │   │   └── java
  │   │       └── com.example.quicksort
  │   │           └── QuickSort.java     # Thuật toán QuickSort
  │   ├── test
  │   │   └── java
  │   │       └── com.example.quicksort
  │   │           └── QuickSortTest.java # Kiểm thử thuật toán
  ├── pom.xml                             # Cấu hình Maven
  └── README.md                           # Tài liệu dự án
```
## Cài đặt dự án
1. Clone repository từ GitHub hoặc GitLab:
```plaintext
    git clone <https://github.com/duyanh78204/baitapvoiJUnit.git>
    cd <BaitapkiemthuJUnit>
```
2. Sử dụng Maven để tải xuống và cài đặt tất cả các phụ thuộc cần thiết cho dự án:
```plaintext
mvn clean install
```
3. Kiểm tra cài đặt
```plaintext
mvn test
```
4. Tạo báo cáo mức độ bao phủ kiểm thử
```plaintext
mvn clean verify
```
Báo cáo sẽ được tạo tại thư mục sau:
```plaintext
target/site/jacoco/index.html
```

## Kết Quả Kiểm Thử

| **Tên Test Case**                      | **Mô Tả**                                                                 | **Kết Quả** |
|----------------------------------------|---------------------------------------------------------------------------|-------------|
| `testQuickSortSortedArray`             | Kiểm tra với mảng đã được sắp xếp                                         | ✅ Passed   |
| `testQuickSortUnsortedArray`           | Kiểm tra với mảng chưa được sắp xếp                                       | ✅ Passed   |
| `testQuickSortEmptyArray`              | Kiểm tra với mảng rỗng                                                    | ✅ Passed   |
| `testQuickSortArrayWithDuplicates`     | Kiểm tra với mảng chứa các giá trị lặp lại                                 | ✅ Passed   |
| `testQuickSortArrayWithNegativeNumbers`| Kiểm tra với mảng chứa số âm                                              | ✅ Passed   |
| `testQuickSortArrayWithMinAndMaxValues`| Kiểm tra với mảng chứa giá trị lớn nhất và nhỏ nhất của kiểu `int`         | ✅ Passed   |
| `testLargeArray`                       | Kiểm tra với mảng lớn gồm 10,000 phần tử                                   | ✅ Passed   |
| `testQuickSortSingleElementArray`      | Kiểm tra với mảng chỉ chứa một phần tử                                     | ✅ Passed   |
| `testQuickSortReversedArray`           | Kiểm tra với mảng sắp xếp ngược                                           | ✅ Passed   |
| `testQuickSortAllZeros`                | Kiểm tra với mảng chỉ chứa các số 0                                        | ✅ Passed   |
| `testQuickSortSingleElement`           | Kiểm tra lại với mảng chỉ chứa một phần tử                                 | ✅ Passed   |
| `testQuickSortTwoSortedElements`       | Kiểm tra với mảng gồm hai phần tử đã được sắp xếp                          | ✅ Passed   |
| `testQuickSortTwoUnsortedElements`     | Kiểm tra với mảng gồm hai phần tử chưa được sắp xếp                        | ✅ Passed   |
| `testQuickSortSortedDescendingArray`   | Kiểm tra với mảng được sắp xếp theo thứ tự giảm dần                        | ✅ Passed   |
| `testQuickSortArrayWithIdenticalElements`| Kiểm tra với mảng có tất cả các phần tử giống nhau                        | ✅ Passed   |

---
## Hình ảnh kết quả:
<img width="1512" alt="image" src="https://github.com/user-attachments/assets/2573a84f-0f61-467b-87b3-ba22c865c175" />

___
## Tổng Kết

Tất cả các bài kiểm thử đều **thành công** (✅ Passed). Điều này cho thấy thuật toán **QuickSort** đã hoạt động đúng và ổn định trong các trường hợp kiểm thử được xây dựng, bao gồm cả các tình huống đặc biệt như mảng lớn, mảng rỗng, và mảng có giá trị cực biên.

---


## Kết Quả Báo Cáo

| **Element**      | **Missed Instructions** | **Coverage** | **Missed Branches** | **Branch Coverage** | **Missed Complexity** | **Missed Lines** | **Missed Methods** | **Missed Classes** |
|-------------------|-------------------------|--------------|---------------------|---------------------|-----------------------|------------------|--------------------|--------------------|
| `com.employee`    | 3                       | 0%           | n/a                 | n/a                 | 2                     | 3                | 2                  | 1                  |
| `default`         | 7                       | 96%          | 0                   | 100%                | 1                     | 18               | 3                  | 0                  |
| **Tổng Cộng**     | 10                      | 88%          | 0                   | 100%                | 3                     | 21               | 5                  | 2                  |

---
## Hình ảnh kết quả:
<img width="1393" alt="image" src="https://github.com/user-attachments/assets/534b3d3d-78c7-4c7b-a132-d94246c03525" />

___
## Hình ảnh báo cáo trong thư mục index
<img width="1512" alt="image" src="https://github.com/user-attachments/assets/fcf237a4-7f09-4201-8e19-961a6d0dff0a" />

___
## Giải Thích Thông Số

- **Missed Instructions**: Số lượng câu lệnh chưa được kiểm thử.
- **Coverage**: Tỷ lệ câu lệnh được kiểm thử so với tổng số câu lệnh.
- **Missed Branches**: Số nhánh điều kiện chưa được kiểm thử.
- **Branch Coverage**: Tỷ lệ nhánh điều kiện được kiểm thử.
- **Missed Complexity**: Độ phức tạp bị bỏ sót (Cyclomatic Complexity).
- **Missed Lines**: Số dòng mã chưa được kiểm thử.
- **Missed Methods**: Số phương thức chưa được kiểm thử.
- **Missed Classes**: Số lớp chưa được kiểm thử.

---

## Tổng Kết

- **Tổng Độ Phủ**: 88%
- **Độ Phủ Nhánh Điều Kiện**: 100%
- Package `default` đạt độ phủ **96%**, với tất cả các nhánh điều kiện được kiểm thử.
- Package `com.employee` chưa được kiểm thử đầy đủ, chỉ đạt **0% độ phủ mã nguồn**.

---
## Tài liệu tham khảo:
https://chatgpt.com/share/6781570c-0eac-8008-9937-ec1d5d0105fa

