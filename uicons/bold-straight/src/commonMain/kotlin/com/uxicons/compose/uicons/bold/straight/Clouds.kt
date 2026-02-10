package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clouds: ImageVector? = null

val Icons.Bs.Clouds: ImageVector
    get() = _Clouds ?: UXIcon(name = "Clouds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.75f, 24f)
                horizontalLineTo(10.5f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -8.74f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.63f, 13.57f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.75f, 24f)
                close()
                moveTo(10.5f, 18f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                horizontalLineToRelative(8.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.5f)
                horizontalLineTo(17.12f)
                lineToRelative(-0.17f, -1.31f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.86f, 0.93f)
                lineTo(12.59f, 18f)
                close()
                moveTo(17.83f, 5.56f)
                lineToRelative(-0.02f, 0.01f)
                arcTo(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.88f, 0.09f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 11.47f)
                arcTo(5.78f, 5.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.46f, 21.89f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -3.41f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 17.05f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -3.45f)
                lineToRelative(2.15f, -0.56f)
                lineTo(5.93f, 11.26f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.29f, -3.77f)
                lineToRelative(0.07f, 0.56f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.75f, 3.81f)
                arcTo(7.22f, 7.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.75f)
                curveTo(24f, 9f, 19.93f, 6.27f, 17.83f, 5.56f)
                close()
            }
        }.also { _Clouds = it}
