package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meat: ImageVector? = null

val Icons.Ss.Meat: ImageVector
    get() = _Meat ?: UXIcon(name = "Meat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.34f, 14.01f)
                curveToRelative(0.33f, 0f, 0.65f, -0.03f, 0.97f, -0.07f)
                curveToRelative(-4.65f, 3.55f, -10.94f, 4.04f, -11.24f, 4.06f)
                lineToRelative(-0.46f, 0.03f)
                lineToRelative(-1.12f, -1.12f)
                lineToRelative(-4.28f, 4.28f)
                curveToRelative(0.46f, 0.26f, 0.78f, 0.74f, 0.78f, 1.31f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.24f, 0.06f, -0.46f, 0.16f, -0.66f)
                curveToRelative(-0.2f, 0.1f, -0.42f, 0.16f, -0.66f, 0.16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.56f, 0f, 1.05f, 0.32f, 1.31f, 0.78f)
                lineToRelative(4.28f, -4.28f)
                lineToRelative(-1.12f, -1.12f)
                lineToRelative(0.03f, -0.46f)
                curveToRelative(0.02f, -0.29f, 0.53f, -6.58f, 4.07f, -11.22f)
                curveToRelative(-0.37f, 2.54f, 0.75f, 5.58f, 3.2f, 8.03f)
                curveToRelative(2.14f, 2.14f, 4.75f, 3.27f, 7.07f, 3.27f)
                close()
                moveTo(23.0f, 11.0f)
                curveToRelative(-1.83f, 1.83f, -5.55f, 1.08f, -8.32f, -1.68f)
                curveToRelative(-2.76f, -2.76f, -3.51f, -6.48f, -1.68f, -8.32f)
                curveToRelative(1.83f, -1.83f, 5.55f, -1.08f, 8.32f, 1.68f)
                curveToRelative(2.76f, 2.76f, 3.51f, 6.48f, 1.68f, 8.32f)
                close()
                moveTo(18.73f, 5.28f)
                curveToRelative(-0.72f, -0.72f, -1.64f, -0.99f, -2.04f, -0.59f)
                reflectiveCurveToRelative(-0.14f, 1.31f, 0.59f, 2.04f)
                reflectiveCurveToRelative(1.64f, 0.99f, 2.04f, 0.59f)
                reflectiveCurveToRelative(0.14f, -1.31f, -0.59f, -2.04f)
                close()
            }
        }.also { _Meat = it}
