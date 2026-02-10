package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerBrush: ImageVector? = null

val Icons.Ss.HammerBrush: ImageVector
    get() = _HammerBrush ?: UXIcon(name = "HammerBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.05f, 16f)
                curveToRelative(0.16f, -0.92f, 0.74f, -1.72f, 1.59f, -2.15f)
                lineToRelative(2.83f, -1.44f)
                curveToRelative(-0.4f, -2.29f, -0.97f, -5.82f, -0.97f, -6.41f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.58f, -0.58f, 4.12f, -0.97f, 6.41f)
                lineToRelative(2.83f, 1.44f)
                curveToRelative(0.85f, 0.43f, 1.43f, 1.23f, 1.59f, 2.15f)
                horizontalLineToRelative(-12.9f)
                close()
                moveTo(11f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineToRelative(1.19f, -4f)
                lineToRelative(1.32f, 4f)
                horizontalLineToRelative(7.49f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-13f)
                close()
                moveTo(11f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-6f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.98f)
                lineToRelative(-0.48f, 14f)
                horizontalLineToRelative(4f)
                lineToRelative(-0.48f, -14f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _HammerBrush = it}
