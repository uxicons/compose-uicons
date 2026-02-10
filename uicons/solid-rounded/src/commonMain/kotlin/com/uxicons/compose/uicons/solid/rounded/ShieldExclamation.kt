package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Sr.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.58f, 2.14f)
                lineToRelative(-6.26f, -2.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 0f)
                lineToRelative(-6.27f, 2.09f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.42f, 4.74f)
                verticalLineToRelative(5.12f)
                curveToRelative(0f, 7.56f, 9.2f, 11.74f, 9.59f, 11.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 0f)
                curveToRelative(0.39f, -0.17f, 9.59f, -4.35f, 9.59f, -11.91f)
                verticalLineToRelative(-5.12f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.42f, -4.74f)
                close()
                moveTo(12f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(13f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
        }.also { _ShieldExclamation = it}
