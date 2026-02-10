package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Ts.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 14.93f)
                lineToRelative(-8.07f, 8.07f)
                horizontalLineToRelative(-5.9f)
                lineToRelative(13.97f, -13.97f)
                verticalLineToRelative(5.9f)
                close()
                moveTo(22.85f, 1.85f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.42f, 0.15f, 0.65f)
                lineTo(23f, 7.61f)
                lineTo(7.61f, 23f)
                lineTo(1.71f, 23f)
                lineTo(22.85f, 1.85f)
                close()
                moveTo(22.14f, 1.14f)
                lineTo(1f, 22.29f)
                verticalLineToRelative(-5.9f)
                lineTo(16.39f, 1f)
                horizontalLineToRelative(5.11f)
                curveToRelative(0.23f, 0f, 0.45f, 0.05f, 0.65f, 0.15f)
                close()
                moveTo(1f, 9.07f)
                lineTo(9.07f, 1f)
                horizontalLineToRelative(5.9f)
                lineTo(1f, 14.97f)
                verticalLineToRelative(-5.9f)
                close()
                moveTo(2.5f, 1f)
                lineTo(7.66f, 1f)
                lineTo(1f, 7.66f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 22.95f)
                lineToRelative(0.05f, 0.05f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(-0.05f)
                close()
                moveTo(16.34f, 23f)
                lineToRelative(6.66f, -6.66f)
                verticalLineToRelative(6.66f)
                horizontalLineToRelative(-6.66f)
                close()
            }
        }.also { _Background = it}
