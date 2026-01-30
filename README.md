# 🏗️ DP: Design Patterns Master-Class

A professional, high-quality showcase of core software design patterns implemented in Java. This repository serves as a practical guide for developers aiming to master software architecture and clean code principles.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)
![SOLID](https://img.shields.io/badge/Principles-SOLID-red?style=for-the-badge)

---

## 📖 Hakkında

**DP (Design Patterns)**, yazılım geliştirme sürecinde sıkça karşılaşılan problemlere yönelik optimize edilmiş çözümler sunan bir eğitim ve referans deposudur. Proje, Gang of Four (GoF) tarafından tanımlanan desenleri modern Java standartlarıyla (Java 17+) harmanlayarak sunar.

Bu depo; sadece kod bloklarını değil, aynı zamanda **SOLID** prensiplerine uygun, test edilebilir ve sürdürülebilir bir mimarinin nasıl kurulacağını gösterir.

---

## 🚀 Özellikler

Proje üç ana kategoride toplanan tasarım desenlerini içerir:

*   **Creational (Oluşturucu) Desenler:** Nesne oluşturma süreçlerini kontrol altına alarak esneklik sağlar. (Singleton, Factory, Builder, Abstract Factory, Prototype)
*   **Structural (Yapısal) Desenler:** Sınıflar ve nesneler arasındaki ilişkileri düzenleyerek büyük yapıların verimli kurulmasını sağlar. (Adapter, Bridge, Composite, Decorator, Facade, Proxy)
*   **Behavioral (Davranışsal) Desenler:** Nesneler arasındaki iletişimi ve sorumluluk dağılımını optimize eder. (Strategy, Observer, Command, State, Visitor, Iterator)
*   **Clean Code Odaklı:** Karmaşıklıktan uzak, geliştirici dostu ve açıklayıcı kod yapısı.

---

## 🛠️ Teknolojiler

*   **Dil:** Java 17+
*   **Bağımlılık Yönetimi:** Maven / Gradle
*   **Test:** JUnit 5
*   **IDE:** IntelliJ IDEA / Eclipse / VS Code

---

## ⚙️ Kurulum

Projeyi yerel makinenizde çalıştırmak için aşağıdaki adımları izleyin:

1. Depoyu klonlayın:
   ```bash
   git clone https://github.com/umutbarancicek/DP.git
   ```

2. Proje dizinine gidin:
   ```bash
   cd DP
   ```

3. Bağımlılıkları yükleyin ve projeyi derleyin:
   ```bash
   mvn clean install
   ```

---

## 💻 Kullanım

Her tasarım deseni kendi paketi altında bağımsız bir `main` metodu veya birim testi (Unit Test) ile birlikte gelir. Örneğin, **Singleton** desenini incelemek için:

```java
// Örnek kullanım mantığı
public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
    }
}
```

İlgili desenin klasörüne giderek örnek uygulamayı doğrudan çalıştırabilirsiniz.

---

## 🤝 Katkıda Bulunma

Katkılarınız bu depoyu daha güçlü hale getirir! 

1. Bu depoyu Fork edin.
2. Yeni bir Feature branch oluşturun (`git checkout -b feature/AmazingFeature`).
3. Değişikliklerinizi Commit edin (`git commit -m 'Add some AmazingFeature'`).
4. Branch'inizi Push edin (`git push origin feature/AmazingFeature`).
5. Bir Pull Request açın.

---

## 📄 Lisans

Bu proje **MIT Lisansı** altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atabilirsiniz.

---

**Geliştirici:** [@umutbarancicek](https://github.com/umutbarancicek)  
**Konular:** #clean-code #design-patterns #java-oop #software-architecture #solid-principles
