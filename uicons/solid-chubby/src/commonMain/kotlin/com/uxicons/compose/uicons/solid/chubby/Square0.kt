package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square0: ImageVector? = null

val Icons.Sc.Square0: ImageVector
    get() = _Square0 ?: UXIcon(name = "Square0") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 3.38f, -1.01f, 4f, -3f, 4f)
                reflectiveCurveToRelative(-3f, -0.62f, -3f, -4f)
                reflectiveCurveToRelative(1.01f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 0.62f, 3f, 4f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                reflectiveCurveToRelative(-9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, -2.58f, -0.52f, -6f, -5f, -6f)
                reflectiveCurveToRelative(-5f, 3.42f, -5f, 6f)
                reflectiveCurveToRelative(0.52f, 6f, 5f, 6f)
                reflectiveCurveToRelative(5f, -3.42f, 5f, -6f)
                close()
            }
        }.also { _Square0 = it}
