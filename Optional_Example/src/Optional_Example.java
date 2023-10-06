import java.util.Optional;

public class Optional_Example {
    public static void main(String[] args) {

        Optional<String> gender = Optional.of("Female");

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        String option_Full = "Full";
        String option_null = null;
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(option_Full));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(option_null));

        // java.lang.NullPointerException
        // System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(option_null));

        ifPresentOptionalAPI();
    }

    private static void ifPresentOptionalAPI() {

        // Before Optional, we would do something like this:
        String name = "Margaret Whittaker";
        if (name != null) {
            System.out.println("Name length is: " + name.length());
        }

        // Same with use of Optional (but it will throw an exception when name is null)
        Optional<String> opt = Optional.of(name);
        opt.ifPresent(str -> System.out.println("Name length is: " + str.length()));

        // So when you expect name could be null you use ofNullable
        name = null;
        Optional<String> emptyOpt = Optional.ofNullable(name);
        emptyOpt.ifPresent(str -> System.out.println("Name length is: " + str.length() + " but this won't print..."));

        System.out.println("Proof that the Optional was empty -> " + emptyOpt);

    }
}