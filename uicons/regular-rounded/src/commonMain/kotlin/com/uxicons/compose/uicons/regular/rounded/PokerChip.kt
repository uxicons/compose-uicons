package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PokerChip: ImageVector? = null

val Icons.Rr.PokerChip: ImageVector
    get() = _PokerChip ?: UXIcon(name = "PokerChip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(22f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.19f, 1.9f)
                lineToRelative(-1.93f, -0.58f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.64f)
                lineToRelative(1.93f, -0.58f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, 1.9f)
                close()
                moveTo(21.24f, 8.18f)
                lineTo(19.31f, 8.76f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, -4.07f)
                lineToRelative(0.58f, -1.93f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.42f, 5.42f)
                close()
                moveTo(12f, 18f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                close()
                moveTo(13.9f, 2.19f)
                lineTo(13.32f, 4.12f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, 0f)
                lineToRelative(-0.58f, -1.93f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, 0f)
                close()
                moveTo(8.18f, 2.76f)
                lineTo(8.76f, 4.69f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, 4.07f)
                lineToRelative(-1.93f, -0.58f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.42f, -5.42f)
                close()
                moveTo(2f, 12f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, -1.9f)
                lineToRelative(1.93f, 0.58f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.64f)
                lineToRelative(-1.93f, 0.58f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.19f, -1.9f)
                close()
                moveTo(2.76f, 15.82f)
                lineTo(4.69f, 15.24f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, 4.07f)
                lineToRelative(-0.58f, 1.93f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.42f, -5.42f)
                close()
                moveTo(10.1f, 21.82f)
                lineTo(10.68f, 19.88f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, 0f)
                lineToRelative(0.58f, 1.93f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.8f, 0f)
                close()
                moveTo(15.82f, 21.24f)
                lineTo(15.24f, 19.31f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, -4.07f)
                lineToRelative(1.93f, 0.58f)
                arcToRelative(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.42f, 5.42f)
                close()
                moveTo(14.63f, 10.89f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.22f)
                lineToRelative(-1.89f, 2.52f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, 0f)
                lineToRelative(-1.89f, -2.52f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.22f)
                lineToRelative(1.89f, -2.52f)
                arcToRelative(0.92f, 0.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.48f, 0f)
                close()
            }
        }.also { _PokerChip = it}
