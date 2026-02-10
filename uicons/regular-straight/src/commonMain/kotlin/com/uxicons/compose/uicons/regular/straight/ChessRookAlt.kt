package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRookAlt: ImageVector? = null

val Icons.Rs.ChessRookAlt: ImageVector
    get() = _ChessRookAlt ?: UXIcon(name = "ChessRookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                lineTo(19f, 8.83f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                lineTo(21f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 6f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8.83f)
                lineTo(5f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(22f, 24f)
                lineTo(22f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                close()
                moveTo(6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                lineTo(5f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 5f)
                horizontalLineToRelative(2f)
                lineTo(10f, 2f)
                horizontalLineToRelative(4f)
                lineTo(14f, 5f)
                horizontalLineToRelative(2f)
                lineTo(16f, 2f)
                horizontalLineToRelative(3f)
                lineTo(19f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(17f, 7f)
                lineTo(17f, 18f)
                lineTo(7f, 18f)
                lineTo(7f, 7f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(14f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _ChessRookAlt = it}
