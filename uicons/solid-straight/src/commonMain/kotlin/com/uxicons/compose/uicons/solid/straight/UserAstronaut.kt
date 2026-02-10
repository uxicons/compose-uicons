package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAstronaut: ImageVector? = null

val Icons.Ss.UserAstronaut: ImageVector
    get() = _UserAstronaut ?: UXIcon(name = "UserAstronaut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.99f, 8.08f)
                curveToRelative(0.01f, 2.12f, 1.8f, 3.92f, 4.01f, 3.92f)
                curveToRelative(2.19f, 0f, 3.98f, -1.77f, 4f, -3.96f)
                lineToRelative(-7.9f, -0.04f)
                curveToRelative(-0.07f, 0f, -0.1f, 0.04f, -0.11f, 0.08f)
                close()
            }
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
                curveToRelative(0.67f, 2.16f, 2.17f, 3.95f, 4.13f, 5f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(1.96f, -1.05f, 3.47f, -2.84f, 4.13f, -5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.95f, 0.86f, -2f, 2.1f, -2f)
                horizontalLineToRelative(7.9f)
                curveToRelative(1.24f, 0f, 2f, 1.04f, 2f, 2f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _UserAstronaut = it}
