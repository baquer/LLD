package org.example;

public class Report {

    // Creating a Constructor

    private final String title;
    private final String desc;
    private final String content;

    Report(ReportBuilder builder) {
        this.title = builder.title;
        this.desc = builder.desc;
        this.content = builder.content;
    }

    // Create a Static Builder Class

    public static class ReportBuilder {

        private String title;
        private String desc;
        private String content;

        // Don't create a constructor for this
        // For chaining make a setter

        public ReportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public ReportBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public Report build() {
            return new Report(this);
        }

    }

}
