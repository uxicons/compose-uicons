package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Sc.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 3.95f)
                curveToRelative(-3.69f, -2.12f, -8.03f, -2.74f, -11.03f, -2.89f)
                curveToRelative(-1.73f, -0.12f, -2.87f, -0.02f, -2.91f, -0.02f)
                curveToRelative(-0.38f, 0.03f, -0.7f, 0.28f, -0.84f, 0.62f)
                curveToRelative(-0.47f, 1.5f, -0.78f, 4.61f, -0.72f, 6.06f)
                verticalLineToRelative(2.27f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.27f)
                curveToRelative(0f, -0.19f, 0.0f, -1.01f, 0.06f, -2.03f)
                curveToRelative(-0.55f, 0.23f, -1.37f, 0.62f, -2.3f, 1.25f)
                curveToRelative(-2.04f, 1.36f, -1.94f, 2.95f, -1.49f, 4.07f)
                curveToRelative(0.06f, 0.15f, 1.6f, 3.65f, 5.74f, 6.98f)
                curveToRelative(0.02f, 0.69f, 0.09f, 2.1f, 0.29f, 4.11f)
                curveToRelative(0.05f, 0.51f, 0.48f, 0.9f, 0.99f, 0.9f)
                horizontalLineToRelative(10.44f)
                curveToRelative(0.51f, 0f, 0.94f, -0.39f, 0.99f, -0.9f)
                curveToRelative(0.23f, -2.17f, 0.27f, -4.13f, 0.27f, -4.83f)
                curveToRelative(1.18f, -2.09f, 3.0f, -6.31f, 3.0f, -12.45f)
                curveToRelative(0f, -0.36f, -0.19f, -0.69f, -0.5f, -0.87f)
                close()
            }
        }.also { _HandBackFist = it}
