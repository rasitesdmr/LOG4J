                                                          LOGGİNG AND LOG4J ?

Loglama bir sistemin hareketlerini kaydeden bir yapıdır. 
Özellikle sistem yöneticileri ve hata gideren kullanıcılar ve hatta geliştiriciler için bir vazgeçilmezdir. 
Bir projede karşılaşılan hataları, akışları, performans sıkıntılarını ve son kullanıcının yaptğı işlemleri izleyerek, 
bunları anlık olarak yakalayıp düzeltmek için kullanılır. 
Logların anlamlı ve faydalı olabilmesi için ilk olarak kod içerisinde anlaşılır loglar yazılmalıdır.

                                           XML KOMUTLARI
     
     <Console name="Console" target="SYSTEM.OUT">   Log çıktısının console da yazılacağını belirtiyoruz.

     <File> Log çıktısının herhangi bir dosyaya yazılacağını belirtiyoruz.

     <RollingFile> File dosyasının Role yaparak loglama yaparız.

     <ParrentLayout pattern="%d{ISO8601}[%t] %-5level %logger{36} -%msg%n" />  Görüntülenecek logun ekran
     
     çıktısının nasıl olacağını belirtiyoruz.

     %d{ISO8601} : Log tutulduğu tarih ve zamanı gösterir.

     [%t] :Logumuz hangi metotda çalıştı.

     %-5level :Tutulan log hangi levelde ise onu verir.

     %logger{%36} :Tutulan log hangi classta tutulmuş onu gösterir.

     %msg%n :Tutulan log da bulunan mesajı gösterir.

     (%F:%L) :Tutulan logun hangi clasta kaçıncı satırda olduğunu gösterir.

     <Loggers> : Bu tag içinde istediğimiz bölgelere seviyelere göre <Logger> ekleyerek detaylı log
     
     yapmamızı sağlıyor.

     <Root> :Bir pakede yada classa özel <Logger> tagıyla log atamamıssa bu root kök log geçerli olur.

     <AppenderRef ref="Console" />

     <Appenders> nu tag içinde birden fazla ekrana <Console> ve <Parrent> tnaımlayabiliriz.
     
     Biz bu <Root> tagın içinde hangi Appender'ı kullanaçağımızı belirtiyoruz.

                               SEVİYELER 

ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATTAL < OFF
