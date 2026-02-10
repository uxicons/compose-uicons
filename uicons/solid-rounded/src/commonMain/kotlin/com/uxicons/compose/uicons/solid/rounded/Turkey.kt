package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Turkey: ImageVector? = null

val Icons.Sr.Turkey: ImageVector
    get() = _Turkey ?: UXIcon(name = "Turkey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.41f, 8.81f)
                curveToRelative(1.54f, -1.57f, 5.79f, -3.52f, 7.93f, -2.56f)
                lineToRelative(1.44f, -1.44f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.06f, -0.65f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.65f, 2.06f)
                lineTo(19.75f, 7.67f)
                curveToRelative(0.98f, 2.39f, -1.1f, 6.47f, -2.56f, 7.93f)
                curveTo(12.6f, 19.95f, 6.05f, 13.4f, 10.41f, 8.81f)
                close()
                moveTo(18.61f, 17.01f)
                curveToRelative(-6.83f, 6.36f, -16.1f, -3.67f, -9.21f, -9.98f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                verticalLineToRelative(2.57f)
                curveTo(0.17f, 23.88f, 5.72f, 23.81f, 9f, 24f)
                curveToRelative(9f, 0.15f, 20.25f, -2.31f, 12.42f, -11.78f)
                arcTo(13.06f, 13.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.61f, 17.01f)
                close()
                moveTo(8f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                lineTo(9f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 1f)
                lineTo(7f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                close()
                moveTo(12f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(4f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 3f)
                lineTo(5f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 1f)
                lineTo(3f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                close()
            }
        }.also { _Turkey = it}
