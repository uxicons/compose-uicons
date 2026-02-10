package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Indent: ImageVector? = null

val Icons.Br.Indent: ImageVector
    get() = _Indent ?: UXIcon(name = "Indent") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 6f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 11f)
            horizontalLineTo(9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 16f)
            horizontalLineTo(9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.71f, 15.74f)
            lineToRelative(2.97f, -2.97f)
            arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.54f)
            lineTo(1.71f, 8.26f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.96f)
            verticalLineToRelative(6.07f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 15.74f)
            close()
        }
    }.also { _Indent = it }
