package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Sr.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.61f, 16.09f)
                curveToRelative(-4.23f, -1.52f, -12.4f, -4.08f, -19.6f, -4.08f)
                lineTo(1f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(3.01f, 24f)
                curveToRelative(7.2f, 0f, 15.36f, -2.48f, 19.58f, -3.96f)
                curveToRelative(0.85f, -0.3f, 1.41f, -1.07f, 1.41f, -1.97f)
                reflectiveCurveToRelative(-0.54f, -1.68f, -1.39f, -1.99f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(8.56f, 10.41f)
                curveToRelative(0.26f, -0.25f, 0.51f, -0.51f, 0.74f, -0.81f)
                lineTo(15.15f, 1.8f)
                curveToRelative(0.84f, -1.13f, 2.19f, -1.8f, 3.6f, -1.8f)
                horizontalLineToRelative(0.3f)
                curveToRelative(0.78f, 0f, 1.5f, 0.36f, 1.98f, 0.98f)
                curveToRelative(0.48f, 0.62f, 0.64f, 1.41f, 0.43f, 2.17f)
                lineToRelative(-2.56f, 9.61f)
                curveToRelative(-3.0f, -0.91f, -6.63f, -1.82f, -10.34f, -2.34f)
                close()
            }
        }.also { _PlaneTail = it}
