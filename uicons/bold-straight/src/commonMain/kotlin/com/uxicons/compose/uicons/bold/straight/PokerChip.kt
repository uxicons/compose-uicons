package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PokerChip: ImageVector? = null

val Icons.Bs.PokerChip: ImageVector
    get() = _PokerChip ?: UXIcon(name = "PokerChip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(20.62f, 9.41f)
                lineTo(17.75f, 10.28f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.02f, -4.02f)
                lineToRelative(0.86f, -2.87f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.03f, 6.03f)
                close()
                moveTo(12f, 15.82f)
                lineTo(9.14f, 12f)
                lineTo(12f, 8.18f)
                lineTo(14.86f, 12f)
                close()
                moveTo(9.41f, 3.38f)
                lineTo(10.28f, 6.25f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.02f, 4.02f)
                lineToRelative(-2.87f, -0.86f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.03f, -6.03f)
                close()
                moveTo(3.38f, 14.58f)
                lineTo(6.25f, 13.72f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, 4.02f)
                lineToRelative(-0.86f, 2.87f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.03f, -6.03f)
                close()
                moveTo(14.58f, 20.61f)
                lineTo(13.72f, 17.74f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.02f, -4.02f)
                lineToRelative(2.87f, 0.86f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.03f, 6.03f)
                close()
            }
        }.also { _PokerChip = it}
