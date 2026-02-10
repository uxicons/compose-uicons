package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Megaphone: ImageVector? = null

val Icons.Sr.Megaphone: ImageVector
    get() = _Megaphone ?: UXIcon(name = "Megaphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -0.1f)
                lineToRelative(-2f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, -1.79f)
                lineToRelative(2f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.9f)
                close()
                moveTo(21.45f, 6.9f)
                lineTo(23.45f, 5.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.89f, -1.79f)
                lineToRelative(-2f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.89f, 1.79f)
                close()
                moveTo(24f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(18f, 19f)
                verticalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                curveToRelative(0f, 2.95f, -2.58f, 4f, -5f, 4f)
                horizontalLineToRelative(-7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(2.42f, 0f, 5f, 1.05f, 5f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(8.19f, 17f)
                horizontalLineToRelative(-4.19f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.38f, -0.17f)
                lineToRelative(2.5f, 5.58f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, 1.58f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, -3.47f)
                close()
            }
        }.also { _Megaphone = it}
