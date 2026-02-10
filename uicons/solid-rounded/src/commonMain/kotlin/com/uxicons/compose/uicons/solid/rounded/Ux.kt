package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ux: ImageVector? = null

val Icons.Sr.Ux: ImageVector
    get() = _Ux ?: UXIcon(name = "Ux") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveTo(19.87f, 15.51f)
                curveToRelative(0.27f, 0.48f, 0.1f, 1.09f, -0.38f, 1.36f)
                curveToRelative(-0.15f, 0.09f, -0.32f, 0.13f, -0.49f, 0.13f)
                curveToRelative(-0.35f, 0f, -0.69f, -0.18f, -0.87f, -0.51f)
                lineToRelative(-1.38f, -2.45f)
                lineToRelative(-1.38f, 2.45f)
                curveToRelative(-0.18f, 0.33f, -0.52f, 0.51f, -0.87f, 0.51f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.04f, -0.49f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.88f, -0.38f, -1.36f)
                lineToRelative(1.97f, -3.51f)
                lineToRelative(-1.97f, -3.51f)
                curveToRelative(-0.27f, -0.48f, -0.1f, -1.09f, 0.38f, -1.36f)
                curveToRelative(0.48f, -0.27f, 1.09f, -0.1f, 1.36f, 0.38f)
                lineToRelative(1.38f, 2.45f)
                lineToRelative(1.38f, -2.45f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.38f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.38f, 1.36f)
                lineToRelative(-1.97f, 3.51f)
                lineToRelative(1.97f, 3.51f)
                close()
            }
        }.also { _Ux = it}
