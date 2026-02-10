package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lamp: ImageVector? = null

val Icons.Rr.Lamp: ImageVector
    get() = _Lamp ?: UXIcon(name = "Lamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 10.21f)
                lineToRelative(-0.78f, -6.09f)
                curveToRelative(-0.3f, -2.35f, -2.31f, -4.12f, -4.68f, -4.12f)
                lineTo(5.49f, 0f)
                curveTo(3.12f, 0f, 1.11f, 1.77f, 0.81f, 4.12f)
                lineTo(0.03f, 10.21f)
                curveToRelative(-0.15f, 1.21f, 0.22f, 2.43f, 1.03f, 3.35f)
                curveToRelative(0.81f, 0.92f, 1.97f, 1.44f, 3.19f, 1.44f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.83f, -1.54f, 1.99f, -2f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.62f, -1.29f, -2.94f, -2.9f, -3.0f)
                curveToRelative(-0.36f, -0.08f, -2.1f, -0.53f, -2.1f, -2.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.74f)
                curveToRelative(1.22f, 0f, 2.38f, -0.53f, 3.19f, -1.44f)
                curveToRelative(0.81f, -0.92f, 1.18f, -2.14f, 1.03f, -3.35f)
                close()
                moveTo(15f, 20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(0.98f, 0f, 2.26f, -0.4f, 3.1f, -1.38f)
                curveToRelative(0.84f, 0.82f, 1.9f, 1.27f, 2.9f, 1.38f)
                close()
                moveTo(21.43f, 12.24f)
                curveToRelative(-0.43f, 0.48f, -1.04f, 0.76f, -1.69f, 0.76f)
                lineTo(4.25f, 13f)
                curveToRelative(-0.65f, 0f, -1.26f, -0.28f, -1.69f, -0.76f)
                curveToRelative(-0.43f, -0.48f, -0.62f, -1.13f, -0.54f, -1.77f)
                lineToRelative(0.78f, -6.09f)
                curveToRelative(0.17f, -1.35f, 1.33f, -2.37f, 2.69f, -2.37f)
                horizontalLineToRelative(13.01f)
                curveToRelative(1.36f, 0f, 2.52f, 1.02f, 2.69f, 2.37f)
                lineToRelative(0.78f, 6.09f)
                curveToRelative(0.08f, 0.64f, -0.12f, 1.29f, -0.54f, 1.77f)
                close()
            }
        }.also { _Lamp = it}
