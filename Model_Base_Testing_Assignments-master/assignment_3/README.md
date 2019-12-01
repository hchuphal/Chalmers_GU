# Before you can build the deeplearning4j or the nd4j libs
You have to configure you system and install needed software. Instructions can be found here:

https://deeplearning4j.org/docs/latest/deeplearning4j-build-from-source

# How to mutate the lib (nd4j-api) implementing the API

- Start project "deeplearning4j"
- mutate relevant code
- when done click: Build(in main taskbar) -> Build Artifacts... -> Choose nd4j-api:jar -> Rebuild

# How to test mutated lib

- got to folder: <folder with your local repo>/Model_Base_Testing_Assignments/assignment_3/deeplearning4j/classes/artifacts/nd4j_api_jar

- copy the archive nd4j-api.jar

- place the folder in: <folder with your local repo>/Model_Base_Testing_Assignments/assignment_3/pbtnd4j/lib_mutated

- add this folder to the project libraryies (this is done from the IDE): rightclick on the jar -> Add as Library... 

- the original lib nd4j-api-1.0.0-beta4.jar has to be deleted as library. Therefore click on File -> Project Structure... -> rightclick on the lib -> delete -> ok

