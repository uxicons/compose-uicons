package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Rc.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 7.09f)
                curveToRelative(-0.32f, 3.62f, -2.64f, 6.41f, -3.5f, 7.32f)
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
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                close()
            }
        }.also { _CircleY = it}
