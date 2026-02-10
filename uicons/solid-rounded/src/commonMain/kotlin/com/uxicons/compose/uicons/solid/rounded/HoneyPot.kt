package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Sr.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 2f)
                lineTo(2f, 2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(1.96f, 4f)
                curveToRelative(-1.05f, 1.72f, -1.96f, 3.82f, -1.96f, 5.91f)
                curveToRelative(0f, 4.21f, 2.64f, 9.21f, 3.77f, 11.16f)
                curveToRelative(1.05f, 1.81f, 3.03f, 2.94f, 5.16f, 2.94f)
                horizontalLineToRelative(6.13f)
                curveToRelative(2.13f, 0f, 4.11f, -1.13f, 5.16f, -2.94f)
                curveToRelative(1.13f, -1.95f, 3.77f, -6.94f, 3.77f, -11.16f)
                curveToRelative(0f, -2.09f, -0.91f, -4.18f, -1.96f, -5.91f)
                horizontalLineToRelative(-6.54f)
                close()
            }
        }.also { _HoneyPot = it}
