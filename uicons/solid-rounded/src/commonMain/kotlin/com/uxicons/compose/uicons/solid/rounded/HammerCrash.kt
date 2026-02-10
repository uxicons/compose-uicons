package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerCrash: ImageVector? = null

val Icons.Sr.HammerCrash: ImageVector
    get() = _HammerCrash ?: UXIcon(name = "HammerCrash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(19.88f, 14.79f)
                curveToRelative(0.44f, -0.34f, 0.51f, -0.97f, 0.17f, -1.4f)
                lineToRelative(-0.78f, -1f)
                curveToRelative(-0.34f, -0.44f, -0.97f, -0.51f, -1.4f, -0.17f)
                curveToRelative(-0.44f, 0.34f, -0.51f, 0.97f, -0.17f, 1.4f)
                lineToRelative(0.78f, 1f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.38f, 0.79f, 0.38f)
                curveToRelative(0.22f, 0f, 0.43f, -0.07f, 0.61f, -0.21f)
                close()
                moveTo(22.99f, 10.99f)
                curveToRelative(0.27f, -0.48f, 0.1f, -1.09f, -0.38f, -1.36f)
                lineToRelative(-0.89f, -0.5f)
                curveToRelative(-0.48f, -0.27f, -1.09f, -0.1f, -1.36f, 0.38f)
                curveToRelative(-0.27f, 0.48f, -0.1f, 1.09f, 0.38f, 1.36f)
                lineToRelative(0.89f, 0.5f)
                curveToRelative(0.15f, 0.09f, 0.32f, 0.13f, 0.49f, 0.13f)
                curveToRelative(0.35f, 0f, 0.69f, -0.18f, 0.87f, -0.51f)
                close()
                moveTo(18.2f, 9.43f)
                lineToRelative(0.45f, -0.87f)
                curveToRelative(0.37f, -0.72f, 0.44f, -1.54f, 0.19f, -2.31f)
                reflectiveCurveToRelative(-0.79f, -1.39f, -1.47f, -1.74f)
                lineTo(11.21f, 1.09f)
                curveTo(7.27f, -0.96f, 4.3f, 0.34f, 2.89f, 1.3f)
                curveToRelative(-0.6f, 0.4f, -0.93f, 1.07f, -0.88f, 1.79f)
                curveToRelative(0.04f, 0.71f, 0.45f, 1.32f, 1.08f, 1.65f)
                lineToRelative(11.1f, 5.98f)
                curveToRelative(0.43f, 0.22f, 0.9f, 0.33f, 1.35f, 0.33f)
                curveToRelative(1.09f, 0f, 2.14f, -0.59f, 2.67f, -1.61f)
                close()
                moveTo(6.17f, 8.67f)
                lineTo(0.31f, 19.66f)
                curveToRelative(-0.72f, 1.46f, -0.14f, 3.25f, 1.3f, 4.0f)
                curveToRelative(0.43f, 0.23f, 0.91f, 0.34f, 1.38f, 0.34f)
                curveToRelative(0.31f, 0f, 0.63f, -0.05f, 0.94f, -0.15f)
                curveToRelative(0.77f, -0.25f, 1.4f, -0.79f, 1.74f, -1.49f)
                lineToRelative(5.77f, -10.84f)
                lineToRelative(-5.28f, -2.84f)
                close()
            }
        }.also { _HammerCrash = it}
