package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoon: ImageVector? = null

val Icons.Sr.CloudMoon: ImageVector
    get() = _CloudMoon ?: UXIcon(name = "CloudMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.89f, 24.02f)
                curveToRelative(-1.96f, 0f, -3.84f, -0.01f, -4.49f, -0.03f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, -0.12f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -6.59f)
                arcToRelative(6.38f, 6.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -2.73f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.54f, 13.7f)
                curveToRelative(0.14f, 0.33f, 0.76f, 0.47f, 0.76f, 0.47f)
                curveToRelative(4.93f, 1.28f, 4.86f, 8.57f, -0.14f, 9.7f)
                arcTo(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.1f, 24f)
                curveTo(18.23f, 24.02f, 16.01f, 24.02f, 13.89f, 24.02f)
                close()
                moveTo(6f, 16.26f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, -2.17f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.02f, 8.6f)
                arcToRelative(7.7f, 7.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.49f, -4.55f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -2.15f)
                arcToRelative(2.22f, 2.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                arcTo(10.76f, 10.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.36f, 0.13f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.3f, 8.76f)
                arcTo(9.91f, 9.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.86f, 17.79f)
                curveToRelative(0.06f, 0.05f, 0.33f, 0.22f, 0.65f, 0.42f)
                arcTo(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.26f)
                close()
            }
        }.also { _CloudMoon = it}
