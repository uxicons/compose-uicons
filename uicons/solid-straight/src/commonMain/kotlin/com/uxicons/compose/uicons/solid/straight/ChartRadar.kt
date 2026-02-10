package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartRadar: ImageVector? = null

val Icons.Ss.ChartRadar: ImageVector
    get() = _ChartRadar ?: UXIcon(name = "ChartRadar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.73f, 13.99f)
                lineToRelative(0f, 0.01f)
                lineToRelative(4.54f, 0f)
                lineToRelative(0f, -0.01f)
                lineToRelative(-2.27f, -3.97f)
                lineToRelative(-2.27f, 3.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.01f, 1f)
                lineTo(5.96f, 1f)
                lineTo(-0.01f, 12f)
                lineToRelative(5.97f, 11f)
                horizontalLineToRelative(12.05f)
                lineToRelative(5.98f, -11f)
                lineTo(18.01f, 1f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-0.74f, 0f, -1.39f, -0.4f, -1.73f, -1f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(-0.35f, 0.6f, -0.99f, 1f, -1.73f, 1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.89f, -1.99f, 1.99f, -2f)
                lineToRelative(2.28f, -3.99f)
                curveToRelative(-0.17f, -0.3f, -0.27f, -0.64f, -0.27f, -1.01f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.37f, -0.1f, 0.71f, -0.27f, 1.01f)
                lineToRelative(2.28f, 3.99f)
                curveToRelative(1.1f, 0f, 1.99f, 0.9f, 1.99f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _ChartRadar = it}
