package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onboarding: ImageVector? = null

val Icons.Tr.Onboarding: ImageVector
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
                moveTo(4.02f, 9.37f)
                curveToRelative(0.53f, -1.99f, 2.37f, -3.37f, 4.48f, -3.37f)
                reflectiveCurveToRelative(3.96f, 1.39f, 4.48f, 3.37f)
                curveToRelative(0.07f, 0.27f, -0.09f, 0.54f, -0.35f, 0.61f)
                curveToRelative(-0.29f, 0.08f, -0.55f, -0.13f, -0.61f, -0.35f)
                curveToRelative(-0.41f, -1.55f, -1.86f, -2.63f, -3.52f, -2.63f)
                reflectiveCurveToRelative(-3.11f, 1.08f, -3.52f, 2.63f)
                curveToRelative(-0.07f, 0.27f, -0.34f, 0.43f, -0.61f, 0.35f)
                curveToRelative(-0.27f, -0.07f, -0.43f, -0.34f, -0.35f, -0.61f)
                close()
                moveTo(23.18f, 9.65f)
                curveToRelative(-0.5f, -0.45f, -1.15f, -0.68f, -1.81f, -0.65f)
                curveToRelative(-0.67f, 0.03f, -1.29f, 0.32f, -1.74f, 0.82f)
                lineToRelative(-3.73f, 4.1f)
                curveToRelative(-0.31f, -1.11f, -1.33f, -1.92f, -2.54f, -1.92f)
                lineTo(3.5f, 12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.96f)
                curveToRelative(2.71f, 0f, 5.29f, -1.16f, 7.09f, -3.18f)
                lineToRelative(6.81f, -7.64f)
                curveToRelative(0.91f, -1.02f, 0.83f, -2.6f, -0.18f, -3.53f)
                close()
                moveTo(22.62f, 12.51f)
                lineToRelative(-6.81f, 7.64f)
                curveToRelative(-1.61f, 1.81f, -3.93f, 2.85f, -6.35f, 2.85f)
                lineTo(3.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.86f)
                curveToRelative(0.91f, 0f, 1.64f, 0.74f, 1.64f, 1.64f)
                curveToRelative(0f, 0.81f, -0.6f, 1.51f, -1.4f, 1.62f)
                lineToRelative(-6.16f, 0.74f)
                curveToRelative(-0.27f, 0.03f, -0.47f, 0.28f, -0.44f, 0.56f)
                curveToRelative(0.03f, 0.27f, 0.28f, 0.48f, 0.56f, 0.44f)
                lineToRelative(6.17f, -0.74f)
                curveToRelative(1.02f, -0.15f, 1.85f, -0.88f, 2.15f, -1.82f)
                lineToRelative(4.5f, -4.94f)
                curveToRelative(0.27f, -0.3f, 0.64f, -0.47f, 1.05f, -0.49f)
                curveToRelative(0.41f, -0.02f, 0.79f, 0.12f, 1.09f, 0.39f)
                curveToRelative(0.61f, 0.56f, 0.66f, 1.51f, 0.11f, 2.12f)
                close()
            }
        }.also { _Onboarding = it}
