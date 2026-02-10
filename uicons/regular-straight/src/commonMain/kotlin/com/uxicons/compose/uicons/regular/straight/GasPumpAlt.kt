package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Rs.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.41f, 4f)
                lineTo(19.71f, 0.29f)
                lineTo(18.29f, 1.71f)
                lineTo(20f, 3.41f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                verticalLineTo(5.41f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.41f, 4f)
                close()
                moveTo(3f, 2f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                close()
                moveTo(2f, 22f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                close()
            }
        }.also { _GasPumpAlt = it}
