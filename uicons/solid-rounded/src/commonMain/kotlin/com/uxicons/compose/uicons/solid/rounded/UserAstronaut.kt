package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAstronaut: ImageVector? = null

val Icons.Sr.UserAstronaut: ImageVector
    get() = _UserAstronaut ?: UXIcon(name = "UserAstronaut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.12f, 11f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-0.38f)
                curveTo(19.05f, 2.53f, 15.82f, 0f, 12f, 0f)
                reflectiveCurveTo(4.95f, 2.53f, 3.88f, 6f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.68f, 2.2f, 2.23f, 4.02f, 4.25f, 5.06f)
                curveToRelative(-3.45f, 0.43f, -6.13f, 3.38f, -6.13f, 6.94f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -3.56f, -2.68f, -6.51f, -6.13f, -6.94f)
                curveToRelative(2.02f, -1.04f, 3.57f, -2.86f, 4.25f, -5.06f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.95f, 0.86f, -2f, 2.1f, -2f)
                horizontalLineToRelative(7.9f)
                curveToRelative(1.24f, 0f, 2f, 1.04f, 2f, 2f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
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
                moveToRelative(15f, 22f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _UserAstronaut = it}
