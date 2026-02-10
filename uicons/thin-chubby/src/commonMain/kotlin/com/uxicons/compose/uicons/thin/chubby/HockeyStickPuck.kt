package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyStickPuck: ImageVector? = null

val Icons.Tc.HockeyStickPuck: ImageVector
    get() = _HockeyStickPuck ?: UXIcon(name = "HockeyStickPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.69f, 1.04f)
                curveToRelative(-0.26f, -0.1f, -0.55f, 0.01f, -0.65f, 0.27f)
                curveToRelative(-0.06f, 0.14f, -4.72f, 11.33f, -7.31f, 16.4f)
                curveToRelative(-1.02f, -0.91f, -4.95f, -4f, -10.16f, -3.05f)
                curveToRelative(-1.77f, 0.32f, -3.56f, 1.74f, -3.56f, 4.17f)
                curveToRelative(0f, 2.01f, 1.4f, 4.17f, 3.65f, 4.17f)
                horizontalLineToRelative(4.15f)
                curveToRelative(2.41f, 0f, 4.03f, -0.73f, 5.41f, -2.45f)
                curveToRelative(1.85f, -2.3f, 8.46f, -18.18f, 8.75f, -18.85f)
                curveToRelative(0.1f, -0.26f, -0.01f, -0.55f, -0.27f, -0.65f)
                close()
                moveTo(13.44f, 19.92f)
                curveToRelative(-1.19f, 1.48f, -2.53f, 2.08f, -4.63f, 2.08f)
                horizontalLineToRelative(-4.16f)
                curveToRelative(-1.81f, 0f, -2.65f, -1.9f, -2.65f, -3.17f)
                curveToRelative(0f, -1.98f, 1.48f, -2.95f, 2.74f, -3.18f)
                curveToRelative(0.6f, -0.11f, 1.19f, -0.16f, 1.75f, -0.16f)
                curveToRelative(4.3f, 0f, 7.41f, 2.82f, 7.75f, 3.14f)
                curveToRelative(-0.32f, 0.59f, -0.6f, 1.04f, -0.81f, 1.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 20f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _HockeyStickPuck = it}
