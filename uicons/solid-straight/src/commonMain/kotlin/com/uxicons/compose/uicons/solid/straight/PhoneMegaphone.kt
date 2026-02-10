package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneMegaphone: ImageVector? = null

val Icons.Ss.PhoneMegaphone: ImageVector
    get() = _PhoneMegaphone ?: UXIcon(name = "PhoneMegaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-16f)
                close()
                moveTo(9f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(24f, 9f)
                curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
                verticalLineToRelative(-3.59f)
                reflectiveCurveToRelative(-1.89f, 0f, -1.89f, 0f)
                curveToRelative(-0.21f, 1.11f, -0.75f, 2.05f, -2.11f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.74f, 0.41f, 1.38f, 1.01f, 1.73f)
                lineToRelative(1.86f, 4.27f)
                horizontalLineToRelative(0.72f)
                curveToRelative(0.48f, 0f, 0.92f, -0.24f, 1.18f, -0.64f)
                reflectiveCurveToRelative(0.3f, -0.9f, 0.11f, -1.34f)
                lineToRelative(-0.87f, -2.02f)
                horizontalLineToRelative(0.99f)
                curveToRelative(1.36f, -0.05f, 1.9f, 0.9f, 2.11f, 2f)
                horizontalLineToRelative(1.89f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0.58f, -0.21f, 1.0f, -0.76f, 1.0f, -1.41f)
                close()
                moveTo(14.69f, 16f)
                horizontalLineToRelative(-11.69f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.16f, 0.52f, 2.27f, 1.39f, 3.02f)
                lineToRelative(1.3f, 2.98f)
                close()
            }
        }.also { _PhoneMegaphone = it}
