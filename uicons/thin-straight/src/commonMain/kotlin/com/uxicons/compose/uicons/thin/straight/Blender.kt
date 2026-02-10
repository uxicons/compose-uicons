package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blender: ImageVector? = null

val Icons.Ts.Blender: ImageVector
    get() = _Blender ?: UXIcon(name = "Blender") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.08f, 18.05f)
                lineTo(20.91f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.57f, 0f, 1f, 1.57f, 1f, 3.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.73f, -1.27f, -3.18f, -2.92f, -3.45f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 1f)
                horizontalLineToRelative(12.74f)
                lineToRelative(-2.67f, 17f)
                lineTo(7f, 18f)
                verticalLineToRelative(-4f)
                close()
                moveTo(4.5f, 13f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _Blender = it}
