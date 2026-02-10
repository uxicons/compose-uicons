package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Bs.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 16.16f)
                curveToRelative(-0.33f, -1.17f, -0.73f, -2.27f, -1.19f, -3.33f)
                curveToRelative(2.15f, -0.56f, 3.75f, -2.5f, 3.75f, -4.82f)
                curveToRelative(0f, -1.7f, -0.85f, -3.19f, -2.14f, -4.09f)
                curveToRelative(-0.53f, -0.6f, -3.61f, -3.91f, -7.92f, -3.91f)
                curveTo(10.67f, 0f, 4.03f, 3.44f, 2.15f, 16.27f)
                curveToRelative(-1.26f, 0.53f, -2.15f, 1.78f, -2.15f, 3.23f)
                verticalLineToRelative(4.5f)
                lineToRelative(24f, -0.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                curveToRelative(-0.42f, -0.42f, -0.93f, -0.7f, -1.48f, -0.86f)
                close()
                moveTo(19.06f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14f, 3f)
                curveToRelative(0.96f, 0f, 1.87f, 0.26f, 2.67f, 0.63f)
                curveToRelative(-1.55f, 0.85f, -2.61f, 2.48f, -2.61f, 4.37f)
                curveToRelative(0f, 1.95f, 1.12f, 3.62f, 2.75f, 4.44f)
                curveToRelative(0.56f, 1.11f, 1.08f, 2.3f, 1.49f, 3.56f)
                lineToRelative(-13.06f, 0.0f)
                curveTo(6.99f, 5.4f, 12.09f, 3f, 14f, 3f)
                close()
                moveTo(21f, 21.0f)
                lineToRelative(-18f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineToRelative(17f, -0.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.18f, 0f, 0.3f, 0.09f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.15f, 0.17f, 0.15f, 0.35f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _HatSanta = it}
