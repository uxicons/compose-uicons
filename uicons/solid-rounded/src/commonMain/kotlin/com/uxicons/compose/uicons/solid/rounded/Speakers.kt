package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speakers: ImageVector? = null

val Icons.Sr.Speakers: ImageVector
    get() = _Speakers ?: UXIcon(name = "Speakers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17f, 5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(8f, 14.28f)
                verticalLineToRelative(3.44f)
                curveToRelative(-0.29f, 0.17f, -0.63f, 0.28f, -1f, 0.28f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.37f, 0f, 0.7f, 0.11f, 1f, 0.28f)
                close()
                moveTo(10.01f, 23.9f)
                curveToRelative(-0.33f, 0.07f, -0.66f, 0.1f, -1.01f, 0.1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(-0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1.01f, 0.1f)
                curveToRelative(-1.24f, 1.26f, -2.01f, 2.99f, -2.01f, 4.9f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.28f, -1f, -0.28f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.37f, 0f, 0.7f, -0.11f, 1f, -0.28f)
                verticalLineToRelative(3.42f)
                curveToRelative(-0.32f, -0.08f, -0.65f, -0.14f, -1f, -0.14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.37f, 0f, 0.72f, -0.07f, 1.05f, -0.16f)
                curveToRelative(0.19f, 1.57f, 0.9f, 2.98f, 1.95f, 4.06f)
                close()
                moveTo(15f, 16.0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _Speakers = it}
