package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudRain: ImageVector? = null

val Icons.Ss.CloudRain: ImageVector
    get() = _CloudRain ?: UXIcon(name = "CloudRain") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 24f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.73f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineTo(15.5f, 18f)
                lineToRelative(1.76f, 1.72f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 3.54f)
                horizontalLineToRelative(0f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 24f)
                close()
                moveTo(8.5f, 24f)
                arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.73f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.54f)
                lineTo(8.5f, 18f)
                lineToRelative(1.76f, 1.72f)
                arcTo(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 24f)
                close()
                moveTo(17.44f, 5.06f)
                curveTo(13.53f, -4.12f, -0.04f, 0.31f, 2.27f, 10.05f)
                curveToRelative(-3.41f, 2.27f, -2.75f, 7.97f, 0.98f, 9.46f)
                arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, 0.31f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, -1.5f)
                lineTo(8.5f, 15.21f)
                lineTo(11.66f, 18.3f)
                arcToRelative(4.71f, 4.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.34f, 0.41f)
                arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, -0.39f)
                lineTo(15.5f, 15.21f)
                lineTo(18.66f, 18.3f)
                arcToRelative(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 1.01f)
                arcToRelative(11.46f, 11.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, -0.47f)
                curveTo(26.39f, 15.21f, 24.39f, 5.86f, 17.44f, 5.06f)
                close()
                moveTo(14.12f, 13.12f)
                horizontalLineToRelative(0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.88f, 8.88f)
                lineTo(12f, 6.8f)
                lineToRelative(2.11f, 2.07f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.12f, 13.12f)
                close()
            }
        }.also { _CloudRain = it}
