package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMdChat: ImageVector? = null

val Icons.Ss.UserMdChat: ImageVector
    get() = _UserMdChat ?: UXIcon(name = "UserMdChat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.75f, 2.23f, -4.99f, 4.98f, -5.0f)
                verticalLineToRelative(4.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(4.02f)
                verticalLineToRelative(4.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0f, -1.28f, 0.35f, -2.47f, 0.95f, -3.51f)
                curveToRelative(-1.06f, -0.93f, -2.44f, -1.49f, -3.95f, -1.49f)
                curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.09f, 0f, 2.12f, -0.3f, 3f, -0.81f)
                verticalLineToRelative(-6.19f)
                close()
            }
        }.also { _UserMdChat = it}
