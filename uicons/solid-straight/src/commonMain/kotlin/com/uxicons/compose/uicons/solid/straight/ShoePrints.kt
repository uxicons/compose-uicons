package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShoePrints: ImageVector? = null

val Icons.Ss.ShoePrints: ImageVector
    get() = _ShoePrints ?: UXIcon(name = "ShoePrints") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.61f, 13.95f)
                curveToRelative(-0.79f, -1.58f, -1.6f, -3.21f, -1.6f, -4.95f)
                curveToRelative(0f, -4.81f, 2.59f, -7f, 5f, -7f)
                curveToRelative(1.67f, 0f, 6f, 1.62f, 6f, 9f)
                curveToRelative(0f, 1.62f, -0.27f, 2.7f, -0.53f, 3.74f)
                curveToRelative(-0.18f, 0.71f, -0.35f, 1.4f, -0.42f, 2.26f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-0.23f, -0.97f, -0.74f, -1.99f, -1.27f, -3.05f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(0.95f, 15f)
                horizontalLineToRelative(7.17f)
                curveToRelative(0.23f, -0.97f, 0.74f, -1.99f, 1.27f, -3.05f)
                curveToRelative(0.79f, -1.58f, 1.6f, -3.21f, 1.6f, -4.95f)
                curveTo(11f, 2.19f, 8.41f, 0f, 6f, 0f)
                curveTo(4.33f, 0f, 0f, 1.62f, 0f, 9f)
                curveToRelative(0f, 1.62f, 0.27f, 2.7f, 0.53f, 3.74f)
                curveToRelative(0.18f, 0.71f, 0.35f, 1.4f, 0.42f, 2.26f)
                close()
                moveTo(1f, 17f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                lineTo(1f, 17f)
                close()
            }
        }.also { _ShoePrints = it}
