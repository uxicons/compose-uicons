package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Tc.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.0f, 8.54f)
                curveToRelative(-0.04f, -4.6f, -3.45f, -6.66f, -11.04f, -6.68f)
                curveToRelative(-4.81f, -0.02f, -7.8f, 0.76f, -9.45f, 2.42f)
                curveToRelative(-1.03f, 1.03f, -1.52f, 2.42f, -1.51f, 4.25f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, 0.02f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(6.89f)
                curveToRelative(0.04f, 4.61f, 3.44f, 6.67f, 11.04f, 6.69f)
                horizontalLineToRelative(0.1f)
                curveToRelative(4.74f, 0f, 7.71f, -0.77f, 9.35f, -2.42f)
                curveToRelative(1.03f, -1.03f, 1.52f, -2.42f, 1.51f, -4.28f)
                verticalLineToRelative(-6.89f)
                reflectiveCurveToRelative(0f, -0.01f, 0f, -0.01f)
                close()
                moveTo(3.22f, 4.99f)
                curveToRelative(1.42f, -1.43f, 4.25f, -2.12f, 8.65f, -2.12f)
                horizontalLineToRelative(0.09f)
                curveToRelative(8.79f, 0.02f, 10.02f, 2.76f, 10.04f, 5.72f)
                curveToRelative(0.01f, 1.57f, -0.38f, 2.7f, -1.22f, 3.54f)
                curveToRelative(-1.43f, 1.44f, -4.33f, 2.1f, -8.74f, 2.12f)
                curveToRelative(-8.79f, -0.02f, -10.02f, -2.76f, -10.04f, -5.72f)
                curveToRelative(-0.01f, -1.57f, 0.38f, -2.7f, 1.22f, -3.54f)
                close()
                moveTo(22f, 15.47f)
                curveToRelative(0.01f, 1.57f, -0.38f, 2.7f, -1.22f, 3.54f)
                curveToRelative(-1.42f, 1.43f, -4.25f, 2.12f, -8.65f, 2.12f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-8.78f, -0.02f, -10.01f, -2.75f, -10.04f, -5.69f)
                verticalLineToRelative(-3.36f)
                curveToRelative(1.51f, 2.16f, 4.76f, 3.16f, 10.04f, 3.17f)
                horizontalLineToRelative(0.1f)
                curveToRelative(4.74f, 0f, 7.71f, -0.77f, 9.35f, -2.42f)
                curveToRelative(0.19f, -0.19f, 0.36f, -0.39f, 0.51f, -0.6f)
                verticalLineToRelative(3.24f)
                close()
            }
        }.also { _HockeyPuck = it}
