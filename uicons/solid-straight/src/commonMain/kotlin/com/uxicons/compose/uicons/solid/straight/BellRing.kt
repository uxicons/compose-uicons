package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellRing: ImageVector? = null

val Icons.Ss.BellRing: ImageVector
    get() = _BellRing ?: UXIcon(name = "BellRing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 17.27f)
                lineToRelative(-4.12f, 6.68f)
                lineToRelative(-1.7f, -1.05f)
                lineToRelative(4.12f, -6.68f)
                close()
                moveTo(7.78f, 1.77f)
                lineTo(6.73f, 0.06f)
                lineTo(-0.01f, 4.18f)
                lineTo(1.04f, 5.89f)
                close()
                moveTo(20.18f, 5.23f)
                lineTo(22.08f, 3.33f)
                lineTo(20.67f, 1.92f)
                lineTo(18.78f, 3.81f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.71f, -0.49f)
                lineToRelative(-6.76f, 3.75f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 4.49f)
                lineToRelative(10.58f, 10.59f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.05f, 0.86f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, -0.02f)
                arcToRelative(2.88f, 2.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.13f, -1.4f)
                lineToRelative(3.93f, -6.99f)
                arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -9.36f)
                close()
                moveTo(3f, 18.28f)
                arcToRelative(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.95f, 4.2f)
                lineToRelative(-6.39f, -6.4f)
                arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.56f, 2.2f)
                close()
            }
        }.also { _BellRing = it}
