package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sunset: ImageVector? = null

val Icons.Rc.Sunset: ImageVector
    get() = _Sunset ?: UXIcon(name = "Sunset") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.91f, 21f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-0.12f, -1.51f, -0.5f, -2.65f, -1.05f, -3.51f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, -0.0f)
                lineToRelative(-1.06f, 1.05f)
                curveToRelative(-1.06f, -0.7f, -2.33f, -0.96f, -3.54f, -1.04f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.9f)
                curveToRelative(-1.21f, 0.08f, -2.48f, 0.34f, -3.54f, 1.04f)
                lineToRelative(-1.06f, -1.05f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(-0.55f, 0.85f, -0.94f, 1.99f, -1.05f, 3.51f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.88f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.17f, 1.93f, -5.0f, 5.03f, -5.0f)
                reflectiveCurveToRelative(5.03f, 0.84f, 5.03f, 5.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.88f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.55f, 9.95f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.11f, 0.45f, 0.11f)
                reflectiveCurveToRelative(0.31f, -0.04f, 0.45f, -0.11f)
                curveToRelative(0.11f, -0.05f, 2.67f, -1.36f, 3.84f, -3.97f)
                curveToRelative(0.23f, -0.5f, 0f, -1.1f, -0.5f, -1.32f)
                curveToRelative(-0.51f, -0.23f, -1.1f, 0f, -1.32f, 0.5f)
                curveToRelative(-0.36f, 0.81f, -0.93f, 1.47f, -1.47f, 1.96f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(7.12f)
                curveToRelative(-0.54f, -0.49f, -1.1f, -1.15f, -1.47f, -1.96f)
                curveToRelative(-0.23f, -0.5f, -0.81f, -0.73f, -1.32f, -0.5f)
                curveToRelative(-0.5f, 0.23f, -0.73f, 0.82f, -0.5f, 1.32f)
                curveToRelative(1.17f, 2.61f, 3.73f, 3.92f, 3.84f, 3.97f)
                close()
            }
        }.also { _Sunset = it}
