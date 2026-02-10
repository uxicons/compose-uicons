package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Sr.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.36f, 16.77f)
                curveToRelative(-0.42f, -0.35f, -0.48f, -0.98f, -0.13f, -1.41f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                lineToRelative(6.93f, 5.78f)
                curveToRelative(0.27f, -0.62f, 0.43f, -1.29f, 0.43f, -2.01f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-10.71f)
                lineToRelative(2.77f, 5.47f)
                curveToRelative(0.17f, 0.33f, 0.51f, 0.53f, 0.89f, 0.53f)
                horizontalLineToRelative(6.05f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(1.15f, 2.0f)
                curveToRelative(0.27f, 0.48f, 0.11f, 1.09f, -0.37f, 1.36f)
                curveToRelative(-0.16f, 0.09f, -0.33f, 0.13f, -0.49f, 0.13f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.18f, -0.87f, -0.5f)
                lineToRelative(-1.71f, -3.0f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-1.13f, 0f, -2.15f, -0.62f, -2.67f, -1.62f)
                lineTo(6.05f, 0f)
                horizontalLineToRelative(-1.05f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.53f, 0.1f, 1.03f, 0.26f, 1.5f)
                lineToRelative(5.74f, -2.87f)
                verticalLineToRelative(-3.63f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.64f)
                lineToRelative(2.55f, -1.27f)
                curveToRelative(0.49f, -0.25f, 1.09f, -0.05f, 1.34f, 0.45f)
                curveToRelative(0.25f, 0.49f, 0.05f, 1.09f, -0.45f, 1.34f)
                lineTo(1.23f, 22.25f)
                curveToRelative(0.92f, 1.06f, 2.26f, 1.75f, 3.77f, 1.75f)
                horizontalLineToRelative(14f)
                curveToRelative(1.32f, 0f, 2.51f, -0.52f, 3.41f, -1.36f)
                lineToRelative(-7.05f, -5.87f)
                close()
            }
        }.also { _Damage = it}
