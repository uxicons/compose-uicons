package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nose: ImageVector? = null

val Icons.Rs.Nose: ImageVector
    get() = _Nose ?: UXIcon(name = "Nose") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 18f)
                curveToRelative(0f, 2.78f, 2.78f, 4.03f, 2.9f, 4.08f)
                lineToRelative(-0.79f, 1.84f)
                curveToRelative(-0.17f, -0.07f, -4.11f, -1.81f, -4.11f, -5.92f)
                reflectiveCurveToRelative(5.4f, -6.34f, 5.63f, -6.43f)
                lineToRelative(0.74f, 1.86f)
                curveToRelative(-1.22f, 0.49f, -4.37f, 2.27f, -4.37f, 4.57f)
                close()
                moveTo(23f, 19.44f)
                curveToRelative(-0.02f, -1.42f, -0.78f, -2.98f, -2.26f, -4.61f)
                curveToRelative(-1.45f, -1.61f, -2.9f, -4.76f, -3.96f, -7.07f)
                lineToRelative(-0.42f, -0.91f)
                curveToRelative(-1.08f, -2.32f, -1.37f, -3.43f, -1.37f, -6.85f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 3.53f, 0.29f, 4.97f, 1.55f, 7.69f)
                lineToRelative(0.41f, 0.9f)
                curveToRelative(1.11f, 2.42f, 2.63f, 5.74f, 4.29f, 7.58f)
                curveToRelative(1.14f, 1.26f, 1.74f, 2.41f, 1.74f, 3.33f)
                curveToRelative(0f, 0.01f, 0.09f, 0.92f, -0.45f, 1.54f)
                curveToRelative(-0.51f, 0.59f, -1.49f, 0.91f, -2.81f, 0.94f)
                curveToRelative(-1.16f, -0.07f, -1.85f, -0.65f, -2.71f, -1.37f)
                curveToRelative(-0.5f, -0.42f, -1.01f, -0.85f, -1.65f, -1.22f)
                curveToRelative(-1.03f, -0.59f, -1.81f, -0.47f, -2.28f, -0.26f)
                curveToRelative(-0.55f, 0.24f, -0.81f, 0.65f, -0.88f, 0.77f)
                reflectiveCurveToRelative(-0.28f, 0.55f, -0.2f, 1.15f)
                curveToRelative(0.07f, 0.51f, 0.36f, 1.24f, 1.39f, 1.82f)
                curveToRelative(1.85f, 1.05f, 3.75f, 1.11f, 6.08f, 1.12f)
                horizontalLineToRelative(0f)
                curveToRelative(0.01f, 0.0f, 0.01f, 0f, 0.02f, 0f)
                curveToRelative(0.16f, 0f, 0.32f, 0.0f, 0.48f, 0.0f)
                curveToRelative(1.82f, -0.09f, 3.2f, -0.65f, 4.06f, -1.65f)
                curveToRelative(1.02f, -1.18f, 0.97f, -2.54f, 0.94f, -2.91f)
                close()
            }
        }.also { _Nose = it}
