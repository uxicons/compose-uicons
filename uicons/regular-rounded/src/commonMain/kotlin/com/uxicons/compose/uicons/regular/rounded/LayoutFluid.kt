package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayoutFluid: ImageVector? = null

val Icons.Rr.LayoutFluid: ImageVector
    get() = _LayoutFluid ?: UXIcon(name = "LayoutFluid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                close()
                moveTo(2f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                lineTo(19f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(17f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 0f)
                close()
                moveTo(22f, 9f)
                lineTo(19f, 9f)
                lineTo(19f, 2f)
                horizontalLineToRelative(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                lineTo(2f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(5f, 24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(7f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13f)
                close()
                moveTo(5f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 15f)
                lineTo(5f, 15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                lineTo(11f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(22f, 24f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                close()
                moveTo(22f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 15f)
                lineTo(22f, 15f)
                close()
            }
        }.also { _LayoutFluid = it}
