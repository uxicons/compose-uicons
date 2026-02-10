package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StaplerPaper: ImageVector? = null

val Icons.Ss.StaplerPaper: ImageVector
    get() = _StaplerPaper ?: UXIcon(name = "StaplerPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.64f, 9.37f)
                lineToRelative(6.03f, 6.02f)
                lineToRelative(-8.63f, 8.62f)
                lineToRelative(-8.38f, -8.36f)
                curveToRelative(-0.89f, -0.89f, -0.89f, -2.33f, 0f, -3.21f)
                lineToRelative(3.12f, -3.11f)
                lineToRelative(3.96f, 3.95f)
                lineToRelative(3.91f, -3.9f)
                close()
                moveTo(10.2f, 7.98f)
                horizontalLineToRelative(-4.94f)
                lineToRelative(2.47f, 2.46f)
                lineToRelative(2.47f, -2.46f)
                close()
                moveTo(9.99f, 3.62f)
                lineTo(8.65f, 3.26f)
                lineTo(8.99f, 1.82f)
                curveToRelative(0.32f, -1.29f, 1.64f, -2.08f, 2.93f, -1.75f)
                lineToRelative(10.39f, 2.77f)
                curveToRelative(0.99f, 0.24f, 1.68f, 1.13f, 1.68f, 2.14f)
                lineToRelative(0.01f, 4.99f)
                horizontalLineToRelative(-9.01f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.36f)
                close()
                moveTo(19.99f, 6.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1f, -1.0f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1.0f)
                close()
            }
        }.also { _StaplerPaper = it}
