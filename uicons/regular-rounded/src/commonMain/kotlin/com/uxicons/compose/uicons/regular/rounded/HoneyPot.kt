package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Rr.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.62f, 2f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(2f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.38f)
                curveTo(0.91f, 4.28f, 0f, 7.18f, 0f, 9.9f)
                curveToRelative(0f, 4.21f, 2.64f, 9.21f, 3.77f, 11.16f)
                curveToRelative(1.05f, 1.81f, 3.03f, 2.94f, 5.16f, 2.94f)
                horizontalLineToRelative(6.13f)
                curveToRelative(2.13f, 0f, 4.11f, -1.13f, 5.16f, -2.94f)
                curveToRelative(1.13f, -1.95f, 3.77f, -6.94f, 3.77f, -11.16f)
                curveToRelative(0f, -2.72f, -0.91f, -5.63f, -2.38f, -7.91f)
                close()
                moveTo(18.5f, 20.06f)
                curveToRelative(-0.7f, 1.2f, -2.01f, 1.94f, -3.43f, 1.94f)
                horizontalLineToRelative(-6.13f)
                curveToRelative(-1.42f, 0f, -2.74f, -0.74f, -3.43f, -1.94f)
                curveToRelative(-2.19f, -3.77f, -3.5f, -7.57f, -3.5f, -10.15f)
                curveToRelative(0f, -2.77f, 1.13f, -5.89f, 2.85f, -7.91f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(9f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.65f)
                curveToRelative(1.72f, 2.02f, 2.85f, 5.13f, 2.85f, 7.91f)
                curveToRelative(0f, 2.58f, -1.31f, 6.38f, -3.5f, 10.15f)
                close()
            }
        }.also { _HoneyPot = it}
