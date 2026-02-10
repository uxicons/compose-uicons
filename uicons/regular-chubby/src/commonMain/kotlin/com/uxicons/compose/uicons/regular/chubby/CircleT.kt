package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleT: ImageVector? = null

val Icons.Rc.CircleT: ImageVector
    get() = _CircleT ?: UXIcon(name = "CircleT") {
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
                moveTo(16.95f, 7.76f)
                curveToRelative(-0.14f, 0.42f, -0.53f, 0.68f, -0.95f, 0.68f)
                curveToRelative(-0.61f, -0.06f, -0.8f, -0.3f, -3f, -0.42f)
                verticalLineToRelative(8.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.98f)
                curveToRelative(-1.77f, 0.08f, -2.68f, 0.37f, -2.69f, 0.37f)
                curveToRelative(-0.53f, 0.17f, -1.09f, -0.12f, -1.26f, -0.64f)
                curveToRelative(-0.17f, -0.52f, 0.11f, -1.08f, 0.63f, -1.26f)
                curveToRelative(0.06f, -0.02f, 1.52f, -0.5f, 4.32f, -0.5f)
                reflectiveCurveToRelative(4.26f, 0.48f, 4.32f, 0.5f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                close()
            }
        }.also { _CircleT = it}
