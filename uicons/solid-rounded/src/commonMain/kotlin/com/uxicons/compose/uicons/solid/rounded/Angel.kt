package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angel: ImageVector? = null

val Icons.Sr.Angel: ImageVector
    get() = _Angel ?: UXIcon(name = "Angel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 5.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(17f, 3.25f)
                curveToRelative(0f, -1.85f, -2.15f, -3.25f, -5f, -3.25f)
                reflectiveCurveToRelative(-5f, 1.4f, -5f, 3.25f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.44f, 1.14f, -1.25f, 3f, -1.25f)
                reflectiveCurveToRelative(3f, 0.81f, 3f, 1.25f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(5.26f, 20.76f)
                lineToRelative(5.12f, -11.03f)
                curveToRelative(1.05f, 0.36f, 2.2f, 0.36f, 3.26f, -0.01f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.02f)
                lineToRelative(5.14f, 11.06f)
                curveToRelative(0.67f, 1.52f, -0.44f, 3.24f, -2.11f, 3.24f)
                lineTo(7.37f, 24.0f)
                curveToRelative(-1.67f, 0f, -2.79f, -1.72f, -2.11f, -3.24f)
                close()
                moveTo(8.85f, 8.23f)
                lineToRelative(-5.0f, 10.77f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.5f, 0f, -1.5f, -1.51f, -1.5f, -1.51f)
                curveToRelative(0f, -3.01f, 0.34f, -9.49f, 3.5f, -9.49f)
                curveToRelative(2.19f, 0f, 4.08f, 1.17f, 5.35f, 2.23f)
                close()
                moveTo(20.5f, 6f)
                curveToRelative(3.16f, 0f, 3.5f, 6.48f, 3.5f, 9.49f)
                curveToRelative(0f, 0f, 0f, 1.51f, -1.5f, 1.51f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.35f)
                reflectiveCurveToRelative(-5.0f, -10.77f, -5.0f, -10.77f)
                curveToRelative(1.27f, -1.07f, 3.17f, -2.23f, 5.35f, -2.23f)
                close()
            }
        }.also { _Angel = it}
