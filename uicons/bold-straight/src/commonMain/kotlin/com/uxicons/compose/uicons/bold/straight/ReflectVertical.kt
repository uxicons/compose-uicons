package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Bs.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveToRelative(0.74f, 0f, 1.45f, -0.32f, 1.93f, -0.86f)
                lineTo(21.38f, 0f)
                lineTo(2.62f, 0f)
                lineToRelative(7.44f, 8.13f)
                curveToRelative(0.5f, 0.55f, 1.2f, 0.87f, 1.94f, 0.87f)
                close()
                moveTo(14.57f, 3f)
                lineToRelative(-2.57f, 2.81f)
                lineToRelative(-2.57f, -2.81f)
                horizontalLineToRelative(5.15f)
                close()
                moveTo(10.06f, 15.85f)
                lineTo(2.62f, 24f)
                lineTo(21.38f, 24f)
                lineToRelative(-7.44f, -8.13f)
                curveToRelative(-0.99f, -1.1f, -2.91f, -1.09f, -3.88f, -0.01f)
                close()
                moveTo(23.99f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(0f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(24f, 10.5f)
                close()
            }
        }.also { _ReflectVertical = it}
