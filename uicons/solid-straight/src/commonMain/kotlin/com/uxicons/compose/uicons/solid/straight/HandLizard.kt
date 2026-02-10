package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLizard: ImageVector? = null

val Icons.Ss.HandLizard: ImageVector
    get() = _HandLizard ?: UXIcon(name = "HandLizard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 1f)
                horizontalLineTo(2.07f)
                curveTo(1.06f, 1f, 0.18f, 1.72f, 0.03f, 2.67f)
                curveToRelative(-0.1f, 0.59f, 0.07f, 1.18f, 0.45f, 1.63f)
                curveToRelative(0.38f, 0.45f, 0.94f, 0.71f, 1.52f, 0.71f)
                horizontalLineTo(7.73f)
                curveToRelative(1.68f, 0f, 3.12f, 1.18f, 3.27f, 2.68f)
                curveToRelative(0.09f, 0.87f, -0.2f, 1.69f, -0.78f, 2.33f)
                curveToRelative(-0.58f, 0.64f, -1.35f, 0.99f, -2.21f, 0.99f)
                horizontalLineToRelative(-2.42f)
                curveToRelative(-1.26f, 0f, -2.36f, 0.9f, -2.56f, 2.09f)
                curveToRelative(-0.12f, 0.73f, 0.09f, 1.47f, 0.56f, 2.03f)
                reflectiveCurveToRelative(1.17f, 0.88f, 1.9f, 0.88f)
                horizontalLineTo(14f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(10f)
                verticalLineTo(13.73f)
                curveToRelative(0f, -1.98f, -0.58f, -3.9f, -1.68f, -5.55f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.8f, -2.7f, -4.77f, -4.35f, -8f, -4.45f)
                horizontalLineToRelative(0f)
            }
        }.also { _HandLizard = it}
