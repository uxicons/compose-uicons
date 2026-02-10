package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Rc.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-7.71f, 0f, -11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                close()
                moveTo(11f, 3.02f)
                curveToRelative(-5.81f, 0.25f, -8f, 2.76f, -8f, 8.98f)
                curveToRelative(0f, 6.56f, 2.44f, 9f, 9f, 9f)
                curveToRelative(6.22f, 0f, 8.73f, -2.19f, 8.98f, -8f)
                horizontalLineToRelative(-8.98f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
