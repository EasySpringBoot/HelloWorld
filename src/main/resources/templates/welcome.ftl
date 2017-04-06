<!DOCTYPE html>
<html lang="zh">
<body>
Date: ${time?date}
<br>
Time: ${time?time}
<br>
Message: ${message}
<div>
	<#list books as book>
	    <li>书名： ${book.name}</li>
	    <li>作者： ${book.author}</li>
	    <li>出版社： ${book.press}</li>
	</#list>
</div>
</body>

</html>
