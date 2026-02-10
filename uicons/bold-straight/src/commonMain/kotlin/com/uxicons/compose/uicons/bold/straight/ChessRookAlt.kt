package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRookAlt: ImageVector? = null

val Icons.Bs.ChessRookAlt: ImageVector
    get() = _ChessRookAlt ?: UXIcon(name = "ChessRookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19.04f)
                lineTo(19f, 9.66f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6.5f)
                lineTo(21f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9.66f)
                verticalLineToRelative(9.37f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 22.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19.04f)
                close()
                moveTo(6f, 3f)
                lineTo(8f, 3f)
                lineTo(8f, 5f)
                horizontalLineToRelative(3f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                lineTo(13f, 5f)
                horizontalLineToRelative(3f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                lineTo(18f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(16f, 7f)
                lineTo(16f, 19f)
                lineTo(8f, 19f)
                lineTo(8f, 7f)
                lineTo(6.5f, 7f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 6.5f)
                close()
                moveTo(14f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _ChessRookAlt = it}
