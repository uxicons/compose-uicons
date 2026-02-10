package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Rc.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.05f, 3.31f)
                curveToRelative(-0.17f, -0.52f, 0.11f, -1.09f, 0.63f, -1.26f)
                curveToRelative(0.13f, -0.04f, 3.22f, -1.05f, 9.32f, -1.05f)
                reflectiveCurveToRelative(9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                curveToRelative(-0.17f, 0.53f, -0.76f, 0.81f, -1.26f, 0.63f)
                curveToRelative(-0.03f, -0.01f, -2.96f, -0.95f, -8.68f, -0.95f)
                reflectiveCurveToRelative(-8.66f, 0.94f, -8.69f, 0.95f)
                curveToRelative(-0.53f, 0.17f, -1.09f, -0.11f, -1.26f, -0.64f)
                close()
                moveTo(21.32f, 6.05f)
                curveToRelative(-0.13f, -0.04f, -3.22f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.52f, 0.17f, -0.81f, 0.74f, -0.63f, 1.26f)
                curveToRelative(0.17f, 0.52f, 0.74f, 0.81f, 1.26f, 0.64f)
                curveToRelative(0.03f, -0.01f, 2.62f, -0.84f, 7.69f, -0.94f)
                verticalLineToRelative(14.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-14.99f)
                curveToRelative(5.07f, 0.1f, 7.66f, 0.93f, 7.68f, 0.94f)
                curveToRelative(0.51f, 0.17f, 1.09f, -0.1f, 1.26f, -0.63f)
                curveToRelative(0.17f, -0.52f, -0.11f, -1.09f, -0.63f, -1.26f)
                close()
            }
        }.also { _Tenge = it}
