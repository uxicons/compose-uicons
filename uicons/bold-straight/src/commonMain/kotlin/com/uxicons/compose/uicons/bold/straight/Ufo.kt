package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Bs.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.51f, 8.96f)
                curveToRelative(-0.79f, -2.85f, -3.41f, -4.96f, -6.51f, -4.96f)
                reflectiveCurveToRelative(-5.72f, 2.1f, -6.51f, 4.96f)
                curveToRelative(-3.47f, 1.04f, -5.49f, 2.88f, -5.49f, 5.08f)
                curveToRelative(0f, 3.92f, 6.04f, 5.96f, 12f, 5.96f)
                reflectiveCurveToRelative(12f, -2.05f, 12f, -5.96f)
                curveToRelative(0f, -2.2f, -2.02f, -4.03f, -5.49f, -5.08f)
                close()
                moveTo(12f, 7f)
                curveToRelative(1.97f, 0f, 3.6f, 1.53f, 3.74f, 3.47f)
                curveToRelative(-0.59f, 0.23f, -1.75f, 0.53f, -3.74f, 0.53f)
                curveToRelative(-2.01f, 0f, -3.17f, -0.31f, -3.74f, -0.52f)
                curveToRelative(0.14f, -1.94f, 1.76f, -3.48f, 3.74f, -3.48f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-5.58f, 0f, -9f, -1.92f, -9f, -2.96f)
                curveToRelative(0f, -0.46f, 0.79f, -1.24f, 2.44f, -1.89f)
                lineToRelative(0.25f, 0.25f)
                curveToRelative(0.38f, 0.38f, 1.95f, 1.61f, 6.31f, 1.61f)
                reflectiveCurveToRelative(5.93f, -1.23f, 6.31f, -1.61f)
                lineToRelative(0.25f, -0.25f)
                curveToRelative(1.66f, 0.65f, 2.44f, 1.43f, 2.44f, 1.89f)
                curveToRelative(0f, 1.04f, -3.42f, 2.96f, -9f, 2.96f)
                close()
            }
        }.also { _Ufo = it}
