package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShare: ImageVector? = null

val Icons.Br.CloudShare: ImageVector
    get() = _CloudShare ?: UXIcon(name = "CloudShare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0.01f)
            lineToRelative(-2.5f, -1.43f)
            arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0.42f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
            arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0.42f)
            lineToRelative(2.5f, -1.43f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3.01f)
            arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -0.42f)
            lineToRelative(-2.48f, 1.42f)
            lineToRelative(2.48f, 1.42f)
            arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -0.42f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            close()
            moveTo(9.31f, 3.06f)
            arcToRelative(5.2f, 5.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.91f, 0.99f)
            arcToRelative(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 3.42f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 1.29f)
            arcToRelative(5.19f, 5.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0.24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, -2.84f)
            quadToRelative(-0.25f, -0.09f, -0.52f, -0.16f)
            arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.09f, -5.91f)
            arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.74f, 6.5f)
            arcToRelative(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 4.83f)
            arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 6.3f)
            arcToRelative(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.78f, 4.29f)
            horizontalLineToRelative(2.53f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-2.53f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.88f, -2.04f)
            arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, -3.16f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.01f, -3.35f)
            arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, -3.3f)
            arcToRelative(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.21f, -4.09f)
            close()
        }
    }.also { _CloudShare = it }
