package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Ss.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.13f, 12.4f)
                lineToRelative(-4.52f, 1.0f)
                lineTo(0.11f, 22.54f)
                lineToRelative(6.01f, -6.01f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.01f, 6.01f)
                lineToRelative(9.13f, -2.5f)
                lineToRelative(1.0f, -4.52f)
                lineToRelative(-4.54f, -4.54f)
                close()
                moveTo(23.26f, 0.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-10.69f, 10.68f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(10.68f, -10.68f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.79f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }.also { _PenFancy = it}
