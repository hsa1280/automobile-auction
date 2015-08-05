Start/Stop/Restart mysql on Mac:

sudo /usr/local/mysql/support-files/mysql.server start

sudo /usr/local/mysql/support-files/mysql.server stop

sudo /usr/local/mysql/support-files/mysql.server restart

On the Arch Linux:

You can start the MariaDB daemon with:

/usr/bin/mysqld_safe --datadir='/var/lib/mysql'

to see the database:

mysql -u root -p 
