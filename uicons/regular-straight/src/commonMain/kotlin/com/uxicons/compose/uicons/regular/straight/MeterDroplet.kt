package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterDroplet: ImageVector? = null

val Icons.Rs.MeterDroplet: ImageVector
    get() = _MeterDroplet ?: UXIcon(name = "MeterDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.2f, 23.9f)
                curveToRelative(0.01f, 0.01f, 0.03f, 0.02f, 0.04f, 0.04f)
                curveToRelative(-0.41f, 0.04f, -0.82f, 0.06f, -1.24f, 0.06f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 0.48f, -0.04f, 0.95f, -0.09f, 1.42f)
                curveToRelative(-0.04f, -0.05f, -0.08f, -0.1f, -0.13f, -0.14f)
                lineToRelative(-1.8f, -1.76f)
                curveToRelative(-0.26f, -5.29f, -4.63f, -9.51f, -9.97f, -9.51f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveToRelative(0f, 5.45f, 4.39f, 9.89f, 9.81f, 9.99f)
                curveToRelative(0.35f, 0.7f, 0.81f, 1.34f, 1.38f, 1.91f)
                close()
                moveTo(7f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22.38f, 14.7f)
                curveToRelative(1.05f, 1.05f, 1.62f, 2.43f, 1.62f, 3.9f)
                reflectiveCurveToRelative(-0.57f, 2.85f, -1.61f, 3.89f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
                curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
                reflectiveCurveToRelative(0.57f, -2.85f, 1.61f, -3.89f)
                lineToRelative(3.89f, -3.8f)
                lineToRelative(3.88f, 3.8f)
                close()
                moveTo(22f, 18.6f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                lineToRelative(-2.48f, -2.42f)
                lineToRelative(-2.48f, 2.43f)
                curveToRelative(-0.65f, 0.65f, -1.02f, 1.53f, -1.02f, 2.47f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.02f, 2.48f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                curveToRelative(0.66f, -0.66f, 1.02f, -1.54f, 1.02f, -2.48f)
                close()
            }
        }.also { _MeterDroplet = it}
