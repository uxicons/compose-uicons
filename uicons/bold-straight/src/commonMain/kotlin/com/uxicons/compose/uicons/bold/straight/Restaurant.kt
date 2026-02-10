package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Bs.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.02f, 14.03f)
                arcTo(17.62f, 17.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                lineTo(0f, 2.65f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 0.19f)
                arcTo(2.71f, 2.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.62f, 0.86f)
                lineTo(7.74f, 4.24f)
                lineTo(6.58f, 5.4f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.84f, 1.11f)
                lineTo(3.04f, 3.57f)
                arcTo(15.32f, 15.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.99f, 9.08f)
                curveToRelative(0f, -0.02f, 0f, -0.03f, 0f, 0f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, 3.7f)
                close()
                moveTo(19.27f, 16.75f)
                lineToRelative(-0.67f, 0.67f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.77f, 18.6f)
                lineToRelative(5f, 5.3f)
                lineToRelative(2.21f, -2.03f)
                close()
                moveTo(23.91f, 9.28f)
                lineTo(21.79f, 7.16f)
                lineTo(15.07f, 13.88f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineTo(13.3f, 12.82f)
                lineToRelative(7.07f, -7.07f)
                lineTo(18.25f, 3.63f)
                lineTo(11.18f, 10.7f)
                lineTo(10.12f, 9.64f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -0.71f)
                lineToRelative(6.72f, -6.72f)
                lineTo(14.72f, 0.09f)
                lineTo(8f, 6.81f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineTo(9.06f, 12.82f)
                lineToRelative(-9f, 8.99f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(8.99f, -9f)
                lineTo(12.24f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                close()
            }
        }.also { _Restaurant = it}
