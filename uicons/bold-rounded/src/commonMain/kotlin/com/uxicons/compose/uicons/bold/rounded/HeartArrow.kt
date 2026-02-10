package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Br.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.29f, 17.71f)
            lineToRelative(-1.23f, 1.23f)
            lineToRelative(-2.31f, -2.31f)
            curveTo(20.85f, 14.2f, 22f, 11.88f, 22f, 9.9f)
            arcTo(5.72f, 5.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 4f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 1.85f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 4f)
            arcToRelative(5.15f, 5.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.98f, 0.4f)
            lineTo(2.56f, 0.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 2.56f)
            lineTo(4.16f, 6.28f)
            arcTo(6.14f, 6.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.9f)
            curveToRelative(0f, 2.88f, 2.37f, 6.46f, 6.68f, 10.07f)
            arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.65f, 0f)
            curveToRelative(0.47f, -0.4f, 0.91f, -0.79f, 1.34f, -1.19f)
            lineToRelative(2.28f, 2.28f)
            lineToRelative(-1.23f, 1.23f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.42f, 24f)
            lineTo(23f, 23.99f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
            lineTo(24f, 18.42f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.29f, 17.71f)
            close()
            moveTo(13.39f, 17.67f)
            arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, 0f)
            curveTo(7.47f, 14.21f, 6f, 11.39f, 6f, 9.9f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 7f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 9.9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 7f)
            arcTo(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.9f)
            curveTo(19f, 11.39f, 17.53f, 14.21f, 13.4f, 17.67f)
            close()
        }
    }.also { _HeartArrow = it }
