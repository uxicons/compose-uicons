package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsDouble: ImageVector? = null

val Icons.Sr.MarsDouble: ImageVector
    get() = _MarsDouble ?: UXIcon(name = "MarsDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, -4.18f)
                lineToRelative(3.4f, -3.4f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-3.4f, 3.4f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                horizontalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-3.41f, 3.41f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.19f, -0.74f)
                curveToRelative(0f, 0.11f, 0.02f, 0.21f, 0.02f, 0.32f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
                curveToRelative(-0.11f, 0f, -0.21f, -0.01f, -0.32f, -0.02f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 17f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -4.17f)
                lineTo(22f, 9.41f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 6f)
                close()
            }
        }.also { _MarsDouble = it}
