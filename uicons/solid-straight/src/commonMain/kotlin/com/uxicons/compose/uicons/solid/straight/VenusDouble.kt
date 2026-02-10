package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusDouble: ImageVector? = null

val Icons.Ss.VenusDouble: ImageVector
    get() = _VenusDouble ?: UXIcon(name = "VenusDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(14.85f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.12f, 0.48f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.04f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14.98f)
                close()
                moveTo(24f, 7.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, 7.47f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(21f)
                horizontalLineToRelative(3f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(14.85f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 7.5f)
                close()
            }
        }.also { _VenusDouble = it}
