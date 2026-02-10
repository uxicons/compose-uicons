package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HockeyPuck: ImageVector? = null

val Icons.Rc.HockeyPuck: ImageVector
    get() = _HockeyPuck ?: UXIcon(name = "HockeyPuck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.0f, 8.69f)
                curveToRelative(-0.06f, -4.71f, -3.46f, -6.83f, -11.03f, -6.84f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-4.67f, 0f, -7.62f, 0.78f, -9.28f, 2.45f)
                curveToRelative(-1.08f, 1.08f, -1.6f, 2.53f, -1.59f, 4.41f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, 0.01f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(6.55f)
                curveToRelative(0.04f, 4.74f, 3.44f, 6.86f, 11.04f, 6.87f)
                horizontalLineToRelative(0.09f)
                curveToRelative(4.67f, 0f, 7.62f, -0.78f, 9.29f, -2.46f)
                curveToRelative(1.08f, -1.08f, 1.6f, -2.53f, 1.59f, -4.43f)
                verticalLineToRelative(-6.54f)
                curveToRelative(0f, -0.01f, 0f, -0.03f, 0f, -0.04f)
                close()
                moveTo(4.01f, 5.71f)
                curveToRelative(1.25f, -1.25f, 3.82f, -1.86f, 7.87f, -1.86f)
                horizontalLineToRelative(0.09f)
                curveToRelative(7.92f, 0.02f, 9.02f, 2.37f, 9.04f, 4.91f)
                curveToRelative(0.01f, 1.34f, -0.31f, 2.29f, -1.0f, 2.99f)
                curveToRelative(-1.25f, 1.26f, -3.82f, 1.87f, -7.87f, 1.87f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-7.92f, -0.02f, -9.02f, -2.37f, -9.04f, -4.91f)
                curveToRelative(-0.01f, -1.34f, 0.31f, -2.29f, 1.01f, -2.99f)
                close()
                moveTo(20.0f, 18.29f)
                curveToRelative(-1.25f, 1.26f, -3.82f, 1.87f, -7.87f, 1.87f)
                horizontalLineToRelative(-0.09f)
                curveToRelative(-7.91f, -0.02f, -9.02f, -2.36f, -9.04f, -4.88f)
                verticalLineToRelative(-1.82f)
                curveToRelative(1.76f, 1.46f, 4.72f, 2.15f, 9.04f, 2.16f)
                horizontalLineToRelative(0.09f)
                curveToRelative(4.3f, 0f, 7.15f, -0.66f, 8.87f, -2.08f)
                verticalLineToRelative(1.77f)
                curveToRelative(0.01f, 1.34f, -0.31f, 2.29f, -1.0f, 2.99f)
                close()
            }
        }.also { _HockeyPuck = it}
