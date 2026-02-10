package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eagle: ImageVector? = null

val Icons.Bs.Eagle: ImageVector
    get() = _Eagle ?: UXIcon(name = "Eagle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.98f, 4.98f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, 3f, -3f, 3f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0f, -3f, 3f, -3f)
                close()
                moveTo(23.98f, 18.48f)
                verticalLineToRelative(2.8f)
                reflectiveCurveToRelative(-3.62f, -2.41f, -5.02f, -3.25f)
                curveToRelative(-0.04f, 1.6f, -0.18f, 2.97f, -0.58f, 4.0f)
                lineToRelative(-0.84f, 2.12f)
                lineToRelative(-3.88f, -3.88f)
                curveToRelative(-1.34f, 1.56f, -3.89f, 3.7f, -7.68f, 3.7f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(1.36f, -2.27f)
                curveToRelative(0.04f, -0.07f, 1.29f, -2.26f, 1.29f, -5.23f)
                curveToRelative(0f, -1.61f, -0.75f, -2.87f, -1.21f, -3.5f)
                horizontalLineToRelative(-0.29f)
                curveToRelative(-2f, 0f, -2.5f, 0.48f, -2.5f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(-3.59f, -2.25f, -1.98f, -6.09f, 2f, -6.86f)
                curveToRelative(0.2f, -4.51f, 3.92f, -8.15f, 8.5f, -8.14f)
                curveToRelative(2.44f, -0.07f, 4.41f, 1.33f, 6.5f, 1.5f)
                curveToRelative(1.25f, 0.07f, 2.93f, -0.99f, 4f, -1.5f)
                verticalLineToRelative(2.43f)
                curveToRelative(0.04f, 2.17f, -0.93f, 3.18f, -1f, 5.07f)
                curveToRelative(0f, 0.16f, 0.16f, 0.56f, 0.33f, 0.98f)
                curveToRelative(0.62f, 1.55f, 1.67f, 4.15f, 1.67f, 10.02f)
                close()
                moveTo(20.89f, 15.69f)
                curveToRelative(-0.25f, -3.35f, -0.92f, -5.02f, -1.36f, -6.11f)
                curveToRelative(-0.29f, -0.73f, -0.55f, -1.35f, -0.55f, -2.1f)
                curveToRelative(0.0f, -1.28f, 0.31f, -2.17f, 0.6f, -3.03f)
                curveToRelative(-2.61f, 0.28f, -4.64f, -1.44f, -7.1f, -1.47f)
                curveToRelative(-2.87f, 0f, -5.23f, 2.21f, -5.48f, 5.02f)
                lineToRelative(2.98f, 2.48f)
                lineToRelative(-1.87f, 2.27f)
                curveToRelative(1.17f, 1.97f, 0.99f, 5.71f, 0.29f, 7.77f)
                curveToRelative(3.84f, -2.04f, 3.41f, -3.0f, 4.74f, -5.0f)
                lineToRelative(2.81f, 2.81f)
                curveToRelative(0.05f, -1.44f, 0.03f, -3.75f, 0.03f, -5.27f)
                curveToRelative(1.56f, 0.77f, 3.4f, 1.68f, 4.9f, 2.63f)
                close()
            }
        }.also { _Eagle = it}
