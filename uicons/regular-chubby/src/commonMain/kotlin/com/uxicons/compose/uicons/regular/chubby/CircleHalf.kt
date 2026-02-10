package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalf: ImageVector? = null

val Icons.Rc.CircleHalf: ImageVector
    get() = _CircleHalf ?: UXIcon(name = "CircleHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 20.98f)
                curveToRelative(-5.81f, -0.25f, -8f, -2.76f, -8f, -8.98f)
                reflectiveCurveToRelative(2.19f, -8.73f, 8f, -8.98f)
                close()
            }
        }.also { _CircleHalf = it}
