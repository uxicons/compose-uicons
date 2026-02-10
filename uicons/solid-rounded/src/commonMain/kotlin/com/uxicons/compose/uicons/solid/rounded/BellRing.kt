package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Sr.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.31f, 17.19f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(4.22f, 4.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
                close()
                moveTo(7.33f, 1.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, -1.96f)
                arcToRelative(10.69f, 10.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.71f, 4.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, 1.19f)
                arcToRelative(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.51f, -3.35f)
                close()
                moveTo(23.2f, 16.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.19f, 0.76f)
                arcToRelative(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.32f, 5.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.18f, 1.62f)
                arcToRelative(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.09f, -6.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.76f, -1.19f)
                close()
                moveTo(20.17f, 5.25f)
                lineTo(21.71f, 3.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-1.54f, 1.54f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.82f, -0.5f)
                lineToRelative(-5.5f, 3.4f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.91f, 7.83f)
                lineToRelative(6.96f, 6.96f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.84f, -0.93f)
                lineToRelative(3.6f, -5.88f)
                arcToRelative(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -9.47f)
                close()
            }
        }.also { _BellRing = it}
