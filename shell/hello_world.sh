#! /bin/bash
echo ; echo ; echo
echo `uname -a`
echo `pwd`
echo `ls -al`
echo ; echo ; echo

export TERM="xterm"
declare -i i=0
while true; do

  # clear
  echo ; echo

  echo '#' '[' $i ']' "$(date +'%Y-%m-%d %H:%M:%S.%3N')"
  ((i++))

  /app/hello_world_callee.sh
  sleep 5
done
