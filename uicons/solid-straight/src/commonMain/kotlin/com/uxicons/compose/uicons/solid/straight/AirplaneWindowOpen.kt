package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneWindowOpen: ImageVector? = null

val Icons.Ss.AirplaneWindowOpen: ImageVector
    get() = _AirplaneWindowOpen ?: UXIcon(name = "AirplaneWindowOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.52f, 6f)
                curveTo(4.76f, 2.51f, 8.09f, 0f, 12f, 0f)
                reflectiveCurveToRelative(7.24f, 2.51f, 8.47f, 6f)
                lineTo(3.52f, 6f)
                close()
                moveTo(15.79f, 15.03f)
                lineToRelative(-0.76f, -0.15f)
                lineToRelative(-0.05f, -0.77f)
                curveToRelative(-0.07f, -1.18f, -1.05f, -2.11f, -2.23f, -2.11f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                curveToRelative(0f, 0.25f, 0.05f, 0.5f, 0.15f, 0.77f)
                lineToRelative(0.46f, 1.25f)
                lineToRelative(-1.33f, 0.09f)
                curveToRelative(-0.43f, 0.03f, -0.77f, 0.39f, -0.77f, 0.82f)
                curveToRelative(0f, 0.46f, 0.37f, 0.83f, 0.83f, 0.83f)
                horizontalLineToRelative(5.67f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.71f, -0.51f, -1.33f, -1.21f, -1.47f)
                close()
                moveTo(20.94f, 8f)
                curveToRelative(0.04f, 0.33f, 0.06f, 0.66f, 0.06f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.34f, 0.02f, -0.67f, 0.06f, -1f)
                lineTo(20.94f, 8f)
                close()
                moveTo(19f, 16.5f)
                curveToRelative(0f, -1.42f, -0.86f, -2.68f, -2.12f, -3.22f)
                curveToRelative(-0.44f, -1.89f, -2.13f, -3.28f, -4.12f, -3.28f)
                curveToRelative(-2.34f, 0f, -4.25f, 1.91f, -4.25f, 4.25f)
                curveToRelative(0f, 0.14f, 0.01f, 0.28f, 0.02f, 0.42f)
                curveToRelative(-0.91f, 0.47f, -1.52f, 1.42f, -1.52f, 2.5f)
                curveToRelative(0f, 1.56f, 1.27f, 2.83f, 2.83f, 2.83f)
                horizontalLineToRelative(5.67f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _AirplaneWindowOpen = it}
