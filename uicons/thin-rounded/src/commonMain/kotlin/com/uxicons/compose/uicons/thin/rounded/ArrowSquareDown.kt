package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareDown: ImageVector? = null

val Icons.Tr.ArrowSquareDown: ImageVector
    get() = _ArrowSquareDown ?: UXIcon(name = "ArrowSquareDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
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
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.65f, 13.07f)
                lineToRelative(-2.88f, 2.83f)
                curveToRelative(-0.19f, 0.19f, -0.47f, 0.45f, -0.77f, 0.71f)
                curveToRelative(-0.15f, 0.13f, -0.32f, 0.22f, -0.49f, 0.29f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.4f)
                curveToRelative(-0.18f, -0.06f, -0.34f, -0.15f, -0.49f, -0.29f)
                curveToRelative(-0.3f, -0.27f, -0.59f, -0.53f, -0.78f, -0.72f)
                lineToRelative(-2.88f, -2.83f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(2.88f, 2.83f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.47f, 0.82f, 0.76f)
                curveToRelative(0.47f, 0.42f, 1.06f, 0.63f, 1.66f, 0.63f)
                reflectiveCurveToRelative(1.18f, -0.21f, 1.66f, -0.63f)
                curveToRelative(0.32f, -0.28f, 0.62f, -0.56f, 0.81f, -0.75f)
                lineToRelative(2.88f, -2.83f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
        }.also { _ArrowSquareDown = it}
