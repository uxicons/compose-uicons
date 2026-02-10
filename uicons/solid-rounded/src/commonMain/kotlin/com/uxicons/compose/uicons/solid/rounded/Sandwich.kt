package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sandwich: ImageVector? = null

val Icons.Sr.Sandwich: ImageVector
    get() = _Sandwich ?: UXIcon(name = "Sandwich") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 24f)
                lineTo(2.5f, 24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5f)
                horizontalLineToRelative(19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21.5f)
                close()
                moveTo(22.8f, 5.38f)
                lineTo(19.69f, 1.75f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.8f, -1.33f)
                lineTo(2.39f, 5.45f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.89f)
                curveToRelative(0f, 0.04f, 0f, 0.32f, 0.01f, 0.37f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                lineTo(21f, 12f)
                curveTo(24.48f, 11.94f, 24.73f, 7.46f, 22.8f, 5.38f)
                close()
                moveTo(23.59f, 15.21f)
                lineTo(22.79f, 14.58f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, 0f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, 0f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, 0f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, 0f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, 0f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, 0f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, 0f)
                curveToRelative(-0.24f, 0.19f, -0.81f, 0.61f, -0.82f, 0.61f)
                arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 0.79f)
                curveToRelative(0.4f, -0.24f, 1.3f, -1.21f, 1.97f, -0.62f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 0f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 0f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 0f)
                curveToRelative(0.67f, -0.59f, 1.59f, 0.39f, 1.97f, 0.62f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.58f, 15.21f)
                close()
            }
        }.also { _Sandwich = it}
