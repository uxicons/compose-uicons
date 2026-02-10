package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudSunRain: ImageVector? = null

val Icons.Bs.CloudSunRain: ImageVector
    get() = _CloudSunRain ?: UXIcon(name = "CloudSunRain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17.53f)
                arcToRelative(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 4.72f)
                lineTo(21f, 17.53f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                lineTo(17.12f, 15.28f)
                lineToRelative(-0.17f, -1.31f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14.28f)
                verticalLineToRelative(2.5f)
                lineTo(10.5f, 16.78f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                lineTo(9f, 22.5f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, -8.47f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.63f, 12.35f)
                arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17.53f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(3f)
                lineTo(14f, 19f)
                lineTo(11f, 19f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(3f)
                lineTo(19f, 19f)
                lineTo(16f, 19f)
                close()
                moveTo(8.17f, 10.96f)
                lineTo(7.8f, 10.89f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3.06f, -3.17f)
                arcToRelative(7.48f, 7.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.87f, -0.9f)
                arcToRelative(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -1f)
                lineTo(15.57f, 3.55f)
                lineTo(13.45f, 1.43f)
                lineTo(11.18f, 3.7f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 3.21f)
                lineTo(10f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 3.21f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.82f, 3.7f)
                lineTo(3.55f, 1.43f)
                lineTo(1.43f, 3.55f)
                lineTo(3.7f, 5.82f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.21f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(3f)
                lineTo(3.21f, 10f)
                arcTo(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.7f, 11.18f)
                lineTo(1.43f, 13.45f)
                lineTo(3.55f, 15.57f)
                close()
            }
        }.also { _CloudSunRain = it}
