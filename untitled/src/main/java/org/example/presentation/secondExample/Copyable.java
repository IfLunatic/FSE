package org.example.presentation.secondExample;
//В java вже є релізація патерну Прототип, для цього потрібно наслідуватись від Cloneable, тому назва класу Copyable
public interface Copyable {
    Object copy();
}
