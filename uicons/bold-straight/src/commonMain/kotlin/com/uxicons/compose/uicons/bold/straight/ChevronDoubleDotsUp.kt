package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsUp: ImageVector? = null

val Icons.Bs.ChevronDoubleDotsUp: ImageVector
    get() = _ChevronDoubleDotsUp ?: UXIcon(name = "ChevronDoubleDotsUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.02f, 7.79f)
                lineToRelative(6.12f, 5.74f)
                lineToRelative(-2.05f, 2.19f)
                lineToRelative(-6.12f, -5.74f)
                lineToRelative(-6.08f, 5.75f)
                lineToRelative(-2.05f, -2.19f)
                lineToRelative(6.16f, -5.75f)
                curveToRelative(1.13f, -1.06f, 2.9f, -1.06f, 4.03f, 0.0f)
                close()
                moveTo(13.84f, 0.76f)
                curveToRelative(-1.01f, -1.01f, -2.67f, -1.01f, -3.65f, -0.03f)
                lineToRelative(-9.72f, 9.18f)
                lineToRelative(2.06f, 2.18f)
                lineToRelative(9.47f, -8.94f)
                lineToRelative(9.47f, 8.94f)
                lineToRelative(2.06f, -2.18f)
                lineToRelative(-9.69f, -9.15f)
                close()
                moveTo(12.0f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsUp = it}
