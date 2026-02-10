package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolCrop: ImageVector? = null

val Icons.Bs.ToolCrop: ImageVector
    get() = _ToolCrop ?: UXIcon(name = "ToolCrop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 20f)
                horizontalLineTo(17f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(20f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.also { _ToolCrop = it}
