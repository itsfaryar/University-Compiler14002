# University-Compiler14002<br/>
مراحل اجرای کد :<br/>
ابتدا در ترمینال با استفاده از دستور زیر فایل flex ، به برنامه ی جاوا تبدیل م یشود:<br/>
jflex LexicalAnalyzer.flex<br/>
سپس برای ایجاد فایل پارسر کد زیر را اجرا میکنیم.<br/>
java -jar ./java-cup-11b.jar -parser "Parser" "./parser.cup"<br/>
سپس فایل javaparser.java را با آرگومان نام فایل اجرا میکنیم که به صورت پروژه ی اکلیپس قرار داده شده است.
