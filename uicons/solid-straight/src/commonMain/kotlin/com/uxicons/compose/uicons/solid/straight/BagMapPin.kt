package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagMapPin: ImageVector? = null

val Icons.Ss.BagMapPin: ImageVector
    get() = _BagMapPin ?: UXIcon(name = "BagMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                curveToRelative(0f, -1.34f, -0.52f, -2.59f, -1.47f, -3.54f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.47f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.47f)
                curveToRelative(-0.94f, 0.94f, -1.47f, 2.2f, -1.47f, 3.54f)
                reflectiveCurveToRelative(0.52f, 2.59f, 1.47f, 3.54f)
                lineToRelative(3.53f, 3.45f)
                lineToRelative(3.54f, -3.46f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                lineTo(0f, 6f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.15f)
                lineToRelative(-2.07f, -2.03f)
                curveToRelative(-1.34f, -1.34f, -2.07f, -3.1f, -2.07f, -4.97f)
                reflectiveCurveToRelative(0.73f, -3.63f, 2.05f, -4.95f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.05f, 4.95f)
                lineToRelative(-2.1f, 2.05f)
                horizontalLineToRelative(6.15f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(8f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                lineTo(8f, 6f)
                close()
            }
        }.also { _BagMapPin = it}
