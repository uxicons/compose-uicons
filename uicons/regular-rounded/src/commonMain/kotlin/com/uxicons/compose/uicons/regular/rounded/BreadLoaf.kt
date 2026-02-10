package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Rr.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 5.89f)
                curveToRelative(-0.29f, -1.67f, -1.78f, -2.89f, -3.55f, -2.89f)
                horizontalLineTo(3.6f)
                curveTo(1.83f, 3f, 0.34f, 4.21f, 0.05f, 5.89f)
                curveToRelative(-0.28f, 1.6f, 0.55f, 3.12f, 1.95f, 3.78f)
                verticalLineToRelative(7.33f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(12f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-7.33f)
                curveToRelative(1.4f, -0.66f, 2.22f, -2.18f, 1.95f, -3.78f)
                close()
                moveTo(4f, 17f)
                verticalLineTo(8.95f)
                curveToRelative(0f, -0.48f, -0.33f, -0.89f, -0.8f, -0.98f)
                curveToRelative(-0.7f, -0.14f, -1.33f, -0.83f, -1.18f, -1.74f)
                curveToRelative(0.12f, -0.7f, 0.8f, -1.23f, 1.58f, -1.23f)
                horizontalLineTo(13.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(20.8f, 7.97f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                verticalLineToRelative(8.05f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(0.34f, -0.59f, 0.54f, -1.27f, 0.54f, -2f)
                verticalLineToRelative(-7.34f)
                curveToRelative(1.2f, -0.57f, 2f, -1.79f, 2f, -3.16f)
                curveToRelative(0f, -0.54f, -0.12f, -1.05f, -0.34f, -1.5f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.78f, 0f, 1.46f, 0.53f, 1.58f, 1.23f)
                curveToRelative(0.16f, 0.91f, -0.48f, 1.6f, -1.18f, 1.74f)
                close()
            }
        }.also { _BreadLoaf = it}
