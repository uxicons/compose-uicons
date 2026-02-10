package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Sr.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(19f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(11.56f, 12.98f)
                lineToRelative(-0.61f, 2.75f)
                curveToRelative(-0.24f, 1.09f, -1.06f, 1.95f, -2.14f, 2.24f)
                lineToRelative(-5.23f, 1.43f)
                curveToRelative(-0.59f, 0.16f, -1.01f, -0.56f, -0.58f, -0.99f)
                lineToRelative(3.72f, -3.72f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.72f, 3.72f)
                curveToRelative(-0.43f, 0.43f, -1.15f, 0.01f, -0.99f, -0.58f)
                lineToRelative(1.43f, -5.23f)
                curveToRelative(0.29f, -1.07f, 1.16f, -1.9f, 2.24f, -2.14f)
                lineToRelative(2.75f, -0.61f)
                lineToRelative(4.54f, 4.54f)
                close()
                moveTo(19.94f, 2.54f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.8f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(-3.59f, -3.59f)
                lineTo(15.6f, 0.74f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
            }
        }.also { _AttributionPen = it}
