def result = new File("all-files.txt")
result.text = ''
new File('.').eachFileMatch(~/^.*\.groovy$/) {
	result << "${ it.name }:\n"
	it.eachLine { line, num ->
		result << "$num | $line\n"
	}
}
