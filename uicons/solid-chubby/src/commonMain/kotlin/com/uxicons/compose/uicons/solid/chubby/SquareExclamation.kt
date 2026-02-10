package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareExclamation: ImageVector? = null

val Icons.Sc.SquareExclamation: ImageVector
    get() = _SquareExclamation ?: UXIcon(name = "SquareExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 2.79f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.03f, 0.98f, -9.21f, 1.02f)
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
                moveTo(11f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SquareExclamation = it}
