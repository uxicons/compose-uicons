package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BagMapPin: ImageVector? = null

val Icons.Sr.BagMapPin: ImageVector
    get() = _BagMapPin ?: UXIcon(name = "BagMapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3.12f)
                lineToRelative(-1.05f, -1.02f)
                curveToRelative(-2.75f, -2.75f, -2.75f, -7.19f, -0.02f, -9.92f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0f, 9.9f)
                lineToRelative(-1.07f, 1.05f)
                horizontalLineToRelative(3.12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24.0f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                lineTo(8f, 6f)
                close()
                moveTo(15.54f, 14.47f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.53f, -1.46f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.33f, 0f, -2.59f, 0.52f, -3.53f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.01f, 7.08f)
                lineToRelative(1.78f, 1.74f)
                curveToRelative(0.48f, 0.47f, 1.11f, 0.71f, 1.75f, 0.71f)
                reflectiveCurveToRelative(1.26f, -0.23f, 1.75f, -0.71f)
                lineToRelative(1.79f, -1.75f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                close()
                moveTo(12f, 19.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BagMapPin = it}
