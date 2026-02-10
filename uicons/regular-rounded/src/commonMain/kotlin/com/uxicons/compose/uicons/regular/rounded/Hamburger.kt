package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Rr.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14.01f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -2.22f)
                verticalLineTo(10f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                horizontalLineTo(11f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10f)
                verticalLineToRelative(1.84f)
                arcTo(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 16.4f)
                verticalLineTo(17f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7f)
                horizontalLineToRelative(8f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -7f)
                verticalLineToRelative(-0.77f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.01f)
                close()
                moveTo(2.81f, 15.16f)
                arcToRelative(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, -2.15f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(17f)
                curveToRelative(-1.96f, 0f, -3.98f, 0.79f, -6.36f, 2.48f)
                arcToRelative(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.27f, 0f)
                curveToRelative(-0.23f, -0.16f, -0.45f, -0.33f, -0.67f, -0.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.81f, 15.16f)
                close()
                moveTo(3f, 10f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(2f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineToRelative(1.01f)
                lineToRelative(-18f, 0.01f)
                close()
                moveTo(16f, 22f)
                horizontalLineTo(8f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, -4.75f)
                arcToRelative(6.24f, 6.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.45f, 1.33f)
                curveToRelative(0.24f, 0.18f, 0.48f, 0.37f, 0.73f, 0.55f)
                arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.58f, 0f)
                arcTo(9.38f, 9.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17.01f)
                horizontalLineToRelative(4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                close()
                moveTo(9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                close()
                moveTo(6f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                close()
            }
        }.also { _Hamburger = it}
