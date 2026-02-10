package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Sr.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18f)
                curveToRelative(-7.93f, -0.25f, -7.93f, -11.75f, 0f, -12f)
                curveTo(25.93f, 6.25f, 25.93f, 17.75f, 18f, 18f)
                close()
                moveTo(10f, 12f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.44f, -5.75f)
                arcTo(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4.86f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 5.07f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 0.43f)
                lineTo(7.36f, 1.99f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.63f, 2.99f)
                lineTo(7.67f, 6.5f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.52f, 7.65f)
                lineTo(3f, 5.6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.33f)
                lineTo(5.51f, 9.37f)
                arcTo(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.07f, 11f)
                lineTo(1f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(5.07f, 13f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 1.62f)
                lineTo(2f, 16.66f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.01f, 18.39f)
                lineToRelative(3.51f, -2.04f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 1.13f)
                lineTo(5.6f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.33f, 22.01f)
                lineTo(9.38f, 18.49f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.93f)
                lineTo(11f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(13f, 19.14f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.56f, -1.38f)
                arcTo(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                close()
            }
        }.also { _Eclipse = it}
