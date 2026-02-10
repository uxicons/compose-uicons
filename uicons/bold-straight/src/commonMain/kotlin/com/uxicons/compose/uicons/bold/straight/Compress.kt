package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Compress: ImageVector? = null

val Icons.Bs.Compress: ImageVector
    get() = _Compress ?: UXIcon(name = "Compress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 5.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 6f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineTo(18.5f)
                horizontalLineTo(24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 5.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 15.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(5.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(18f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 15.5f)
                close()
            }
        }.also { _Compress = it}
