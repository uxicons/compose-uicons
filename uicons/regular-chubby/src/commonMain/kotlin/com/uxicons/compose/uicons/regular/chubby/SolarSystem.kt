package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SolarSystem: ImageVector? = null

val Icons.Rc.SolarSystem: ImageVector
    get() = _SolarSystem ?: UXIcon(name = "SolarSystem") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                curveToRelative(0.74f, 0f, 1.44f, 0.03f, 2.09f, 0.09f)
                curveToRelative(0.55f, 0.05f, 0.95f, 0.54f, 0.91f, 1.09f)
                reflectiveCurveToRelative(-0.54f, 0.95f, -1.09f, 0.91f)
                curveToRelative(-0.59f, -0.05f, -1.23f, -0.08f, -1.91f, -0.08f)
                curveToRelative(-6.56f, 0.0f, -9f, 2.44f, -9f, 9.0f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                curveToRelative(0f, -0.68f, -0.03f, -1.32f, -0.08f, -1.91f)
                curveToRelative(-0.05f, -0.55f, 0.35f, -1.04f, 0.91f, -1.09f)
                curveToRelative(0.55f, -0.04f, 1.04f, 0.35f, 1.09f, 0.91f)
                curveToRelative(0.06f, 0.65f, 0.09f, 1.35f, 0.09f, 2.09f)
                close()
                moveTo(12.0f, 6.95f)
                curveToRelative(-0.05f, 0.55f, 0.35f, 1.04f, 0.9f, 1.09f)
                curveToRelative(1.96f, 0.18f, 3.09f, 0.89f, 3.09f, 3.96f)
                curveToRelative(0f, 3.03f, -0.97f, 4f, -4f, 4f)
                curveToRelative(-3.08f, 0f, -3.78f, -1.13f, -3.96f, -3.09f)
                curveToRelative(-0.05f, -0.55f, -0.52f, -0.95f, -1.09f, -0.9f)
                curveToRelative(-0.55f, 0.05f, -0.95f, 0.54f, -0.9f, 1.09f)
                curveToRelative(0.31f, 3.35f, 2.2f, 4.91f, 5.95f, 4.91f)
                curveToRelative(4.15f, 0f, 6f, -1.85f, 6f, -6f)
                curveToRelative(0f, -3.75f, -1.56f, -5.64f, -4.91f, -5.95f)
                curveToRelative(-0.55f, -0.05f, -1.04f, 0.35f, -1.09f, 0.9f)
                close()
                moveTo(19.5f, 7f)
                curveToRelative(1.41f, -0.01f, 2.46f, -0.61f, 2.5f, -2.5f)
                curveToRelative(-0.03f, -1.82f, -1.1f, -2.49f, -2.5f, -2.5f)
                curveToRelative(-1.41f, 0.01f, -2.47f, 0.65f, -2.5f, 2.5f)
                curveToRelative(0.03f, 1.89f, 1.1f, 2.49f, 2.5f, 2.5f)
                close()
                moveTo(8f, 10f)
                curveToRelative(1.13f, -0.01f, 1.97f, -0.49f, 2f, -2f)
                curveToRelative(-0.03f, -1.45f, -0.88f, -1.99f, -2f, -2f)
                curveToRelative(-1.13f, 0.01f, -1.97f, 0.52f, -2f, 2f)
                curveToRelative(0.03f, 1.51f, 0.88f, 1.99f, 2f, 2f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(-0.02f, -1.09f, -0.66f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-0.84f, 0.01f, -1.48f, 0.39f, -1.5f, 1.5f)
                curveToRelative(0.02f, 1.13f, 0.66f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.84f, -0.01f, 1.48f, -0.37f, 1.5f, -1.5f)
                close()
            }
        }.also { _SolarSystem = it}
