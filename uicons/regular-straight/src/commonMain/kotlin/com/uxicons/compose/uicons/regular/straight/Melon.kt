package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Rs.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.02f, 0.79f)
                lineTo(19.31f, 0.09f)
                lineTo(0.09f, 19.31f)
                lineToRelative(0.71f, 0.71f)
                arcToRelative(13.61f, 13.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.23f, 0f)
                arcToRelative(13.59f, 13.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -19.23f)
                close()
                moveTo(15f, 10.21f)
                arcToRelative(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.15f, 4.17f)
                lineToRelative(6.53f, -6.53f)
                arcTo(4.76f, 4.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 10.21f)
                close()
                moveTo(18.6f, 18.6f)
                arcToRelative(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.66f, 0.68f)
                lineTo(6.4f, 15.83f)
                arcTo(6.79f, 6.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.83f, 6.4f)
                lineToRelative(3.45f, -3.45f)
                arcTo(11.6f, 11.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.6f, 18.6f)
                close()
            }
        }.also { _Melon = it}
