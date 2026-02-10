package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Backpack: ImageVector? = null

val Icons.Rr.Backpack: ImageVector
    get() = _Backpack ?: UXIcon(name = "Backpack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(10f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11f)
                close()
                moveTo(24f, 18f)
                verticalLineToRelative(1f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(5f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(0f, 18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4.9f)
                lineTo(4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.02f, 5.07f)
                curveTo(8.01f, 5.05f, 8f, 5.03f, 8f, 5f)
                lineTo(8f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                lineTo(16f, 5f)
                curveToRelative(0f, 0.03f, -0.01f, 0.05f, -0.01f, 0.07f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                verticalLineToRelative(1.1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 18f)
                close()
                moveTo(10f, 4.26f)
                arcToRelative(7.74f, 7.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                lineTo(14f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                close()
                moveTo(6f, 16.54f)
                arcToRelative(8.37f, 8.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                lineTo(18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 12f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(0.03f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19f)
                lineTo(4f, 15.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                verticalLineToRelative(1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                close()
                moveTo(15f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.87f, -2.19f)
                arcToRelative(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.75f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 22f)
                close()
                moveTo(22f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                lineTo(20f, 19f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.03f, 3f)
                lineTo(19f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _Backpack = it}
