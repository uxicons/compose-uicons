package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Ts.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12f, 12f)
                horizontalLineToRelative(5.01f)
                lineToRelative(-0.03f, 1.51f)
                curveToRelative(-0.23f, 2.76f, -2.32f, 4.74f, -4.98f, 4.74f)
                curveToRelative(-2.85f, 0f, -5f, -2.15f, -5f, -5f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -2.94f, 2.2f, -5.25f, 5f, -5.25f)
                curveToRelative(1.89f, 0f, 3.59f, 1.06f, 4.45f, 2.78f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-0.69f, -1.37f, -2.05f, -2.22f, -3.55f, -2.22f)
                curveToRelative(-2.28f, 0f, -4f, 1.83f, -4f, 4.25f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 2.32f, 1.68f, 4f, 4f, 4f)
                curveToRelative(2.12f, 0f, 3.8f, -1.59f, 3.98f, -3.79f)
                lineToRelative(0.01f, -0.46f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _CircleG = it}
