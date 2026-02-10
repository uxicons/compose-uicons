package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Key: ImageVector? = null

val Icons.Rr.Key: ImageVector
    get() = _Key ?: UXIcon(name = "Key") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 24f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.47f, 9.28f)
                arcTo(7.37f, 7.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.35f, 9.23f)
                lineToRelative(7.91f, -7.91f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.46f, 0f)
                horizontalLineToRelative(0f)
                arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.54f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, 3.21f)
                lineTo(22f, 7.42f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.59f, 8f)
                lineTo(19f, 8f)
                lineTo(19f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(16f, 11f)
                verticalLineToRelative(1.59f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.41f, 14f)
                lineToRelative(-0.65f, 0.65f)
                arcToRelative(7.33f, 7.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.05f, 3.88f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.43f, 5.43f)
                arcTo(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 24f)
                close()
                moveTo(7.5f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.29f, 6.99f)
                arcToRelative(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, -3.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.24f, -1.03f)
                lineTo(14f, 12.59f)
                lineTo(14f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1f)
                lineTo(17f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(1.59f)
                lineToRelative(0.67f, -0.67f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 3.54f)
                arcTo(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.46f, 2f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, 0.74f)
                lineToRelative(-8.33f, 8.33f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.04f, 0.24f)
                arcTo(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 11f)
                close()
                moveTo(5f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18f)
                close()
            }
        }.also { _Key = it}
