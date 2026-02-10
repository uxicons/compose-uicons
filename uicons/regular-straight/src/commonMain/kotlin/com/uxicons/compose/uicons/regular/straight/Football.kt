package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Rs.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(20.23f, 6.33f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 5.13f)
                lineToRelative(-2.74f, -1.93f)
                close()
                moveTo(14.71f, 2.38f)
                lineTo(12f, 4.35f)
                lineTo(9.29f, 2.38f)
                arcToRelative(9.76f, 9.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.42f, 0f)
                close()
                moveTo(14.5f, 11.06f)
                lineTo(13.55f, 14f)
                horizontalLineToRelative(-3.1f)
                lineToRelative(-0.95f, -2.94f)
                lineToRelative(2.5f, -1.82f)
                close()
                moveTo(4.76f, 9.53f)
                lineTo(2.03f, 11.46f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, -5.13f)
                close()
                moveTo(4.01f, 17.98f)
                lineTo(7.48f, 18f)
                lineTo(8.57f, 21.38f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.56f, -3.4f)
                close()
                moveTo(10.84f, 21.93f)
                lineTo(8.94f, 16f)
                lineTo(2.83f, 15.98f)
                arcToRelative(9.91f, 9.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, -2.18f)
                lineToRelative(4.93f, -3.48f)
                lineToRelative(-1.78f, -5.75f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, -1.3f)
                lineToRelative(4.83f, 3.52f)
                lineToRelative(-4.81f, 3.5f)
                lineToRelative(1.86f, 5.7f)
                horizontalLineToRelative(6f)
                lineToRelative(1.85f, -5.71f)
                lineToRelative(-4.81f, -3.49f)
                lineToRelative(4.84f, -3.52f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.8f, 1.3f)
                lineToRelative(-1.78f, 5.75f)
                lineToRelative(4.93f, 3.47f)
                arcToRelative(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, 2.17f)
                lineToRelative(-6.11f, 0.02f)
                lineToRelative(-1.9f, 5.93f)
                arcToRelative(9.21f, 9.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.31f, 0f)
                close()
                moveTo(15.43f, 21.38f)
                lineTo(16.52f, 18f)
                lineTo(19.99f, 17.99f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.56f, 3.39f)
                close()
            }
        }.also { _Football = it}
