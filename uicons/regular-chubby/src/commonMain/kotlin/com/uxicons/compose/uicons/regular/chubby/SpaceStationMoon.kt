package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoon: ImageVector? = null

val Icons.Rc.SpaceStationMoon: ImageVector
    get() = _SpaceStationMoon ?: UXIcon(name = "SpaceStationMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                verticalLineToRelative(6.89f)
                curveToRelative(0f, 0.47f, 0.33f, 0.88f, 0.79f, 0.98f)
                curveToRelative(0.21f, 0.05f, 5.22f, 1.14f, 10.21f, 1.14f)
                reflectiveCurveToRelative(10.0f, -1.09f, 10.21f, -1.14f)
                curveToRelative(0.46f, -0.1f, 0.79f, -0.51f, 0.79f, -0.98f)
                verticalLineToRelative(-6.89f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 4f)
                curveToRelative(4.06f, 0f, 6.54f, 0.94f, 7.84f, 3.21f)
                curveToRelative(-1.54f, 0.28f, -4.74f, 0.79f, -7.84f, 0.79f)
                reflectiveCurveToRelative(-6.3f, -0.51f, -7.84f, -0.79f)
                curveToRelative(1.3f, -2.27f, 3.78f, -3.21f, 7.84f, -3.21f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(6.68f)
                curveToRelative(-0.64f, 0.07f, -1.31f, 0.14f, -2f, 0.2f)
                verticalLineToRelative(-2.87f)
                curveToRelative(0f, -1.99f, -1.01f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.01f, -3f, 3f)
                verticalLineToRelative(2.87f)
                curveToRelative(-0.69f, -0.05f, -1.36f, -0.12f, -2f, -0.2f)
                verticalLineToRelative(-6.68f)
                curveToRelative(0f, -1.26f, 0.09f, -2.35f, 0.28f, -3.3f)
                curveToRelative(1.44f, 0.17f, 3.08f, 0.3f, 4.72f, 0.3f)
                reflectiveCurveToRelative(3.29f, -0.13f, 4.72f, -0.3f)
                curveToRelative(0.18f, 0.95f, 0.28f, 2.04f, 0.28f, 3.3f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, -1.51f, 0.14f, -2.8f, 0.42f, -3.9f)
                curveToRelative(0.44f, 0.09f, 1.08f, 0.2f, 1.88f, 0.33f)
                curveToRelative(-0.2f, 1.05f, -0.29f, 2.23f, -0.29f, 3.57f)
                verticalLineToRelative(6.41f)
                curveToRelative(-0.82f, -0.12f, -1.52f, -0.25f, -2f, -0.34f)
                verticalLineToRelative(-6.07f)
                close()
                moveTo(11f, 19.98f)
                verticalLineToRelative(-2.98f)
                curveToRelative(0f, -0.88f, 0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                verticalLineToRelative(2.98f)
                curveToRelative(-0.33f, 0.01f, -0.67f, 0.02f, -1f, 0.02f)
                reflectiveCurveToRelative(-0.67f, -0.01f, -1f, -0.02f)
                close()
                moveTo(21f, 19.07f)
                curveToRelative(-0.48f, 0.09f, -1.18f, 0.21f, -2f, 0.34f)
                verticalLineToRelative(-6.41f)
                curveToRelative(0f, -1.34f, -0.1f, -2.52f, -0.29f, -3.57f)
                curveToRelative(0.79f, -0.12f, 1.44f, -0.24f, 1.88f, -0.33f)
                curveToRelative(0.28f, 1.1f, 0.42f, 2.38f, 0.42f, 3.9f)
                verticalLineToRelative(6.07f)
                close()
            }
        }.also { _SpaceStationMoon = it}
