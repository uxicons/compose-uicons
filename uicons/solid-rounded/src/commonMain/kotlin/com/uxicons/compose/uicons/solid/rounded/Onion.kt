package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onion: ImageVector? = null

val Icons.Sr.Onion: ImageVector
    get() = _Onion ?: UXIcon(name = "Onion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.65f)
                arcTo(13.45f, 13.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                curveToRelative(0f, 2.09f, -0.76f, 5f, -2f, 5f)
                reflectiveCurveToRelative(-2f, -2.91f, -2f, -5f)
                arcTo(13.45f, 13.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.65f)
                close()
                moveTo(15f, 3.15f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
                horizontalLineToRelative(-1f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3.14f)
                curveToRelative(-2.29f, 3.5f, -7.44f, 13.1f, -0.29f, 15.95f)
                curveTo(6.45f, 13.26f, 10f, 6.22f, 11.29f, 5.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                curveToRelative(1.31f, 0.94f, 4.83f, 7.99f, 2.58f, 13.8f)
                curveTo(22.44f, 16.24f, 17.29f, 6.64f, 15f, 3.15f)
                close()
                moveTo(14.61f, 21.52f)
                horizontalLineToRelative(0f)
                lineToRelative(0.94f, 0.65f)
                arcTo(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 24f)
                curveToRelative(-0.45f, 0.07f, -1.63f, -0.94f, -2f, -1.13f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                curveToRelative(-0.38f, 0.2f, -1.55f, 1.19f, -2f, 1.13f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, -1.83f)
                lineToRelative(1.03f, -0.62f)
                horizontalLineToRelative(0f)
                curveTo(-2.71f, 20.88f, -2.41f, 7.45f, 6.09f, 4.06f)
                curveTo(4.65f, 6.65f, 3f, 10.4f, 3f, 14f)
                curveToRelative(0f, 5.7f, 6.35f, 8f, 9f, 8f)
                reflectiveCurveToRelative(9f, -2.3f, 9f, -8f)
                curveToRelative(0f, -3.6f, -1.65f, -7.34f, -3.09f, -9.93f)
                curveTo(26.43f, 7.44f, 26.65f, 20.88f, 14.61f, 21.52f)
                close()
            }
        }.also { _Onion = it}
