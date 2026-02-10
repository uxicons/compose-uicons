package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreasureChest: ImageVector? = null

val Icons.Br.TreasureChest: ImageVector
    get() = _TreasureChest ?: UXIcon(name = "TreasureChest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 0f)
            lineTo(7.5f, 0f)
            curveTo(3.36f, 0f, 0f, 3.36f, 0f, 7.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -4.14f, -3.36f, -7.5f, -7.5f, -7.5f)
            close()
            moveTo(21f, 7.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            lineTo(19f, 3.76f)
            curveToRelative(1.21f, 0.81f, 2f, 2.18f, 2f, 3.74f)
            close()
            moveTo(12f, 6f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-2f)
            lineTo(8f, 3f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(5f, 3.76f)
            verticalLineToRelative(5.24f)
            lineTo(3f, 9f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.56f, 0.8f, -2.93f, 2f, -3.74f)
            close()
            moveTo(19f, 20.95f)
            verticalLineToRelative(-5.45f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            lineTo(8f, 21f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.45f)
            curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.21f, -0.86f, 2.22f, -2f, 2.45f)
            close()
        }
    }.also { _TreasureChest = it }
