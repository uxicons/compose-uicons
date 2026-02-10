package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareA: ImageVector? = null

val Icons.Bs.SquareA: ImageVector
    get() = _SquareA ?: UXIcon(name = "SquareA") {
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
                moveTo(12f, 5f)
                curveToRelative(-1.36f, 0f, -2.33f, 0.47f, -3f, 2f)
                lineToRelative(-4f, 12f)
                horizontalLineToRelative(3.24f)
                lineToRelative(0.93f, -3f)
                horizontalLineToRelative(5.66f)
                lineToRelative(0.93f, 3f)
                horizontalLineToRelative(3.24f)
                lineToRelative(-4f, -12f)
                curveToRelative(-0.67f, -1.53f, -1.64f, -2f, -3f, -2f)
                close()
                moveTo(10.1f, 13f)
                lineToRelative(1.46f, -4.72f)
                curveToRelative(0.09f, -0.17f, 0.27f, -0.28f, 0.45f, -0.28f)
                curveToRelative(0.17f, 0.0f, 0.36f, 0.1f, 0.45f, 0.28f)
                lineToRelative(1.46f, 4.72f)
                horizontalLineToRelative(-3.81f)
                close()
            }
        }.also { _SquareA = it}
