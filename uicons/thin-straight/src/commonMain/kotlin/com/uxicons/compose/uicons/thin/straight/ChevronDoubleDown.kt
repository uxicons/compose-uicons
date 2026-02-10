package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Ts.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineTo(0.11f, 11.73f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(10.83f, 10.83f)
                curveToRelative(0.19f, 0.19f, 0.52f, 0.19f, 0.71f, 0f)
                lineToRelative(10.83f, -10.83f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-10.83f, 10.83f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                close()
                moveTo(12.47f, 13.77f)
                lineTo(23.89f, 2.35f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(12f, 12.83f)
                lineTo(0.82f, 1.65f)
                lineTo(0.11f, 2.35f)
                lineTo(11.53f, 13.77f)
                curveToRelative(0.13f, 0.13f, 0.3f, 0.19f, 0.47f, 0.19f)
                reflectiveCurveToRelative(0.34f, -0.06f, 0.47f, -0.19f)
                close()
            }
        }.also { _ChevronDoubleDown = it}
