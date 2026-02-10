package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Rr.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                lineTo(1f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(23f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(18.93f, 7.13f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.65f, 4.39f)
                lineTo(9.67f, 0.43f)
                arcTo(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 0.43f)
                arcTo(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2.91f)
                lineTo(5f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                horizontalLineToRelative(8.32f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.93f, 7.13f)
                close()
                moveTo(8.74f, 2.2f)
                lineTo(16.75f, 6.18f)
                arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.24f, 0.48f)
                curveToRelative(-0.07f, 0.31f, -0.49f, 0.34f, -0.67f, 0.34f)
                lineTo(8f, 7.0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                lineTo(7f, 2.91f)
                arcToRelative(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.42f, -0.76f)
                arcTo(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.01f, 2f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.74f, 2.2f)
                close()
                moveTo(9.63f, 23.59f)
                lineTo(17.66f, 19.6f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, -2.73f)
                arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.32f, 15f)
                lineTo(8f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3.08f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 2.48f)
                arcTo(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.03f, 24f)
                arcTo(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.63f, 23.59f)
                close()
                moveTo(16.32f, 17f)
                curveToRelative(0.18f, 0f, 0.6f, 0.03f, 0.67f, 0.34f)
                arcToRelative(0.42f, 0.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.23f, 0.47f)
                lineTo(8.7f, 21.82f)
                arcToRelative(1.31f, 1.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.28f, 0.02f)
                arcTo(0.82f, 0.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21.08f)
                lineTo(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                close()
            }
        }.also { _Reflect = it}
