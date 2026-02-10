package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Bs.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.88f, 1f)
                lineTo(18f, 4.88f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
                horizontalLineToRelative(-9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineToRelative(5f)
                verticalLineTo(6.12f)
                lineToRelative(3f, -3f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(9f)
                horizontalLineTo(10.82f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, -0.74f)
                lineTo(12.2f, 5.9f)
                lineTo(9.8f, 4.1f)
                lineTo(7.59f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.18f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                close()
                moveTo(3f, 21f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _GasPump = it}
