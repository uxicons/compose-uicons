package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRook: ImageVector? = null

val Icons.Rr.ChessRook: ImageVector
    get() = _ChessRook ?: UXIcon(name = "ChessRook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                lineTo(24f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(20f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(18f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(11f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                lineTo(9f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                lineTo(2f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(0f, 8f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.87f)
                lineTo(3f, 22f)
                lineTo(2f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(22f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(21f, 22f)
                lineTo(21f, 11.87f)
                arcTo(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8f)
                close()
                moveTo(5f, 22f)
                lineTo(5f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8f)
                lineTo(2f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(20f, 2f)
                horizontalLineToRelative(2f)
                lineTo(22f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                lineTo(19f, 22f)
                close()
                moveTo(12f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(15f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
                moveTo(13f, 16f)
                lineTo(11f, 16f)
                lineTo(11f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
        }.also { _ChessRook = it}
