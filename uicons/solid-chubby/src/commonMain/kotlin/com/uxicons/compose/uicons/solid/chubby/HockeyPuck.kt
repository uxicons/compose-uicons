package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Sc.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.83f, 14.07f)
                curveToRelative(-2.07f, 2.08f, -5.47f, 3.04f, -10.7f, 3.04f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-2.31f, -0.01f, -7.99f, -0.02f, -11.03f, -3.3f)
                verticalLineToRelative(1.97f)
                curveToRelative(0.04f, 4.74f, 3.44f, 6.86f, 11.03f, 6.87f)
                horizontalLineToRelative(0.09f)
                curveToRelative(4.67f, 0f, 7.62f, -0.78f, 9.29f, -2.46f)
                curveToRelative(1.08f, -1.08f, 1.6f, -2.53f, 1.59f, -4.43f)
                verticalLineToRelative(-1.88f)
                curveToRelative(-0.06f, 0.06f, -0.11f, 0.12f, -0.17f, 0.18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.96f, 1.35f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-4.67f, 0f, -7.62f, 0.78f, -9.28f, 2.45f)
                curveToRelative(-1.08f, 1.08f, -1.6f, 2.53f, -1.59f, 4.41f)
                curveToRelative(0.03f, 4.75f, 3.43f, 6.88f, 11.04f, 6.9f)
                horizontalLineToRelative(0.09f)
                curveToRelative(4.67f, 0f, 7.62f, -0.78f, 9.29f, -2.46f)
                curveToRelative(1.08f, -1.08f, 1.6f, -2.53f, 1.59f, -4.41f)
                curveToRelative(-0.03f, -4.75f, -3.43f, -6.88f, -11.04f, -6.9f)
                close()
            }
        }.also { _HockeyPuck = it}
