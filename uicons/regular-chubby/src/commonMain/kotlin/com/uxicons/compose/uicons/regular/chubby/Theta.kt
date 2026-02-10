package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Theta: ImageVector? = null

val Icons.Rc.Theta: ImageVector
    get() = _Theta ?: UXIcon(name = "Theta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 3.29f, -9f, 11f)
                reflectiveCurveToRelative(2.69f, 11f, 9f, 11f)
                reflectiveCurveToRelative(9f, -3.29f, 9f, -11f)
                reflectiveCurveToRelative(-2.69f, -11f, -9f, -11f)
                close()
                moveTo(12f, 3f)
                curveToRelative(4.12f, 0f, 6.74f, 1.38f, 6.98f, 8f)
                horizontalLineToRelative(-13.95f)
                curveToRelative(0.24f, -6.62f, 2.86f, -8f, 6.98f, -8f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.12f, 0f, -6.74f, -1.38f, -6.98f, -8f)
                horizontalLineToRelative(13.95f)
                curveToRelative(-0.24f, 6.62f, -2.86f, 8f, -6.98f, 8f)
                close()
            }
        }.also { _Theta = it}
