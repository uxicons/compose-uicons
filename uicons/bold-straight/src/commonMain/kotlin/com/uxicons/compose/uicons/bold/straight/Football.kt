package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Bs.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(10.64f, 20.89f)
                lineTo(9.08f, 16f)
                lineTo(3.95f, 15.99f)
                arcToRelative(8.88f, 8.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, -2.63f)
                lineToRelative(4.15f, -2.93f)
                lineToRelative(-1.51f, -4.9f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, -1.53f)
                lineToRelative(4.12f, 2.99f)
                lineToRelative(4.12f, -2.99f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, 1.53f)
                lineToRelative(-1.51f, 4.9f)
                lineToRelative(4.15f, 2.93f)
                arcToRelative(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 2.63f)
                lineToRelative(-5.13f, 0.01f)
                lineToRelative(-1.57f, 4.89f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, 0.11f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, -0.11f)
                close()
                moveTo(14.92f, 16f)
                horizontalLineToRelative(-5.85f)
                lineToRelative(-1.81f, -5.56f)
                lineToRelative(4.73f, -3.44f)
                lineToRelative(4.73f, 3.44f)
                close()
            }
        }.also { _Football = it}
