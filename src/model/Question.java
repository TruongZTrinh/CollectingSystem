package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Question {
    private int questionId;
    private String questionName;
    private String questionType;
    private int formId;

    // Constructor
    public Question(int questionId, String questionName, String questionType, int formId) {
        this.questionId = questionId;
        this.questionName = questionName;
        this.questionType = questionType;
        this.formId = formId;
    }

    // Create
    public void createQuestion(Connection conn) throws SQLException {
        String sql = "INSERT INTO Question (question_name, question_type, form_id) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, questionName);
        pstmt.setString(2, questionType);
        pstmt.setInt(3, formId);
        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            this.questionId = rs.getInt(1);
        }
        rs.close();
        pstmt.close();
    }

    // Read
    public static Question getQuestionById(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM Question WHERE question_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        Question question = null;
        if (rs.next()) {
            question = new Question(rs.getInt("question_id"), rs.getString("question_name"), rs.getString("question_type"), rs.getInt("form_id"));
        }
        rs.close();
        pstmt.close();
        return question;
    }

    // Update
    public void updateQuestion(Connection conn) throws SQLException {
        String sql = "UPDATE Question SET question_name = ?, question_type = ?, form_id = ? WHERE question_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, questionName);
        pstmt.setString(2, questionType);
        pstmt.setInt(3, formId);
        pstmt.setInt(4, questionId);
        pstmt.executeUpdate();
        pstmt.close();
    }

    // Delete
    public void deleteQuestion(Connection conn) throws SQLException {
        String sql = "DELETE FROM Question WHERE question_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, questionId);
        pstmt.executeUpdate();
        pstmt.close();
    }
}