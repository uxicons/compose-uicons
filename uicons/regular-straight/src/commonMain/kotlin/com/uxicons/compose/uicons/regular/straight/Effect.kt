package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Effect: ImageVector? = null

val Icons.Rs.Effect: ImageVector
    get() = _Effect ?: UXIcon(name = "Effect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(14.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                curveToRelative(1.2f, 0f, 2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2.61f)
                lineToRelative(4.42f, 14.54f)
                curveToRelative(-1.2f, 0.69f, -2.03f, 1.97f, -2.03f, 3.46f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                curveToRelative(-0.02f, 0f, -0.03f, 0.01f, -0.05f, 0.01f)
                lineTo(15.7f, 2f)
                horizontalLineToRelative(8.3f)
                close()
                moveTo(22f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(9f, 16.14f)
                curveToRelative(-0.79f, 0.2f, -1.48f, 0.64f, -2f, 1.24f)
                curveToRelative(-0.52f, -0.6f, -1.21f, -1.03f, -2f, -1.24f)
                lineTo(5f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14.14f)
                close()
            }
        }.also { _Effect = it}
