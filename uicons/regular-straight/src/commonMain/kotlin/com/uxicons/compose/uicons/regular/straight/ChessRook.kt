package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRook: ImageVector? = null

val Icons.Rs.ChessRook: ImageVector
    get() = _ChessRook ?: UXIcon(name = "ChessRook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(18f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(3f, 22f)
                lineTo(1f, 22f)
                verticalLineToRelative(2f)
                lineTo(23f, 24f)
                lineTo(23f, 22f)
                lineTo(21f, 22f)
                lineTo(21f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 0f)
                close()
                moveTo(22f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(19f, 10f)
                lineTo(19f, 22f)
                lineTo(5f, 22f)
                lineTo(5f, 10f)
                lineTo(3f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                lineTo(2f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 6f)
                horizontalLineToRelative(7f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 6f)
                horizontalLineToRelative(7f)
                lineTo(20f, 2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
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
