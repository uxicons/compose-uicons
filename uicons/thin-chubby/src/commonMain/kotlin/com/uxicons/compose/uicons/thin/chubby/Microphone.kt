package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microphone: ImageVector? = null

val Icons.Tc.Microphone: ImageVector
    get() = _Microphone ?: UXIcon(name = "Microphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19.27f)
                curveToRelative(5.14f, 0f, 7.44f, -2.82f, 7.44f, -9.14f)
                reflectiveCurveTo(17.14f, 1f, 12f, 1f)
                reflectiveCurveTo(4.56f, 3.82f, 4.56f, 10.14f)
                reflectiveCurveToRelative(2.29f, 9.14f, 7.44f, 9.14f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.82f, 0f, 5.46f, 0.7f, 6.22f, 5.21f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.06f, 0.59f, 0.09f, 1.23f, 0.09f, 1.93f)
                reflectiveCurveToRelative(-0.03f, 1.34f, -0.09f, 1.93f)
                horizontalLineToRelative(-2.93f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.8f)
                curveToRelative(-0.76f, 4.51f, -3.4f, 5.21f, -6.22f, 5.21f)
                reflectiveCurveToRelative(-5.46f, -0.7f, -6.22f, -5.21f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.93f)
                curveToRelative(-0.06f, -0.59f, -0.09f, -1.23f, -0.09f, -1.93f)
                reflectiveCurveToRelative(0.03f, -1.34f, 0.09f, -1.93f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.8f)
                curveToRelative(0.76f, -4.51f, 3.4f, -5.21f, 6.22f, -5.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.41f, 11.78f)
                curveToRelative(-0.27f, -0.02f, -0.52f, 0.18f, -0.54f, 0.46f)
                curveToRelative(-0.63f, 8.06f, -5.72f, 9.76f, -9.88f, 9.76f)
                reflectiveCurveTo(2.75f, 20.31f, 2.12f, 12.24f)
                curveToRelative(-0.02f, -0.28f, -0.26f, -0.48f, -0.54f, -0.46f)
                curveToRelative(-0.28f, 0.02f, -0.48f, 0.26f, -0.46f, 0.54f)
                curveToRelative(0.73f, 9.29f, 7.12f, 10.68f, 10.87f, 10.68f)
                reflectiveCurveToRelative(10.15f, -1.39f, 10.87f, -10.68f)
                curveToRelative(0.02f, -0.28f, -0.18f, -0.52f, -0.46f, -0.54f)
                close()
            }
        }.also { _Microphone = it}
