package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Sr.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, 0.25f)
                lineToRelative(1.95f, -1.95f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineTo(11.01f, 6.4f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                horizontalLineToRelative(4f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.68f, 3.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(19.29f, 6.24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.95f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, -3f)
                horizontalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(7.36f)
                lineToRelative(2.68f, -2.68f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.68f, 3.27f)
                close()
            }
        }.also { _GasPump = it}
