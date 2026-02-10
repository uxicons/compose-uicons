package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Sr.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 17.88f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 24f)
                lineTo(8f, 24f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.91f, -5.95f)
                curveToRelative(0.09f, 0.02f, 0.17f, 0.06f, 0.26f, 0.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 1.84f)
                arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.51f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18.01f)
                horizontalLineToRelative(6f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.94f, 17.88f)
                close()
                moveTo(0f, 14.1f)
                arcToRelative(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, 2.05f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.87f, 2.31f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.89f, 0f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16.01f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                lineTo(2.09f, 12.01f)
                arcTo(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.1f)
                close()
                moveTo(23f, 10f)
                verticalLineToRelative(0.15f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.14f)
                lineTo(2.09f, 10.01f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10.17f)
                lineTo(1f, 10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 0f)
                horizontalLineToRelative(2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                close()
                moveTo(7f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
                close()
                moveTo(10f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                close()
            }
        }.also { _Hamburger = it}
