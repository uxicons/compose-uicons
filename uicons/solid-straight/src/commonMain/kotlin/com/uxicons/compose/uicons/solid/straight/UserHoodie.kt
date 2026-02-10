package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHoodie: ImageVector? = null

val Icons.Ss.UserHoodie: ImageVector
    get() = _UserHoodie ?: UXIcon(name = "UserHoodie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20.65f)
                verticalLineToRelative(3.35f)
                lineTo(2.99f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.96f, 1.15f, -3.64f, 2.8f, -4.46f)
                curveToRelative(2.1f, 3.17f, 4.68f, 5.62f, 5.21f, 6.11f)
                close()
                moveTo(5.05f, 7.7f)
                curveToRelative(0.2f, -0.42f, 0.45f, -0.82f, 0.74f, -1.18f)
                curveToRelative(0.93f, -1.15f, 2.77f, -2.52f, 6.21f, -2.52f)
                reflectiveCurveToRelative(5.29f, 1.37f, 6.22f, 2.52f)
                curveToRelative(0.29f, 0.35f, 0.53f, 0.74f, 0.73f, 1.15f)
                curveToRelative(0.02f, -0.23f, 0.04f, -0.46f, 0.04f, -0.68f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(4.99f, 3.14f, 4.99f, 7f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0f, 0.23f, 0.02f, 0.46f, 0.05f, 0.7f)
                close()
                moveTo(18.2f, 14.55f)
                curveToRelative(-2.1f, 3.17f, -4.68f, 5.61f, -5.2f, 6.1f)
                verticalLineToRelative(3.35f)
                horizontalLineToRelative(7.99f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.96f, -1.14f, -3.63f, -2.78f, -4.45f)
                close()
                moveTo(17.45f, 11.95f)
                curveToRelative(-1.72f, 3.1f, -4.4f, 5.87f, -5.45f, 6.89f)
                curveToRelative(-1.05f, -1.02f, -3.72f, -3.77f, -5.44f, -6.87f)
                horizontalLineToRelative(0.01f)
                curveToRelative(-0.35f, -1.66f, -0.07f, -3.15f, 0.78f, -4.2f)
                curveToRelative(0.94f, -1.16f, 2.55f, -1.78f, 4.66f, -1.78f)
                reflectiveCurveToRelative(3.72f, 0.62f, 4.67f, 1.78f)
                curveToRelative(0.85f, 1.04f, 1.12f, 2.53f, 0.78f, 4.17f)
                close()
                moveTo(14.4f, 13f)
                horizontalLineToRelative(-4.81f)
                curveToRelative(0.52f, 0.72f, 1.05f, 1.4f, 1.56f, 2f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.51f, -0.6f, 1.04f, -1.28f, 1.55f, -2f)
                close()
            }
        }.also { _UserHoodie = it}
