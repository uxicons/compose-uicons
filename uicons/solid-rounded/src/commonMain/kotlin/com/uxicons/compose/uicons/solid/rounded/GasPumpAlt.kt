package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Sr.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                verticalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(3.41f)
                lineTo(18.29f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.71f, 0.29f)
                lineToRelative(2.54f, 2.54f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 6.98f)
                curveTo(24f, 6.99f, 24f, 18f, 24f, 18f)
                close()
                moveTo(16f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                close()
            }
        }.also { _GasPumpAlt = it}
