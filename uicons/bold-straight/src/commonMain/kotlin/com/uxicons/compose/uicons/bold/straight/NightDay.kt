package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightDay: ImageVector? = null

val Icons.Bs.NightDay: ImageVector
    get() = _NightDay ?: UXIcon(name = "NightDay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 2.16f)
                lineTo(2.16f, 23.96f)
                lineTo(0.04f, 21.84f)
                lineTo(21.84f, 0.04f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(3.33f, 11.55f)
                lineToRelative(-1.89f, 1.89f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.88f, -3.88f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                lineToRelative(1.05f, 1.05f)
                lineToRelative(3.93f, -3.87f)
                lineToRelative(-2.1f, -2.14f)
                lineToRelative(-1.94f, 1.91f)
                curveToRelative(-0.48f, -0.29f, -1.0f, -0.48f, -1.53f, -0.62f)
                lineTo(10.02f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(7.02f, 2.7f)
                curveToRelative(-0.54f, 0.14f, -1.06f, 0.36f, -1.55f, 0.65f)
                lineToRelative(-1.91f, -1.91f)
                lineTo(1.44f, 3.56f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(-0.29f, 0.49f, -0.51f, 1.01f, -0.65f, 1.55f)
                lineTo(0f, 7.02f)
                verticalLineToRelative(3f)
                lineTo(2.72f, 10.02f)
                curveToRelative(0.14f, 0.53f, 0.33f, 1.04f, 0.61f, 1.52f)
                close()
                moveTo(23.9f, 10.5f)
                curveToRelative(-0.89f, -0.97f, -2.01f, -1.72f, -3.28f, -2.17f)
                lineToRelative(-2.42f, 2.42f)
                curveToRelative(-0.98f, 1.39f, -1.73f, 3.07f, -1.73f, 5.18f)
                curveToRelative(0f, 1.87f, 0.62f, 3.63f, 1.67f, 5.06f)
                curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f)
                curveToRelative(-2.75f, 0f, -4.99f, -2.21f, -5.05f, -4.95f)
                lineToRelative(-2.55f, 2.55f)
                curveToRelative(1.1f, 3.14f, 4.08f, 5.4f, 7.6f, 5.4f)
                curveToRelative(2.36f, 0f, 4.47f, -1.02f, 5.95f, -2.63f)
                curveToRelative(-2.53f, -0.51f, -4.44f, -2.75f, -4.44f, -5.43f)
                reflectiveCurveToRelative(1.91f, -4.92f, 4.44f, -5.43f)
                close()
            }
        }.also { _NightDay = it}
