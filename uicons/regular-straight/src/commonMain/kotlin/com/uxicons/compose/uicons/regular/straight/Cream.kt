package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cream: ImageVector? = null

val Icons.Rs.Cream: ImageVector
    get() = _Cream ?: UXIcon(name = "Cream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.18f)
                lineTo(22f, 8f)
                lineTo(20f, 8f)
                curveTo(20f, 2.56f, 17.03f, 0.29f, 16.9f, 0.2f)
                lineTo(16.64f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 1f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(10f, 3f)
                arcTo(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.09f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(4.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                verticalLineToRelative(9f)
                lineTo(24f, 24f)
                lineTo(24f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12.18f)
                close()
                moveTo(10f, 5f)
                horizontalLineToRelative(3f)
                arcToRelative(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, -2.16f)
                arcTo(9.08f, 9.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8f)
                lineTo(6.13f, 8f)
                arcTo(3.66f, 3.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5f)
                close()
                moveTo(20f, 10f)
                verticalLineToRelative(2f)
                lineTo(4f, 12f)
                lineTo(4f, 10f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(21f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _Cream = it}
