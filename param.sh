#!/bin/bash
required=2
echo $required
echo "Liczba parametrów skryptu: $#"
if [[ $required == $# ]]; then
	echo "zgadza sie liczba parametrów"
	echo "param1 = ${1}"
	echo "param2 = ${2}"
		if [[ $1 < $2 ]]; then
			for ((i=$1; $i<=$2; i=`expr $i+1`)); do
  				echo "$i"
			done
		else
			for ((i=$2; $i<=$1; i=`expr $i-1`)); do
 				echo "$i"
			done
		fi
else
	echo "Podaj oba parametry wejściowe. Podane parametry: $* "
fi
