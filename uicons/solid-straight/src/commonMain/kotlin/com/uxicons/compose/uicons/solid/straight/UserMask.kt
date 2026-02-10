package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Ss.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.97f, 11.9f)
                curveToRelative(0.08f, -0.82f, -0.04f, -1.7f, -0.25f, -2.43f)
                curveToRelative(0.79f, -0.34f, 1.52f, -0.83f, 2.18f, -1.36f)
                curveToRelative(-0.24f, 1.47f, -0.93f, 2.78f, -1.93f, 3.79f)
                close()
                moveTo(12f, 0f)
                curveToRelative(-3.34f, 0f, -6.13f, 2.35f, -6.83f, 5.48f)
                curveToRelative(1.51f, 1.53f, 3.04f, 2.52f, 4.33f, 2.52f)
                horizontalLineToRelative(5f)
                curveToRelative(1.25f, 0f, 2.81f, -0.98f, 4.33f, -2.51f)
                curveToRelative(-0.69f, -3.14f, -3.48f, -5.49f, -6.83f, -5.49f)
                close()
                moveTo(9f, 12.0f)
                curveToRelative(0f, 0.87f, 0.1f, 1.53f, 0.2f, 2.0f)
                horizontalLineToRelative(5.6f)
                curveToRelative(0.1f, -0.47f, 0.2f, -1.13f, 0.2f, -2.0f)
                reflectiveCurveToRelative(-0.1f, -1.53f, -0.2f, -2.0f)
                horizontalLineToRelative(-5.6f)
                curveToRelative(-0.1f, 0.46f, -0.2f, 1.13f, -0.2f, 2.0f)
                close()
                moveTo(16.5f, 16f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(7f, 11.5f)
                curveToRelative(0f, -0.72f, 0.09f, -1.4f, 0.27f, -2.03f)
                curveToRelative(-0.79f, -0.34f, -1.52f, -0.83f, -2.18f, -1.36f)
                curveToRelative(0.24f, 1.47f, 0.93f, 2.78f, 1.93f, 3.79f)
                curveToRelative(-0.01f, -0.14f, -0.03f, -0.26f, -0.03f, -0.4f)
                close()
            }
        }.also { _UserMask = it}
