package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Sr.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2.59f)
                lineToRelative(-2.99f, -2.99f)
                curveTo(21.2f, 15.25f, 23f, 12.55f, 23f, 9.99f)
                arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, -5.95f)
                arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.57f)
                arcTo(5.39f, 5.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 4.04f)
                arcToRelative(5.13f, 5.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.43f, 0.62f)
                lineTo(1.71f, 0.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.71f)
                lineTo(4.5f, 5.92f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.99f)
                curveToRelative(0f, 3.79f, 3.95f, 7.9f, 7.26f, 10.68f)
                arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.47f, 0f)
                curveToRelative(0.61f, -0.51f, 1.24f, -1.06f, 1.86f, -1.65f)
                lineTo(20.59f, 22f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 17f)
                close()
            }
        }.also { _HeartArrow = it}
