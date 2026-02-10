package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderAll: ImageVector? = null

val Icons.Rc.BorderAll: ImageVector
    get() = _BorderAll ?: UXIcon(name = "BorderAll") {
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
                moveTo(20.98f, 11f)
                horizontalLineToRelative(-7.98f)
                verticalLineToRelative(-7.98f)
                curveToRelative(2.99f, 0.1f, 5.9f, 0.59f, 7.15f, 0.83f)
                curveToRelative(0.24f, 1.25f, 0.73f, 4.16f, 0.83f, 7.15f)
                close()
                moveTo(11f, 3.02f)
                verticalLineToRelative(7.98f)
                horizontalLineToRelative(-7.98f)
                curveToRelative(0.1f, -2.99f, 0.59f, -5.9f, 0.83f, -7.15f)
                curveToRelative(1.25f, -0.24f, 4.16f, -0.73f, 7.15f, -0.83f)
                close()
                moveTo(3.02f, 13f)
                horizontalLineToRelative(7.98f)
                verticalLineToRelative(7.98f)
                curveToRelative(-2.99f, -0.1f, -5.9f, -0.59f, -7.15f, -0.83f)
                curveToRelative(-0.24f, -1.25f, -0.73f, -4.16f, -0.83f, -7.15f)
                close()
                moveTo(13f, 20.98f)
                verticalLineToRelative(-7.98f)
                horizontalLineToRelative(7.98f)
                curveToRelative(-0.1f, 2.99f, -0.59f, 5.9f, -0.83f, 7.15f)
                curveToRelative(-1.25f, 0.24f, -4.16f, 0.73f, -7.15f, 0.83f)
                close()
            }
        }.also { _BorderAll = it}
