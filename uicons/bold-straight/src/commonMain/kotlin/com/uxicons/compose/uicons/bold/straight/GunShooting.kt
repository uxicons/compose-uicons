package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunShooting: ImageVector? = null

val Icons.Bs.GunShooting: ImageVector
    get() = _GunShooting ?: UXIcon(name = "GunShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, -0.5f)
                lineToRelative(1f, 4f)
                lineToRelative(-4f, -4f)
                lineTo(18f, 6f)
                lineToRelative(4f, -4f)
                lineToRelative(-1f, 4f)
                lineToRelative(3f, -0.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 1.5f)
                close()
                moveTo(2f, 6f)
                horizontalLineToRelative(14f)
                lineTo(16f, 14f)
                horizontalLineToRelative(-3.95f)
                lineToRelative(-0.07f, 0.22f)
                curveToRelative(-0.32f, 1.06f, -1.29f, 1.78f, -2.4f, 1.78f)
                horizontalLineToRelative(-0.21f)
                lineToRelative(-1.82f, 6f)
                lineTo(0f, 22f)
                verticalLineToRelative(-2.23f)
                lineToRelative(1.7f, -5.51f)
                curveToRelative(0.02f, -0.07f, 0.01f, -0.13f, -0.03f, -0.18f)
                curveToRelative(-0.04f, -0.06f, -0.1f, -0.08f, -0.17f, -0.08f)
                lineTo(0f, 14.0f)
                verticalLineToRelative(-6f)
                lineTo(1.5f, 8.0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(6.86f, 14f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.02f, 0.38f, -0.02f, 0.77f, -0.14f, 1.15f)
                lineToRelative(-1.19f, 3.85f)
                horizontalLineToRelative(1.96f)
                lineToRelative(1.52f, -5f)
                close()
                moveTo(3f, 11f)
                lineTo(13f, 11f)
                verticalLineToRelative(-2f)
                lineTo(4.66f, 9f)
                curveToRelative(-0.35f, 0.73f, -0.94f, 1.32f, -1.66f, 1.66f)
                verticalLineToRelative(0.34f)
                close()
            }
        }.also { _GunShooting = it}
