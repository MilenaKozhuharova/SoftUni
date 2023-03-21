import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return this.name;
        }

        public String getTypeList() {
            return this.typeList;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            String input = scanner.nextLine();
            String[] inputSongsArr = input.split("_");

            String typeList = inputSongsArr[0];
            String name = inputSongsArr[1];
            String time = inputSongsArr[2];

            Song currentSong = new Song(typeList, name, time);
            songList.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song song : songList) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songList) {

                String currentTypeList = song.getTypeList();
                if (currentTypeList.equals(command)) {
                    System.out.println(song.getName());
                }

            }
        }
    }
}
