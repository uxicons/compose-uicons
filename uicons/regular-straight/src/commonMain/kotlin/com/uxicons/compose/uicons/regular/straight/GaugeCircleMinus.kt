package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GaugeCircleMinus: ImageVector? = null

val Icons.Rs.GaugeCircleMinus: ImageVector
    get() = _GaugeCircleMinus ?: UXIcon(name = "GaugeCircleMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.25f, 17.91f)
                curveToRelative(-2.05f, -1.71f, -3.25f, -4.24f, -3.25f, -6.91f)
                curveTo(2f, 6.04f, 6.04f, 2.0f, 11.0f, 2f)
                curveToRelative(0.0f, 0f, 0.0f, 0.0f, 0.01f, 0.0f)
                curveToRelative(4.72f, 0f, 8.59f, 3.65f, 8.97f, 8.27f)
                curveToRelative(0.72f, 0.18f, 1.4f, 0.46f, 2.02f, 0.82f)
                curveToRelative(0.0f, -0.03f, 0.02f, -0.05f, 0.02f, -0.08f)
                curveTo(22.01f, 4.94f, 17.07f, 0.0f, 11.0f, 0.0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                verticalLineToRelative(-0.0f)
                curveTo(4.93f, 0f, 0f, 4.93f, 0f, 11f)
                curveToRelative(0f, 3.57f, 1.75f, 6.94f, 4.69f, 9f)
                lineToRelative(0.61f, 0.43f)
                lineToRelative(3.32f, -2.65f)
                lineToRelative(-1.25f, -1.56f)
                lineToRelative(-2.13f, 1.7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-5.28f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _GaugeCircleMinus = it}
