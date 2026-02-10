package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateSquare: ImageVector? = null

val Icons.Bs.RotateSquare: ImageVector
    get() = _RotateSquare ?: UXIcon(name = "RotateSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.94f, 7.06f)
                lineToRelative(2.06f, -2.06f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.66f, -0.54f, 1.2f, -1.2f, 1.2f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(1.82f, -1.82f)
                curveToRelative(-0.74f, -0.74f, -1.76f, -1.18f, -2.82f, -1.18f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                curveToRelative(1.87f, 0f, 3.64f, 0.76f, 4.94f, 2.06f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.07f, 0f, -2.08f, -0.43f, -2.82f, -1.18f)
                lineToRelative(1.82f, -1.82f)
                horizontalLineToRelative(-4.8f)
                curveToRelative(-0.66f, 0f, -1.2f, 0.54f, -1.2f, 1.2f)
                verticalLineToRelative(4.8f)
                lineToRelative(2.06f, -2.06f)
                curveToRelative(1.3f, 1.3f, 3.07f, 2.06f, 4.94f, 2.06f)
                curveToRelative(3.52f, 0f, 6.43f, -2.61f, 6.92f, -6f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                close()
            }
        }.also { _RotateSquare = it}
