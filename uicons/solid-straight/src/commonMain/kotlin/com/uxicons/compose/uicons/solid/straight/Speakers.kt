package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Speakers: ImageVector? = null

val Icons.Ss.Speakers: ImageVector
    get() = _Speakers ?: UXIcon(name = "Speakers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-14f)
                lineTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(15f, 7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(21f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(8f, 19.87f)
                curveToRelative(-0.32f, 0.08f, -0.66f, 0.13f, -1f, 0.13f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.13f)
                verticalLineToRelative(-3.4f)
                curveToRelative(-0.29f, 0.17f, -0.64f, 0.27f, -1f, 0.27f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.36f, 0f, 0.71f, 0.1f, 1f, 0.27f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.92f, 0.28f, -1.78f, 0.76f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.13f)
                close()
                moveTo(8f, 14.27f)
                curveToRelative(-0.29f, -0.17f, -0.64f, -0.27f, -1f, -0.27f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                curveToRelative(0.36f, 0f, 0.71f, -0.1f, 1f, -0.27f)
                verticalLineToRelative(-3.46f)
                close()
            }
        }.also { _Speakers = it}
