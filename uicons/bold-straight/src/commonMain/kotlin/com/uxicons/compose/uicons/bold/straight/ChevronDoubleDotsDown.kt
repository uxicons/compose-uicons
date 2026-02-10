package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsDown: ImageVector? = null

val Icons.Bs.ChevronDoubleDotsDown: ImageVector
    get() = _ChevronDoubleDotsDown ?: UXIcon(name = "ChevronDoubleDotsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.98f, 16.2f)
                lineToRelative(-6.12f, -5.74f)
                lineToRelative(2.05f, -2.19f)
                lineToRelative(6.12f, 5.74f)
                lineToRelative(6.08f, -5.75f)
                lineToRelative(2.05f, 2.19f)
                lineToRelative(-6.16f, 5.75f)
                curveToRelative(-0.56f, 0.53f, -1.29f, 0.79f, -2.01f, 0.79f)
                reflectiveCurveToRelative(-1.45f, -0.27f, -2.02f, -0.8f)
                close()
                moveTo(21.47f, 11.91f)
                lineTo(12f, 20.85f)
                lineTo(2.53f, 11.91f)
                lineTo(0.47f, 14.09f)
                lineTo(10.16f, 23.24f)
                curveToRelative(0.49f, 0.49f, 1.15f, 0.76f, 1.84f, 0.76f)
                reflectiveCurveToRelative(1.35f, -0.27f, 1.81f, -0.73f)
                lineToRelative(9.72f, -9.18f)
                lineToRelative(-2.06f, -2.18f)
                close()
                moveTo(12f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _ChevronDoubleDotsDown = it}
