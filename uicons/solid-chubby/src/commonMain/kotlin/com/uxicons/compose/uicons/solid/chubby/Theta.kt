package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Sc.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.98f, 0f, -9f, 5.88f, -9f, 11f)
                reflectiveCurveToRelative(1.02f, 11f, 9f, 11f)
                reflectiveCurveToRelative(9f, -5.88f, 9f, -11f)
                reflectiveCurveToRelative(-1.02f, -11f, -9f, -11f)
                close()
                moveTo(12f, 4f)
                curveToRelative(3.58f, 0f, 5.65f, 1.09f, 5.96f, 6.5f)
                horizontalLineToRelative(-11.91f)
                curveToRelative(0.31f, -5.41f, 2.38f, -6.5f, 5.96f, -6.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.58f, 0f, -5.65f, -1.09f, -5.96f, -6.5f)
                horizontalLineToRelative(11.91f)
                curveToRelative(-0.31f, 5.41f, -2.38f, 6.5f, -5.96f, 6.5f)
                close()
            }
        }.also { _Theta = it}
