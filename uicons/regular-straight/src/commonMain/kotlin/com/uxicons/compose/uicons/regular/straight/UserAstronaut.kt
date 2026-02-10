package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAstronaut: ImageVector? = null

val Icons.Rs.UserAstronaut: ImageVector
    get() = _UserAstronaut ?: UXIcon(name = "UserAstronaut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.12f, 11f)
                horizontalLineToRelative(1.88f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1.88f)
                curveTo(19.05f, 2.53f, 15.82f, 0f, 12f, 0f)
                reflectiveCurveTo(4.95f, 2.53f, 3.88f, 6f)
                horizontalLineToRelative(-1.88f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.49f, 1.58f, 1.42f, 2.96f, 2.66f, 4f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(1.23f, -1.04f, 2.17f, -2.42f, 2.66f, -4f)
                close()
                moveTo(5.5f, 8.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -0.34f, 0.36f, -1f, 1.1f, -1f)
                horizontalLineToRelative(7.9f)
                curveToRelative(0.72f, 0f, 1f, 0.66f, 1f, 1f)
                close()
            }
        }.also { _UserAstronaut = it}
