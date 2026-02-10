package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Club: ImageVector? = null

val Icons.Sc.Club: ImageVector
    get() = _Club ?: UXIcon(name = "Club") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.21f, 8.65f)
                curveToRelative(-1.01f, -0.75f, -2.17f, -1.08f, -3.34f, -0.96f)
                curveToRelative(0.04f, -0.11f, 0.08f, -0.22f, 0.12f, -0.33f)
                curveToRelative(0.43f, -1.41f, 0.17f, -2.88f, -0.75f, -4.12f)
                curveToRelative(-1.01f, -1.36f, -2.67f, -2.24f, -4.24f, -2.24f)
                reflectiveCurveToRelative(-3.23f, 0.88f, -4.24f, 2.24f)
                curveToRelative(-0.92f, 1.24f, -1.18f, 2.71f, -0.75f, 4.12f)
                curveToRelative(0.03f, 0.11f, 0.07f, 0.22f, 0.12f, 0.33f)
                curveToRelative(-1.17f, -0.12f, -2.32f, 0.2f, -3.34f, 0.96f)
                curveToRelative(-1.34f, 1.0f, -2.21f, 2.63f, -2.21f, 4.17f)
                reflectiveCurveToRelative(0.87f, 3.17f, 2.21f, 4.17f)
                curveToRelative(0.87f, 0.65f, 1.85f, 0.98f, 2.86f, 0.98f)
                curveToRelative(0.45f, 0f, 0.9f, -0.07f, 1.34f, -0.2f)
                curveToRelative(0.84f, -0.25f, 1.64f, -0.8f, 2.34f, -1.43f)
                curveToRelative(-0.15f, 1.7f, -0.47f, 3.1f, -1.5f, 3.73f)
                horizontalLineToRelative(-1.24f)
                curveToRelative(-0.81f, 0f, -1.47f, 0.66f, -1.47f, 1.47f)
                reflectiveCurveToRelative(0.66f, 1.47f, 1.47f, 1.47f)
                horizontalLineToRelative(8.82f)
                curveToRelative(0.81f, 0f, 1.47f, -0.66f, 1.47f, -1.47f)
                reflectiveCurveToRelative(-0.66f, -1.47f, -1.47f, -1.47f)
                horizontalLineToRelative(-1.3f)
                curveToRelative(-1.03f, -0.63f, -1.35f, -2.06f, -1.51f, -3.79f)
                curveToRelative(0.72f, 0.66f, 1.54f, 1.23f, 2.41f, 1.49f)
                curveToRelative(0.45f, 0.14f, 0.9f, 0.2f, 1.34f, 0.2f)
                curveToRelative(1f, 0f, 1.98f, -0.33f, 2.86f, -0.98f)
                curveToRelative(1.34f, -1.0f, 2.21f, -2.63f, 2.21f, -4.17f)
                reflectiveCurveToRelative(-0.87f, -3.17f, -2.21f, -4.17f)
                close()
            }
        }.also { _Club = it}
