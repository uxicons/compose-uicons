package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radiation: ImageVector? = null

val Icons.Sc.Radiation: ImageVector
    get() = _Radiation ?: UXIcon(name = "Radiation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12.0f)
                horizontalLineToRelative(-7.12f)
                curveToRelative(-0.13f, -0.57f, -0.39f, -1.02f, -0.77f, -1.35f)
                lineToRelative(3.62f, -5.85f)
                curveToRelative(0.3f, -0.46f, 0.13f, -1.14f, -0.36f, -1.4f)
                curveToRelative(-3.27f, -1.84f, -7.46f, -1.84f, -10.74f, 0f)
                curveToRelative(-0.49f, 0.26f, -0.66f, 0.93f, -0.36f, 1.4f)
                lineToRelative(3.61f, 5.86f)
                curveToRelative(-0.37f, 0.33f, -0.63f, 0.77f, -0.76f, 1.34f)
                curveToRelative(-1.96f, 0f, -5.79f, 0f, -7.12f, 0.0f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.45f, -1.0f, 1f)
                curveToRelative(0f, 3.79f, 1.92f, 7.27f, 5.15f, 9.3f)
                curveToRelative(0.16f, 0.1f, 0.35f, 0.15f, 0.53f, 0.15f)
                curveToRelative(0.36f, 0.0f, 0.7f, -0.2f, 0.87f, -0.51f)
                curveToRelative(0.44f, -0.79f, 1.15f, -1.96f, 1.87f, -3.16f)
                curveToRelative(0.62f, -1.02f, 1.23f, -2.05f, 1.71f, -2.88f)
                curveToRelative(0.27f, 0.05f, 0.55f, 0.09f, 0.87f, 0.09f)
                curveToRelative(0.33f, 0f, 0.62f, -0.04f, 0.9f, -0.09f)
                lineToRelative(3.56f, 6.06f)
                curveToRelative(0.17f, 0.3f, 0.51f, 0.5f, 0.86f, 0.49f)
                curveToRelative(0.19f, 0f, 0.37f, -0.05f, 0.53f, -0.15f)
                curveToRelative(3.22f, -2.03f, 5.15f, -5.51f, 5.15f, -9.3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 13f)
                curveToRelative(0f, -0.88f, 0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.12f, -1f, -1f)
                close()
            }
        }.also { _Radiation = it}
