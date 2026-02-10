package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryEmpty: ImageVector? = null

val Icons.Rc.BatteryEmpty: ImageVector
    get() = _BatteryEmpty ?: UXIcon(name = "BatteryEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 8.58f)
                curveToRelative(-0.13f, -0.28f, -0.38f, -0.48f, -0.68f, -0.55f)
                curveToRelative(-0.04f, -0.01f, -0.34f, -0.08f, -0.89f, -0.16f)
                curveToRelative(-0.3f, -1.46f, -0.66f, -2.37f, -0.69f, -2.44f)
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
                curveToRelative(0.03f, -0.07f, 0.38f, -0.98f, 0.68f, -2.43f)
                curveToRelative(0.55f, -0.08f, 0.85f, -0.15f, 0.89f, -0.16f)
                curveToRelative(0.3f, -0.07f, 0.55f, -0.28f, 0.68f, -0.56f)
                curveToRelative(0.03f, -0.06f, 0.68f, -1.51f, 0.68f, -3.42f)
                curveToRelative(0f, -1.92f, -0.66f, -3.36f, -0.69f, -3.42f)
                close()
                moveTo(11.09f, 18f)
                curveToRelative(-3.22f, 0f, -6.12f, -0.46f, -7.29f, -0.68f)
                curveToRelative(-0.28f, -0.89f, -0.81f, -2.89f, -0.81f, -5.32f)
                curveToRelative(0f, -2.42f, 0.53f, -4.42f, 0.81f, -5.32f)
                curveToRelative(1.17f, -0.21f, 4.07f, -0.68f, 7.29f, -0.68f)
                reflectiveCurveToRelative(6.12f, 0.46f, 7.29f, 0.68f)
                curveToRelative(0.28f, 0.89f, 0.81f, 2.89f, 0.81f, 5.32f)
                curveToRelative(0f, 2.42f, -0.53f, 4.42f, -0.81f, 5.32f)
                curveToRelative(-1.17f, 0.21f, -4.07f, 0.68f, -7.29f, 0.68f)
                close()
            }
        }.also { _BatteryEmpty = it}
