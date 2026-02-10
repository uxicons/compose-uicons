package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ban: ImageVector? = null

val Icons.Sc.Ban: ImageVector
    get() = _Ban ?: UXIcon(name = "Ban") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.07f)
                curveTo(7.28f, 1.07f, 1f, 2.21f, 1f, 12f)
                reflectiveCurveToRelative(6.28f, 10.93f, 11f, 10.93f)
                reflectiveCurveToRelative(11f, -1.13f, 11f, -10.93f)
                reflectiveCurveTo(16.72f, 1.07f, 12f, 1.07f)
                close()
                moveTo(12f, 4.08f)
                curveToRelative(1.98f, 0f, 3.66f, 0.21f, 4.96f, 0.89f)
                lineTo(4.93f, 16.9f)
                curveToRelative(-0.61f, -1.17f, -0.93f, -2.75f, -0.93f, -4.9f)
                curveToRelative(0f, -6.6f, 3.06f, -7.92f, 8f, -7.92f)
                close()
                moveTo(12f, 19.93f)
                curveToRelative(-1.98f, 0f, -3.66f, -0.21f, -4.96f, -0.89f)
                lineTo(19.07f, 7.1f)
                curveToRelative(0.61f, 1.17f, 0.93f, 2.75f, 0.93f, 4.9f)
                curveToRelative(0f, 6.6f, -3.06f, 7.92f, -8f, 7.92f)
                close()
            }
        }.also { _Ban = it}
