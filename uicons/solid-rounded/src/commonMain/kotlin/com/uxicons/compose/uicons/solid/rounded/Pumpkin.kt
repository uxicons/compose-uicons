package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pumpkin: ImageVector? = null

val Icons.Sr.Pumpkin: ImageVector
    get() = _Pumpkin ?: UXIcon(name = "Pumpkin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.54f, 23.97f)
                curveTo(-2.13f, 23.04f, -2.14f, 7f, 6.51f, 6.03f)
                curveTo(2.03f, 10.6f, 1.8f, 19.84f, 6.54f, 23.97f)
                close()
                moveTo(9.15f, 6.34f)
                arcTo(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                curveToRelative(0f, 4.57f, 2.88f, 8.8f, 4.31f, 8.98f)
                arcTo(26.32f, 26.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                curveTo(8f, 11.02f, 8.38f, 8.15f, 9.15f, 6.34f)
                close()
                moveTo(17.49f, 6.03f)
                curveToRelative(4.48f, 4.57f, 4.71f, 13.81f, -0.03f, 17.94f)
                curveTo(26.13f, 23.04f, 26.14f, 7f, 17.49f, 6.03f)
                close()
                moveTo(14.85f, 6.34f)
                curveTo(15.62f, 8.15f, 16f, 11.02f, 16f, 15f)
                arcToRelative(26.32f, 26.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.31f, 8.98f)
                curveTo(16.12f, 23.8f, 19f, 19.57f, 19f, 15f)
                arcTo(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.85f, 6.34f)
                close()
                moveTo(16f, 0f)
                arcToRelative(4.77f, 4.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.99f, 2.56f)
                curveToRelative(-0.58f, -1.05f, -2.8f, -3.66f, -3.9f, -2.01f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.55f, 1.9f)
                curveTo(10.2f, 2.72f, 11f, 4.41f, 11f, 7.02f)
                curveTo(9.59f, 9.21f, 9.53f, 24.21f, 12f, 24f)
                curveToRelative(2.48f, 0.2f, 2.4f, -14.82f, 1f, -17f)
                curveToRelative(-0.03f, -5.35f, 3.92f, -5.89f, 4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                curveTo(20.47f, 4.68f, 18.93f, -0.18f, 16f, 0f)
                close()
            }
        }.also { _Pumpkin = it}
