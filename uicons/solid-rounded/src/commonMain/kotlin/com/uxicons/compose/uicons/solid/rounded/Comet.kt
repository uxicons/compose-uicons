package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comet: ImageVector? = null

val Icons.Sr.Comet: ImageVector
    get() = _Comet ?: UXIcon(name = "Comet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(20.64f, 9.61f)
                curveToRelative(-0.3f, 0.48f, -0.6f, 0.95f, -0.87f, 1.4f)
                horizontalLineToRelative(0.73f)
                curveToRelative(0.92f, 0f, 1.76f, 0.5f, 2.2f, 1.3f)
                curveToRelative(0.44f, 0.81f, 0.4f, 1.78f, -0.09f, 2.56f)
                curveToRelative(-2.84f, 4.42f, -8.04f, 9.14f, -14.1f, 9.14f)
                curveToRelative(-2.27f, 0f, -4.4f, -0.88f, -6.01f, -2.49f)
                curveToRelative(-1.6f, -1.61f, -2.49f, -3.74f, -2.49f, -6.01f)
                curveTo(0f, 9.44f, 4.72f, 4.24f, 9.14f, 1.4f)
                curveToRelative(0.77f, -0.49f, 1.75f, -0.53f, 2.56f, -0.09f)
                curveToRelative(0.8f, 0.44f, 1.3f, 1.28f, 1.3f, 2.2f)
                verticalLineToRelative(0.73f)
                curveToRelative(0.44f, -0.27f, 0.91f, -0.57f, 1.4f, -0.87f)
                curveToRelative(2.08f, -1.3f, 4.22f, -2.65f, 5.52f, -3.15f)
                curveToRelative(1.12f, -0.44f, 2.35f, -0.18f, 3.21f, 0.67f)
                curveToRelative(0.85f, 0.85f, 1.11f, 2.08f, 0.67f, 3.21f)
                curveToRelative(-0.51f, 1.29f, -1.85f, 3.44f, -3.15f, 5.52f)
                close()
                moveTo(13f, 15.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                close()
            }
        }.also { _Comet = it}
