package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpSlash: ImageVector? = null

val Icons.Sr.GasPumpSlash: ImageVector
    get() = _GasPumpSlash ?: UXIcon(name = "GasPumpSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.76f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(4.24f)
                close()
                moveTo(0f, 11f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.87f, -3.89f)
                lineTo(6.76f, 11f)
                close()
                moveTo(24f, 6.98f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -4.15f)
                lineTo(19.71f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(20f, 3.41f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-0.59f)
                lineTo(16f, 14.59f)
                verticalLineTo(11f)
                horizontalLineTo(12.41f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(5f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 0.83f)
                lineTo(1.71f, 0.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.71f)
                lineToRelative(22f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                lineTo(22.17f, 20.76f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18f)
                reflectiveCurveTo(24f, 6.99f, 24f, 6.98f)
                close()
            }
        }.also { _GasPumpSlash = it}
