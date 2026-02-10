package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsLeft: ImageVector? = null

val Icons.Bs.ChevronDoubleDotsLeft: ImageVector
    get() = _ChevronDoubleDotsLeft ?: UXIcon(name = "ChevronDoubleDotsLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.98f, 12.03f)
                lineToRelative(5.75f, 6.08f)
                lineToRelative(-2.19f, 2.05f)
                lineToRelative(-5.75f, -6.16f)
                curveToRelative(-1.06f, -1.13f, -1.06f, -2.9f, 0.0f, -4.03f)
                lineToRelative(5.74f, -6.12f)
                lineToRelative(2.19f, 2.05f)
                close()
                moveTo(12.09f, 2.53f)
                lineTo(9.91f, 0.47f)
                lineTo(0.76f, 10.16f)
                curveToRelative(-1.01f, 1.01f, -1.01f, 2.67f, -0.03f, 3.65f)
                lineToRelative(9.18f, 9.72f)
                lineToRelative(2.18f, -2.06f)
                lineToRelative(-8.94f, -9.47f)
                close()
                moveTo(14.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 10.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsLeft = it}
