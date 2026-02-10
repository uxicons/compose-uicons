package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Expand: ImageVector? = null

val Icons.Bs.Expand: ImageVector
    get() = _Expand ?: UXIcon(name = "Expand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 21f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.55f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.55f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 2.46f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(5.54f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 24f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.55f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineToRelative(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.46f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.55f, 0f)
                close()
            }
        }.also { _Expand = it}
