package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Bs.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.27f, 4.15f)
                lineTo(19.56f, 0.44f)
                lineTo(17.44f, 2.56f)
                lineTo(19f, 4.12f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.45f)
                verticalLineTo(18.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
                verticalLineToRelative(-1f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
                horizontalLineToRelative(-9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                verticalLineTo(5.91f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.27f, 4.15f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(9f)
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
        }.also { _GasPumpAlt = it}
