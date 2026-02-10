package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartConnected: ImageVector? = null

val Icons.Sr.ChartConnected: ImageVector
    get() = _ChartConnected ?: UXIcon(name = "ChartConnected") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.98f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -3.73f)
                lineToRelative(-0.04f, -0.09f)
                arcToRelative(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.29f, -5.42f)
                lineToRelative(-0.33f, -0.14f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.46f, 0f)
                lineToRelative(-0.42f, 0.19f)
                arcTo(10.19f, 10.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, 8.24f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.03f, 7.47f)
                lineToRelative(0.13f, 0.3f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.16f, 5.23f)
                lineToRelative(0.39f, 0.18f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.46f, 0f)
                lineToRelative(0.37f, -0.16f)
                arcToRelative(10.19f, 10.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.31f, -5.53f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.98f)
                close()
                moveTo(15.89f, 19.11f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.79f, 0f)
                arcTo(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, 15.88f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, 8.1f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.21f, -3.2f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.79f, 0f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.1f, 8.09f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, 7.79f)
                arcTo(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.89f, 19.11f)
                close()
            }
        }.also { _ChartConnected = it}
