package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SwipeRight: ImageVector? = null

val Icons.Bs.SwipeRight: ImageVector
    get() = _SwipeRight ?: UXIcon(name = "SwipeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.74f, 5.13f)
                lineToRelative(-3.74f, 3.37f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                lineTo(20f, 0.5f)
                lineToRelative(3.74f, 3.37f)
                curveToRelative(0.35f, 0.35f, 0.35f, 0.91f, 0f, 1.26f)
                close()
                moveTo(9.12f, 9.71f)
                lineToRelative(12f, 3.13f)
                verticalLineToRelative(11.15f)
                lineToRelative(-15f, 0.01f)
                lineTo(0.86f, 19.61f)
                curveToRelative(-0.87f, -0.72f, -0.98f, -2.01f, -0.26f, -2.87f)
                curveToRelative(0.72f, -0.87f, 2.01f, -0.98f, 2.87f, -0.26f)
                lineToRelative(2.64f, 2.22f)
                lineTo(6.11f, 3.5f)
                curveToRelative(0f, -0.91f, 0.8f, -1.63f, 1.74f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.27f, 0.81f, 1.27f, 1.56f)
                verticalLineToRelative(6.13f)
                close()
                moveTo(9.12f, 12.81f)
                verticalLineToRelative(8.2f)
                lineToRelative(9f, -0.01f)
                verticalLineToRelative(-5.84f)
                lineToRelative(-9f, -2.35f)
                close()
            }
        }.also { _SwipeRight = it}
