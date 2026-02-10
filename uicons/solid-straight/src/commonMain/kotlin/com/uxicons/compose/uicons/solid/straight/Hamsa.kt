package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamsa: ImageVector? = null

val Icons.Ss.Hamsa: ImageVector
    get() = _Hamsa ?: UXIcon(name = "Hamsa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 17f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 13.24f)
                verticalLineToRelative(1.47f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.82f, 0f, -2.99f, 2.29f, -3f, 2.79f)
                curveToRelative(0f, 4.44f, -1.87f, 6.5f, -6f, 6.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-4.13f, 0f, -6f, -2.05f, -6f, -6.5f)
                curveToRelative(-0.01f, -0.5f, -0.18f, -2.79f, -3f, -2.79f)
                lineTo(0f, 14.71f)
                verticalLineToRelative(-1.47f)
                curveToRelative(0.6f, -1.21f, 2.1f, -2.68f, 4f, -3.24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                lineTo(10f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(1.9f, 0.55f, 3.4f, 2.03f, 4f, 3.24f)
                close()
                moveTo(16.33f, 17f)
                curveToRelative(-0.37f, -0.78f, -1.66f, -3f, -4.33f, -3f)
                reflectiveCurveToRelative(-3.96f, 2.22f, -4.33f, 3f)
                curveToRelative(0.37f, 0.78f, 1.66f, 3f, 4.33f, 3f)
                reflectiveCurveToRelative(3.96f, -2.22f, 4.33f, -3f)
                close()
            }
        }.also { _Hamsa = it}
