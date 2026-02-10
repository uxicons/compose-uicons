package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Sr.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7f)
                lineTo(15f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(17f, 5.61f)
                curveTo(17.63f, 4.98f, 21.7f, 0.89f, 22.29f, 0.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                curveTo(23.11f, 2.3f, 19.06f, 6.37f, 18.44f, 7f)
                lineTo(21f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(17f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7f)
                close()
                moveTo(20.66f, 14.86f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                arcTo(12.78f, 12.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, 9.52f)
                lineToRelative(1.6f, -1.9f)
                arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -4.28f)
                reflectiveCurveTo(7.29f, 0.94f, 7.26f, 0.91f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.93f, 0.86f)
                lineToRelative(-1.15f, 1f)
                curveToRelative(-7.72f, 8.21f, 12.2f, 28.14f, 20.4f, 20.3f)
                lineToRelative(0.91f, -1.05f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.38f)
                curveTo(23.06f, 16.71f, 20.66f, 14.86f, 20.66f, 14.86f)
                close()
            }
        }.also { _CallIncoming = it}
