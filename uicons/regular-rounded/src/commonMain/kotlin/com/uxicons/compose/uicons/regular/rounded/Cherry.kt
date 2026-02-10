package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cherry: ImageVector? = null

val Icons.Rr.Cherry: ImageVector
    get() = _Cherry ?: UXIcon(name = "Cherry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 13f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.98f, 0.56f)
                curveTo(18.05f, 9.49f, 16.14f, 4.98f, 12.81f, 0.41f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, 0f)
                curveTo(7.86f, 4.98f, 5.95f, 9.5f, 5.58f, 13.57f)
                curveTo(3.27f, 12f, -0.06f, 13.74f, 0f, 17.5f)
                curveToRelative(0f, 6.5f, 8.62f, 8.91f, 12f, 3.45f)
                curveTo(15.38f, 26.41f, 24f, 24f, 24f, 17.5f)
                curveTo(24f, 14.68f, 22.17f, 13f, 20.4f, 13f)
                close()
                moveTo(12f, 2.74f)
                arcToRelative(24.5f, 24.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.41f, 10.72f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14.38f)
                arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, -0.93f)
                arcTo(24.51f, 24.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.74f)
                close()
                moveTo(6.5f, 22f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17.5f)
                curveTo(2f, 15.63f, 3.08f, 15f, 3.57f, 15f)
                curveToRelative(1.37f, 0.03f, 1.13f, 1.02f, 2.93f, 1f)
                curveToRelative(1.81f, 0.02f, 1.55f, -0.98f, 2.9f, -1f)
                curveToRelative(0.5f, 0f, 1.6f, 0.63f, 1.6f, 2.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 22f)
                close()
                moveTo(17.5f, 22f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 17.5f)
                curveToRelative(0f, -1.87f, 1.08f, -2.5f, 1.57f, -2.5f)
                curveToRelative(1.37f, 0.03f, 1.13f, 1.02f, 2.93f, 1f)
                curveToRelative(1.81f, 0.02f, 1.55f, -0.98f, 2.9f, -1f)
                curveToRelative(0.5f, 0f, 1.6f, 0.63f, 1.6f, 2.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 22f)
                close()
            }
        }.also { _Cherry = it}
