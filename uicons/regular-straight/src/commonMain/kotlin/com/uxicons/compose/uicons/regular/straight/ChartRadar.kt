package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartRadar: ImageVector? = null

val Icons.Rs.ChartRadar: ImageVector
    get() = _ChartRadar ?: UXIcon(name = "ChartRadar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.01f, 13f)
                lineToRelative(-2.28f, -3.99f)
                curveToRelative(0.17f, -0.3f, 0.27f, -0.64f, 0.27f, -1.01f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.37f, 0.1f, 0.71f, 0.27f, 1.01f)
                lineToRelative(-2.28f, 3.99f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.74f, 0f, 1.39f, -0.4f, 1.73f, -1f)
                horizontalLineToRelative(4.54f)
                curveToRelative(0.35f, 0.6f, 0.99f, 1f, 1.73f, 1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.89f, -1.99f, -1.99f, -2f)
                close()
                moveTo(9.73f, 13.99f)
                lineToRelative(2.27f, -3.98f)
                lineToRelative(2.27f, 3.98f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                horizontalLineToRelative(-4.54f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.01f, 23f)
                lineTo(5.96f, 23f)
                lineTo(-0.01f, 12f)
                lineTo(5.96f, 1f)
                horizontalLineToRelative(12.05f)
                lineToRelative(5.98f, 11f)
                lineToRelative(-5.98f, 11f)
                close()
                moveTo(7.15f, 21f)
                horizontalLineToRelative(9.68f)
                lineToRelative(4.89f, -9f)
                lineTo(16.82f, 3f)
                lineTo(7.15f, 3f)
                lineTo(2.26f, 12f)
                lineToRelative(4.89f, 9f)
                close()
            }
        }.also { _ChartRadar = it}
