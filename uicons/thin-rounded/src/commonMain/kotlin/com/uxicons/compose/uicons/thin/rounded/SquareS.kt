package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Tr.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(6f, 7.78f)
                curveToRelative(0f, 1.24f, 0.83f, 2.33f, 2.02f, 2.67f)
                lineToRelative(8.23f, 2.13f)
                curveToRelative(1.62f, 0.47f, 2.75f, 1.96f, 2.75f, 3.64f)
                curveToRelative(0f, 2.09f, -1.7f, 3.78f, -3.78f, 3.78f)
                horizontalLineToRelative(-6.48f)
                curveToRelative(-1.86f, 0f, -3.74f, -1.2f, -3.74f, -3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                curveToRelative(0f, 1.72f, 1.42f, 2.5f, 2.74f, 2.5f)
                horizontalLineToRelative(6.48f)
                curveToRelative(1.53f, 0f, 2.78f, -1.25f, 2.78f, -2.78f)
                curveToRelative(0f, -1.23f, -0.83f, -2.33f, -2.01f, -2.67f)
                lineToRelative(-8.23f, -2.13f)
                curveToRelative(-1.63f, -0.46f, -2.76f, -1.96f, -2.76f, -3.64f)
                curveToRelative(0f, -2.08f, 1.69f, -3.78f, 3.78f, -3.78f)
                horizontalLineToRelative(6.49f)
                curveToRelative(1.77f, 0f, 3.72f, 1.1f, 3.81f, 3.52f)
                curveToRelative(0.01f, 0.28f, -0.2f, 0.51f, -0.48f, 0.52f)
                curveToRelative(-0.27f, 0.01f, -0.51f, -0.21f, -0.52f, -0.48f)
                curveToRelative(-0.07f, -1.77f, -1.46f, -2.56f, -2.81f, -2.56f)
                horizontalLineToRelative(-6.49f)
                curveToRelative(-1.53f, 0f, -2.78f, 1.25f, -2.78f, 2.78f)
                close()
            }
        }.also { _SquareS = it}
