package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PuzzlePiece: ImageVector? = null

val Icons.Ss.PuzzlePiece: ImageVector
    get() = _PuzzlePiece ?: UXIcon(name = "PuzzlePiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10.5f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0.27f)
                verticalLineTo(9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(12.73f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.27f, 2f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineTo(24f)
                horizontalLineTo(6.54f)
                lineTo(6.3f, 23f)
                arcTo(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 2f)
                lineToRelative(-0.24f, 1f)
                horizontalLineTo(18f)
                verticalLineTo(18.23f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
                close()
            }
        }.also { _PuzzlePiece = it}
