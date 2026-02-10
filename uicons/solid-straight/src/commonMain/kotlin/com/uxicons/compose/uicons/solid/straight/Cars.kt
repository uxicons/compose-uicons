package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cars: ImageVector? = null

val Icons.Ss.Cars: ImageVector
    get() = _Cars ?: UXIcon(name = "Cars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.35f, 14f)
                lineTo(7.65f, 14f)
                lineTo(9.08f, 9.99f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.91f, 8f)
                horizontalLineToRelative(7.18f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 1.99f)
                close()
                moveTo(24f, 22f)
                lineTo(22f, 22f)
                verticalLineToRelative(2f)
                lineTo(18f, 24f)
                lineTo(18f, 22f)
                lineTo(13f, 22f)
                verticalLineToRelative(2f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                lineTo(7f, 22f)
                lineTo(7f, 17.73f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.14f, 16f)
                lineTo(23.86f, 16f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17.73f)
                close()
                moveTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18f)
                close()
                moveTo(20f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                close()
                moveTo(2f, 16f)
                lineTo(2f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 9.73f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, 8f)
                lineTo(7.92f, 8f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 9.32f)
                lineToRelative(-1.43f, 4.01f)
                arcToRelative(24.2f, 24.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 2.36f)
                curveToRelative(-0.02f, 0.1f, -0.02f, 0.21f, -0.04f, 0.32f)
                close()
                moveTo(4f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                close()
                moveTo(16.35f, 6f)
                lineTo(14.92f, 1.99f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.09f, 0f)
                lineTo(4.91f, 0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, 1.99f)
                lineTo(0.65f, 6f)
                close()
            }
        }.also { _Cars = it}
