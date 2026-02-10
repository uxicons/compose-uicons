package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunShooting: ImageVector? = null

val Icons.Rs.GunShooting: ImageVector
    get() = _GunShooting ?: UXIcon(name = "GunShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.5f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, -0.5f)
                lineToRelative(1f, 4f)
                lineToRelative(-4f, -4f)
                verticalLineToRelative(-3.24f)
                lineToRelative(1.53f, -0.76f)
                lineToRelative(-1.53f, -0.76f)
                verticalLineToRelative(-3.24f)
                lineTo(22f, 1.5f)
                lineToRelative(-1f, 4f)
                lineToRelative(3f, -0.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 1.5f)
                close()
                moveTo(14f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4.19f)
                lineToRelative(-0.47f, 1.57f)
                curveToRelative(-0.25f, 0.85f, -1.03f, 1.43f, -1.92f, 1.43f)
                horizontalLineToRelative(-1.21f)
                lineToRelative(-1.52f, 5f)
                lineTo(0f, 21f)
                lineToRelative(0.04f, -1.79f)
                lineToRelative(1.63f, -5.29f)
                curveToRelative(0.15f, -0.44f, -0.21f, -0.93f, -0.67f, -0.91f)
                lineTo(0f, 13f)
                verticalLineToRelative(-5f)
                lineTo(1f, 8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                lineTo(12f, 6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                close()
                moveTo(7.03f, 13f)
                lineTo(3.61f, 13f)
                curveToRelative(0.13f, 0.48f, 0.12f, 1f, -0.03f, 1.5f)
                lineToRelative(-1.38f, 4.5f)
                horizontalLineToRelative(3.01f)
                lineToRelative(1.82f, -6f)
                close()
                moveTo(14f, 8f)
                lineTo(3.83f, 8f)
                curveToRelative(-0.3f, 0.85f, -0.98f, 1.53f, -1.83f, 1.83f)
                verticalLineToRelative(1.17f)
                lineTo(14f, 11f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _GunShooting = it}
