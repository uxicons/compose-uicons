package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDotsDown: ImageVector? = null

val Icons.Ss.ChevronDoubleDotsDown: ImageVector
    get() = _ChevronDoubleDotsDown ?: UXIcon(name = "ChevronDoubleDotsDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(21.81f, 12.78f)
                lineTo(12.0f, 22.0f)
                lineTo(2.19f, 12.78f)
                lineTo(0.81f, 14.23f)
                lineTo(10.51f, 23.39f)
                curveToRelative(0.4f, 0.4f, 0.93f, 0.62f, 1.49f, 0.62f)
                reflectiveCurveToRelative(1.09f, -0.22f, 1.47f, -0.6f)
                lineToRelative(9.72f, -9.18f)
                lineToRelative(-1.37f, -1.46f)
                close()
                moveTo(12.0f, 18.5f)
                curveToRelative(0.56f, 0f, 1.09f, -0.22f, 1.47f, -0.59f)
                lineToRelative(7.09f, -6.68f)
                lineToRelative(-1.37f, -1.46f)
                lineToRelative(-7.19f, 6.73f)
                lineToRelative(-7.19f, -6.73f)
                lineToRelative(-1.37f, 1.46f)
                lineToRelative(7.07f, 6.65f)
                curveToRelative(0.4f, 0.4f, 0.93f, 0.62f, 1.49f, 0.62f)
                close()
            }
        }.also { _ChevronDoubleDotsDown = it}
