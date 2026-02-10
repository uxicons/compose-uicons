package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Rr.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.44f)
                curveToRelative(-1.25f, 0f, -2.31f, 0.93f, -2.48f, 2.17f)
                lineToRelative(-0.55f, 4.1f)
                curveToRelative(-0.21f, 1.56f, -0.94f, 3.04f, -2.06f, 4.16f)
                lineTo(1.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(11.28f, -11.28f)
                curveToRelative(0.81f, -0.81f, 1.34f, -1.88f, 1.49f, -3.01f)
                lineToRelative(0.55f, -4.1f)
                curveToRelative(0.3f, -2.23f, 2.22f, -3.9f, 4.46f, -3.9f)
                horizontalLineToRelative(1.44f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
            }
        }.also { _Staff = it}
