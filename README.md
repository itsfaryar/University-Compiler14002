# University-Compiler14002
مراحل اجرای کد :
ابتدا در ترمینال با استفاده از دستور زیر فایل flex ، به برنامه ی جاوا تبدیل م یشود:
jflex LexicalAnalyzer.flex
سپس برای ایجاد فایل پارسر کد زیر را اجرا میکنیم.
java -jar ./java-cup-11b.jar -parser "Parser" "./parser.cup"
سپس فایل javaparser.java را با آرگومان نام فایل اجرا میکنیم که به صورت پروژه ی اکلیپس قرار داده شده
است.
فایل