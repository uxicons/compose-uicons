package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareT: ImageVector? = null

val Icons.Sc.SquareT: ImageVector
    get() = _SquareT ?: UXIcon(name = "SquareT") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 2.79f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.02f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.19f, 0.04f, 4.71f, 1.02f, 9.21f, 1.02f)
                reflectiveCurveToRelative(9.02f, -0.98f, 9.21f, -1.02f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.04f, -0.19f, 1.02f, -4.71f, 1.02f, -9.21f)
                reflectiveCurveToRelative(-0.98f, -9.02f, -1.02f, -9.21f)
                close()
                moveTo(16.95f, 7.76f)
                curveToRelative(-0.14f, 0.42f, -0.53f, 0.68f, -0.95f, 0.68f)
                curveToRelative(-0.61f, -0.06f, -0.8f, -0.3f, -3f, -0.42f)
                verticalLineToRelative(8.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.97f)
                curveToRelative(-1.77f, 0.08f, -2.68f, 0.37f, -2.69f, 0.37f)
                curveToRelative(-0.53f, 0.17f, -1.09f, -0.12f, -1.26f, -0.64f)
                curveToRelative(-0.17f, -0.52f, 0.11f, -1.08f, 0.63f, -1.26f)
                curveToRelative(0.06f, -0.02f, 1.52f, -0.5f, 4.32f, -0.5f)
                reflectiveCurveToRelative(4.26f, 0.48f, 4.32f, 0.5f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                close()
            }
        }.also { _SquareT = it}
