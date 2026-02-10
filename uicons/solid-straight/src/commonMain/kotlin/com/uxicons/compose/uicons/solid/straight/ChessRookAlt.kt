package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRookAlt: ImageVector? = null

val Icons.Ss.ChessRookAlt: ImageVector
    get() = _ChessRookAlt ?: UXIcon(name = "ChessRookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineTo(2f)
                verticalLineTo(23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(16f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8.83f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(8.83f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                verticalLineTo(0f)
                close()
                moveTo(14f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _ChessRookAlt = it}
