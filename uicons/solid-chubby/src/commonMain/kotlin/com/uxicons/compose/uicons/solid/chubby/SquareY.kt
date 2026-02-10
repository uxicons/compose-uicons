package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareY: ImageVector? = null

val Icons.Sc.SquareY: ImageVector
    get() = _SquareY ?: UXIcon(name = "SquareY") {
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
                moveTo(13f, 14.41f)
                verticalLineToRelative(2.59f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.59f)
                curveToRelative(-0.85f, -0.91f, -3.18f, -3.7f, -3.5f, -7.32f)
                curveToRelative(-0.05f, -0.55f, 0.36f, -1.03f, 0.91f, -1.08f)
                curveToRelative(0.55f, -0.06f, 1.03f, 0.36f, 1.08f, 0.91f)
                curveToRelative(0.21f, 2.46f, 1.63f, 4.54f, 2.5f, 5.6f)
                curveToRelative(0.87f, -1.06f, 2.29f, -3.13f, 2.5f, -5.6f)
                curveToRelative(0.05f, -0.55f, 0.52f, -0.96f, 1.08f, -0.91f)
                curveToRelative(0.55f, 0.05f, 0.96f, 0.53f, 0.91f, 1.08f)
                curveToRelative(-0.32f, 3.62f, -2.64f, 6.41f, -3.5f, 7.32f)
                close()
            }
        }.also { _SquareY = it}
