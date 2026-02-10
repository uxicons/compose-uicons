package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsRight: ImageVector? = null

val Icons.Bs.ChevronDoubleDotsRight: ImageVector
    get() = _ChevronDoubleDotsRight ?: UXIcon(name = "ChevronDoubleDotsRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.2f, 14.02f)
                lineToRelative(-5.74f, 6.12f)
                lineToRelative(-2.19f, -2.05f)
                lineToRelative(5.74f, -6.12f)
                lineToRelative(-5.75f, -6.08f)
                lineToRelative(2.19f, -2.05f)
                lineToRelative(5.75f, 6.16f)
                curveToRelative(1.06f, 1.13f, 1.06f, 2.9f, -0.0f, 4.03f)
                close()
                moveTo(23.27f, 10.19f)
                lineTo(14.09f, 0.47f)
                lineTo(11.91f, 2.53f)
                lineTo(20.85f, 12f)
                lineTo(11.91f, 21.47f)
                lineTo(14.09f, 23.53f)
                lineTo(23.24f, 13.84f)
                curveToRelative(0.49f, -0.49f, 0.76f, -1.15f, 0.76f, -1.84f)
                reflectiveCurveToRelative(-0.27f, -1.35f, -0.73f, -1.81f)
                close()
                moveTo(9.5f, 13.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(5.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsRight = it}
