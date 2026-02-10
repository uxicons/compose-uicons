package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Bs.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(17f)
                lineToRelative(2.44f, 2.44f)
                lineTo(16.91f, 4.97f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.9f, 0.05f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 16.82f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(16.82f)
                arcToRelative(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.01f, -0.85f)
                arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.03f, 7.1f)
                lineToRelative(2.54f, -2.53f)
                close()
                moveTo(3f, 10.5f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.86f, 7.28f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.44f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10.5f)
                close()
                moveTo(13.5f, 14f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 14f)
                close()
            }
        }.also { _VenusMars = it}
