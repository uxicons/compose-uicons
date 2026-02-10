package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Rr.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(12.79f, 23.76f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-5.17f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.43f, -4.75f)
                lineToRelative(-6.26f, -2.08f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 0f)
                lineToRelative(-6.26f, 2.08f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                arcToRelative(4.63f, 4.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 0.31f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -0.24f)
                close()
                moveTo(17.94f, 4.02f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, 2.85f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.45f, -8.05f, -9.86f)
                verticalLineToRelative(-5.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.06f, -2.85f)
                lineToRelative(5.94f, -1.97f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                close()
            }
        }.also { _ShieldExclamation = it}
