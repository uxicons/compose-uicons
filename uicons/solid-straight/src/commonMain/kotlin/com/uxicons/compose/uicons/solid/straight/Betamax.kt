package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Betamax: ImageVector? = null

val Icons.Ss.Betamax: ImageVector
    get() = _Betamax ?: UXIcon(name = "Betamax") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(12f)
                lineTo(0f, 21f)
                lineTo(0f, 9f)
                lineTo(24f, 9f)
                close()
                moveTo(11f, 15f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(21f, 11f)
                lineTo(13f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                lineTo(21f, 11f)
                close()
                moveTo(7f, 13f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Betamax = it}
