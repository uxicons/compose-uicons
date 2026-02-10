package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onboarding: ImageVector? = null

val Icons.Rr.Onboarding: ImageVector
    get() = _Onboarding ?: UXIcon(name = "Onboarding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(5.72f, 9.2f)
                curveToRelative(1.51f, -1.54f, 4.06f, -1.54f, 5.57f, 0f)
                curveToRelative(0.2f, 0.2f, 0.46f, 0.3f, 0.72f, 0.3f)
                curveToRelative(0.25f, 0f, 0.5f, -0.1f, 0.7f, -0.28f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-1.13f, -1.16f, -2.63f, -1.8f, -4.22f, -1.8f)
                reflectiveCurveToRelative(-3.08f, 0.64f, -4.22f, 1.8f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.4f, 0.39f, 1.03f, 0.38f, 1.41f, -0.02f)
                close()
                moveTo(23.24f, 13.02f)
                lineToRelative(-6.8f, 7.64f)
                curveToRelative(-1.9f, 2.13f, -4.62f, 3.35f, -7.47f, 3.35f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8.86f)
                curveToRelative(1.14f, 0f, 2.14f, 0.61f, 2.69f, 1.52f)
                lineToRelative(3.22f, -3.53f)
                curveToRelative(0.54f, -0.59f, 1.28f, -0.94f, 2.08f, -0.98f)
                curveToRelative(0.79f, -0.03f, 1.57f, 0.24f, 2.17f, 0.78f)
                curveToRelative(1.21f, 1.11f, 1.31f, 3.0f, 0.22f, 4.23f)
                close()
                moveTo(21.67f, 10.26f)
                curveToRelative(-0.2f, -0.18f, -0.46f, -0.28f, -0.73f, -0.26f)
                curveToRelative(-0.27f, 0.01f, -0.52f, 0.13f, -0.7f, 0.33f)
                lineToRelative(-4.43f, 4.87f)
                curveToRelative(-0.39f, 1.07f, -1.34f, 1.89f, -2.51f, 2.06f)
                lineToRelative(-5.16f, 0.74f)
                curveToRelative(-0.55f, 0.07f, -1.05f, -0.3f, -1.13f, -0.85f)
                reflectiveCurveToRelative(0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(5.16f, -0.74f)
                curveToRelative(0.56f, -0.08f, 0.98f, -0.56f, 0.98f, -1.13f)
                curveToRelative(0f, -0.63f, -0.51f, -1.14f, -1.14f, -1.14f)
                lineTo(4f, 13.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4.96f)
                curveToRelative(2.28f, 0f, 4.46f, -0.98f, 5.97f, -2.68f)
                lineToRelative(6.8f, -7.64f)
                curveToRelative(0.37f, -0.41f, 0.34f, -1.05f, -0.07f, -1.42f)
                close()
            }
        }.also { _Onboarding = it}
