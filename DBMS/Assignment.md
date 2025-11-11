
## 📘 Question 1 — Create the Table

**Task:**  
Write the SQL query to create a table named **Hotels** with the following columns:

| Column Name      | Data Type     | Constraint           |
|------------------|----------------|----------------------|
| hotel_id         | INT            | PRIMARY KEY          |
| hotel_name       | VARCHAR(60)    | UNIQUE               |
| city             | VARCHAR(40)    | —                    |
| rooms_available  | INT            | NOT NULL             |

**✅ SQL Query:**

```sql
CREATE TABLE Hotels (
    hotel_id INT PRIMARY KEY,
    hotel_name VARCHAR(60) UNIQUE,
    city VARCHAR(40),
    rooms_available INT NOT NULL
);
````

---

## 📗 Question 2 — Perform Operations on the `Hotels` Table

The following SQL statements perform various data operations (DML) on the **Hotels** table.

---

### 🏨 1. Insert Two Hotels

```sql
INSERT INTO Hotels (hotel_id, hotel_name, city, rooms_available)
VALUES
(1, 'TGB', 'Surat', 9),
(2, 'Lotus Resort', 'Bharuch', 8);
```

---

### 🛠️ 2. Update the Number of Available Rooms

```sql
UPDATE Hotels
SET rooms_available = 6
WHERE hotel_id = 1;
```

---

### ❌ 3. Delete a Hotel Using `hotel_id`

```sql
DELETE FROM Hotels
WHERE hotel_id = 1;
```

---

### 🔢 4. Calculate the Total Number of Rooms Available (SUM)

```sql
SELECT SUM(rooms_available) AS total_rooms
FROM Hotels;
```

---

### 📊 5. Calculate the Average Number of Rooms Available (AVG)

```sql
SELECT AVG(rooms_available) AS avg_rooms
FROM Hotels;
```

---

## 🧾 Summary

| Operation           | SQL Command      | Purpose                  |
| ------------------- | ---------------- | ------------------------ |
| Create Table        | `CREATE TABLE`   | Defines the structure    |
| Insert Data         | `INSERT INTO`    | Adds new hotel records   |
| Update Data         | `UPDATE`         | Changes existing values  |
| Delete Data         | `DELETE`         | Removes specific records |
| Aggregate Functions | `SUM()`, `AVG()` | Performs calculations    |

---