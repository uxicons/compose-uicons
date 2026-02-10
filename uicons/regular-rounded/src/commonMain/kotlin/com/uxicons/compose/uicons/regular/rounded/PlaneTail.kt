package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Rr.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.61f, 16.09f)
                curveToRelative(-1.15f, -0.41f, -2.59f, -0.91f, -4.22f, -1.4f)
                lineToRelative(3.08f, -11.54f)
                curveToRelative(0.2f, -0.76f, 0.04f, -1.55f, -0.43f, -2.17f)
                curveToRelative(-0.48f, -0.62f, -1.2f, -0.98f, -1.98f, -0.98f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(-1.41f, 0f, -2.75f, 0.67f, -3.6f, 1.8f)
                lineToRelative(-5.85f, 7.8f)
                curveToRelative(-1.17f, 1.56f, -2.96f, 2.4f, -3.79f, 2.4f)
                lineTo(1f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(3.01f, 14f)
                curveToRelative(6.9f, 0f, 14.82f, 2.48f, 18.92f, 3.97f)
                curveToRelative(0.03f, 0.01f, 0.07f, 0.03f, 0.07f, 0.1f)
                curveToRelative(0f, 0.07f, -0.04f, 0.09f, -0.07f, 0.1f)
                curveToRelative(-4.1f, 1.44f, -12.02f, 3.84f, -18.92f, 3.84f)
                lineTo(1f, 22.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(3.01f, 24.0f)
                curveToRelative(7.2f, 0f, 15.36f, -2.48f, 19.58f, -3.96f)
                curveToRelative(0.85f, -0.3f, 1.41f, -1.07f, 1.41f, -1.97f)
                reflectiveCurveToRelative(-0.54f, -1.68f, -1.39f, -1.99f)
                close()
                moveTo(10.9f, 10.8f)
                lineToRelative(5.85f, -7.8f)
                curveToRelative(0.47f, -0.63f, 1.22f, -1f, 2f, -1f)
                horizontalLineToRelative(0.3f)
                curveToRelative(0.21f, 0f, 0.34f, 0.12f, 0.4f, 0.2f)
                curveToRelative(0.06f, 0.07f, 0.14f, 0.23f, 0.09f, 0.43f)
                lineToRelative(-3.07f, 11.5f)
                curveToRelative(-2.25f, -0.62f, -4.75f, -1.21f, -7.29f, -1.6f)
                curveToRelative(0.62f, -0.47f, 1.22f, -1.04f, 1.73f, -1.72f)
                close()
                moveTo(8f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _PlaneTail = it}
