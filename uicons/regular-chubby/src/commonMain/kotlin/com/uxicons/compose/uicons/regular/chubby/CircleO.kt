package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleO: ImageVector? = null

val Icons.Rc.CircleO: ImageVector
    get() = _CircleO ?: UXIcon(name = "CircleO") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-4.48f, 0f, -5f, 3.42f, -5f, 6f)
                reflectiveCurveToRelative(0.52f, 6f, 5f, 6f)
                reflectiveCurveToRelative(5f, -3.42f, 5f, -6f)
                reflectiveCurveToRelative(-0.52f, -6f, -5f, -6f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.99f, 0f, -3f, -0.62f, -3f, -4f)
                reflectiveCurveToRelative(1.01f, -4f, 3f, -4f)
                reflectiveCurveToRelative(3f, 0.62f, 3f, 4f)
                reflectiveCurveToRelative(-1.01f, 4f, -3f, 4f)
                close()
            }
        }.also { _CircleO = it}
