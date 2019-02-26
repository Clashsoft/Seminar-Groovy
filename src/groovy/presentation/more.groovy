// Strings
def a = 1, b = 2
assert "$a + $b = ${a+b}" == "1 + 2 = 3"
assert "123.456" =~ /\d+\.\d+/

// Prozesse
"ls -l".execute().text

// Dateiverarbeitung
new File("out.txt") << "File Append\n"
new File(".").eachFile { println it }

// Groovy Truth
assert "a" && 3 && [1] && new Object()
assert !("") && !(0) && !([]) && !(null)
