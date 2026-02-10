package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PuzzlePiece: ImageVector? = null

val Icons.Bs.PuzzlePiece: ImageVector
    get() = _PuzzlePiece ?: UXIcon(name = "PuzzlePiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 12f)
                arcTo(19.07f, 19.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12.48f)
                verticalLineTo(9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 6f)
                horizontalLineTo(11.52f)
                curveToRelative(0.06f, -0.34f, 0.13f, -0.7f, 0.19f, -1.03f)
                arcTo(12.62f, 12.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.16f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 0f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.16f)
                arcToRelative(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 1.91f)
                curveToRelative(0.06f, 0.31f, 0.12f, 0.63f, 0.17f, 0.93f)
                horizontalLineTo(3.41f)
                arcTo(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.42f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                verticalLineTo(17.52f)
                arcTo(19.07f, 19.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.84f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                close()
                moveTo(15f, 21f)
                horizontalLineTo(11.52f)
                curveToRelative(0.06f, -0.34f, 0.13f, -0.7f, 0.19f, -1.03f)
                arcTo(12.62f, 12.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.16f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 15f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3.16f)
                arcToRelative(13.69f, 13.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 1.91f)
                curveToRelative(0.06f, 0.31f, 0.12f, 0.63f, 0.17f, 0.93f)
                horizontalLineTo(3f)
                verticalLineTo(9.42f)
                arcTo(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 9f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _PuzzlePiece = it}
