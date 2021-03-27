@echo off
set MYCLASS=gak.gaknet.App
set MYTARGET=%CD%\target\classes
set MYCLASSFILE=%MYTARGET%\gak\gaknet\App.class

if not exist %MYCLASSFILE% echo cannot fine MY CLASS FILE
if not exist %MYCLASSFILE% echo perhaps you need to run MVN COMPILE
if not exist %MYCLASSFILE% goto end

call mvn.cmd exec:java -Dexec.mainClass=%MYCLASS% -Dexec.args="%1 %2 %3 %4 %5 %6 %7 %8 %9"

:end
set MYCLASS=
set MYCLASSFILE=
set MYTARGET=
