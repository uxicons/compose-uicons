package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolCrop: ImageVector? = null

val Icons.Ss.ToolCrop: ImageVector
    get() = _ToolCrop ?: UXIcon(name = "ToolCrop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(18f)
                close()
            }
        }.also { _ToolCrop = it}
