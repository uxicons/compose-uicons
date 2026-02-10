package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PingPong: ImageVector? = null

val Icons.Br.PingPong: ImageVector
    get() = _PingPong ?: UXIcon(name = "PingPong") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 9.88f)
            arcToRelative(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.77f, -7.1f)
            arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.49f, -1.06f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.71f, 8.18f)
            arcToRelative(11.37f, 11.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, 5.1f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 0.58f)
            lineToRelative(-3.81f, 2.66f)
            verticalLineToRelative(0.01f)
            arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.63f, 4.46f)
            lineToRelative(0.01f, 0.01f)
            lineToRelative(2.57f, -3.72f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -0.12f)
            arcToRelative(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.46f, 1.16f)
            arcToRelative(7.47f, 7.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, -0.08f)
            arcToRelative(9.91f, 9.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.25f, -2.92f)
            arcToRelative(10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.14f, -7.16f)
            close()
            moveTo(3f, 5f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            close()
            moveTo(15.38f, 16.8f)
            lineTo(7.75f, 9.17f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -4.17f)
            arcToRelative(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.05f, -0.48f)
            arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.15f, 0.38f)
            arcToRelative(6.54f, 6.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.9f, 4.88f)
            arcToRelative(7.59f, 7.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.26f, 5.13f)
            arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.36f, 1.88f)
            close()
        }
    }.also { _PingPong = it }
