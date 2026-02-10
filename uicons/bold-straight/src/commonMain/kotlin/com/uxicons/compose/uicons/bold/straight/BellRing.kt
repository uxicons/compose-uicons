package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Bs.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.78f, 5.41f)
                lineToRelative(-1.57f, -2.56f)
                lineToRelative(4.5f, -2.75f)
                lineToRelative(1.57f, 2.55f)
                close()
                moveTo(21.38f, 17.71f)
                lineTo(18.61f, 22.21f)
                lineTo(21.16f, 23.79f)
                lineTo(23.94f, 19.29f)
                close()
                moveTo(20.91f, 14.79f)
                lineTo(16.22f, 22.39f)
                arcToRelative(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.42f, 1.58f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.43f, 0.03f)
                arcToRelative(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, -0.97f)
                lineToRelative(-1.08f, -1.08f)
                arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.89f, -5.89f)
                lineToRelative(-3.08f, -3.09f)
                arcToRelative(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.51f, -5.11f)
                lineToRelative(7.39f, -4.52f)
                arcToRelative(8.49f, 8.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.46f, 0.2f)
                lineToRelative(1.98f, -1.98f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.98f, 1.98f)
                arcToRelative(8.59f, 8.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, 9.12f)
                close()
                moveTo(17.39f, 6.64f)
                arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.92f, -0.76f)
                lineToRelative(-7.37f, 4.51f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 0.2f)
                arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 0.26f)
                lineToRelative(10.06f, 10.06f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 0.09f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, -0.15f)
                lineToRelative(4.68f, -7.58f)
                arcToRelative(5.56f, 5.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, -6.62f)
                close()
            }
        }.also { _BellRing = it}
