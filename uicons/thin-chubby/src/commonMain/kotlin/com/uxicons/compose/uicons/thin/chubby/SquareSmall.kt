package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareSmall: ImageVector? = null

val Icons.Tc.SquareSmall: ImageVector
    get() = _SquareSmall ?: UXIcon(name = "SquareSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-2.47f, 0f, -4.95f, -0.54f, -5.06f, -0.56f)
                curveToRelative(-0.19f, -0.04f, -0.34f, -0.19f, -0.38f, -0.38f)
                curveToRelative(-0.02f, -0.1f, -0.56f, -2.59f, -0.56f, -5.06f)
                reflectiveCurveToRelative(0.54f, -4.95f, 0.56f, -5.06f)
                curveToRelative(0.04f, -0.19f, 0.19f, -0.34f, 0.38f, -0.38f)
                curveToRelative(0.1f, -0.02f, 2.59f, -0.56f, 5.06f, -0.56f)
                reflectiveCurveToRelative(4.95f, 0.54f, 5.06f, 0.56f)
                curveToRelative(0.19f, 0.04f, 0.34f, 0.19f, 0.38f, 0.38f)
                curveToRelative(0.02f, 0.1f, 0.56f, 2.59f, 0.56f, 5.06f)
                reflectiveCurveToRelative(-0.54f, 4.95f, -0.56f, 5.06f)
                curveToRelative(-0.04f, 0.19f, -0.19f, 0.34f, -0.38f, 0.38f)
                curveToRelative(-0.1f, 0.02f, -2.59f, 0.56f, -5.06f, 0.56f)
                close()
                moveTo(7.47f, 16.52f)
                curveToRelative(0.74f, 0.14f, 2.67f, 0.47f, 4.53f, 0.47f)
                reflectiveCurveToRelative(3.78f, -0.33f, 4.53f, -0.47f)
                curveToRelative(0.14f, -0.74f, 0.47f, -2.66f, 0.47f, -4.53f)
                reflectiveCurveToRelative(-0.33f, -3.78f, -0.47f, -4.53f)
                curveToRelative(-0.74f, -0.14f, -2.67f, -0.47f, -4.53f, -0.47f)
                reflectiveCurveToRelative(-3.78f, 0.33f, -4.53f, 0.47f)
                curveToRelative(-0.14f, 0.74f, -0.47f, 2.66f, -0.47f, 4.53f)
                reflectiveCurveToRelative(0.33f, 3.78f, 0.47f, 4.53f)
                close()
            }
        }.also { _SquareSmall = it}
