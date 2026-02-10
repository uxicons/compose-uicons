package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onboarding: ImageVector? = null

val Icons.Br.Onboarding: ImageVector
    get() = _Onboarding ?: UXIcon(name = "Onboarding") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(5.54f, 9f)
            horizontalLineToRelative(5.92f)
            curveToRelative(0.61f, 0f, 0.99f, -0.7f, 0.63f, -1.19f)
            curveToRelative(-0.82f, -1.1f, -2.12f, -1.81f, -3.59f, -1.81f)
            reflectiveCurveToRelative(-2.77f, 0.71f, -3.59f, 1.81f)
            curveToRelative(-0.36f, 0.49f, 0.02f, 1.19f, 0.63f, 1.19f)
            close()
            moveTo(23.02f, 14.47f)
            lineToRelative(-5.2f, 5.94f)
            curveToRelative(-1.99f, 2.28f, -4.87f, 3.59f, -7.9f, 3.59f)
            horizontalLineToRelative(-5.41f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(7.86f)
            curveToRelative(0.94f, 0f, 1.8f, 0.36f, 2.45f, 0.95f)
            lineToRelative(2.44f, -2.68f)
            curveToRelative(0.7f, -0.77f, 1.65f, -1.22f, 2.69f, -1.27f)
            curveToRelative(1.03f, -0.05f, 2.03f, 0.31f, 2.8f, 1.01f)
            curveToRelative(1.56f, 1.43f, 1.69f, 3.87f, 0.28f, 5.45f)
            close()
            moveTo(20.71f, 11.23f)
            curveToRelative(-0.17f, -0.16f, -0.39f, -0.25f, -0.64f, -0.23f)
            curveToRelative(-0.24f, 0.01f, -0.45f, 0.11f, -0.61f, 0.29f)
            lineToRelative(-3.5f, 3.84f)
            curveToRelative(-0.22f, 1.59f, -1.48f, 2.88f, -3.09f, 3.12f)
            lineToRelative(-5.16f, 0.74f)
            curveToRelative(-0.82f, 0.11f, -1.58f, -0.45f, -1.7f, -1.27f)
            curveToRelative(-0.12f, -0.82f, 0.45f, -1.58f, 1.27f, -1.7f)
            lineToRelative(5.16f, -0.74f)
            curveToRelative(0.31f, -0.04f, 0.55f, -0.32f, 0.55f, -0.64f)
            curveToRelative(0f, -0.35f, -0.29f, -0.64f, -0.64f, -0.64f)
            horizontalLineToRelative(-7.86f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(5.41f)
            curveToRelative(2.16f, 0f, 4.22f, -0.94f, 5.65f, -2.56f)
            lineToRelative(5.21f, -5.95f)
            curveToRelative(0.33f, -0.37f, 0.3f, -0.93f, -0.06f, -1.25f)
            close()
        }
    }.also { _Onboarding = it }
