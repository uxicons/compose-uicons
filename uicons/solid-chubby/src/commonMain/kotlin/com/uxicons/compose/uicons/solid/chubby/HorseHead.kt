package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Sc.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.89f, 16.55f)
                curveToRelative(-0.06f, -0.12f, -1.56f, -3.11f, -4.06f, -6.61f)
                curveToRelative(-2.1f, -3.15f, -4.22f, -4.69f, -5.45f, -5.39f)
                lineToRelative(0.63f, -2.47f)
                curveToRelative(0.14f, -0.55f, -0.31f, -1.1f, -0.87f, -1.03f)
                curveToRelative(-0.84f, 0.1f, -3.01f, 1.14f, -4.2f, 3.08f)
                curveToRelative(-2.52f, 0.44f, -7.14f, 2.29f, -7.91f, 9.83f)
                curveToRelative(-0.01f, 0.19f, -0.14f, 4.71f, 1.02f, 8.34f)
                curveToRelative(0.13f, 0.41f, 0.52f, 0.7f, 0.95f, 0.7f)
                horizontalLineToRelative(11f)
                curveToRelative(0.37f, 0f, 0.71f, -0.2f, 0.88f, -0.53f)
                reflectiveCurveToRelative(0.15f, -0.72f, -0.05f, -1.03f)
                curveToRelative(-0.02f, -0.02f, -1.28f, -1.94f, -1.7f, -4.13f)
                curveToRelative(1.28f, 0.35f, 2.51f, 0.81f, 3.0f, 1.68f)
                curveToRelative(1.31f, 2.3f, 4.34f, 2.02f, 4.47f, 2f)
                curveToRelative(0.25f, -0.03f, 0.48f, -0.14f, 0.65f, -0.33f)
                curveToRelative(0.04f, -0.05f, 1.08f, -1.23f, 1.71f, -3.38f)
                curveToRelative(0.07f, -0.24f, 0.05f, -0.5f, -0.06f, -0.73f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HorseHead = it}
