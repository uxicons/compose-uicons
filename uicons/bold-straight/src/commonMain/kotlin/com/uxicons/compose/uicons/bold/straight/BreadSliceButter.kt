package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSliceButter: ImageVector? = null

val Icons.Bs.BreadSliceButter: ImageVector
    get() = _BreadSliceButter ?: UXIcon(name = "BreadSliceButter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.68f, 1f)
                lineTo(5.32f, 1f)
                curveTo(2.39f, 1f, 0f, 3.39f, 0f, 6.32f)
                curveToRelative(0f, 1.56f, 0.73f, 3.01f, 2f, 4.03f)
                verticalLineToRelative(12.65f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-12.65f)
                curveToRelative(1.27f, -1.02f, 2f, -2.47f, 2f, -4.03f)
                curveToRelative(0f, -2.93f, -2.39f, -5.32f, -5.32f, -5.32f)
                close()
                moveTo(19.75f, 8.27f)
                lineToRelative(-0.74f, 0.43f)
                verticalLineToRelative(11.3f)
                lineTo(5f, 20.0f)
                verticalLineToRelative(-11.3f)
                lineToRelative(-0.74f, -0.43f)
                curveToRelative(-0.79f, -0.46f, -1.25f, -1.19f, -1.25f, -1.95f)
                curveToRelative(0f, -1.28f, 1.04f, -2.32f, 2.32f, -2.32f)
                horizontalLineToRelative(13.36f)
                curveToRelative(1.28f, 0f, 2.32f, 1.04f, 2.32f, 2.32f)
                curveToRelative(0f, 0.76f, -0.47f, 1.49f, -1.25f, 1.95f)
                close()
                moveTo(12.91f, 9.38f)
                lineToRelative(2.71f, 2.71f)
                curveToRelative(0.5f, 0.5f, 0.5f, 1.32f, 0f, 1.82f)
                lineToRelative(-2.71f, 2.71f)
                curveToRelative(-0.5f, 0.5f, -1.32f, 0.5f, -1.82f, 0f)
                lineToRelative(-2.71f, -2.71f)
                curveToRelative(-0.5f, -0.5f, -0.5f, -1.32f, 0f, -1.82f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(0.5f, -0.5f, 1.32f, -0.5f, 1.82f, 0f)
                close()
            }
        }.also { _BreadSliceButter = it}
