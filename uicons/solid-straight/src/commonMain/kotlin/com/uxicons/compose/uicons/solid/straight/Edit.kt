package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Edit: ImageVector? = null

val Icons.Ss.Edit: ImageVector
    get() = _Edit ?: UXIcon(name = "Edit") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.83f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(14.17f)
                lineToRelative(0.59f, -0.59f)
                lineTo(18.17f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineToRelative(7f)
                verticalLineTo(5.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.41f)
                lineToRelative(4.41f, -4.41f)
                lineToRelative(-4.41f, 0f)
                lineToRelative(0f, 4.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                horizontalLineTo(9f)
                lineTo(23.38f, 3.62f)
                arcToRelative(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(6f, 15f)
                close()
            }
        }.also { _Edit = it}
