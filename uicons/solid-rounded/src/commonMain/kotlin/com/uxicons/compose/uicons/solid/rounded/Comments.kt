package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Sr.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.7f, 18f)
                horizontalLineTo(3f)
                curveToRelative(-1.49f, 0f, -3f, -1.13f, -3f, -3.67f)
                verticalLineTo(9.29f)
                arcTo(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.35f, 0.02f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.63f, 9.63f)
                arcTo(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.7f, 18f)
                close()
                moveTo(20f, 9.08f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0f, 0.24f, 0f, 0.47f, -0.01f, 0.71f)
                curveTo(19.59f, 15.2f, 14.65f, 19.78f, 9.08f, 19.98f)
                lineToRelative(0f, 0.01f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 24f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.08f)
                close()
            }
        }.also { _Comments = it}
