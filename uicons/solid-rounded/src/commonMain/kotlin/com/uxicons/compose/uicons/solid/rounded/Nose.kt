package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nose: ImageVector? = null

val Icons.Sr.Nose: ImageVector
    get() = _Nose ?: UXIcon(name = "Nose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 19.44f)
                curveToRelative(-0.02f, -1.42f, -0.78f, -2.98f, -2.26f, -4.61f)
                curveToRelative(-1.45f, -1.61f, -2.9f, -4.76f, -3.96f, -7.07f)
                lineToRelative(-0.72f, -1.56f)
                curveToRelative(-0.7f, -1.5f, -0.96f, -2.04f, -1.04f, -3.7f)
                verticalLineToRelative(-0.01f)
                curveToRelative(-0.06f, -1.39f, -1.21f, -2.49f, -2.6f, -2.49f)
                horizontalLineToRelative(0f)
                curveToRelative(-3.0f, 0f, -5.43f, 2.43f, -5.43f, 5.43f)
                verticalLineToRelative(6.26f)
                curveToRelative(0.86f, -0.39f, 1.65f, -0.68f, 2.24f, -0.87f)
                curveToRelative(0.55f, -0.18f, 1.14f, 0.16f, 1.27f, 0.73f)
                horizontalLineToRelative(0f)
                curveToRelative(0.12f, 0.51f, -0.17f, 1.02f, -0.67f, 1.18f)
                curveToRelative(-2.03f, 0.65f, -6.84f, 2.59f, -6.84f, 6.27f)
                curveToRelative(0f, 2.41f, 1.56f, 5f, 5f, 5f)
                horizontalLineToRelative(2.4f)
                curveToRelative(-0.24f, -0.34f, -0.35f, -0.67f, -0.38f, -0.94f)
                curveToRelative(-0.08f, -0.59f, 0.14f, -1.03f, 0.2f, -1.15f)
                reflectiveCurveToRelative(0.33f, -0.53f, 0.88f, -0.77f)
                curveToRelative(0.47f, -0.21f, 1.25f, -0.33f, 2.28f, 0.26f)
                curveToRelative(0.64f, 0.36f, 1.16f, 0.8f, 1.65f, 1.22f)
                curveToRelative(0.85f, 0.71f, 1.53f, 1.29f, 2.69f, 1.37f)
                curveToRelative(1.96f, -0.04f, 3.43f, -0.58f, 4.34f, -1.63f)
                curveToRelative(1.02f, -1.18f, 0.97f, -2.54f, 0.94f, -2.91f)
                close()
            }
        }.also { _Nose = it}
