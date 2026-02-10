package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onboarding: ImageVector? = null

val Icons.Ts.Onboarding: ImageVector
    get() = _Onboarding ?: UXIcon(name = "Onboarding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(23.18f, 9.65f)
                curveToRelative(-0.5f, -0.45f, -1.15f, -0.68f, -1.81f, -0.65f)
                curveToRelative(-0.67f, 0.03f, -1.29f, 0.32f, -1.74f, 0.82f)
                lineToRelative(-3.73f, 4.1f)
                curveToRelative(-0.31f, -1.11f, -1.33f, -1.92f, -2.54f, -1.92f)
                lineTo(2.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.22f)
                lineToRelative(9.64f, -10.82f)
                curveToRelative(0.91f, -1.02f, 0.83f, -2.6f, -0.18f, -3.53f)
                close()
                moveTo(22.62f, 12.52f)
                lineToRelative(-9.34f, 10.48f)
                lineTo(2.5f, 23.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.86f)
                curveToRelative(0.91f, 0f, 1.64f, 0.74f, 1.64f, 1.64f)
                curveToRelative(0f, 0.81f, -0.6f, 1.51f, -1.4f, 1.62f)
                lineToRelative(-5.66f, 0.74f)
                lineToRelative(0.13f, 0.99f)
                lineToRelative(5.67f, -0.74f)
                curveToRelative(1.02f, -0.15f, 1.84f, -0.88f, 2.15f, -1.82f)
                lineToRelative(4.5f, -4.94f)
                curveToRelative(0.27f, -0.3f, 0.64f, -0.47f, 1.05f, -0.49f)
                curveToRelative(0.41f, -0.02f, 0.79f, 0.12f, 1.09f, 0.39f)
                curveToRelative(0.61f, 0.56f, 0.66f, 1.51f, 0.11f, 2.12f)
                close()
            }
        }.also { _Onboarding = it}
