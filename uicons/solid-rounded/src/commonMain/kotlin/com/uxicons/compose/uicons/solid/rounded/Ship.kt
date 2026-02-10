package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ship: ImageVector? = null

val Icons.Sr.Ship: ImageVector
    get() = _Ship ?: UXIcon(name = "Ship") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                curveToRelative(0f, 1.63f, -1.72f, 3f, -3.75f, 3f)
                arcTo(4.21f, 4.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 23f)
                arcToRelative(4.32f, 4.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 0.01f)
                arcTo(4.29f, 4.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.51f, 23f)
                arcTo(4.21f, 4.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 24f)
                curveTo(1.72f, 24f, 0f, 22.63f, 0f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.31f, 0.66f, 1f, 1.75f, 1f)
                arcToRelative(2.0f, 2.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -0.68f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, -0.19f)
                arcToRelative(12.19f, 12.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.19f, -6.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.01f, -3.39f)
                lineTo(11f, 9.28f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(9.28f)
                lineToRelative(6.93f, 2.27f)
                lineToRelative(0f, 0f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 3.39f)
                arcToRelative(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.16f, 6.18f)
                arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, 0.18f)
                arcTo(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.25f, 22f)
                curveToRelative(1.07f, 0f, 1.75f, -0.66f, 1.75f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
                moveTo(12f, 7f)
                arcToRelative(5.84f, 5.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.62f, 0.38f)
                lineTo(20f, 9.47f)
                verticalLineTo(7.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.6f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(7.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.4f)
                verticalLineTo(9.46f)
                lineToRelative(6.38f, -2.08f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                close()
            }
        }.also { _Ship = it}
