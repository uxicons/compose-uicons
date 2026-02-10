package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eclipse: ImageVector? = null

val Icons.Sc.Eclipse: ImageVector
    get() = _Eclipse ?: UXIcon(name = "Eclipse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.23f, 17.78f)
                curveToRelative(-3.88f, 0f, -5.77f, -1.89f, -5.77f, -5.78f)
                reflectiveCurveToRelative(1.89f, -5.78f, 5.77f, -5.78f)
                reflectiveCurveToRelative(5.77f, 1.89f, 5.77f, 5.78f)
                reflectiveCurveToRelative(-1.89f, 5.78f, -5.77f, 5.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.46f, 12f)
                curveToRelative(0f, -2.89f, 0.92f, -5.03f, 2.65f, -6.33f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.22f)
                curveToRelative(-0.98f, 0.12f, -1.82f, 0.37f, -2.54f, 0.75f)
                lineToRelative(-0.64f, -0.64f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, -0.0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                lineToRelative(0.65f, 0.65f)
                curveToRelative(-0.38f, 0.72f, -0.63f, 1.56f, -0.75f, 2.54f)
                horizontalLineToRelative(-1.21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.21f)
                curveToRelative(0.12f, 0.98f, 0.37f, 1.83f, 0.75f, 2.54f)
                lineToRelative(-0.65f, 0.65f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.53f, 0.0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(0.64f, -0.64f)
                curveToRelative(0.71f, 0.38f, 1.56f, 0.63f, 2.54f, 0.75f)
                verticalLineToRelative(1.22f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.8f)
                curveToRelative(-1.74f, -1.3f, -2.65f, -3.44f, -2.65f, -6.33f)
                close()
            }
        }.also { _Eclipse = it}
