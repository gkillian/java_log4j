@echo off
set LOG4J=c:\temp\java\lib\log4j-1.2.17.jar
if not exist %LOG4J% echo file %LOG4J% does not exist
if not exist %LOG4J% goto end

set MYCLASS=gak.gaknet.App
set MYTARGET=%CD%\target\classes
set MYCLASSFILE=%MYTARGET%\gak\gaknet\App.class

if not exist %MYCLASSFILE% echo cannot fine MY CLASS FILE
if not exist %MYCLASSFILE% echo perhaps you need to run MVN COMPILE
if not exist %MYCLASSFILE% goto end

@echo on
java -cp %LOG4J%;%MYTARGET%;. %MYCLASS% %1 %2 %3 %4 %5 %6 %7 %8 %9
@echo off


:end
set MYCLASS=
set MYCLASSFILE=
set MYTARGET=
set LOG4J=
