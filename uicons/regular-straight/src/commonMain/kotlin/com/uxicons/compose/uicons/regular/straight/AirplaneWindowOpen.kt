package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneWindowOpen: ImageVector? = null

val Icons.Rs.AirplaneWindowOpen: ImageVector
    get() = _AirplaneWindowOpen ?: UXIcon(name = "AirplaneWindowOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-6f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                close()
                moveTo(11.65f, 15.02f)
                curveToRelative(-0.1f, -0.27f, -0.15f, -0.52f, -0.15f, -0.77f)
                curveToRelative(0f, -1.24f, 1.01f, -2.25f, 2.25f, -2.25f)
                curveToRelative(1.18f, 0f, 2.16f, 0.93f, 2.23f, 2.11f)
                lineToRelative(0.05f, 0.77f)
                lineToRelative(0.76f, 0.15f)
                curveToRelative(0.7f, 0.14f, 1.21f, 0.76f, 1.21f, 1.47f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.67f)
                curveToRelative(-0.46f, 0f, -0.83f, -0.37f, -0.83f, -0.83f)
                curveToRelative(0f, -0.43f, 0.34f, -0.79f, 0.77f, -0.82f)
                lineToRelative(1.33f, -0.09f)
                lineToRelative(-0.46f, -1.25f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.79f, 0f, 5.19f, 1.64f, 6.32f, 4f)
                lineTo(5.68f, 6f)
                curveToRelative(1.13f, -2.36f, 3.53f, -4f, 6.32f, -4f)
                close()
                moveTo(5f, 15f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.08f, -1f)
                horizontalLineToRelative(13.84f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                verticalLineToRelative(5.07f)
                curveToRelative(-0.32f, -0.33f, -0.7f, -0.6f, -1.12f, -0.78f)
                curveToRelative(-0.44f, -1.89f, -2.13f, -3.28f, -4.12f, -3.28f)
                curveToRelative(-2.34f, 0f, -4.25f, 1.91f, -4.25f, 4.25f)
                curveToRelative(0f, 0.14f, 0.01f, 0.28f, 0.02f, 0.42f)
                curveToRelative(-0.91f, 0.47f, -1.52f, 1.42f, -1.52f, 2.5f)
                curveToRelative(0f, 1.56f, 1.27f, 2.83f, 2.83f, 2.83f)
                horizontalLineToRelative(5.67f)
                curveToRelative(0.15f, 0f, 0.29f, -0.03f, 0.44f, -0.04f)
                curveToRelative(-1.27f, 1.26f, -3.01f, 2.04f, -4.94f, 2.04f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                close()
            }
        }.also { _AirplaneWindowOpen = it}
