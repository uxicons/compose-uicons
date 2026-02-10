package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessRook: ImageVector? = null

val Icons.Bs.ChessRook: ImageVector
    get() = _ChessRook ?: UXIcon(name = "ChessRook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.5f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 9.5f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3.46f)
                lineTo(3f, 21f)
                lineTo(1f, 21f)
                verticalLineToRelative(3f)
                lineTo(23f, 24f)
                lineTo(23f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 12.96f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9.5f)
                close()
                moveTo(6f, 21f)
                lineTo(6f, 10f)
                lineTo(3.5f, 10f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9.5f)
                lineTo(3f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 7f)
                horizontalLineToRelative(3f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                lineTo(14f, 7f)
                horizontalLineToRelative(3f)
                lineTo(17f, 3f)
                horizontalLineToRelative(4f)
                lineTo(21f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(18f, 10f)
                lineTo(18f, 21f)
                close()
                moveTo(15f, 13f)
                verticalLineToRelative(4f)
                lineTo(9f, 17f)
                lineTo(9f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
        }.also { _ChessRook = it}
