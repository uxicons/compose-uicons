package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldInterrogation: ImageVector? = null

val Icons.Rr.ShieldInterrogation: ImageVector
    get() = _ShieldInterrogation ?: UXIcon(name = "ShieldInterrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.96f, -3.19f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -2.12f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, -1.6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.36f, 1.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, -3.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, 6.57f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.93f, 1.44f)
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
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 0.31f)
                arcToRelative(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, -0.24f)
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
        }.also { _ShieldInterrogation = it}
