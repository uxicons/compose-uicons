package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PuzzlePiece: ImageVector? = null

val Icons.Rs.PuzzlePiece: ImageVector
    get() = _PuzzlePiece ?: UXIcon(name = "PuzzlePiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                lineTo(10.44f, 24f)
                lineToRelative(0.29f, -1.23f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 21f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 1.77f)
                lineTo(7.56f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                lineTo(5.27f, 6f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.27f, 2f)
                lineTo(15f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1.77f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -0.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -0.27f)
                close()
                moveTo(12.91f, 22f)
                lineTo(16f, 22f)
                lineTo(16f, 15.58f)
                lineToRelative(1.29f, 0.39f)
                arcTo(11.22f, 11.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 16.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                arcToRelative(11.22f, 11.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.71f, 0.53f)
                lineTo(16f, 13.42f)
                lineTo(16f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(10.08f, 8f)
                lineToRelative(0.39f, -1.29f)
                arcTo(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                arcToRelative(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.53f, 2.71f)
                lineTo(7.92f, 8f)
                lineTo(3f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                lineTo(2f, 22f)
                lineTo(5.09f, 22f)
                arcTo(7.15f, 7.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcTo(7.15f, 7.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.91f, 22f)
                close()
            }
        }.also { _PuzzlePiece = it}
