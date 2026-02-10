package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Ts.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveToRelative(2.92f, 0f, 5.24f, 2.04f, 5.33f, 2.13f)
                lineToRelative(-0.67f, 0.75f)
                curveToRelative(-0.02f, -0.02f, -2.14f, -1.87f, -4.67f, -1.87f)
                reflectiveCurveToRelative(-4.65f, 1.85f, -4.67f, 1.87f)
                lineToRelative(-0.67f, -0.75f)
                curveToRelative(0.1f, -0.09f, 2.42f, -2.13f, 5.33f, -2.13f)
                close()
                moveTo(8.68f, 10.05f)
                curveToRelative(-0.39f, 0.14f, -0.68f, 0.51f, -0.68f, 0.95f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1.0f, -0.44f, 1f, -0.99f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, -0.01f)
                curveToRelative(0f, -0.73f, -0.55f, -3f, -4f, -3f)
                verticalLineToRelative(1f)
                curveToRelative(1.57f, 0f, 2.32f, 0.54f, 2.68f, 1.05f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
                moveTo(18f, 9f)
                verticalLineToRelative(-1f)
                curveToRelative(-3.95f, 0f, -4f, 2.97f, -4f, 3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.44f, -0.29f, -0.82f, -0.69f, -0.95f)
                curveToRelative(0.35f, -0.52f, 1.1f, -1.05f, 2.69f, -1.05f)
                close()
            }
        }.also { _Angry = it}
