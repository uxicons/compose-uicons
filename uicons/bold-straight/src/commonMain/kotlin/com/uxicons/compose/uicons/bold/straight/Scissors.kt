package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scissors: ImageVector? = null

val Icons.Bs.Scissors: ImageVector
    get() = _Scissors ?: UXIcon(name = "Scissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 13f)
                arcToRelative(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.17f, 0.45f)
                lineToRelative(-2.37f, -2.85f)
                lineToRelative(7.2f, -8.64f)
                lineToRelative(-2.31f, -1.92f)
                lineToRelative(-6.85f, 8.22f)
                lineToRelative(-6.85f, -8.22f)
                lineToRelative(-2.3f, 1.92f)
                lineToRelative(7.2f, 8.64f)
                lineToRelative(-2.38f, 2.85f)
                arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.33f, 1.9f)
                lineToRelative(2f, -2.4f)
                lineToRelative(2f, 2.4f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.5f, -2.35f)
                close()
                moveTo(5.5f, 21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 21f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 2.5f)
                close()
            }
        }.also { _Scissors = it}
