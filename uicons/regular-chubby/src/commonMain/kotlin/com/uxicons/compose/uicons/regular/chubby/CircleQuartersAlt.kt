package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Rc.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(18.18f, 4.41f)
                lineTo(12f, 10.59f)
                lineTo(5.82f, 4.41f)
                curveToRelative(1.43f, -0.97f, 3.44f, -1.41f, 6.18f, -1.41f)
                reflectiveCurveToRelative(4.75f, 0.43f, 6.18f, 1.41f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.74f, 0.43f, -4.75f, 1.41f, -6.18f)
                lineToRelative(6.18f, 6.18f)
                lineToRelative(-6.18f, 6.18f)
                curveToRelative(-0.97f, -1.43f, -1.41f, -3.44f, -1.41f, -6.18f)
                close()
                moveTo(5.82f, 19.59f)
                lineTo(12f, 13.41f)
                lineTo(18.18f, 19.59f)
                curveToRelative(-1.43f, 0.97f, -3.44f, 1.41f, -6.18f, 1.41f)
                reflectiveCurveToRelative(-4.75f, -0.43f, -6.18f, -1.41f)
                close()
                moveTo(19.59f, 18.18f)
                lineTo(13.41f, 12f)
                lineTo(19.59f, 5.82f)
                curveToRelative(0.97f, 1.43f, 1.41f, 3.44f, 1.41f, 6.18f)
                reflectiveCurveToRelative(-0.43f, 4.75f, -1.41f, 6.18f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
