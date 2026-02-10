package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Tc.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.39f, 0f, -9f, 3.19f, -9f, 11f)
                reflectiveCurveToRelative(2.61f, 11f, 9f, 11f)
                reflectiveCurveToRelative(9f, -3.19f, 9f, -11f)
                reflectiveCurveToRelative(-2.61f, -11f, -9f, -11f)
                close()
                moveTo(12f, 2f)
                curveToRelative(5.62f, 0f, 7.88f, 2.68f, 7.99f, 9.5f)
                horizontalLineToRelative(-15.98f)
                curveToRelative(0.11f, -6.82f, 2.37f, -9.5f, 7.99f, -9.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.62f, 0f, -7.88f, -2.68f, -7.99f, -9.5f)
                horizontalLineToRelative(15.98f)
                curveToRelative(-0.11f, 6.82f, -2.37f, 9.5f, -7.99f, 9.5f)
                close()
            }
        }.also { _Theta = it}
