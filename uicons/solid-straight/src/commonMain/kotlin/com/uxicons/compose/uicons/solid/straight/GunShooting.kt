package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunShooting: ImageVector? = null

val Icons.Ss.GunShooting: ImageVector
    get() = _GunShooting ?: UXIcon(name = "GunShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.5f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, -0.5f)
                lineToRelative(1f, 4f)
                lineToRelative(-4f, -4f)
                verticalLineTo(5.5f)
                lineTo(22f, 1.5f)
                lineToRelative(-1f, 4f)
                lineToRelative(3f, -0.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 1.5f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                curveTo(2f, 7.11f, 1.1f, 8f, 0f, 8f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(4f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(1.65f, 14f)
                lineTo(0.04f, 19.21f)
                lineToRelative(-0.04f, 1.79f)
                horizontalLineTo(5f)
                lineToRelative(1.52f, -5f)
                horizontalLineToRelative(1.91f)
                curveToRelative(0.88f, 0f, 1.66f, -0.58f, 1.92f, -1.43f)
                lineToRelative(0.17f, -0.57f)
                horizontalLineTo(1.65f)
                close()
            }
        }.also { _GunShooting = it}
