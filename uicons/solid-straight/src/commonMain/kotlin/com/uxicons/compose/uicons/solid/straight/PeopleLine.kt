package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeopleLine: ImageVector? = null

val Icons.Ss.PeopleLine: ImageVector
    get() = _PeopleLine ?: UXIcon(name = "PeopleLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(15.79f, 0f, 18f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(6f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(3.79f, 0f, 6f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7.16f, 14.53f)
                curveToRelative(-0.73f, -0.99f, -1.16f, -2.21f, -1.16f, -3.53f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
                lineTo(3.5f, 10f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(5.26f, 16f)
                curveToRelative(0.51f, -0.62f, 1.16f, -1.12f, 1.9f, -1.47f)
                close()
                moveTo(20.5f, 10f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
                curveToRelative(0f, 1.32f, -0.43f, 2.54f, -1.16f, 3.53f)
                curveToRelative(0.73f, 0.35f, 1.38f, 0.85f, 1.9f, 1.47f)
                horizontalLineToRelative(5.26f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _PeopleLine = it}
