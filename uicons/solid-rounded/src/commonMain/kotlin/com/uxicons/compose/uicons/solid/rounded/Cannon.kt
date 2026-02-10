package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cannon: ImageVector? = null

val Icons.Sr.Cannon: ImageVector
    get() = _Cannon ?: UXIcon(name = "Cannon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.04f, 19.33f)
                curveToRelative(0.08f, 0.71f, 0.27f, 1.39f, 0.56f, 2.02f)
                curveToRelative(-0.97f, 0.52f, -2.02f, 0.79f, -3.08f, 0.79f)
                curveToRelative(-2.04f, 0f, -4.05f, -0.96f, -5.32f, -2.75f)
                curveToRelative(-2.06f, -2.92f, -1.39f, -6.96f, 1.51f, -9.04f)
                lineToRelative(6.33f, 8.98f)
                close()
                moveTo(22.98f, 9.44f)
                lineToRelative(-4.06f, 3.68f)
                curveToRelative(-0.99f, -0.62f, -2.16f, -0.98f, -3.42f, -0.98f)
                curveToRelative(-2.8f, 0f, -5.17f, 1.77f, -6.09f, 4.25f)
                lineToRelative(-4.95f, -7.02f)
                lineToRelative(2.41f, -1.32f)
                curveTo(6.17f, 5.24f, 3.9f, 3.31f, 0.9f, 2.99f)
                curveTo(0.35f, 2.94f, -0.05f, 2.44f, 0.01f, 1.9f)
                curveToRelative(0.06f, -0.55f, 0.56f, -0.95f, 1.1f, -0.89f)
                curveToRelative(3.63f, 0.38f, 6.5f, 2.74f, 7.55f, 6.06f)
                lineToRelative(9.09f, -4.99f)
                curveToRelative(1.38f, -0.76f, 3.1f, -0.36f, 4.01f, 0.92f)
                lineToRelative(1.67f, 2.36f)
                curveToRelative(0.9f, 1.28f, 0.71f, 3.03f, -0.45f, 4.08f)
                close()
            }
        }.also { _Cannon = it}
