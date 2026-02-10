package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Rs.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12.79f, 23.71f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-6.52f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.05f, -2.84f)
                lineToRelative(-7.95f, -2.63f)
                lineToRelative(-7.95f, 2.63f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.05f, 2.84f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.8f, 0.4f)
                close()
                moveTo(19.32f, 4.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 0.94f)
                verticalLineToRelative(6.52f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.45f, -8.05f, -9.86f)
                verticalLineToRelative(-6.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, -0.94f)
                lineToRelative(7.32f, -2.42f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _ShieldExclamation = it}
