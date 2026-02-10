package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayoutFluid: ImageVector? = null

val Icons.Ss.LayoutFluid: ImageVector
    get() = _LayoutFluid ?: UXIcon(name = "LayoutFluid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineToRelative(7f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13f)
                horizontalLineTo(0f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13f)
                close()
            }
        }.also { _LayoutFluid = it}
