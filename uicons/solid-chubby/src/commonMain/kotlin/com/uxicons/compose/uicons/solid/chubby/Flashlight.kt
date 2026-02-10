package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flashlight: ImageVector? = null

val Icons.Sc.Flashlight: ImageVector
    get() = _Flashlight ?: UXIcon(name = "Flashlight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.47f, 13.53f)
                curveToRelative(-1.19f, -1.19f, -2.05f, -2.33f, -2.61f, -3.48f)
                curveToRelative(-0.38f, 0.39f, -0.75f, 0.79f, -1.12f, 1.19f)
                curveToRelative(-1.52f, 1.64f, -2.99f, 3.33f, -4.5f, 5.16f)
                curveToRelative(-1.22f, 1.49f, -2.05f, 3.16f, 0.07f, 5.29f)
                curveToRelative(0.96f, 0.95f, 1.82f, 1.31f, 2.62f, 1.31f)
                curveToRelative(1.01f, 0f, 1.89f, -0.58f, 2.67f, -1.25f)
                curveToRelative(1.2f, -0.98f, 3.05f, -2.55f, 5.13f, -4.47f)
                curveToRelative(0.43f, -0.4f, 0.83f, -0.78f, 1.22f, -1.16f)
                curveToRelative(-1.16f, -0.57f, -2.31f, -1.43f, -3.47f, -2.59f)
                close()
                moveTo(8.62f, 16.8f)
                lineTo(7.62f, 17.8f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.03f, 0f, -1.42f)
                lineToRelative(1.01f, -1.01f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0f)
                reflectiveCurveToRelative(0.39f, 1.03f, 0f, 1.42f)
                close()
                moveTo(17.23f, 15.07f)
                curveToRelative(-1.79f, 0f, -3.58f, -0.94f, -5.47f, -2.84f)
                curveToRelative(-1.94f, -1.94f, -2.85f, -3.68f, -2.85f, -5.47f)
                reflectiveCurveToRelative(0.9f, -3.53f, 2.85f, -5.47f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0f)
                lineToRelative(9.52f, 9.52f)
                curveToRelative(0.39f, 0.38f, 0.39f, 1.05f, 0f, 1.42f)
                curveToRelative(-1.89f, 1.89f, -3.68f, 2.84f, -5.47f, 2.84f)
                close()
            }
        }.also { _Flashlight = it}
