package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Tc.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(6.25f, 21.01f)
                curveToRelative(0.46f, -2.84f, 2.14f, -4.01f, 5.75f, -4.01f)
                reflectiveCurveToRelative(5.29f, 1.18f, 5.75f, 4.01f)
                curveToRelative(-1.48f, 0.67f, -3.37f, 0.99f, -5.75f, 0.99f)
                reflectiveCurveToRelative(-4.28f, -0.32f, -5.75f, -0.99f)
                close()
                moveTo(18.67f, 20.51f)
                curveToRelative(-0.63f, -3.1f, -2.7f, -4.51f, -6.67f, -4.51f)
                reflectiveCurveToRelative(-6.03f, 1.41f, -6.67f, 4.51f)
                curveToRelative(-2.33f, -1.5f, -3.33f, -4.22f, -3.33f, -8.51f)
                curveToRelative(0f, -7.2f, 2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                curveToRelative(0f, 4.29f, -1.01f, 7.01f, -3.33f, 8.51f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-2.77f, 0f, -4f, 1.23f, -4f, 4f)
                reflectiveCurveToRelative(1.23f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.23f, 4f, -4f)
                reflectiveCurveToRelative(-1.23f, -4f, -4f, -4f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-2.21f, 0f, -3f, -0.79f, -3f, -3f)
                reflectiveCurveToRelative(0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                close()
            }
        }.also { _CircleUser = it}
