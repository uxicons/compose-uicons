package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Sr.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
                reflectiveCurveTo(18.63f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.4f, 0f, 4.6f, 0.85f, 6.33f, 2.26f)
                lineToRelative(-6.33f, 6.33f)
                lineToRelative(-6.33f, -6.33f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.33f, -2.26f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.33f)
                lineToRelative(6.33f, 6.33f)
                lineToRelative(-6.33f, 6.33f)
                curveToRelative(-1.41f, -1.73f, -2.26f, -3.93f, -2.26f, -6.33f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.4f, 0f, -4.6f, -0.85f, -6.33f, -2.26f)
                lineToRelative(6.33f, -6.33f)
                lineToRelative(6.33f, 6.33f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.33f, 2.26f)
                close()
                moveTo(19.74f, 18.32f)
                lineToRelative(-6.33f, -6.33f)
                lineToRelative(6.33f, -6.33f)
                curveToRelative(1.41f, 1.73f, 2.26f, 3.93f, 2.26f, 6.33f)
                reflectiveCurveToRelative(-0.85f, 4.6f, -2.26f, 6.33f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
