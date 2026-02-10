package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onboarding: ImageVector? = null

val Icons.Sr.Onboarding: ImageVector
    get() = _Onboarding ?: UXIcon(name = "Onboarding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12.44f, 8.33f)
                curveToRelative(0.14f, -0.4f, 0.01f, -0.85f, -0.32f, -1.11f)
                curveToRelative(-0.98f, -0.79f, -2.27f, -1.22f, -3.62f, -1.22f)
                reflectiveCurveToRelative(-2.64f, 0.43f, -3.62f, 1.22f)
                curveToRelative(-0.33f, 0.27f, -0.46f, 0.71f, -0.32f, 1.11f)
                curveToRelative(0.14f, 0.4f, 0.52f, 0.67f, 0.94f, 0.67f)
                horizontalLineToRelative(6f)
                curveToRelative(0.42f, 0f, 0.8f, -0.27f, 0.94f, -0.67f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _Onboarding = it}
