package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Ts.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12.71f, 12f)
                lineToRelative(7.41f, -7.41f)
                curveToRelative(1.79f, 1.96f, 2.88f, 4.56f, 2.88f, 7.41f)
                reflectiveCurveToRelative(-1.09f, 5.46f, -2.88f, 7.41f)
                lineToRelative(-7.41f, -7.41f)
                close()
                moveTo(19.41f, 3.88f)
                lineToRelative(-7.41f, 7.41f)
                lineTo(4.59f, 3.88f)
                curveToRelative(1.96f, -1.79f, 4.56f, -2.88f, 7.41f, -2.88f)
                reflectiveCurveToRelative(5.46f, 1.09f, 7.41f, 2.88f)
                close()
                moveTo(3.88f, 4.59f)
                lineToRelative(7.41f, 7.41f)
                lineToRelative(-7.41f, 7.41f)
                curveToRelative(-1.79f, -1.96f, -2.88f, -4.56f, -2.88f, -7.41f)
                reflectiveCurveToRelative(1.09f, -5.46f, 2.88f, -7.41f)
                close()
                moveTo(4.59f, 20.12f)
                lineToRelative(7.41f, -7.41f)
                lineToRelative(7.41f, 7.41f)
                curveToRelative(-1.96f, 1.79f, -4.56f, 2.88f, -7.41f, 2.88f)
                reflectiveCurveToRelative(-5.46f, -1.09f, -7.41f, -2.88f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
