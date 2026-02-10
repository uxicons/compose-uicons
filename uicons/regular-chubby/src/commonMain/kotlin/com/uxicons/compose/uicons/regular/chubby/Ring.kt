package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Rc.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 3f)
                curveToRelative(-5.44f, 0f, -11f, 0.77f, -11f, 6.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 5.73f, 5.56f, 6.5f, 11f, 6.5f)
                reflectiveCurveToRelative(11f, -0.77f, 11f, -6.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -5.73f, -5.56f, -6.5f, -11f, -6.5f)
                close()
                moveTo(21f, 14.5f)
                curveToRelative(0f, 2.78f, -1.5f, 4.5f, -9f, 4.5f)
                reflectiveCurveToRelative(-9f, -1.72f, -9f, -4.5f)
                verticalLineToRelative(-0.47f)
                curveToRelative(2.1f, 1.66f, 5.57f, 1.97f, 9f, 1.97f)
                reflectiveCurveToRelative(6.9f, -0.31f, 9f, -1.97f)
                close()
                moveTo(3.76f, 12.0f)
                curveToRelative(1.14f, -1.38f, 3.73f, -2.0f, 8.24f, -2.0f)
                reflectiveCurveToRelative(7.1f, 0.63f, 8.24f, 2.0f)
                curveToRelative(-1.04f, 1.27f, -3.38f, 2.0f, -8.24f, 2.0f)
                reflectiveCurveToRelative(-7.2f, -0.73f, -8.24f, -2.0f)
                close()
                moveTo(20.98f, 9.93f)
                curveToRelative(-1.71f, -1.34f, -4.56f, -1.93f, -8.98f, -1.93f)
                reflectiveCurveToRelative(-7.28f, 0.6f, -8.98f, 1.93f)
                curveToRelative(-0.01f, -0.14f, -0.02f, -0.28f, -0.02f, -0.43f)
                curveToRelative(0f, -2.78f, 1.5f, -4.5f, 9f, -4.5f)
                reflectiveCurveToRelative(9f, 1.72f, 9f, 4.5f)
                curveToRelative(0f, 0.15f, -0.01f, 0.29f, -0.02f, 0.43f)
                close()
            }
        }.also { _Ring = it}
