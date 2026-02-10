package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Rc.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.37f, 2.29f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.09f, -0.03f, -2.24f, -0.62f, -4.77f, -0.62f)
                reflectiveCurveToRelative(-4.68f, 0.6f, -4.77f, 0.62f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.03f, 0.08f, -0.63f, 2.11f, -0.63f, 4.79f)
                curveToRelative(0f, 0.86f, 0.06f, 1.75f, 0.18f, 2.62f)
                curveToRelative(0.14f, 1.04f, -0.2f, 2.08f, -0.96f, 2.83f)
                lineToRelative(-8.76f, 8.76f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(8.76f, -8.76f)
                curveToRelative(1.18f, -1.18f, 1.75f, -2.87f, 1.52f, -4.52f)
                curveToRelative(-0.11f, -0.78f, -0.16f, -1.57f, -0.16f, -2.34f)
                curveToRelative(0f, -1.6f, 0.25f, -2.96f, 0.41f, -3.67f)
                curveToRelative(0.74f, -0.16f, 2.15f, -0.42f, 3.68f, -0.42f)
                reflectiveCurveToRelative(2.94f, 0.25f, 3.68f, 0.42f)
                curveToRelative(0.16f, 0.71f, 0.41f, 2.06f, 0.41f, 3.67f)
                curveToRelative(0f, 1.57f, -0.24f, 2.9f, -0.4f, 3.63f)
                curveToRelative(-0.74f, 0.12f, -2.09f, 0.29f, -3.6f, 0.29f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(2.49f, 0f, 4.53f, -0.42f, 4.62f, -0.44f)
                curveToRelative(0.36f, -0.07f, 0.65f, -0.34f, 0.75f, -0.69f)
                curveToRelative(0.03f, -0.08f, 0.63f, -2.11f, 0.63f, -4.79f)
                curveToRelative(0f, -2.7f, -0.6f, -4.71f, -0.63f, -4.79f)
                close()
            }
        }.also { _Staff = it}
