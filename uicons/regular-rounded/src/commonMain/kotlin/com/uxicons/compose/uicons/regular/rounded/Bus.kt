package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bus: ImageVector? = null

val Icons.Rr.Bus: ImageVector
    get() = _Bus ?: UXIcon(name = "Bus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                lineTo(22f, 5.65f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.35f, 0.83f)
                arcToRelative(24.74f, 24.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.7f, 0f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.65f)
                lineTo(2f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0.5f)
                horizontalLineToRelative(6.1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21.5f)
                lineTo(20f, 21f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -4f)
                lineTo(22f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 10f)
                close()
                moveTo(13f, 13f)
                lineTo(13f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                close()
                moveTo(6.2f, 2.75f)
                arcToRelative(22.75f, 22.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.93f, 5f)
                lineTo(4.07f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.2f, 2.75f)
                close()
                moveTo(17f, 20f)
                lineTo(7f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(4f, 15f)
                lineTo(6f, 15f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(8f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(18f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20f)
                close()
            }
        }.also { _Bus = it}
