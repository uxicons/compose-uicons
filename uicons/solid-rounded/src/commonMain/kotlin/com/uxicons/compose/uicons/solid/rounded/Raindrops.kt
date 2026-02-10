package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Sr.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                curveToRelative(0f, -1.56f, 1.2f, -4.04f, 3.55f, -7.39f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 0f)
                curveTo(17.8f, 13.96f, 19f, 16.44f, 19f, 18f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                curveToRelative(0f, -1.26f, 0.84f, -2.85f, 2.57f, -4.88f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.85f, 0f)
                curveTo(9.16f, 3.14f, 10f, 4.74f, 10f, 6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 9.96f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, -4.5f)
                curveToRelative(0f, -1.09f, 0.7f, -2.51f, 2.15f, -4.33f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.71f, 0f)
                curveTo(23.3f, 2.96f, 24f, 4.37f, 24f, 5.46f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 9.96f)
                close()
            }
        }.also { _Raindrops = it}
