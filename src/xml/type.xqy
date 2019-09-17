for $x in doc("usertype.xml")/User/User_Logins
where $x/Type=admin
return $x/User_Name
