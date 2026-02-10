package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tire: ImageVector? = null

val Icons.Sr.Tire: ImageVector
    get() = _Tire ?: UXIcon(name = "Tire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 13f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.84f, 0.1f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, -1.59f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, -0.36f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.64f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 0.87f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 1.59f)
                arcTo(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                close()
                moveTo(18.03f, 8.46f)
                lineTo(15.19f, 9.65f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 8.16f)
                lineTo(13f, 5.08f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.03f, 8.46f)
                close()
                moveTo(11f, 5.08f)
                lineTo(11f, 8.16f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 9.65f)
                lineTo(5.96f, 8.48f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5.08f)
                close()
                moveTo(5.21f, 10.34f)
                lineToRelative(2.63f, 1.07f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, 3.24f)
                lineTo(7.01f, 16.9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.21f, 10.34f)
                close()
                moveTo(8.61f, 18.12f)
                lineTo(10.4f, 15.8f)
                arcToRelative(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.21f, 0.01f)
                lineToRelative(1.78f, 2.31f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.61f, 18.12f)
                close()
                moveTo(16.98f, 16.91f)
                lineTo(15.25f, 14.66f)
                arcToRelative(2.13f, 2.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, -3.26f)
                lineToRelative(2.61f, -1.09f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.98f, 16.91f)
                close()
            }
        }.also { _Tire = it}
