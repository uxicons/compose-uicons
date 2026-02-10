package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Sr.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24f)
                arcToRelative(4.24f, 4.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.94f, -2.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.89f, -0.67f)
                curveTo(9.72f, 22.65f, 12.99f, 22.34f, 13f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(1f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(11f, 16f)
                curveTo(16.28f, 16.14f, 16.27f, 23.86f, 11f, 24f)
                close()
                moveTo(20f, 19f)
                arcToRelative(4.24f, 4.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.94f, -2.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.89f, -0.67f)
                curveTo(18.72f, 17.65f, 21.99f, 17.34f, 22f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(15f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(5f)
                curveTo(25.28f, 11.14f, 25.27f, 18.86f, 20f, 19f)
                close()
                moveTo(20f, 9f)
                lineTo(17f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                curveToRelative(-0.01f, -2.34f, -3.28f, -2.65f, -4.06f, -0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.89f, -0.67f)
                curveTo(17.62f, -0.41f, 23.95f, 0.42f, 24f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                close()
                moveTo(7f, 0f)
                curveTo(-2.25f, 0.29f, -2.25f, 13.71f, 7f, 14f)
                curveTo(16.25f, 13.71f, 16.25f, 0.29f, 7f, 0f)
                close()
                moveTo(7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 11f)
                close()
                moveTo(8f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                lineTo(6f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
                close()
            }
        }.also { _WindWarning = it}
