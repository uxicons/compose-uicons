package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vest: ImageVector? = null

val Icons.Sc.Vest: ImageVector
    get() = _Vest ?: UXIcon(name = "Vest") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-1.34f, 0f, -2.59f, 0.1f, -3.68f, 0.23f)
                curveToRelative(0.93f, 3.19f, 2.69f, 5.66f, 3.68f, 6.87f)
                curveToRelative(0.98f, -1.2f, 2.75f, -3.67f, 3.68f, -6.87f)
                curveToRelative(-1.09f, -0.14f, -2.34f, -0.24f, -3.68f, -0.24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.75f, 1.9f)
                curveToRelative(-0.44f, 0.11f, -0.75f, 0.51f, -0.75f, 0.97f)
                verticalLineToRelative(5.71f)
                curveToRelative(-0.77f, 0.8f, -2f, 2.26f, -2f, 3.41f)
                curveToRelative(0f, 1.04f, 0.05f, 2.06f, 0.12f, 3f)
                horizontalLineToRelative(4.88f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4.67f)
                curveToRelative(0.3f, 2.37f, 0.71f, 3.99f, 0.73f, 4.09f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.59f, 0.65f, 0.7f)
                curveToRelative(0.14f, 0.04f, 3.14f, 1.06f, 7.28f, 1.2f)
                verticalLineToRelative(-12.99f)
                curveToRelative(-0.88f, -0.97f, -3.46f, -4.09f, -4.67f, -8.46f)
                curveToRelative(-0.64f, 0.12f, -1.18f, 0.25f, -1.58f, 0.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 15f)
                horizontalLineToRelative(4.88f)
                curveToRelative(0.07f, -0.94f, 0.12f, -1.95f, 0.12f, -3f)
                curveToRelative(0f, -1.16f, -1.23f, -2.61f, -2f, -3.41f)
                verticalLineToRelative(-5.71f)
                curveToRelative(0f, -0.46f, -0.31f, -0.85f, -0.75f, -0.97f)
                curveToRelative(-0.41f, -0.1f, -0.94f, -0.23f, -1.58f, -0.35f)
                curveToRelative(-1.21f, 4.37f, -3.79f, 7.49f, -4.67f, 8.46f)
                verticalLineToRelative(12.99f)
                curveToRelative(4.17f, -0.14f, 7.15f, -1.16f, 7.29f, -1.2f)
                curveToRelative(0.32f, -0.11f, 0.56f, -0.37f, 0.65f, -0.7f)
                curveToRelative(0.03f, -0.11f, 0.43f, -1.73f, 0.73f, -4.1f)
                horizontalLineToRelative(-4.67f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _Vest = it}
