package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Br.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.19f, 16f)
            horizontalLineToRelative(-2.37f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.38f, -1.73f)
            lineToRelative(-0.73f, -2.25f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, -2.8f)
            lineToRelative(1.92f, -1.39f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.94f, 0f)
            lineToRelative(1.92f, 1.39f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.91f, 2.8f)
            lineToRelative(-0.73f, 2.25f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.38f, 1.72f)
            close()
            moveTo(24f, 12f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
            arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, -0.14f)
            lineToRelative(0.85f, -2.78f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.85f, -2.08f)
            lineToRelative(2.82f, -0.01f)
            arcToRelative(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.87f, -2.9f)
            lineToRelative(-2.25f, -1.5f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.14f, -3.34f)
            lineToRelative(0.85f, -2.57f)
            arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.46f, -1.76f)
            lineToRelative(-2.17f, 1.51f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.53f, 0f)
            lineToRelative(-2.11f, -1.54f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.43f, 1.7f)
            lineToRelative(0.77f, 2.66f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.14f, 3.34f)
            lineToRelative(-2.23f, 1.59f)
            arcToRelative(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, 2.81f)
            lineToRelative(2.82f, 0.01f)
            arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.85f, 2.08f)
            lineToRelative(0.86f, 2.78f)
            arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, 0.14f)
            close()
        }
    }.also { _Football = it }
