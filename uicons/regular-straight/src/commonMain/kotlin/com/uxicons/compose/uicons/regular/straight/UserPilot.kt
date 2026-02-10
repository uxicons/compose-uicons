package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPilot: ImageVector? = null

val Icons.Rs.UserPilot: ImageVector
    get() = _UserPilot ?: UXIcon(name = "UserPilot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21.32f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -1.48f, -1.01f, -2.76f, -2.42f, -3.13f)
                lineToRelative(-4.56f, 4.95f)
                lineToRelative(-4.59f, -4.95f)
                curveToRelative(-1.42f, 0.37f, -2.44f, 1.65f, -2.44f, 3.14f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -2.68f, 2.02f, -4.92f, 4.69f, -5.21f)
                lineToRelative(0.5f, -0.06f)
                lineToRelative(3.83f, 4.14f)
                lineToRelative(3.81f, -4.14f)
                lineToRelative(0.51f, 0.06f)
                curveToRelative(2.66f, 0.31f, 4.66f, 2.55f, 4.66f, 5.21f)
                close()
                moveTo(6f, 6f)
                lineToRelative(-2f, -1f)
                verticalLineToRelative(-3f)
                lineTo(10.3f, 0.21f)
                curveToRelative(1.11f, -0.28f, 2.28f, -0.28f, 3.4f, 0f)
                lineToRelative(6.3f, 1.79f)
                verticalLineToRelative(3f)
                lineToRelative(-2f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 7.62f)
                curveToRelative(-0.98f, 0.21f, -2.31f, 0.39f, -4f, 0.39f)
                reflectiveCurveToRelative(-3.02f, -0.18f, -4f, -0.39f)
                verticalLineToRelative(1.39f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.39f)
                close()
                moveTo(8.98f, 4.19f)
                lineToRelative(3.02f, 1.81f)
                lineToRelative(3.02f, -1.81f)
                lineToRelative(-1.03f, -1.72f)
                lineToRelative(-1.99f, 1.19f)
                lineToRelative(-1.99f, -1.19f)
                lineToRelative(-1.03f, 1.72f)
                close()
            }
        }.also { _UserPilot = it}
