<?php
	session_start();
	// store scalar value
	$_SESSION['user'] = 'admin';
	// store an array
	$_SESSION['roles'] = ['administrator', 'approver', 'editor'];
?>

<html>
<head>
    <title>PHP Session Demo</title>
</head>
<body>
    <a href="profile.php">Go to profile page</a>
</body>
</html>