package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallHistory: ImageVector? = null

val Icons.Sr.CallHistory: ImageVector
    get() = _CallHistory ?: UXIcon(name = "CallHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.66f, 14.86f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.01f)
                lineToRelative(-1.91f, 1.61f)
                arcTo(12.79f, 12.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.54f, 9.53f)
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
                moveTo(22.57f, 12.57f)
                curveToRelative(4.99f, -7.35f, -3.8f, -16.12f, -11.14f, -11.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.15f, 1.64f)
                curveToRelative(5.47f, -3.76f, 12.11f, 2.88f, 8.35f, 8.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.64f, 1.14f)
                close()
                moveTo(18.71f, 10.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineTo(17f, 7.59f)
                lineTo(17f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(15f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                close()
            }
        }.also { _CallHistory = it}
