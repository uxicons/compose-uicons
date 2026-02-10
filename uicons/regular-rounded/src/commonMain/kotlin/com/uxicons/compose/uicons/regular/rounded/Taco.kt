package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taco: ImageVector? = null

val Icons.Rr.Taco: ImageVector
    get() = _Taco ?: UXIcon(name = "Taco") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                close()
                moveTo(15f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17f)
                close()
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                close()
                moveTo(22.99f, 10.27f)
                curveToRelative(1.26f, 2.14f, 1f, 5.34f, 1.01f, 7.73f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(3.5f, 23f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19.5f)
                curveToRelative(0.03f, -3.51f, -0.52f, -8.3f, 2.06f, -11.12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.63f, 9.62f)
                arcTo(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14.27f)
                lineTo(2f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
                curveToRelative(0.05f, -2.67f, -0.36f, -6.81f, 1.04f, -9.17f)
                curveTo(4.65f, 7.91f, 4.18f, 3.9f, 8.26f, 3.06f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, -1.95f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.92f, -0.01f)
                arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.77f, 1.96f)
                curveTo(24.76f, 3.89f, 24.39f, 7.8f, 22.99f, 10.27f)
                close()
                moveTo(7.36f, 8.35f)
                arcToRelative(9.46f, 9.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.32f, -0.08f)
                curveTo(22.35f, 6.66f, 21.98f, 5.07f, 20f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.98f, -0.8f)
                arcTo(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.69f, 3f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.58f, 0.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, -0.32f)
                curveToRelative(-0.98f, -1.26f, -1.81f, -1.15f, -2.7f, 0.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, 0.32f)
                arcTo(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.34f, 3f)
                arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.98f, 4.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                curveTo(6.97f, 5.07f, 6.65f, 6.73f, 7.36f, 8.35f)
                close()
                moveTo(22f, 14.5f)
                curveTo(21.62f, 4.46f, 7.23f, 4.61f, 7f, 14.79f)
                curveToRelative(-0.09f, 1.11f, 0.27f, 5.25f, -0.34f, 6.21f)
                lineTo(19f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _Taco = it}
