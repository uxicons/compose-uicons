package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheese: ImageVector? = null

val Icons.Rs.Cheese: ImageVector
    get() = _Cheese ?: UXIcon(name = "Cheese") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 19f)
                close()
                moveTo(8f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(14f, 24f)
                lineTo(14f, 23f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
                verticalLineToRelative(1f)
                lineTo(4.83f, 24f)
                curveTo(-0.78f, 23.91f, -0.64f, 14.08f, 1.12f, 10.51f)
                arcTo(19.97f, 19.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.04f, 0.96f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.75f, 0.85f)
                lineTo(24f, 8.5f)
                close()
                moveTo(15.85f, 22f)
                lineTo(22f, 22f)
                lineTo(22f, 10f)
                lineTo(4.83f, 10f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, 1.22f)
                arcTo(12.72f, 12.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 16f)
                arcToRelative(12.72f, 12.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 4.78f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.83f, 22f)
                lineTo(9.15f, 22f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.85f, 22f)
                close()
                moveTo(10.97f, 2f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 0.57f)
                arcToRelative(18.18f, 18.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.8f, 5.46f)
                arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, -0.02f)
                lineTo(19.99f, 8.01f)
                lineTo(12.6f, 2.48f)
                arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.97f, 2f)
                close()
            }
        }.also { _Cheese = it}
