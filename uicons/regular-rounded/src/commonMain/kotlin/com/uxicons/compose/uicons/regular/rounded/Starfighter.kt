package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Rr.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(7f)
                lineTo(15.98f, 14f)
                curveTo(15.7f, -4.73f, 8.3f, -4.67f, 8.02f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                lineTo(0f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.59f)
                lineToRelative(3.88f, 3.88f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.96f, 22f)
                horizontalLineToRelative(4.07f)
                arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.09f, 1.29f)
                lineTo(22f, 19.41f)
                lineTo(22f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(24f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 6f)
                close()
                moveTo(10f, 15f)
                arcToRelative(53.69f, 53.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, -7.47f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.93f, 0f)
                arcTo(53.69f, 53.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                verticalLineToRelative(5f)
                lineTo(10f, 20f)
                close()
                moveTo(13.05f, 5.15f)
                arcToRelative(4.38f, 4.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, 0f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.09f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.05f, 5.15f)
                close()
                moveTo(8f, 21.59f)
                arcToRelative(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0.29f)
                lineTo(2f, 16.59f)
                lineTo(2f, 16f)
                lineTo(8f, 16f)
                close()
                moveTo(16.71f, 21.88f)
                arcTo(0.43f, 0.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21.59f)
                lineTo(16f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.59f)
                close()
            }
        }.also { _Starfighter = it}
