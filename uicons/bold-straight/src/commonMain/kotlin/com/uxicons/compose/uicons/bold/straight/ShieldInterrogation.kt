package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldInterrogation: ImageVector? = null

val Icons.Bs.ShieldInterrogation: ImageVector
    get() = _ShieldInterrogation ?: UXIcon(name = "ShieldInterrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12.96f, 23.56f)
                curveToRelative(2.12f, -0.86f, 9.04f, -4.21f, 9.04f, -11.58f)
                verticalLineToRelative(-6.16f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.32f, -3.21f)
                lineToRelative(-7.68f, -2.54f)
                lineToRelative(-7.68f, 2.54f)
                arcToRelative(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.32f, 3.21f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 6.51f, 6.85f, 10.45f, 8.95f, 11.5f)
                lineToRelative(0.98f, 0.49f)
                close()
                moveTo(18.73f, 5.45f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, 0.36f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 5.26f, -5.03f, 7.9f, -6.93f, 8.7f)
                curveToRelative(-1.93f, -1f, -7.07f, -4.1f, -7.07f, -8.7f)
                verticalLineToRelative(-6.16f)
                arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, -0.36f)
                lineToRelative(6.73f, -2.23f)
                close()
                moveTo(13.68f, 12.63f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.13f, -6.79f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 3.16f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.39f, -0.79f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.17f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 0.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.54f, 1.2f)
                arcToRelative(3.42f, 3.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.92f, 3.12f)
                horizontalLineToRelative(3f)
                arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, -0.4f)
                close()
            }
        }.also { _ShieldInterrogation = it}
