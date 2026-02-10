package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Summer: ImageVector? = null

val Icons.Sr.Summer: ImageVector
    get() = _Summer ?: UXIcon(name = "Summer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                curveToRelative(-6.08f, 0.12f, -9.34f, -7.64f, -5f, -11.89f)
                lineTo(12f, 5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                verticalLineToRelative(7.11f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17f)
                close()
                moveTo(20f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.83f)
                lineTo(18f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(6.17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 17f)
                close()
                moveTo(10f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 1f)
                lineTo(8f, 3.08f)
                arcToRelative(5.88f, 5.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.08f, 0.29f)
                lineTo(5.87f, 1.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.74f, 0.98f)
                lineTo(5.18f, 4.37f)
                arcToRelative(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, 0.84f)
                lineTo(2.5f, 4.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.5f, 5.86f)
                lineTo(3.36f, 6.95f)
                arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.08f, 8f)
                lineTo(1f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(3.08f, 10f)
                arcToRelative(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.08f)
                lineTo(1.51f, 12.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.98f, 1.74f)
                lineToRelative(1.89f, -1.06f)
                arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.84f, 0.83f)
                lineTo(4.14f, 15.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.86f, 16.5f)
                lineTo(6.95f, 14.64f)
                lineTo(7f, 14.66f)
                curveToRelative(1.41f, 0.66f, 1.81f, -1.65f, 2.48f, -2.6f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.28f)
                close()
            }
        }.also { _Summer = it}
