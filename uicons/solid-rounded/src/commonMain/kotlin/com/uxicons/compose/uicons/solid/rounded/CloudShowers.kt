package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowers: ImageVector? = null

val Icons.Sr.CloudShowers: ImageVector
    get() = _CloudShowers ?: UXIcon(name = "CloudShowers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(13f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                close()
                moveTo(11f, 21f)
                lineTo(11f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(7f, 23f)
                lineTo(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(19f, 21f)
                lineTo(19f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(17.92f, 5.13f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, -0.56f)
                curveTo(13.12f, -3.73f, 0.49f, 0.19f, 2.15f, 9.53f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, 0.87f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 8.37f)
                arcTo(0.59f, 0.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18.19f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 15.22f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.77f, 0f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.23f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.88f, 0.9f)
                verticalLineToRelative(1.22f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.89f, 0.37f)
                curveTo(25.84f, 13.83f, 24.05f, 6.22f, 17.92f, 5.13f)
                close()
            }
        }.also { _CloudShowers = it}
