package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoadCheck: ImageVector? = null

val Icons.Rr.RoadCheck: ImageVector
    get() = _RoadCheck ?: UXIcon(name = "RoadCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.48f, 0f, -2.88f, -0.65f, -3.83f, -1.78f)
                curveToRelative(-0.95f, -1.13f, -1.35f, -2.62f, -1.1f, -4.08f)
                lineToRelative(2.45f, -14f)
                curveToRelative(0.42f, -2.4f, 2.49f, -4.14f, 4.93f, -4.14f)
                horizontalLineToRelative(9.09f)
                curveToRelative(2.43f, 0f, 4.5f, 1.74f, 4.92f, 4.13f)
                lineToRelative(0.74f, 4.19f)
                curveToRelative(0.1f, 0.54f, -0.27f, 1.06f, -0.81f, 1.16f)
                curveToRelative(-0.55f, 0.09f, -1.06f, -0.27f, -1.16f, -0.81f)
                lineToRelative(-0.74f, -4.19f)
                curveToRelative(-0.25f, -1.44f, -1.5f, -2.48f, -2.95f, -2.48f)
                horizontalLineToRelative(-9.09f)
                curveToRelative(-1.46f, 0f, -2.7f, 1.04f, -2.96f, 2.48f)
                lineToRelative(-2.45f, 14f)
                curveToRelative(-0.15f, 0.88f, 0.09f, 1.77f, 0.66f, 2.45f)
                curveToRelative(0.57f, 0.68f, 1.41f, 1.07f, 2.3f, 1.07f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(18.99f, 16.06f)
                lineTo(17.09f, 17.89f)
                curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0f)
                lineToRelative(-0.79f, -0.77f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.38f, -1.41f, 0.02f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                lineToRelative(0.78f, 0.77f)
                curveToRelative(0.46f, 0.45f, 1.06f, 0.68f, 1.66f, 0.68f)
                reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
                lineToRelative(1.9f, -1.82f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.01f, 0.03f, -1.41f)
                reflectiveCurveToRelative(-1.01f, -0.41f, -1.41f, -0.03f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(22f, 17.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                close()
            }
        }.also { _RoadCheck = it}
