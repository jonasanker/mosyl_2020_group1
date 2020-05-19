#!/bin/bash
# Generate Models, Edit and Editor code

STATIONPLAN_GENMODEL=../Development/org.mdse.gt.stationplan/model/StationPlan.genmodel
DEPOT_GENMODEL=../Development/org.mdse.pts.depot/model/Depot.genmodel
NETWORK_GENMODEL=../Development/org.mdse.pts.network/model/Network.genmodel
SCHEDULE_GENMODEL=../Development/org.mdse.pts.schedule/model/Schedule.genmodel
TIMETABLE_GENMODEL=../Development/org.mdse.pts.timetable/model/Timetable.genmodel
COMMON_GENMODEL=../Development/org.mdse.pts.common/model/Common.genmodel

SCHEDULE_DSL=Development/org.mdse.pts.schedule.dsl/src/org/mdse/pts/schedule/dsl/GenerateSchedule.mwe2

stationplan() {
	echo "Generate StationPlan code"
    generateCode $STATIONPLAN_GENMODEL
}

depot() {
	echo "Generate Depot code"
    generateCode $DEPOT_GENMODEL
}

network() {
	echo "Generate Network code"
    generateCode $NETWORK_GENMODEL
}

schedule() {
	echo "Generate Schedule code"
    generateCode $SCHEDULE_GENMODEL
}

scheduleDsl() {
    echo "Generate Schedule language infrastructure"
    generateLanguage $SCHEDULE_DSL
}

timetable() {
	echo "Generate Timetable code"
    generateCode $TIMETABLE_GENMODEL
}

common() {
	echo "Generate Common code"
    generateCode $COMMON_GENMODEL
}

generateCode() {
    eclipse -noSplash -data ../Development/ -application org.eclipse.emf.codegen.ecore.Generator -model -edit -editor $1
}

generateLanguage() {
    eclipse -noSplash -data ../Development/ -application org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher $1 -p ../Development
}

allCode() {
    echo "Generate code for all projects"
    stationplan
    depot
    network
    schedule
    timetable
	common
}

allLangInfrastructure() {
    echo "Generate language infrastructure for all projects"
    scheduleDsl
}

if [ "$1" == "stationplan" ]; then 
	stationplan 
	exit 0
elif [ "$1" == "depot" ]; then 
	depot 
	exit 0
elif [ "$1" == "network" ]; then 
	network 
	exit 0
elif [ "$1" == "schedule" ]; then 
	schedule 
	exit 0
elif [ "$1" == "schedule-lang" ]; then 
	scheduleDsl
	exit 0
elif [ "$1" == "timetable" ]; then 
    timetable 
	exit 0
elif [ "$1" == "common" ]; then 
    common 
	exit 0
elif [ "$1" == "all" ]; then 
    allCode
	exit 0
else 
	echo -e "No arguments provided. Possible arguments:"
	echo "stationplan"
	echo "depot"
	echo "network"
	echo "schedule"
	echo "schedule-lang"
	echo "timetable"
	echo "all"
	echo "common"

	exit 1
fi