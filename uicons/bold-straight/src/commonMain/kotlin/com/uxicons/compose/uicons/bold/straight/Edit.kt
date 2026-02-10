package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Bs.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                horizontalLineTo(16f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineTo(3.41f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.41f, 3f)
                horizontalLineTo(15.17f)
                lineToRelative(3f, -3f)
                horizontalLineTo(3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.41f)
                verticalLineTo(24f)
                horizontalLineTo(18.35f)
                lineTo(24f, 18.35f)
                verticalLineTo(5.83f)
                lineToRelative(-3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                horizontalLineTo(8f)
                lineTo(23.4f, 3.6f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(5f, 16f)
                close()
            }
        }.also { _Edit = it}
