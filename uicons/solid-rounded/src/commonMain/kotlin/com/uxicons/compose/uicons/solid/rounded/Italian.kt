package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Italian: ImageVector? = null

val Icons.Sr.Italian: ImageVector
    get() = _Italian ?: UXIcon(name = "Italian") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineToRelative(12.85f)
                curveToRelative(0.05f, 1.66f, -1.98f, 2.75f, -3.34f, 1.79f)
                lineToRelative(-3.96f, -2.64f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-1.45f, 0f, -2.75f, -0.63f, -3.66f, -1.62f)
                lineToRelative(0.57f, -0.38f)
                horizontalLineToRelative(6.09f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                lineTo(21f, 5f)
                curveToRelative(0f, -0.19f, -0.01f, -0.38f, -0.03f, -0.57f)
                curveToRelative(1.78f, 0.77f, 3.03f, 2.52f, 3.03f, 4.57f)
                close()
                moveTo(14f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(12.85f)
                curveToRelative(-0.05f, 1.66f, 1.98f, 2.75f, 3.34f, 1.79f)
                lineToRelative(3.96f, -2.64f)
                horizontalLineToRelative(6.7f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(19f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7.6f, 11.2f)
                curveToRelative(0f, 0.44f, -0.36f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.36f, -0.8f, -0.8f)
                lineTo(6f, 5.8f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
                reflectiveCurveToRelative(0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineToRelative(5.4f)
                close()
                moveTo(12.8f, 6.6f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(4.6f)
                curveToRelative(0f, 0.44f, -0.36f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.36f, -0.8f, -0.8f)
                lineTo(10.3f, 6.6f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-0.44f, 0f, -0.8f, -0.36f, -0.8f, -0.8f)
                reflectiveCurveToRelative(0.36f, -0.8f, 0.8f, -0.8f)
                horizontalLineToRelative(3.4f)
                curveToRelative(0.44f, 0f, 0.8f, 0.36f, 0.8f, 0.8f)
                reflectiveCurveToRelative(-0.36f, 0.8f, -0.8f, 0.8f)
                close()
            }
        }.also { _Italian = it}
