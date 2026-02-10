package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPilot: ImageVector? = null

val Icons.Ts.UserPilot: ImageVector
    get() = _UserPilot ?: UXIcon(name = "UserPilot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 6.12f)
                lineToRelative(-3.27f, -1.96f)
                lineToRelative(0.52f, -0.86f)
                lineToRelative(2.76f, 1.65f)
                lineToRelative(2.76f, -1.65f)
                lineToRelative(0.52f, 0.86f)
                lineToRelative(-3.27f, 1.96f)
                close()
                moveTo(6.01f, 6.29f)
                lineToRelative(-2f, -1.5f)
                verticalLineToRelative(-2.62f)
                lineTo(10.17f, 0.27f)
                curveToRelative(1.22f, -0.31f, 2.47f, -0.31f, 3.66f, -0.01f)
                lineToRelative(0.03f, 0.01f)
                lineToRelative(6.16f, 1.9f)
                verticalLineToRelative(2.62f)
                lineToRelative(-2f, 1.5f)
                verticalLineToRelative(2.75f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-2.75f)
                close()
                moveTo(17.01f, 9.04f)
                verticalLineToRelative(-0.72f)
                curveToRelative(-0.85f, 0.32f, -2.44f, 0.72f, -5f, 0.72f)
                reflectiveCurveToRelative(-4.15f, -0.41f, -5f, -0.72f)
                verticalLineToRelative(0.72f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveTo(7.01f, 5.79f)
                verticalLineToRelative(1.45f)
                curveToRelative(0.53f, 0.25f, 2.07f, 0.8f, 5f, 0.8f)
                reflectiveCurveToRelative(4.46f, -0.56f, 5f, -0.8f)
                verticalLineToRelative(-1.45f)
                lineToRelative(2f, -1.5f)
                verticalLineToRelative(-1.38f)
                lineToRelative(-5.44f, -1.68f)
                curveToRelative(-1.03f, -0.25f, -2.11f, -0.25f, -3.14f, 0.0f)
                lineToRelative(-5.42f, 1.68f)
                verticalLineToRelative(1.38f)
                lineToRelative(2f, 1.5f)
                close()
                moveTo(16.0f, 16.04f)
                horizontalLineToRelative(-7.99f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3.49f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _UserPilot = it}
