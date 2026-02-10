package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Bs.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.12f, 12f)
                lineToRelative(5.21f, -5.21f)
                curveToRelative(1.05f, 1.47f, 1.67f, 3.27f, 1.67f, 5.21f)
                reflectiveCurveToRelative(-0.62f, 3.74f, -1.67f, 5.21f)
                lineToRelative(-5.21f, -5.21f)
                close()
                moveTo(17.21f, 4.67f)
                lineToRelative(-5.21f, 5.21f)
                lineToRelative(-5.21f, -5.21f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                reflectiveCurveToRelative(3.74f, 0.62f, 5.21f, 1.67f)
                close()
                moveTo(4.67f, 6.79f)
                lineToRelative(5.21f, 5.21f)
                lineToRelative(-5.21f, 5.21f)
                curveToRelative(-1.05f, -1.47f, -1.67f, -3.27f, -1.67f, -5.21f)
                reflectiveCurveToRelative(0.62f, -3.74f, 1.67f, -5.21f)
                close()
                moveTo(6.79f, 19.33f)
                lineToRelative(5.21f, -5.21f)
                lineToRelative(5.21f, 5.21f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                reflectiveCurveToRelative(-3.74f, -0.62f, -5.21f, -1.67f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
