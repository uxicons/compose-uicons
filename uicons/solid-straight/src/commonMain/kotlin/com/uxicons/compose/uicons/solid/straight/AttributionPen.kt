package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Ss.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(7.02f, 8.44f)
                lineToRelative(-4.52f, 1f)
                lineTo(0.01f, 18.58f)
                lineToRelative(6.01f, -6.01f)
                lineToRelative(1.41f, 1.41f)
                lineTo(1.42f, 19.99f)
                lineToRelative(9.13f, -2.49f)
                lineToRelative(1f, -4.52f)
                lineToRelative(-4.54f, -4.54f)
                close()
                moveTo(19.19f, 0.74f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-6.72f, 6.72f)
                lineToRelative(3.59f, 3.59f)
                lineToRelative(6.72f, -6.72f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.8f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                close()
            }
        }.also { _AttributionPen = it}
