package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Tc.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(19.32f, 3.97f)
                lineTo(12f, 11.29f)
                lineTo(4.68f, 3.97f)
                curveToRelative(1.61f, -1.36f, 3.99f, -1.97f, 7.32f, -1.97f)
                reflectiveCurveToRelative(5.71f, 0.61f, 7.32f, 1.97f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -3.33f, 0.61f, -5.71f, 1.97f, -7.32f)
                lineToRelative(7.32f, 7.32f)
                lineToRelative(-7.32f, 7.32f)
                curveToRelative(-1.36f, -1.61f, -1.97f, -3.99f, -1.97f, -7.32f)
                close()
                moveTo(4.68f, 20.03f)
                lineTo(12f, 12.71f)
                lineTo(19.32f, 20.03f)
                curveToRelative(-1.61f, 1.36f, -3.99f, 1.97f, -7.32f, 1.97f)
                reflectiveCurveToRelative(-5.71f, -0.61f, -7.32f, -1.97f)
                close()
                moveTo(20.03f, 19.32f)
                lineTo(12.71f, 12f)
                lineTo(20.03f, 4.68f)
                curveToRelative(1.36f, 1.61f, 1.97f, 3.99f, 1.97f, 7.32f)
                reflectiveCurveToRelative(-0.61f, 5.71f, -1.97f, 7.32f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
