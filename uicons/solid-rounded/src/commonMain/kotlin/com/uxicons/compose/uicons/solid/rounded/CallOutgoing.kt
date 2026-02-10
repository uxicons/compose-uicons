package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallOutgoing: ImageVector? = null

val Icons.Sr.CallOutgoing: ImageVector
    get() = _CallOutgoing ?: UXIcon(name = "CallOutgoing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(3.44f)
                lineTo(16.7f, 8.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.3f, 7.29f)
                lineTo(20.61f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2f)
                close()
                moveTo(20.66f, 14.86f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                arcTo(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, 9.52f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -4.28f)
                reflectiveCurveTo(7.29f, 0.94f, 7.26f, 0.91f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.93f, 0.86f)
                lineToRelative(-1.15f, 1f)
                curveToRelative(-7.72f, 8.21f, 12.2f, 28.14f, 20.4f, 20.3f)
                lineToRelative(0.91f, -1.05f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.38f)
                curveTo(23.06f, 16.71f, 20.66f, 14.86f, 20.66f, 14.86f)
                close()
            }
        }.also { _CallOutgoing = it}
