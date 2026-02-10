package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenNail: ImageVector? = null

val Icons.Ss.BrokenNail: ImageVector
    get() = _BrokenNail ?: UXIcon(name = "BrokenNail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 10f)
                verticalLineToRelative(-3.41f)
                curveToRelative(1.81f, 1.7f, 2.89f, 4.02f, 2.98f, 6.55f)
                lineToRelative(-1.83f, -3.14f)
                horizontalLineToRelative(-1.15f)
                close()
                moveTo(7.68f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 13.5f)
                curveToRelative(0f, -2.66f, 1.1f, -5.13f, 3f, -6.91f)
                verticalLineToRelative(5.91f)
                curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.04f, 0f, 0.07f, -0.01f, 0.1f, -0.01f)
                lineToRelative(-2.92f, 5.0f)
                close()
                moveTo(6.44f, 15.78f)
                curveToRelative(-0.88f, -0.82f, -1.44f, -1.98f, -1.44f, -3.28f)
                lineTo(5.0f, 4f)
                curveTo(5f, 1.79f, 6.79f, 0f, 9f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(7.46f)
                lineToRelative(-2.11f, 3.61f)
                curveToRelative(-0.78f, -0.67f, -1.79f, -1.07f, -2.89f, -1.07f)
                curveToRelative(-1.46f, 0f, -2.74f, 0.7f, -3.56f, 1.78f)
                close()
            }
        }.also { _BrokenNail = it}
