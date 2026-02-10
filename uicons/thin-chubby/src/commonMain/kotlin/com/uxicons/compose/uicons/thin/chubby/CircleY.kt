package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Tc.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 6.54f)
                curveToRelative(-0.37f, 4.08f, -3.27f, 7.16f, -4.0f, 7.87f)
                verticalLineToRelative(3.09f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.09f)
                curveToRelative(-0.72f, -0.71f, -3.63f, -3.78f, -4.0f, -7.87f)
                curveToRelative(-0.02f, -0.28f, 0.18f, -0.52f, 0.45f, -0.54f)
                curveToRelative(0.27f, -0.01f, 0.52f, 0.18f, 0.54f, 0.45f)
                curveToRelative(0.31f, 3.39f, 2.62f, 6.12f, 3.5f, 7.04f)
                curveToRelative(0.88f, -0.92f, 3.19f, -3.65f, 3.5f, -7.04f)
                curveToRelative(0.02f, -0.28f, 0.27f, -0.47f, 0.54f, -0.45f)
                curveToRelative(0.28f, 0.03f, 0.48f, 0.27f, 0.45f, 0.54f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.81f, -3.19f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.19f, -11f, -11f)
                reflectiveCurveToRelative(3.19f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.19f, 11f, 11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -7.2f, -2.8f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.8f, -10f, 10f)
                reflectiveCurveToRelative(2.8f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -2.8f, 10f, -10f)
                close()
            }
        }.also { _CircleY = it}
