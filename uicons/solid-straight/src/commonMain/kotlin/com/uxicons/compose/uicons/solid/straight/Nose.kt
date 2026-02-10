package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nose: ImageVector? = null

val Icons.Ss.Nose: ImageVector
    get() = _Nose ?: UXIcon(name = "Nose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 19.44f)
                curveToRelative(-0.02f, -1.42f, -0.78f, -2.98f, -2.26f, -4.61f)
                curveToRelative(-1.45f, -1.61f, -2.9f, -4.76f, -3.96f, -7.07f)
                lineToRelative(-0.72f, -1.56f)
                curveToRelative(-0.88f, -1.87f, -1.06f, -2.26f, -1.06f, -5.2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6.69f)
                curveToRelative(1.69f, -0.78f, 3.12f, -1.13f, 3.27f, -1.16f)
                lineToRelative(0.46f, 1.95f)
                curveToRelative(-0.08f, 0.02f, -7.73f, 1.89f, -7.73f, 6.53f)
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
