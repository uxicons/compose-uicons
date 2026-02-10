package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Sc.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.0f, 7.42f)
                curveToRelative(0.61f, 0.54f, 1.22f, 0.2f, 1.42f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0.19f, 0.19f)
                lineToRelative(-0.49f, 0.49f)
                curveToRelative(-0.93f, -0.69f, -2.06f, -1.18f, -3.37f, -1.46f)
                curveToRelative(0.13f, -0.33f, 0.21f, -0.68f, 0.21f, -1.06f)
                curveToRelative(0f, -1.54f, -1.25f, -2.8f, -2.79f, -2.8f)
                reflectiveCurveToRelative(-2.79f, 1.25f, -2.79f, 2.8f)
                curveToRelative(0f, 0.38f, 0.07f, 0.73f, 0.21f, 1.06f)
                curveToRelative(-1.29f, 0.27f, -2.4f, 0.76f, -3.32f, 1.43f)
                lineToRelative(-0.46f, -0.46f)
                lineToRelative(0.19f, -0.19f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.77f, 0.55f, 1.42f, 0f)
                lineToRelative(0.18f, -0.19f)
                lineToRelative(0.43f, 0.43f)
                curveToRelative(-1.21f, 1.54f, -1.85f, 3.61f, -1.85f, 6.11f)
                curveToRelative(0f, 5.86f, 3.29f, 9.19f, 9.2f, 9.22f)
                curveToRelative(5.9f, -0.04f, 9.08f, -3.21f, 9.19f, -9.22f)
                curveToRelative(-0.04f, -2.52f, -0.67f, -4.55f, -1.82f, -6.07f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(0.18f, 0.19f)
                close()
                moveTo(11.96f, 3f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                reflectiveCurveToRelative(-0.36f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.36f, -0.8f, -0.8f)
                reflectiveCurveToRelative(0.36f, -0.8f, 0.8f, -0.8f)
                close()
                moveTo(11.96f, 15.73f)
                curveToRelative(-1.07f, 0f, -1.94f, -0.87f, -1.94f, -1.94f)
                curveToRelative(0f, -0.7f, 0.38f, -1.32f, 0.94f, -1.66f)
                verticalLineToRelative(-2.13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.13f)
                curveToRelative(0.56f, 0.34f, 0.94f, 0.96f, 0.94f, 1.66f)
                curveToRelative(0f, 1.07f, -0.87f, 1.94f, -1.94f, 1.94f)
                close()
            }
        }.also { _Stopwatch = it}
