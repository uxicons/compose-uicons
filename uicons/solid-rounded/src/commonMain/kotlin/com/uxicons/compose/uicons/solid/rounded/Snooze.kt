package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snooze: ImageVector? = null

val Icons.Sr.Snooze: ImageVector
    get() = _Snooze ?: UXIcon(name = "Snooze") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 24f)
                lineTo(2.46f, 24f)
                curveToRelative(-1.08f, 0f, -2.0f, -0.67f, -2.33f, -1.69f)
                reflectiveCurveToRelative(0.01f, -2.11f, 0.88f, -2.75f)
                lineToRelative(7.8f, -5.73f)
                curveToRelative(0.23f, -0.17f, 0.2f, -0.4f, 0.16f, -0.52f)
                curveToRelative(-0.04f, -0.12f, -0.15f, -0.32f, -0.43f, -0.32f)
                lineTo(1.01f, 13f)
                curveTo(0.46f, 13f, 0.01f, 12.55f, 0.01f, 12f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.08f, 0f, 2.0f, 0.67f, 2.33f, 1.69f)
                curveToRelative(0.34f, 1.03f, -0.01f, 2.11f, -0.88f, 2.75f)
                lineToRelative(-7.8f, 5.73f)
                curveToRelative(-0.23f, 0.17f, -0.2f, 0.4f, -0.16f, 0.51f)
                reflectiveCurveToRelative(0.15f, 0.32f, 0.43f, 0.32f)
                horizontalLineToRelative(7.54f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(24.0f, 21f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.81f)
                lineToRelative(4.02f, -3.52f)
                curveToRelative(0.68f, -0.5f, 0.96f, -1.35f, 0.69f, -2.15f)
                reflectiveCurveToRelative(-0.98f, -1.33f, -1.83f, -1.33f)
                horizontalLineToRelative(-4.08f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-4.02f, 3.52f)
                curveToRelative(-0.68f, 0.5f, -0.96f, 1.35f, -0.69f, 2.15f)
                reflectiveCurveToRelative(0.98f, 1.33f, 1.83f, 1.33f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineToRelative(-5.0f, -0.04f)
                lineToRelative(5.16f, -4.24f)
                curveToRelative(0.73f, -0.54f, 1.02f, -1.44f, 0.74f, -2.3f)
                curveToRelative(-0.28f, -0.86f, -1.05f, -1.42f, -1.96f, -1.42f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineToRelative(5.0f, 0.04f)
                lineToRelative(-5.16f, 4.24f)
                curveToRelative(-0.73f, 0.54f, -1.02f, 1.44f, -0.74f, 2.3f)
                curveToRelative(0.28f, 0.86f, 1.05f, 1.42f, 1.96f, 1.42f)
                horizontalLineToRelative(4.94f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Snooze = it}
