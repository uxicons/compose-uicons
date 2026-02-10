package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VestPatches: ImageVector? = null

val Icons.Sc.VestPatches: ImageVector
    get() = _VestPatches ?: UXIcon(name = "VestPatches") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-1.34f, 0f, -2.59f, 0.1f, -3.68f, 0.24f)
                curveToRelative(0.93f, 3.19f, 2.69f, 5.66f, 3.68f, 6.87f)
                curveToRelative(0.98f, -1.2f, 2.75f, -3.67f, 3.68f, -6.87f)
                curveToRelative(-1.09f, -0.14f, -2.34f, -0.24f, -3.68f, -0.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8.6f)
                verticalLineToRelative(-5.71f)
                curveToRelative(0f, -0.46f, -0.31f, -0.85f, -0.75f, -0.97f)
                curveToRelative(-0.41f, -0.1f, -0.94f, -0.23f, -1.58f, -0.35f)
                curveToRelative(-1.21f, 4.37f, -3.79f, 7.49f, -4.67f, 8.46f)
                verticalLineToRelative(12.98f)
                curveToRelative(4.17f, -0.14f, 7.15f, -1.15f, 7.29f, -1.19f)
                curveToRelative(0.32f, -0.11f, 0.56f, -0.37f, 0.65f, -0.7f)
                curveToRelative(0.04f, -0.17f, 1.06f, -4.26f, 1.06f, -9.1f)
                curveToRelative(0f, -1.16f, -1.23f, -2.61f, -2f, -3.41f)
                close()
                moveTo(19.26f, 14.65f)
                curveToRelative(-0.19f, 0.23f, -0.47f, 0.35f, -0.76f, 0.35f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.29f, 0f, -0.57f, -0.13f, -0.76f, -0.35f)
                curveToRelative(-0.19f, -0.23f, -0.27f, -0.52f, -0.22f, -0.81f)
                curveToRelative(0.31f, -1.84f, 1.3f, -2.58f, 1.42f, -2.65f)
                curveToRelative(0.34f, -0.24f, 0.8f, -0.24f, 1.14f, 0f)
                curveToRelative(0.11f, 0.08f, 1.1f, 0.81f, 1.42f, 2.65f)
                curveToRelative(0.05f, 0.29f, -0.03f, 0.59f, -0.22f, 0.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.75f, 1.91f)
                curveToRelative(-0.44f, 0.11f, -0.75f, 0.51f, -0.75f, 0.97f)
                verticalLineToRelative(5.71f)
                curveToRelative(-0.77f, 0.8f, -2f, 2.26f, -2f, 3.41f)
                curveToRelative(0f, 4.82f, 1.02f, 8.92f, 1.06f, 9.1f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.59f, 0.65f, 0.7f)
                curveToRelative(0.14f, 0.04f, 3.14f, 1.05f, 7.28f, 1.19f)
                verticalLineToRelative(-12.98f)
                curveToRelative(-0.88f, -0.97f, -3.46f, -4.09f, -4.67f, -8.46f)
                curveToRelative(-0.64f, 0.12f, -1.18f, 0.25f, -1.58f, 0.35f)
                close()
                moveTo(6.5f, 20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(8.5f, 12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _VestPatches = it}
