package DZ_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mapa = new HashMap<>();
        List<String> newPath;
        List<String> addNewPath;

        for (String path : paths) {
            String[] files = path.split(" ");
            String folder = files[0];
            for (int i = 1; i < files.length; i++) {
                String nameFile = files[i].substring(0, files[i].indexOf('('));
                String content = files[i].substring(files[i].indexOf('(') + 1, files[i].length() - 1);
                if (!mapa.containsKey(content)) {
                    newPath = new ArrayList<>();
                    newPath.add(folder + "/" + nameFile);
                    mapa.put(content, newPath);
                } else {
                    addNewPath = mapa.get(content);
                    addNewPath.add(folder + "/" + nameFile);
                    mapa.put(content, addNewPath);
                }
            }
        }

        for (String key : mapa.keySet()) {
            if (mapa.get(key).size() > 1) {
                ans.add(mapa.get(key));
            }
        }
        return ans;
    }
}
