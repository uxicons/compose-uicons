package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeDeciduous: ImageVector? = null

val Icons.Sc.TreeDeciduous: ImageVector
    get() = _TreeDeciduous ?: UXIcon(name = "TreeDeciduous") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 12f)
                curveToRelative(0f, -1.87f, -1.29f, -3.45f, -3.03f, -3.88f)
                curveToRelative(0.02f, -0.21f, 0.03f, -0.41f, 0.03f, -0.62f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 0.21f, 0.01f, 0.41f, 0.03f, 0.62f)
                curveToRelative(-1.74f, 0.43f, -3.03f, 2.01f, -3.03f, 3.88f)
                curveToRelative(0f, 2.34f, 1.43f, 5.14f, 8f, 5.5f)
                verticalLineToRelative(-3.78f)
                curveToRelative(-0.67f, -0.47f, -1.53f, -1.17f, -2.28f, -2.09f)
                curveToRelative(-0.35f, -0.43f, -0.28f, -1.06f, 0.15f, -1.41f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.28f, 1.41f, 0.15f)
                curveToRelative(0.23f, 0.28f, 0.48f, 0.54f, 0.72f, 0.78f)
                verticalLineToRelative(-1.76f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.77f)
                curveToRelative(0.25f, -0.24f, 0.49f, -0.5f, 0.72f, -0.78f)
                curveToRelative(0.35f, -0.43f, 0.98f, -0.49f, 1.41f, -0.15f)
                reflectiveCurveToRelative(0.49f, 0.98f, 0.15f, 1.41f)
                curveToRelative(-0.76f, 0.93f, -1.63f, 1.65f, -2.28f, 2.11f)
                verticalLineToRelative(3.76f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(0.02f, 4.0f)
                curveToRelative(0.0f, 0.83f, 0.65f, 1.5f, 1.48f, 1.5f)
                curveToRelative(0.83f, -0.0f, 1.52f, -0.69f, 1.52f, -1.52f)
                lineToRelative(-0.02f, -3.98f)
                curveToRelative(6.56f, -0.36f, 8f, -3.16f, 8f, -5.5f)
                close()
            }
        }.also { _TreeDeciduous = it}
