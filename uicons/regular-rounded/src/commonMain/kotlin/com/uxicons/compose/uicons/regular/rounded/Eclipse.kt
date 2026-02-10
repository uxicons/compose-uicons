package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Rr.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(11f, 18.92f)
                arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.62f, -0.43f)
                lineTo(7.33f, 22.01f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 21f)
                lineToRelative(2.05f, -3.52f)
                arcToRelative(7.09f, 7.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, -1.13f)
                lineTo(3.01f, 18.39f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16.66f)
                lineToRelative(3.51f, -2.04f)
                arcTo(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.07f, 13f)
                lineTo(1f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(5.07f, 11f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.45f, -1.63f)
                lineTo(2f, 7.33f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5.6f)
                lineTo(6.53f, 7.65f)
                arcTo(7.14f, 7.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.67f, 6.51f)
                lineTo(5.63f, 2.99f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.36f, 1.99f)
                lineTo(9.4f, 5.5f)
                arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, -0.43f)
                lineTo(11f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(13f, 5.08f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.29f, 7.05f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                curveToRelative(0f, 3.54f, 3.73f, 4.87f, 4.29f, 4.95f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.92f)
                lineTo(13f, 23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(18f, 18f)
                curveToRelative(-7.93f, -0.25f, -7.93f, -11.75f, 0f, -12f)
                curveTo(25.93f, 6.25f, 25.93f, 17.75f, 18f, 18f)
                close()
                moveTo(18f, 8f)
                curveToRelative(-5.28f, 0.14f, -5.27f, 7.86f, 0f, 8f)
                curveTo(23.27f, 15.86f, 23.27f, 8.14f, 18f, 8f)
                close()
            }
        }.also { _Eclipse = it}
