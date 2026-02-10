package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watermelon: ImageVector? = null

val Icons.Rs.Watermelon: ImageVector
    get() = _Watermelon ?: UXIcon(name = "Watermelon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.02f, 0.79f)
                lineTo(19.31f, 0.09f)
                lineTo(0.09f, 19.31f)
                lineToRelative(0.71f, 0.71f)
                arcTo(13.6f, 13.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.02f, 0.79f)
                close()
                moveTo(18.6f, 18.6f)
                arcToRelative(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.66f, 0.68f)
                lineTo(19.28f, 2.94f)
                arcTo(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.6f, 18.6f)
                close()
                moveTo(19.63f, 10.63f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.76f, 0f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 8f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.64f, 0.88f)
                arcTo(1.24f, 1.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.64f, 10.64f)
                close()
                moveTo(14.63f, 16.88f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.76f, 1.76f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 16.88f)
                close()
                moveTo(17.63f, 13.88f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.76f, 1.76f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 13f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.64f, 13.88f)
                close()
                moveTo(9.63f, 17.88f)
                arcToRelative(1.24f, 1.24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.76f, 1.76f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                arcTo(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.64f, 17.88f)
                close()
            }
        }.also { _Watermelon = it}
