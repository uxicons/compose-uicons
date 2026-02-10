package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmExclamation: ImageVector? = null

val Icons.Ts.AlarmExclamation: ImageVector
    get() = _AlarmExclamation ?: UXIcon(name = "AlarmExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                curveToRelative(0f, -5.9f, -4.67f, -10.73f, -10.5f, -10.99f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.01f)
                curveTo(5.67f, 2.27f, 1f, 7.1f, 1f, 13f)
                curveToRelative(0f, 3.05f, 1.25f, 5.82f, 3.27f, 7.82f)
                lineToRelative(-2.14f, 2.35f)
                lineToRelative(0.74f, 0.67f)
                lineToRelative(2.14f, -2.35f)
                curveToRelative(1.9f, 1.57f, 4.34f, 2.51f, 6.99f, 2.51f)
                reflectiveCurveToRelative(5.09f, -0.94f, 6.99f, -2.51f)
                lineToRelative(2.14f, 2.35f)
                lineToRelative(0.74f, -0.67f)
                lineToRelative(-2.14f, -2.35f)
                curveToRelative(2.02f, -2.0f, 3.27f, -4.76f, 3.27f, -7.82f)
                close()
                moveTo(2f, 13f)
                curveTo(2f, 7.49f, 6.49f, 3f, 12f, 3f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 18.51f, 2f, 13f)
                close()
                moveTo(18.8f, 1.33f)
                lineToRelative(0.5f, -0.86f)
                curveToRelative(1.65f, 0.96f, 3.07f, 2.22f, 4.23f, 3.73f)
                lineToRelative(-0.8f, 0.61f)
                curveToRelative(-1.08f, -1.41f, -2.4f, -2.58f, -3.94f, -3.48f)
                close()
                moveTo(1.25f, 4.83f)
                lineToRelative(-0.8f, -0.6f)
                curveTo(1.61f, 2.71f, 3.04f, 1.44f, 4.69f, 0.47f)
                lineToRelative(0.51f, 0.86f)
                curveToRelative(-1.54f, 0.9f, -2.87f, 2.08f, -3.95f, 3.5f)
                close()
                moveTo(12.5f, 16f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _AlarmExclamation = it}
