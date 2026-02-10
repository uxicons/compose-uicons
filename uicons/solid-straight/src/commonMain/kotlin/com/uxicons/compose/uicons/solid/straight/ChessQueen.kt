package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Ss.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.8f, 8.15f)
                arcTo(10.49f, 10.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.16f, 4.18f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.68f, 0f)
                arcTo(10.44f, 10.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.2f, 8.15f)
                arcToRelative(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 3.33f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.69f, 0f)
                arcTo(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, 8.15f)
                close()
                moveTo(21.45f, 20f)
                lineTo(24.02f, 9.06f)
                curveTo(20.43f, 9.45f, 18f, 11.78f, 18f, 15f)
                horizontalLineTo(16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                horizontalLineTo(6f)
                curveTo(6f, 11.78f, 3.57f, 9.45f, -0.02f, 9.06f)
                lineTo(2.55f, 20f)
                close()
                moveTo(2f, 24f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _ChessQueen = it}
