package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerTime: ImageVector? = null

val Icons.Rr.MarkerTime: ImageVector
    get() = _MarkerTime ?: UXIcon(name = "MarkerTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                arcToRelative(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.81f, -1.55f)
                lineToRelative(-3.94f, -3.64f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.53f, -15.58f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15.56f)
                lineToRelative(-3.99f, 3.69f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.79f, 1.53f)
                close()
                moveTo(12f, 2f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.36f, 15.36f)
                lineToRelative(3.93f, 3.64f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.84f, 0.02f)
                lineToRelative(3.98f, -3.68f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, -12.7f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.36f, -2.64f)
                close()
                moveTo(12f, 18f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, -7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                close()
                moveTo(12f, 6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
                moveTo(13.71f, 12.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineToRelative(-0.71f, -0.71f)
                verticalLineToRelative(-1.59f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineToRelative(1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                close()
            }
        }.also { _MarkerTime = it}
