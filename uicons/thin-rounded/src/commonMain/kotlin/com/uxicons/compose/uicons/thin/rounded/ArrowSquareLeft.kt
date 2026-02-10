package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSquareLeft: ImageVector? = null

val Icons.Tr.ArrowSquareLeft: ImageVector
    get() = _ArrowSquareLeft ?: UXIcon(name = "ArrowSquareLeft") {
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
                moveTo(17.5f, 11.5f)
                horizontalLineTo(7.1f)
                curveToRelative(0.06f, -0.18f, 0.15f, -0.34f, 0.29f, -0.49f)
                curveToRelative(0.27f, -0.3f, 0.53f, -0.59f, 0.72f, -0.78f)
                lineToRelative(2.83f, -2.88f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-2.83f, 2.88f)
                curveToRelative(-0.2f, 0.2f, -0.47f, 0.5f, -0.76f, 0.82f)
                curveToRelative(-0.84f, 0.94f, -0.84f, 2.37f, 0f, 3.31f)
                curveToRelative(0.28f, 0.32f, 0.56f, 0.62f, 0.75f, 0.81f)
                lineToRelative(2.83f, 2.88f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineToRelative(-2.83f, -2.88f)
                curveToRelative(-0.19f, -0.19f, -0.45f, -0.47f, -0.71f, -0.77f)
                curveToRelative(-0.13f, -0.15f, -0.22f, -0.32f, -0.29f, -0.49f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowSquareLeft = it}
