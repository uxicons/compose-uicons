package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Ts.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(7.11f)
                lineToRelative(3.9f, 3.28f)
                curveToRelative(0.28f, 0.25f, 0.65f, 0.38f, 1.0f, 0.38f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.37f)
                lineToRelative(3.98f, -3.29f)
                horizontalLineToRelative(7.03f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6.39f)
                lineToRelative(-4.28f, 3.54f)
                curveToRelative(-0.19f, 0.17f, -0.47f, 0.17f, -0.67f, -0.01f)
                lineToRelative(-4.19f, -3.53f)
                lineTo(1f, 19f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(12f, 3.98f)
                curveToRelative(-0.55f, 0f, -1.03f, 0.39f, -1.22f, 0.99f)
                lineToRelative(-3.28f, 11.02f)
                horizontalLineToRelative(1.05f)
                lineToRelative(1.19f, -4f)
                horizontalLineToRelative(4.53f)
                lineToRelative(1.19f, 4f)
                horizontalLineToRelative(1.05f)
                lineToRelative(-3.28f, -11.02f)
                curveToRelative(-0.19f, -0.6f, -0.67f, -0.99f, -1.22f, -0.99f)
                close()
                moveTo(10.03f, 11f)
                lineToRelative(1.7f, -5.73f)
                curveToRelative(0.04f, -0.14f, 0.14f, -0.29f, 0.26f, -0.29f)
                reflectiveCurveToRelative(0.22f, 0.15f, 0.26f, 0.29f)
                lineToRelative(1.7f, 5.73f)
                horizontalLineToRelative(-3.93f)
                close()
            }
        }.also { _Answer = it}
