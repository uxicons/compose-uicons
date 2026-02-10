package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Rc.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 22.21f)
                curveToRelative(-0.11f, 0.54f, -0.66f, 0.89f, -1.19f, 0.77f)
                curveToRelative(-0.02f, -0.01f, -2.31f, -0.48f, -6.79f, -0.48f)
                reflectiveCurveToRelative(-6.77f, 0.47f, -6.79f, 0.48f)
                curveToRelative(-0.53f, 0.11f, -1.07f, -0.23f, -1.19f, -0.77f)
                curveToRelative(-0.11f, -0.54f, 0.23f, -1.07f, 0.77f, -1.19f)
                curveToRelative(0.1f, -0.02f, 2.49f, -0.52f, 7.21f, -0.52f)
                reflectiveCurveToRelative(7.11f, 0.5f, 7.21f, 0.52f)
                curveToRelative(0.54f, 0.12f, 0.88f, 0.65f, 0.77f, 1.19f)
                close()
                moveTo(5.21f, 10.48f)
                curveToRelative(0.02f, -0.01f, 1.99f, -0.4f, 5.79f, -0.47f)
                verticalLineToRelative(5.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.99f)
                curveToRelative(3.8f, 0.06f, 5.77f, 0.46f, 5.79f, 0.47f)
                curveToRelative(0.53f, 0.12f, 1.07f, -0.23f, 1.19f, -0.77f)
                curveToRelative(0.11f, -0.54f, -0.23f, -1.07f, -0.77f, -1.19f)
                curveToRelative(-0.09f, -0.02f, -2.17f, -0.44f, -6.21f, -0.51f)
                verticalLineToRelative(-6.01f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6.01f)
                curveToRelative(-4.04f, 0.07f, -6.12f, 0.49f, -6.21f, 0.51f)
                curveToRelative(-0.54f, 0.12f, -0.88f, 0.65f, -0.77f, 1.19f)
                curveToRelative(0.12f, 0.54f, 0.65f, 0.88f, 1.19f, 0.77f)
                close()
            }
        }.also { _PlusMinus = it}
