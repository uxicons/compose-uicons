package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picpeople: ImageVector? = null

val Icons.Sr.Picpeople: ImageVector
    get() = _Picpeople ?: UXIcon(name = "Picpeople") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(16.8f, 18.4f)
                curveToRelative(-1.15f, -1.52f, -2.9f, -2.4f, -4.8f, -2.4f)
                reflectiveCurveToRelative(-3.65f, 0.88f, -4.8f, 2.4f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                curveToRelative(0.76f, -1.02f, 1.93f, -1.6f, 3.2f, -1.6f)
                reflectiveCurveToRelative(2.44f, 0.58f, 3.2f, 1.6f)
                curveToRelative(0.2f, 0.26f, 0.5f, 0.4f, 0.8f, 0.4f)
                curveToRelative(0.21f, 0f, 0.42f, -0.07f, 0.6f, -0.2f)
                curveToRelative(0.44f, -0.33f, 0.53f, -0.96f, 0.2f, -1.4f)
                close()
            }
        }.also { _Picpeople = it}
