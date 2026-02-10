package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenNail: ImageVector? = null

val Icons.Rs.BrokenNail: ImageVector
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
                moveTo(11f, 18f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-4.6f)
                curveToRelative(-1.27f, 1.37f, -2f, 3.17f, -2f, 5.1f)
                verticalLineToRelative(10.5f)
                lineTo(0f, 24f)
                lineTo(0f, 13.5f)
                curveToRelative(0f, -3.1f, 1.49f, -5.94f, 4f, -7.72f)
                verticalLineToRelative(-1.78f)
                curveTo(4f, 1.79f, 5.79f, 0f, 8f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1.78f)
                curveToRelative(1.52f, 1.08f, 2.65f, 2.55f, 3.31f, 4.22f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-0.3f, -0.58f, -0.67f, -1.12f, -1.12f, -1.6f)
                verticalLineToRelative(1.34f)
                lineToRelative(-2f, 3.43f)
                lineTo(14f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                lineTo(6f, 13f)
                curveToRelative(0f, 0.89f, 0.4f, 1.68f, 1.02f, 2.23f)
                curveToRelative(0.79f, -0.71f, 1.83f, -1.15f, 2.98f, -1.15f)
                curveToRelative(1.09f, 0f, 2.08f, 0.4f, 2.85f, 1.05f)
                lineToRelative(-1.66f, 2.84f)
                curveToRelative(-0.07f, 0.0f, -0.13f, 0.02f, -0.2f, 0.02f)
                close()
            }
        }.also { _BrokenNail = it}
