package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Br.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(0.22f, 4.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -2.06f)
            lineToRelative(3.27f, -2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.56f, 2.56f)
            lineToRelative(-3.27f, 2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.06f, -0.5f)
            close()
            moveTo(23.29f, 17.98f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.06f, 0.49f)
            lineToRelative(-2f, 3.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.55f, 1.58f)
            lineToRelative(2f, -3.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.49f, -2.07f)
            close()
            moveTo(20.84f, 15.48f)
            lineTo(17.23f, 21.35f)
            arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.09f, 2.61f)
            arcToRelative(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, 0.04f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.39f, -1.18f)
            arcToRelative(4.18f, 4.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.96f, -5.87f)
            lineToRelative(-1.49f, -1.5f)
            arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -4.59f)
            arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.59f, -4.05f)
            lineToRelative(5.49f, -3.39f)
            arcToRelative(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.08f, 0.27f)
            lineToRelative(1.24f, -1.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineToRelative(-1.24f, 1.24f)
            arcToRelative(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.51f, 9.69f)
            close()
            moveTo(17.23f, 6.78f)
            arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.52f, -0.82f)
            lineToRelative(-5.5f, 3.4f)
            arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.18f, 1.85f)
            arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 2.12f)
            lineToRelative(6.91f, 6.93f)
            arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.99f, -0.47f)
            lineToRelative(3.57f, -5.82f)
            arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.02f, -7.18f)
            close()
        }
    }.also { _BellRing = it }
