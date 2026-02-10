package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerTime: ImageVector? = null

val Icons.Rs.MarkerTime: ImageVector
    get() = _MarkerTime ?: UXIcon(name = "MarkerTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23.99f)
                lineToRelative(-7.06f, -6.91f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.13f, -14.15f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.14f)
                close()
                moveTo(12f, 2.01f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 13.66f)
                lineToRelative(5.66f, 5.54f)
                lineToRelative(5.67f, -5.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.67f, -13.65f)
                close()
                moveTo(12f, 16f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                close()
                moveTo(12f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                close()
                moveTo(14.21f, 10.79f)
                lineTo(13f, 9.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                lineToRelative(1.79f, 1.79f)
                close()
            }
        }.also { _MarkerTime = it}
