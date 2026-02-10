package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomOut: ImageVector? = null

val Icons.Sr.ZoomOut: ImageVector
    get() = _ZoomOut ?: UXIcon(name = "ZoomOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-5.97f, -5.96f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(5.97f, 5.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
                moveTo(13f, 11f)
                horizontalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ZoomOut = it}
