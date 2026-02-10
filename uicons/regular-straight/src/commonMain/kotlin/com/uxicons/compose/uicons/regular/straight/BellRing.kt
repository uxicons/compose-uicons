package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Rs.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.04f, 5.89f)
                lineToRelative(-1.04f, -1.7f)
                lineToRelative(6.74f, -4.13f)
                lineToRelative(1.04f, 1.71f)
                close()
                moveTo(22.27f, 16.22f)
                lineTo(18.15f, 22.9f)
                lineTo(19.85f, 23.95f)
                lineTo(23.97f, 17.27f)
                close()
                moveTo(20.92f, 14.6f)
                lineTo(16f, 22.58f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.13f, 1.39f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, 0.02f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.05f, -0.85f)
                lineToRelative(-0.96f, -0.96f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.61f, -6.62f)
                lineToRelative(-3.01f, -3.01f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, -4.49f)
                lineToRelative(7.76f, -4.75f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.71f, 0.49f)
                lineToRelative(1.89f, -1.89f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.9f, 1.9f)
                arcToRelative(8.45f, 8.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.74f, 9.37f)
                close()
                moveTo(9.01f, 20.72f)
                lineTo(5.32f, 17.02f)
                arcToRelative(2.72f, 2.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 3.21f)
                arcToRelative(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, 0.48f)
                close()
                moveTo(18.13f, 5.9f)
                arcToRelative(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -0.88f)
                lineToRelative(-7.75f, 4.74f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, 0.65f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 0.74f)
                lineToRelative(10.59f, 10.59f)
                arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.76f, 0.26f)
                arcToRelative(0.9f, 0.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.67f, -0.44f)
                lineToRelative(4.92f, -7.97f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.07f, -7.68f)
                close()
            }
        }.also { _BellRing = it}
