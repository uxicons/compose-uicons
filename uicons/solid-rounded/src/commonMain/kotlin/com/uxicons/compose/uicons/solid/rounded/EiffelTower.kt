package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EiffelTower: ImageVector? = null

val Icons.Sr.EiffelTower: ImageVector
    get() = _EiffelTower ?: UXIcon(name = "EiffelTower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 13f)
                curveToRelative(-0.67f, -1.03f, -1.22f, -2.03f, -1.63f, -3.03f)
                curveToRelative(0.49f, -0.07f, 0.87f, -0.47f, 0.87f, -0.97f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-0.33f, -1.28f, -0.47f, -2.6f, -0.47f, -4f)
                verticalLineToRelative(-1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.4f, -0.15f, 2.72f, -0.47f, 4f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.51f, 0.38f, 0.91f, 0.87f, 0.97f)
                curveToRelative(-0.41f, 1.0f, -0.96f, 2.0f, -1.63f, 3.03f)
                horizontalLineToRelative(7.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.41f, 20.59f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.01f, -0.02f, -0.01f)
                curveToRelative(-1.29f, -1.24f, -2.41f, -2.38f, -3.4f, -3.47f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.1f)
                curveToRelative(-0.99f, 1.09f, -2.12f, 2.24f, -3.41f, 3.49f)
                curveToRelative(-0.38f, 0.38f, -0.59f, 0.88f, -0.59f, 1.41f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2.0f, 2f)
                lineToRelative(3.09f, -0.01f)
                curveToRelative(0.49f, 0f, 0.9f, -0.35f, 0.98f, -0.83f)
                curveToRelative(0.41f, -2.41f, 2.48f, -4.16f, 4.92f, -4.16f)
                reflectiveCurveToRelative(4.52f, 1.75f, 4.92f, 4.16f)
                curveToRelative(0.08f, 0.48f, 0.5f, 0.83f, 0.98f, 0.83f)
                lineToRelative(3.09f, 0.01f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                close()
            }
        }.also { _EiffelTower = it}
