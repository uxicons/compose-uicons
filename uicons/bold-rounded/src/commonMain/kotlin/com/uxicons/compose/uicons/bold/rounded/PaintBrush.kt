package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintBrush: ImageVector? = null

val Icons.Br.PaintBrush: ImageVector
    get() = _PaintBrush ?: UXIcon(name = "PaintBrush") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 3.94f)
            arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, -2.8f)
            arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.52f, -0.03f)
            lineToRelative(-10.17f, 9.93f)
            arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, 1.74f)
            curveToRelative(-1.62f, 1.62f, -2.52f, 5.77f, -2.73f, 7.24f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 4.01f)
            arcToRelative(3.56f, 3.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, -0.04f)
            curveToRelative(1.46f, -0.21f, 5.62f, -1.11f, 7.24f, -2.73f)
            arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -4.88f)
            lineToRelative(9.88f, -9.64f)
            arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, -2.79f)
            close()
            moveTo(9.12f, 19.13f)
            curveToRelative(-0.65f, 0.65f, -3.35f, 1.57f, -5.54f, 1.88f)
            arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, -0.58f)
            curveToRelative(0.32f, -2.2f, 1.23f, -4.89f, 1.88f, -5.54f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.24f, 0f)
            arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.73f, 1.23f)
            arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.1f, 0.36f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 2.65f)
            close()
            moveTo(20.72f, 4.58f)
            lineTo(11.72f, 13.36f)
            arcToRelative(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.48f, -0.59f)
            arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.85f, -0.7f)
            lineToRelative(9.04f, -8.81f)
            arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.3f, 0.01f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, 1.31f)
            close()
        }
    }.also { _PaintBrush = it }
