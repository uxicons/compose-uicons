package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Rs.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.21f, 21.29f)
                lineTo(0.73f, 13.82f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
                reflectiveCurveToRelative(0.26f, -1.3f, 0.73f, -1.77f)
                lineTo(8.26f, 2.76f)
                lineToRelative(1.41f, 1.41f)
                lineTo(2.15f, 11.7f)
                curveToRelative(-0.13f, 0.13f, -0.15f, 0.28f, -0.15f, 0.35f)
                reflectiveCurveToRelative(0.02f, 0.23f, 0.15f, 0.35f)
                lineToRelative(7.47f, 7.47f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(23.27f, 13.82f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                lineTo(15.74f, 2.76f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(0.13f, 0.13f, 0.15f, 0.28f, 0.15f, 0.35f)
                reflectiveCurveToRelative(-0.02f, 0.23f, -0.15f, 0.35f)
                lineToRelative(-7.47f, 7.47f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.47f, -7.47f)
                close()
            }
        }.also { _CodeSimple = it}
