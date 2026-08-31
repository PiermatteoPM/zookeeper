@echo off
setlocal enabledelayedexpansion

REM Verifica dei 16 branch C1-C4/VC1-VC4 di QuorumServer con la suite di test aggiornata (54 test).
REM Lanciare da: C:\Users\pierm\Desktop\zookeeper-m4
REM Risultato: un file di log per branch + un riepilogo finale a schermo.

set TESTFILE=zookeeper-server\src\test\java\org\apache\zookeeper\server\quorum\QuorumServerAddressStringTest.java
set LOGDIR=verifica_c1c4_logs
if not exist %LOGDIR% mkdir %LOGDIR%

set BRANCHES=c1-quorumserver c1b-quorumserver c2-quorumserver c2b-quorumserver c3-quorumserver c3b-quorumserver c4-quorumserver c4b-quorumserver vc1-quorumserver vc1b-quorumserver vc2-quorumserver vc2b-quorumserver vc3-quorumserver vc3b-quorumserver vc4-quorumserver vc4b-quorumserver

echo ============================================
echo Verifica C1-C4/VC1-VC4 QuorumServer - inizio
echo ============================================
echo.

for %%B in (%BRANCHES%) do (
    echo --- %%B ---
    git checkout %%B >nul 2>&1
    git checkout m4-work -- %TESTFILE% >nul 2>&1
    call mvn -pl zookeeper-server -am test -Dtest=QuorumServerAddressStringTest -DfailIfNoTests=false > %LOGDIR%\%%B.log 2>&1
    git restore --worktree --staged %TESTFILE% >nul 2>&1

    findstr /C:"Tests run:" %LOGDIR%\%%B.log | findstr /V "Tests run: 0" > %LOGDIR%\%%B_summary.txt
    findstr /C:"BUILD SUCCESS" %LOGDIR%\%%B.log >nul
    if !errorlevel! == 0 (
        echo   BUILD SUCCESS
    ) else (
        echo   BUILD FAILURE - controlla %LOGDIR%\%%B.log
    )
    type %LOGDIR%\%%B_summary.txt
    echo.
)

git checkout m4-work >nul 2>&1

echo ============================================
echo Fatto. Log completi in %LOGDIR%\
echo Se qualche branch mostra BUILD FAILURE, apri il suo file .log per il dettaglio.
echo ============================================
pause
