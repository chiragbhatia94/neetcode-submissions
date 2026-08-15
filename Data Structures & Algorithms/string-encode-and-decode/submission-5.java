class Solution {    

    public String encode(List<String> strs) {
        String encodedStr = "";
        for (String str: strs) {
            encodedStr = encodedStr + "#" + str.length() + "#" + str;
        }
        return encodedStr;
    }

    public List<String> decode(String str) {
        // System.out.println(str);
        if (str.equals("")) {
            return new ArrayList<>();
        }
        String[] output =  str.split("#\\d+#", -1);
        List<String> decodedList = new ArrayList<>(Arrays.asList(output));
        // System.out.println(decodedList.getClass().getName());
        // System.out.println(decodedList);
        if (decodedList.size() == 0) {
            return decodedList;
        }
        decodedList.remove(0);
        return decodedList;
    }
}


