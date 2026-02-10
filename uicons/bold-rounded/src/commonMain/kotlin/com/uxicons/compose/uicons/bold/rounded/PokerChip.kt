package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PokerChip: ImageVector? = null

val Icons.Br.PokerChip: ImageVector
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
            moveTo(12.74f, 15.63f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, 0f)
            lineToRelative(-1.89f, -2.52f)
            arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.22f)
            lineToRelative(1.89f, -2.52f)
            arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.48f, 0f)
            lineToRelative(1.89f, 2.52f)
            arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.22f)
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
    }.also { _PokerChip = it }
