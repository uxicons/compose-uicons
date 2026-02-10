package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Br.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(18.24f)
            arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.76f, 13f)
            horizontalLineTo(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(0.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(12f, 3f)
            arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 8f)
            arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(7.5f, 21f)
            arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16.5f)
            verticalLineTo(16f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(0.5f)
            arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 21f)
            close()
        }
    }.also { _ChessPawn = it }
