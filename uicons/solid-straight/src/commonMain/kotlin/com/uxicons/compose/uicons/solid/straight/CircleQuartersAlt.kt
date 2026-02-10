package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Ss.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.41f, 12f)
                lineToRelative(6.33f, -6.33f)
                curveToRelative(1.41f, 1.73f, 2.26f, 3.93f, 2.26f, 6.33f)
                reflectiveCurveToRelative(-0.85f, 4.6f, -2.26f, 6.33f)
                lineToRelative(-6.33f, -6.33f)
                close()
                moveTo(18.32f, 4.26f)
                lineToRelative(-6.33f, 6.33f)
                lineToRelative(-6.33f, -6.33f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.33f, -2.26f)
                reflectiveCurveToRelative(4.6f, 0.85f, 6.33f, 2.26f)
                close()
                moveTo(4.26f, 5.67f)
                lineToRelative(6.33f, 6.33f)
                lineToRelative(-6.33f, 6.33f)
                curveToRelative(-1.41f, -1.73f, -2.26f, -3.93f, -2.26f, -6.33f)
                reflectiveCurveToRelative(0.85f, -4.6f, 2.26f, -6.33f)
                close()
                moveTo(5.67f, 19.74f)
                lineToRelative(6.33f, -6.33f)
                lineToRelative(6.33f, 6.33f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.33f, 2.26f)
                reflectiveCurveToRelative(-4.6f, -0.85f, -6.33f, -2.26f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
