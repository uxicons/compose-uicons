package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClockAlt: ImageVector? = null

val Icons.Sr.ChessClockAlt: ImageVector
    get() = _ChessClockAlt ?: UXIcon(name = "ChessClockAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 10f)
                verticalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.58f)
                lineTo(3f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(5f, 21f)
                lineTo(19f, 21f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(21f, 20.58f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
                lineTo(24f, 10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                lineTo(19f, 3f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(16f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1f)
                lineTo(17f, 5f)
                lineTo(8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                lineTo(4f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                lineTo(5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                close()
                moveTo(17f, 13.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(13.16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                lineTo(16f, 14.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13.5f)
                close()
                moveTo(7.85f, 13.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, 0f)
                lineTo(4.43f, 15.15f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(2.01f, -2.01f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.85f, 13.15f)
                close()
            }
        }.also { _ChessClockAlt = it}
