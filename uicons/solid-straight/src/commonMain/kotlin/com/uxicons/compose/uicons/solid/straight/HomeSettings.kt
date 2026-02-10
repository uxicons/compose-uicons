package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeSettings: ImageVector? = null

val Icons.Ss.HomeSettings: ImageVector
    get() = _HomeSettings ?: UXIcon(name = "HomeSettings") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 18f)
                curveToRelative(0f, -0.46f, -0.09f, -0.9f, -0.22f, -1.31f)
                lineToRelative(1.42f, -0.82f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(-1.41f, 0.81f)
                curveToRelative(-0.6f, -0.65f, -1.4f, -1.12f, -2.29f, -1.33f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.62f)
                curveToRelative(-0.89f, 0.21f, -1.69f, 0.68f, -2.29f, 1.33f)
                lineToRelative(-1.41f, -0.81f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(1.42f, 0.82f)
                curveToRelative(-0.13f, 0.42f, -0.22f, 0.85f, -0.22f, 1.31f)
                reflectiveCurveToRelative(0.09f, 0.9f, 0.22f, 1.31f)
                lineToRelative(-1.42f, 0.82f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(1.41f, -0.81f)
                curveToRelative(0.6f, 0.65f, 1.39f, 1.12f, 2.29f, 1.33f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.62f)
                curveToRelative(0.9f, -0.2f, 1.69f, -0.68f, 2.29f, -1.33f)
                lineToRelative(1.41f, 0.81f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-1.42f, -0.82f)
                curveToRelative(0.13f, -0.42f, 0.22f, -0.85f, 0.22f, -1.31f)
                close()
                moveTo(18f, 19.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.72f, 24f)
                horizontalLineToRelative(-12.72f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineToRelative(8.9f, -6.98f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.73f, 0.58f, 1.16f, 1.44f, 1.18f, 2.37f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(2.72f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.72f, -6f, -2.72f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
            }
        }.also { _HomeSettings = it}
