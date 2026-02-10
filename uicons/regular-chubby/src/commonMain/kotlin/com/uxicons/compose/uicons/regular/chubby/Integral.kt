package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Integral: ImageVector? = null

val Icons.Rc.Integral: ImageVector
    get() = _Integral ?: UXIcon(name = "Integral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 4.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.23f, -0.27f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.27f, -1.5f, 1.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.32f, -1.18f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.18f, -3.5f, -3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.23f, 0.27f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.27f, 1.5f, -1.5f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -2.32f, 1.18f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.18f, 3.5f, 3.5f)
                close()
            }
        }.also { _Integral = it}
