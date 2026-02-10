package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bowling: ImageVector? = null

val Icons.Rr.Bowling: ImageVector
    get() = _Bowling ?: UXIcon(name = "Bowling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                close()
                moveTo(19f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                close()
                moveTo(17f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                close()
                moveTo(24f, 16f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.19f, 6.07f)
                arcTo(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.39f, 24f)
                lineTo(4.61f, 24f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.99f, 21.7f)
                arcTo(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 17f)
                arcToRelative(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, -5.46f)
                arcTo(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8f)
                arcToRelative(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.55f, -2.17f)
                arcTo(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.82f)
                arcTo(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                arcToRelative(6.7f, 6.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.91f, 2.84f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(4f, 4f)
                curveToRelative(0.02f, 0.15f, 0.21f, 0.77f, 0.35f, 1.23f)
                arcTo(10.71f, 10.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                lineTo(7f, 8f)
                arcToRelative(10.71f, 10.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.65f, -2.77f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                close()
                moveTo(9.2f, 20.86f)
                arcTo(9.08f, 9.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17f)
                arcToRelative(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.51f, -4.54f)
                arcTo(18.39f, 18.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, 10f)
                lineTo(4.63f, 10f)
                arcToRelative(18.39f, 18.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.12f, 2.46f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 17f)
                arcToRelative(9.09f, 9.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 3.86f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.61f, 22f)
                lineTo(7.39f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 20.86f)
                close()
                moveTo(22f, 16f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.08f, -3.16f)
                arcTo(9.66f, 9.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcToRelative(11.65f, 11.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, 3.06f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                close()
            }
        }.also { _Bowling = it}
