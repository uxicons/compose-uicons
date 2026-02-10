package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PepperHot: ImageVector? = null

val Icons.Ss.PepperHot: ImageVector
    get() = _PepperHot ?: UXIcon(name = "PepperHot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineToRelative(1f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.21f, 9.82f)
                lineTo(0.36f, 9f)
                lineTo(2.2f, 9f)
                lineToRelative(0.13f, 0.85f)
                curveTo(2.69f, 12.2f, 3.85f, 15f, 7.32f, 15f)
                curveTo(9.62f, 15f, 12f, 13.5f, 12f, 11f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, -3.61f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.56f, 0f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
                close()
                moveTo(16.8f, 5.14f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.02f, 5.8f)
                curveToRelative(0f, 0.07f, -0.02f, 0.13f, -0.02f, 0.2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                curveToRelative(0f, -0.07f, -0.02f, -0.13f, -0.02f, -0.2f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, -0.74f)
                curveTo(18.24f, 1.6f, 16.06f, 0f, 14f, 0f)
                lineTo(14f, 2f)
                curveTo(15.17f, 2f, 16.35f, 3.08f, 16.8f, 5.14f)
                close()
                moveTo(5f, 8.41f)
                lineTo(5f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 8.41f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.71f, 5.29f)
                arcTo(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3.59f)
                lineTo(5f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 3.59f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.29f, 6.71f)
                arcTo(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8.41f)
                close()
                moveTo(9f, 7.41f)
                lineTo(9f, 9f)
                horizontalLineToRelative(2f)
                lineTo(11f, 7.41f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.71f, 4.29f)
                arcTo(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2.59f)
                lineTo(9f, 1f)
                lineTo(7f, 1f)
                lineTo(7f, 2.59f)
                arcTo(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.29f, 5.71f)
                arcTo(2.39f, 2.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7.41f)
                close()
            }
        }.also { _PepperHot = it}
