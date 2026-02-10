package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Bs.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16.5f)
                lineTo(17f, 14f)
                horizontalLineToRelative(3f)
                lineTo(20f, 11f)
                lineTo(17.74f, 11f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.26f, 11f)
                lineTo(4f, 11f)
                verticalLineToRelative(3f)
                lineTo(7f, 14f)
                verticalLineToRelative(2.5f)
                curveTo(7f, 18.86f, 4.62f, 21f, 2f, 21f)
                verticalLineToRelative(3f)
                lineTo(22f, 24f)
                lineTo(22f, 21f)
                curveTo(19.38f, 21f, 17f, 18.86f, 17f, 16.5f)
                close()
                moveTo(8f, 7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                close()
                moveTo(8.3f, 21f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 16.5f)
                lineTo(10f, 14f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.7f, 21f)
                close()
            }
        }.also { _ChessPawn = it}
