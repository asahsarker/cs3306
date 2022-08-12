#!/bin/sh

if [ ! -d "./backup" ] 
then
    mkdir backup
fi

curent_date=$(date '+%Y-%m-%d');
#get the total number of dirs starting with current date
number_of_the_backup=`ls ./backup | grep $curent_date* | wc -l`;

#adding zeros to the number of the backup
digits=000;
temp=$digits${number_of_the_backup//[[:blank:]]/};
number_of_the_backup_zero_padded=${temp:(-${#digits})};

#create the dir for the backup
mkdir backup/${curent_date}-${number_of_the_backup_zero_padded};

cp -r `ls -A ./ | grep -ivw -e "^\..*" -e "^backup$"` ./backup/${curent_date}-${number_of_the_backup_zero_padded};

exit 0;