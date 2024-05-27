CREATE DATABASE Universite;
USE Universite;

CREATE TABLE Ogrenciler (
    OgrenciID INT AUTO_INCREMENT PRIMARY KEY,
    Ad VARCHAR(50),
    Soyad VARCHAR(50),
    DogumTarihi DATE
);

CREATE TABLE Dersler (
    DersID INT AUTO_INCREMENT PRIMARY KEY,
    DersAdi VARCHAR(100),
    Kredi INT
);

CREATE TABLE Kayitlar (
    KayitID INT AUTO_INCREMENT PRIMARY KEY,
    OgrenciID INT,
    DersID INT,
    KayitTarihi DATE,
    FOREIGN KEY (OgrenciID) REFERENCES Ogrenciler(OgrenciID),
    FOREIGN KEY (DersID) REFERENCES Dersler(DersID)
);

INSERT INTO Ogrenciler (Ad, Soyad, DogumTarihi) VALUES
('Ali', 'Yılmaz', '2000-05-15'),
('Ayşe', 'Kara', '1999-12-22'),
('Mehmet', 'Demir', '2001-03-10');

INSERT INTO Dersler (DersAdi, Kredi) VALUES
('Matematik', 4),
('Fizik', 3),
('Kimya', 3);

INSERT INTO Kayitlar (OgrenciID, DersID, KayitTarihi) VALUES
(1, 1, '2023-09-01'),
(2, 2, '2023-09-01'),
(3, 3, '2023-09-01'),
(1, 2, '2023-09-02');

SELECT * FROM Ogrenciler;

SELECT * FROM Dersler;

SELECT
    k.KayitID,
    o.Ad AS OgrenciAdi,
    o.Soyad AS OgrenciSoyadi,
    d.DersAdi,
    k.KayitTarihi
FROM
    Kayitlar k
JOIN
    Ogrenciler o ON k.OgrenciID = o.OgrenciID
JOIN
    Dersler d ON k.DersID = d.DersID;

SELECT
    d.DersAdi,
    k.KayitTarihi
FROM
    Kayitlar k
JOIN
    Dersler d ON k.DersID = d.DersID
WHERE
    k.OgrenciID = 1;

SELECT
    o.Ad AS OgrenciAdi,
    o.Soyad AS OgrenciSoyadi,
    k.KayitTarihi
FROM
    Kayitlar k
JOIN
    Ogrenciler o ON k.OgrenciID = o.OgrenciID
WHERE
    k.DersID = 1;
