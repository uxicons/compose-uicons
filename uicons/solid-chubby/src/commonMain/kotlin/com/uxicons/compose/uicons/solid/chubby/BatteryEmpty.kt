package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryEmpty: ImageVector? = null

val Icons.Sc.BatteryEmpty: ImageVector
    get() = _BatteryEmpty ?: UXIcon(name = "BatteryEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 8.58f)
                curveToRelative(-0.14f, -0.3f, -0.42f, -0.52f, -0.75f, -0.57f)
                curveToRelative(0f, 0f, -0.32f, -0.05f, -0.81f, -0.11f)
                curveToRelative(-0.31f, -1.49f, -0.67f, -2.42f, -0.69f, -2.46f)
                curveToRelative(-0.12f, -0.31f, -0.39f, -0.54f, -0.72f, -0.61f)
                curveToRelative(-0.16f, -0.03f, -3.87f, -0.83f, -8.26f, -0.83f)
                reflectiveCurveToRelative(-8.1f, 0.79f, -8.26f, 0.83f)
                curveToRelative(-0.33f, 0.07f, -0.6f, 0.3f, -0.72f, 0.61f)
                curveToRelative(-0.05f, 0.12f, -1.11f, 2.88f, -1.11f, 6.56f)
                curveToRelative(0f, 3.71f, 1.07f, 6.45f, 1.12f, 6.56f)
                curveToRelative(0.12f, 0.31f, 0.39f, 0.54f, 0.72f, 0.61f)
                curveToRelative(0.16f, 0.03f, 3.87f, 0.83f, 8.26f, 0.83f)
                reflectiveCurveToRelative(8.1f, -0.79f, 8.26f, -0.83f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.02f, -0.04f, 0.38f, -0.98f, 0.69f, -2.46f)
                curveToRelative(0.49f, -0.06f, 0.81f, -0.11f, 0.81f, -0.11f)
                curveToRelative(0.33f, -0.05f, 0.61f, -0.27f, 0.75f, -0.57f)
                curveToRelative(0.03f, -0.06f, 0.68f, -1.51f, 0.68f, -3.42f)
                curveToRelative(0f, -1.92f, -0.66f, -3.36f, -0.69f, -3.42f)
                close()
            }
        }.also { _BatteryEmpty = it}
