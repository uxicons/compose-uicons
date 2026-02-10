package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Sr.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 10f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-0.73f, -2.74f, -2.96f, -4.91f, -5.74f, -5.69f)
                lineTo(17f, 1.94f)
                curveToRelative(0f, -0.61f, -0.59f, -1.07f, -1.18f, -0.9f)
                curveToRelative(-1.33f, 0.38f, -2.36f, 1.57f, -2.7f, 2.96f)
                horizontalLineToRelative(-4.86f)
                curveToRelative(-2.28f, 0f, -4.35f, 0.9f, -5.86f, 2.35f)
                curveToRelative(-0.21f, -0.42f, -0.35f, -0.92f, -0.42f, -1.47f)
                curveToRelative(-0.06f, -0.55f, -0.56f, -0.94f, -1.11f, -0.88f)
                curveTo(0.34f, 4.07f, -0.06f, 4.57f, 0.01f, 5.12f)
                curveToRelative(0.13f, 1.13f, 0.49f, 2.11f, 1.08f, 2.9f)
                curveTo(0.48f, 9.05f, 0.1f, 10.22f, 0.02f, 11.47f)
                curveToRelative(-0.2f, 3.08f, 1.35f, 5.93f, 3.98f, 7.45f)
                verticalLineToRelative(0.08f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.42f, -0.84f, 2.83f, -2f)
                horizontalLineToRelative(2.34f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                curveToRelative(1.51f, 0f, 2.76f, -1.12f, 2.97f, -2.57f)
                curveToRelative(2.05f, -0.82f, 3.63f, -2.45f, 4.44f, -4.43f)
                horizontalLineToRelative(0.59f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Pig = it}
