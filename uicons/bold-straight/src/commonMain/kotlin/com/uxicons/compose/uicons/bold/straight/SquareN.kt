package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareN: ImageVector? = null

val Icons.Bs.SquareN: ImageVector
    get() = _SquareN ?: UXIcon(name = "SquareN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(11.88f)
                curveToRelative(0f, 0.95f, -0.61f, 1.77f, -1.52f, 2.04f)
                curveToRelative(-0.2f, 0.06f, -0.41f, 0.09f, -0.61f, 0.09f)
                curveToRelative(-0.71f, 0f, -1.38f, -0.35f, -1.78f, -0.98f)
                lineToRelative(-5.09f, -7.92f)
                verticalLineToRelative(8.89f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 7.12f)
                curveToRelative(0f, -0.95f, 0.61f, -1.77f, 1.52f, -2.04f)
                curveToRelative(0.91f, -0.27f, 1.87f, 0.09f, 2.38f, 0.89f)
                lineToRelative(5.09f, 7.92f)
                lineTo(15f, 5f)
                close()
            }
        }.also { _SquareN = it}
