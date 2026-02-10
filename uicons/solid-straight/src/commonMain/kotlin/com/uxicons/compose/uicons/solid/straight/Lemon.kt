package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lemon: ImageVector? = null

val Icons.Ss.Lemon: ImageVector
    get() = _Lemon ?: UXIcon(name = "Lemon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 0.88f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, -0.16f)
                curveTo(15.1f, -0.58f, 8.2f, -0.45f, 3.88f, 3.88f)
                reflectiveCurveTo(-0.58f, 15.1f, 0.72f, 19.05f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 4.07f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, 0.16f)
                arcToRelative(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.86f, 0.72f)
                arcToRelative(14.51f, 14.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.32f, -3.88f)
                curveTo(24.45f, 15.8f, 24.58f, 8.9f, 23.28f, 4.95f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 3f)
                close()
                moveTo(16f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                close()
                moveTo(18f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                close()
                moveTo(20f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                close()
            }
        }.also { _Lemon = it}
