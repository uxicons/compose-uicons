package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Rr.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                horizontalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                close()
                moveTo(17f, 22f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(19f)
                horizontalLineToRelative(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                close()
            }
        }.also { _Tablet = it}
