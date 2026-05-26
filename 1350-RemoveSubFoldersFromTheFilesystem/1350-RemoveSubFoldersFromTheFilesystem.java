// Last updated: 5/26/2026, 11:18:05 AM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        //sort the array in ascending alphabetical order
        Arrays.sort(folder);
        //create arraylist to store non subfolders
        List<String> nonSubs = new ArrayList<>();
        //iterate through each directory in sorted array
        for (String directory : folder) {
            //should add the first element if list is empty
            //check if the current directory starts with the previous directories folder
            //if NO then add directory to result
            if (nonSubs.isEmpty()){
                nonSubs.add(directory);
            } else if (!directory.startsWith(nonSubs.get(nonSubs.size()-1) + "/")){
                nonSubs.add(directory);
            }
            // if (nonSubs.isEmpty() || !directory.startsWith(nonSubs.get(nonSubs.size()-1) + "/")){
            //     //add the non subfolder to results
            //     nonSubs.add(directory);
            // }
        }
        //return non subfolders
        return nonSubs;
    }
}