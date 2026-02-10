package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHot: ImageVector? = null

val Icons.Bs.MugHot: ImageVector
    get() = _MugHot ?: UXIcon(name = "MugHot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                lineTo(8f, 4f)
                lineTo(8f, 0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 0f)
                lineTo(13f, 0f)
                lineTo(13f, 4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 4f)
                lineTo(6f, 4f)
                close()
                moveTo(24f, 20f)
                lineTo(19f, 20f)
                verticalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 24f)
                lineTo(3.5f, 24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20.5f)
                lineTo(0f, 6f)
                lineTo(19f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.5f)
                close()
                moveTo(16f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                close()
                moveTo(21f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                lineTo(19f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _MugHot = it}
