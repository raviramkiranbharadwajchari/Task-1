package com.Task.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RegisteredUserRepository userRepository;

    @Autowired
    private TempRepository tempRepository;

    @Autowired
    private OTPRepository otpRepository;
    @Override
    public void registerUser(String email) {
        Optional<RegisteredUser> existingUser = userRepository.findByEmail(email);

        if (existingUser.isPresent()) {
            String otp = generateOTP();
            TempEntity tempEntity = new TempEntity();
            tempEntity.setEmail(email);
            tempEntity.setOtp(otp);
            tempRepository.save(tempEntity);

        } else {
        }
    }

    @Override
    public boolean verifyOTP(String email, String otp) {
        Optional<TempEntity> tempEntityOptional = tempRepository.findByEmail(email);

        if (tempEntityOptional.isPresent() && tempEntityOptional.get().getOtp().equals(otp)) {
            RegisteredUser registeredUser = new RegisteredUser();
            registeredUser.setEmail(email);
            userRepository.save(registeredUser);
            tempRepository.deleteById(email);

            return true;
        }
        return false;
    }
    private String generateOTP() {
        return "123456";
    }
}
