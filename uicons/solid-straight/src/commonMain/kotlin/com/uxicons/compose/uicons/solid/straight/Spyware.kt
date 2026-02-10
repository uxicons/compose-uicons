package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spyware: ImageVector? = null

val Icons.Ss.Spyware: ImageVector
    get() = _Spyware ?: UXIcon(name = "Spyware") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.23f, -3.01f, 1.48f, -5.1f, 3.07f, -5f)
                curveToRelative(0.86f, 0f, 1.48f, 0.42f, 1.92f, 0.86f)
                curveToRelative(0.45f, -0.44f, 1.07f, -0.86f, 1.92f, -0.86f)
                curveToRelative(1.59f, -0.1f, 2.83f, 2.0f, 3.08f, 5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                curveToRelative(0.26f, -2.29f, 1.01f, -3.08f, 1.08f, -3f)
                curveToRelative(0.3f, 0f, 0.55f, 0.29f, 0.93f, 0.75f)
                curveToRelative(0.15f, 0.2f, 0.81f, 0.94f, 0.99f, 1.14f)
                curveToRelative(0.2f, -0.22f, 0.85f, -0.95f, 1.02f, -1.17f)
                curveToRelative(0.36f, -0.44f, 0.61f, -0.73f, 0.91f, -0.73f)
                curveToRelative(0.07f, -0.07f, 0.81f, 0.71f, 1.08f, 3f)
                close()
            }
        }.also { _Spyware = it}
