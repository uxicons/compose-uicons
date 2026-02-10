package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConstructionHelmet: ImageVector? = null

val Icons.Sr.ConstructionHelmet: ImageVector
    get() = _ConstructionHelmet ?: UXIcon(name = "ConstructionHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.32f, 19f)
                lineToRelative(-0.41f, 0.59f)
                curveToRelative(-1.5f, 2.14f, -3.94f, 3.41f, -6.55f, 3.41f)
                horizontalLineToRelative(-4.71f)
                curveToRelative(-2.61f, 0f, -5.06f, -1.27f, -6.55f, -3.41f)
                lineToRelative(-0.41f, -0.59f)
                close()
                moveTo(23f, 15f)
                verticalLineToRelative(-2.45f)
                curveToRelative(0f, -4.14f, -2.44f, -7.86f, -6.13f, -9.64f)
                curveToRelative(0.08f, 0.35f, 0.13f, 0.71f, 0.13f, 1.08f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6.88f)
                curveToRelative(0f, -1.45f, -0.98f, -2.78f, -2.4f, -3.06f)
                curveToRelative(-1.92f, -0.37f, -3.6f, 1.09f, -3.6f, 2.93f)
                verticalLineToRelative(7.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7.01f)
                curveToRelative(0f, -0.37f, 0.05f, -0.73f, 0.13f, -1.08f)
                curveToRelative(-3.69f, 1.79f, -6.13f, 5.5f, -6.13f, 9.64f)
                verticalLineToRelative(2.45f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ConstructionHelmet = it}
