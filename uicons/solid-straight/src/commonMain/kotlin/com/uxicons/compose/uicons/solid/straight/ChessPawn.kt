package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Ss.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 14f)
                lineTo(4f, 12f)
                lineTo(7.11f, 12f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.78f, 0f)
                lineTo(20f, 12f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 16f)
                lineTo(7f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                verticalLineToRelative(2f)
                lineTo(22f, 24f)
                lineTo(22f, 22f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                close()
            }
        }.also { _ChessPawn = it}
