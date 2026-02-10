package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Ss.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 7.56f)
                lineToRelative(-5f, 8.03f)
                lineTo(7f, 7.56f)
                verticalLineToRelative(11.44f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 6.81f)
                curveToRelative(0f, -0.82f, 0.48f, -1.5f, 1.22f, -1.73f)
                curveToRelative(0.75f, -0.24f, 1.57f, 0.05f, 2.03f, 0.71f)
                lineToRelative(3.75f, 6.01f)
                lineToRelative(3.72f, -5.97f)
                curveToRelative(0.49f, -0.71f, 1.31f, -0.99f, 2.06f, -0.75f)
                curveToRelative(0.74f, 0.23f, 1.22f, 0.91f, 1.22f, 1.73f)
                verticalLineToRelative(12.19f)
                close()
            }
        }.also { _SquareM = it}
