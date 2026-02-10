package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Broccoli: ImageVector? = null

val Icons.Sr.Broccoli: ImageVector
    get() = _Broccoli ?: UXIcon(name = "Broccoli") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                curveToRelative(-0.24f, 6.38f, -8.06f, 5.64f, -8f, -0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                curveToRelative(-0.84f, 0.01f, -1.08f, 0.79f, -1f, 1.5f)
                arcToRelative(6.54f, 6.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.33f, 4.9f)
                arcToRelative(5.62f, 5.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.82f, -0.48f)
                curveTo(6.11f, 17.63f, -0.36f, 15.01f, 0f, 10f)
                curveTo(0f, 7.42f, 2f, 5f, 4.48f, 5f)
                curveTo(7f, 5f, 9f, 7.41f, 9f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.7f, 3.22f)
                curveToRelative(1.98f, -4.1f, 8.32f, -4.29f, 10.5f, -0.21f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, 3.19f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.5f)
                close()
                moveTo(14f, 18f)
                arcToRelative(9.12f, 9.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -0.06f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineTo(17.45f)
                curveToRelative(-0.2f, -0.08f, -0.39f, -0.15f, -0.58f, -0.24f)
                arcToRelative(8.7f, 8.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.2f, 0.78f)
                curveToRelative(0.73f, 2.16f, 0.16f, 5.93f, 3.62f, 6.01f)
                horizontalLineToRelative(2.32f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, -2.73f)
                arcToRelative(19.37f, 19.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -3.94f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                close()
            }
        }.also { _Broccoli = it}
