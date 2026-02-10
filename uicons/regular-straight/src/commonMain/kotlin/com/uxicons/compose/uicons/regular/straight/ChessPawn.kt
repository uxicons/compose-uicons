package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Rs.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                verticalLineTo(14f)
                horizontalLineToRelative(3f)
                verticalLineTo(12f)
                horizontalLineTo(16.89f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.78f, 0f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                close()
                moveTo(7f, 7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                close()
                moveTo(6.9f, 22f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                verticalLineTo(14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, 5f)
                close()
            }
        }.also { _ChessPawn = it}
