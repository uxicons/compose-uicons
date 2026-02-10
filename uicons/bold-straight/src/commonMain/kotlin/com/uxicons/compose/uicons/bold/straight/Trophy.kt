package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Bs.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.7f, -3.77f)
                arcToRelative(15.08f, 15.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, -2.15f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.59f, 0f)
                lineTo(5.41f, 0f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, 4.08f)
                arcTo(15.08f, 15.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 6.23f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                curveToRelative(0f, 3.15f, 2.38f, 6.8f, 9f, 6.98f)
                verticalLineToRelative(2.65f)
                arcTo(1.22f, 1.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.67f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(3f)
                lineTo(18f, 24f)
                lineTo(18f, 21f)
                lineTo(16.33f, 21f)
                arcTo(1.23f, 1.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 19.64f)
                lineTo(15f, 16.98f)
                curveTo(21.62f, 16.8f, 24f, 13.15f, 24f, 10f)
                close()
                moveTo(21f, 10f)
                curveToRelative(0f, 1.7f, -1.33f, 3.51f, -4.93f, 3.91f)
                curveToRelative(0.04f, -0.04f, 0.08f, -0.09f, 0.13f, -0.13f)
                arcToRelative(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, -4.78f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                close()
                moveTo(5.09f, 3.15f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.41f, 3f)
                lineTo(18.59f, 3f)
                arcToRelative(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.15f)
                arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 0.33f)
                arcToRelative(15.7f, 15.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.68f, 7.97f)
                arcTo(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16.5f)
                arcToRelative(6.42f, 6.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -5.05f)
                arcTo(15.7f, 15.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.01f, 3.48f)
                arcTo(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 3.15f)
                close()
                moveTo(3f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.97f, -0.99f)
                arcTo(16.36f, 16.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.8f, 13.78f)
                curveToRelative(0.05f, 0.04f, 0.08f, 0.09f, 0.13f, 0.13f)
                curveTo(4.33f, 13.51f, 3f, 11.7f, 3f, 10f)
                close()
            }
        }.also { _Trophy = it}
