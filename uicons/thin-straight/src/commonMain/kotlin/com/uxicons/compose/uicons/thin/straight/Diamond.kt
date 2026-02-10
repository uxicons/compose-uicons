package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Ts.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.52f, 6.25f)
                lineToRelative(-3.69f, -5.17f)
                curveToRelative(-0.48f, -0.68f, -1.27f, -1.08f, -2.11f, -1.08f)
                lineTo(6.28f, 0f)
                curveToRelative(-0.83f, 0f, -1.62f, 0.41f, -2.11f, 1.08f)
                lineTo(0.48f, 6.25f)
                curveToRelative(-0.67f, 0.93f, -0.64f, 2.21f, 0.07f, 3.1f)
                lineToRelative(11.45f, 14.66f)
                lineToRelative(11.45f, -14.65f)
                curveToRelative(0.71f, -0.9f, 0.74f, -2.18f, 0.07f, -3.11f)
                close()
                moveTo(19.01f, 1.67f)
                reflectiveCurveToRelative(3.76f, 5.28f, 3.79f, 5.33f)
                horizontalLineToRelative(-5.95f)
                lineToRelative(-2.06f, -6f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.51f, 0f, 1.0f, 0.25f, 1.29f, 0.67f)
                close()
                moveTo(8.2f, 7f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(3.47f)
                lineToRelative(2.06f, 6f)
                horizontalLineToRelative(-7.6f)
                close()
                moveTo(15.83f, 8f)
                lineToRelative(-3.83f, 12.68f)
                lineToRelative(-3.83f, -12.68f)
                horizontalLineToRelative(7.65f)
                close()
                moveTo(4.99f, 1.67f)
                curveToRelative(0.3f, -0.42f, 0.78f, -0.67f, 1.29f, -0.67f)
                horizontalLineToRelative(2.93f)
                lineToRelative(-2.06f, 6f)
                lineTo(1.19f, 7f)
                curveToRelative(0.03f, -0.06f, 3.79f, -5.33f, 3.79f, -5.33f)
                close()
                moveTo(1.02f, 8f)
                horizontalLineToRelative(6.11f)
                lineToRelative(4.01f, 13.29f)
                lineTo(1.34f, 8.74f)
                curveToRelative(-0.17f, -0.22f, -0.28f, -0.47f, -0.32f, -0.74f)
                close()
                moveTo(12.86f, 21.29f)
                lineToRelative(4.01f, -13.29f)
                horizontalLineToRelative(6.11f)
                curveToRelative(-0.04f, 0.27f, -0.15f, 0.52f, -0.32f, 0.74f)
                lineToRelative(-9.8f, 12.55f)
                close()
            }
        }.also { _Diamond = it}
