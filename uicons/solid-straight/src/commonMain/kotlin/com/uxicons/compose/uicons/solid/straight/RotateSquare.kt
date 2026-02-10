package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Ss.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.02f, 0f, -5.64f, -1.7f, -7f, -4.18f)
                verticalLineToRelative(3.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(1.04f, 1.79f, 2.96f, 3f, 5.17f, 3f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.49f, 3.94f, -3.86f, 7f, -7.93f, 7f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.19f)
                curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.18f, -3f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.49f, -3.94f, 3.86f, -7f, 7.93f, -7f)
                curveToRelative(3.02f, 0f, 5.64f, 1.68f, 7f, 4.15f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _RotateSquare = it}
