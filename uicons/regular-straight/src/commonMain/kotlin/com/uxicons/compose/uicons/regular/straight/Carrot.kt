package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Carrot: ImageVector? = null

val Icons.Rs.Carrot: ImageVector
    get() = _Carrot ?: UXIcon(name = "Carrot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                lineTo(20.41f, 5f)
                lineToRelative(3.29f, -3.29f)
                lineTo(22.29f, 0.29f)
                lineTo(19f, 3.59f)
                lineTo(19f, 0f)
                lineTo(17f, 0f)
                lineTo(17f, 5.46f)
                arcTo(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.15f, 3.33f)
                arcTo(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.72f, 4.38f)
                curveTo(7.31f, 6.79f, 1.71f, 20.1f, 1.08f, 21.61f)
                lineTo(0.14f, 23.86f)
                lineToRelative(2.25f, -0.94f)
                curveToRelative(1.51f, -0.63f, 14.82f, -6.23f, 17.24f, -8.65f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, -4.42f)
                arcTo(10.17f, 10.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, 7f)
                lineTo(24f, 7f)
                close()
                moveTo(18.21f, 12.86f)
                arcToRelative(12.59f, 12.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.36f, 1.57f)
                lineToRelative(-2.39f, -2.39f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(14f, 15.42f)
                curveToRelative(-2.92f, 1.5f, -6.78f, 3.26f, -10.11f, 4.7f)
                curveToRelative(0.84f, -1.94f, 1.79f, -4.07f, 2.73f, -6.08f)
                lineTo(8.61f, 16.02f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(0.9f, -1.86f, 1.76f, -3.52f, 2.47f, -4.7f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.41f, -1.41f)
                lineTo(11.17f, 5.76f)
                curveToRelative(0.85f, -0.79f, 1.37f, -0.92f, 2.18f, -0.59f)
                arcToRelative(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.01f, 2.47f)
                arcToRelative(11.63f, 11.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.47f, 3.01f)
                curveTo(19.08f, 11.22f, 19.18f, 11.89f, 18.21f, 12.86f)
                close()
            }
        }.also { _Carrot = it}
