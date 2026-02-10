package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Br.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 24f)
            arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, -7f)
            curveToRelative(0f, -1.93f, 1.47f, -4.58f, 4.38f, -7.88f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.24f, 0f)
            curveTo(22.53f, 12.42f, 24f, 15.07f, 24f, 17f)
            arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 24f)
            close()
            moveTo(17f, 10.93f)
            arcToRelative(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, 0.17f)
            curveTo(13.95f, 14.14f, 13f, 16.14f, 13f, 17f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            curveToRelative(0f, -0.86f, -0.95f, -2.86f, -3.63f, -5.9f)
            arcTo(0.48f, 0.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10.93f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 12.48f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.98f)
            curveTo(0f, 6.17f, 0.25f, 4.74f, 2.38f, 1.64f)
            arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.25f, 0f)
            curveTo(10.75f, 4.74f, 11f, 6.17f, 11f, 6.98f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 12.48f)
            close()
            moveTo(5.5f, 3f)
            arcToRelative(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.65f, 0.34f)
            curveTo(3.05f, 5.96f, 3f, 6.89f, 3f, 6.98f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
            curveToRelative(0f, -0.1f, -0.05f, -1.03f, -1.85f, -3.64f)
            arcTo(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 3f)
            close()
        }
    }.also { _Raindrops = it }
