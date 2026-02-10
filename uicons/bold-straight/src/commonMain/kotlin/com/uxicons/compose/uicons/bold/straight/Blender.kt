package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blender: ImageVector? = null

val Icons.Bs.Blender: ImageVector
    get() = _Blender ?: UXIcon(name = "Blender") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.21f, 16.34f)
                lineTo(22.94f, 0f)
                lineTo(5.5f, 0f)
                curveTo(3.01f, 0f, 0.99f, 2.02f, 0.99f, 4.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.26f)
                curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.88f, -1.15f, -3.48f, -2.79f, -4.16f)
                close()
                moveTo(5.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(10f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.4f)
                lineToRelative(-2.17f, 13f)
                horizontalLineToRelative(-7.23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20f, 21f)
                lineTo(7f, 21f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.also { _Blender = it}
