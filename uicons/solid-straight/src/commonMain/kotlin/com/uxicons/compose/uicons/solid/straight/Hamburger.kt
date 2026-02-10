package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Ss.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.09f, 12.01f)
                horizontalLineTo(22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineTo(16f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.56f, 2.45f)
                arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.89f, 0f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, 16.15f)
                arcTo(2.07f, 2.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.1f)
                arcTo(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.09f, 12.01f)
                close()
                moveTo(1f, 10.17f)
                verticalLineTo(9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, -9f)
                horizontalLineToRelative(4f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                verticalLineToRelative(1.15f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.14f)
                horizontalLineTo(2.09f)
                arcTo(4.03f, 4.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10.17f)
                close()
                moveTo(7f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                close()
                moveTo(4f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7f)
                close()
                moveTo(22f, 18.01f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.25f, 1.96f)
                arcToRelative(4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.51f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.89f, -1.84f)
                curveToRelative(-0.12f, -0.02f, -0.23f, -0.06f, -0.35f, -0.09f)
                verticalLineTo(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineTo(19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(17.86f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18.01f)
                close()
            }
        }.also { _Hamburger = it}
