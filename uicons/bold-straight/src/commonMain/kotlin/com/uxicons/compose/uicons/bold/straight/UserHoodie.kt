package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHoodie: ImageVector? = null

val Icons.Bs.UserHoodie: ImageVector
    get() = _UserHoodie ?: UXIcon(name = "UserHoodie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.92f, 14.09f)
                curveToRelative(1.12f, -2.4f, 2.08f, -5.05f, 2.08f, -7.09f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                curveToRelative(0f, 2.04f, 0.96f, 4.69f, 2.08f, 7.09f)
                curveToRelative(-2.32f, 0.43f, -4.08f, 2.47f, -4.08f, 4.91f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(0.56f)
                curveToRelative(0.91f, 1.66f, 1.7f, 2.89f, 1.94f, 3.27f)
                verticalLineToRelative(3.73f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.73f)
                curveToRelative(0.24f, -0.38f, 1.03f, -1.61f, 1.94f, -3.27f)
                horizontalLineToRelative(0.56f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.44f, -1.76f, -4.47f, -4.08f, -4.91f)
                close()
                moveTo(12f, 5f)
                curveToRelative(1.66f, 0f, 4f, 0.62f, 4f, 2f)
                curveToRelative(0f, 2.57f, -2.35f, 7.14f, -4f, 9.97f)
                curveToRelative(-1.65f, -2.83f, -4f, -7.4f, -4f, -9.97f)
                curveToRelative(0f, -1.38f, 2.34f, -2f, 4f, -2f)
                close()
            }
        }.also { _UserHoodie = it}
