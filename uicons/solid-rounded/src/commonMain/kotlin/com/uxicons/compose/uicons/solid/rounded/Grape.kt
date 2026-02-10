package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grape: ImageVector? = null

val Icons.Sr.Grape: ImageVector
    get() = _Grape ?: UXIcon(name = "Grape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.11f, 0.55f)
                curveToRelative(1.11f, -1.65f, 3.32f, 0.96f, 3.9f, 2.01f)
                curveTo(13.98f, -0.99f, 18.7f, -0.83f, 19f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                curveToRelative(-0.07f, -1.8f, -3.63f, -1.38f, -3.97f, 3.19f)
                arcToRelative(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.06f, 0f)
                curveToRelative(-0.15f, -2.15f, -0.95f, -3.56f, -2.42f, -4.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.11f, 0.55f)
                close()
                moveTo(8f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 9f)
                close()
                moveTo(11f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15f)
                close()
                moveTo(12f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                close()
                moveTo(19f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                close()
                moveTo(16f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 12f)
                close()
            }
        }.also { _Grape = it}
