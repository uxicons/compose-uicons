package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayoutFluid: ImageVector? = null

val Icons.Bs.LayoutFluid: ImageVector
    get() = _LayoutFluid ?: UXIcon(name = "LayoutFluid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(0f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 24f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(24f)
                verticalLineToRelative(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 24f)
                close()
            }
        }.also { _LayoutFluid = it}
