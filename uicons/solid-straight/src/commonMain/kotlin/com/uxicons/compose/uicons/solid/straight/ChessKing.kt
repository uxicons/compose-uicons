package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Ss.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.13f, 12.14f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 8.39f)
                arcTo(38.51f, 38.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7.02f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(7.02f)
                arcToRelative(38.51f, 38.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.88f, 1.37f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.99f, 3.75f)
                lineTo(21.45f, 20f)
                horizontalLineTo(2.55f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                close()
            }
        }.also { _ChessKing = it}
