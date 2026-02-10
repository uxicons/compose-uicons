package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Ss.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.36f, 4.88f)
                lineToRelative(1.35f, 4.38f)
                lineToRelative(-3.71f, 2.61f)
                arcToRelative(11.91f, 11.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.36f, -6.99f)
                close()
                moveTo(6.87f, 19f)
                lineTo(2.26f, 18.99f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.02f, 4.42f)
                close()
                moveTo(12f, 3.25f)
                lineTo(15.68f, 0.58f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.35f, 0f)
                close()
                moveTo(21.63f, 4.87f)
                lineTo(20.27f, 9.26f)
                lineTo(23.99f, 11.88f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, -7.01f)
                close()
                moveTo(17.11f, 19f)
                lineTo(15.7f, 23.41f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.04f, -4.42f)
                close()
                moveTo(13.44f, 23.91f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, 0.09f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.45f, -0.1f)
                lineToRelative(-2.21f, -6.9f)
                lineToRelative(-7.23f, -0.02f)
                arcToRelative(11.88f, 11.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, -2.81f)
                lineToRelative(5.85f, -4.12f)
                lineToRelative(-2.13f, -6.9f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.27f, -1.65f)
                lineToRelative(5.81f, 4.22f)
                lineToRelative(5.81f, -4.22f)
                arcToRelative(12.03f, 12.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.26f, 1.64f)
                lineToRelative(-2.13f, 6.91f)
                lineToRelative(5.86f, 4.13f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.89f, 2.8f)
                lineToRelative(-7.25f, 0.02f)
                close()
                moveTo(8.35f, 17f)
                horizontalLineToRelative(7.3f)
                lineToRelative(2.26f, -6.94f)
                lineToRelative(-5.91f, -4.29f)
                lineToRelative(-5.91f, 4.29f)
                close()
                moveTo(8.45f, 10.82f)
                lineTo(9.8f, 15f)
                horizontalLineToRelative(4.4f)
                lineToRelative(1.36f, -4.18f)
                lineToRelative(-3.56f, -2.58f)
                close()
            }
        }.also { _Football = it}
