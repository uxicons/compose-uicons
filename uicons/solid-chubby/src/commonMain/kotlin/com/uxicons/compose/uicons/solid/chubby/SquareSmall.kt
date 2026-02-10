package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareSmall: ImageVector? = null

val Icons.Sc.SquareSmall: ImageVector
    get() = _SquareSmall ?: UXIcon(name = "SquareSmall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-2.3f, 0f, -4.62f, -0.5f, -4.71f, -0.52f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.02f, -0.1f, -0.52f, -2.41f, -0.52f, -4.71f)
                reflectiveCurveToRelative(0.5f, -4.62f, 0.52f, -4.71f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.1f, -0.02f, 2.41f, -0.52f, 4.71f, -0.52f)
                reflectiveCurveToRelative(4.62f, 0.5f, 4.71f, 0.52f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.02f, 0.1f, 0.52f, 2.41f, 0.52f, 4.71f)
                reflectiveCurveToRelative(-0.5f, 4.62f, -0.52f, 4.71f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.1f, 0.02f, -2.41f, 0.52f, -4.71f, 0.52f)
                close()
            }
        }.also { _SquareSmall = it}
