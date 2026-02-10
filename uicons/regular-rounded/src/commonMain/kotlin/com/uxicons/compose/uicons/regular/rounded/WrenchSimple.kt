package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Rr.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -1.5f, 0.81f, -2.85f, 2.1f, -3.52f)
                curveToRelative(3.02f, -1.55f, 4.9f, -4.62f, 4.9f, -8.01f)
                curveToRelative(0f, -3.46f, -1.93f, -6.55f, -5.03f, -8.08f)
                lineToRelative(0.03f, 6.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineTo(2.01f)
                curveTo(4.93f, 3.52f, 3f, 6.62f, 3f, 10.07f)
                curveToRelative(0f, 3.39f, 1.88f, 6.46f, 4.9f, 8.01f)
                curveToRelative(1.29f, 0.66f, 2.1f, 2.01f, 2.1f, 3.52f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.74f, -0.4f, -1.42f, -1.01f, -1.74f)
                curveToRelative(-3.69f, -1.89f, -5.99f, -5.65f, -5.99f, -9.79f)
                curveTo(1f, 5.85f, 3.35f, 2.07f, 7.15f, 0.2f)
                curveToRelative(0.61f, -0.3f, 1.32f, -0.26f, 1.9f, 0.1f)
                curveToRelative(0.6f, 0.37f, 0.95f, 1.01f, 0.95f, 1.71f)
                verticalLineToRelative(5.99f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineTo(2.01f)
                curveToRelative(0f, -0.7f, 0.36f, -1.34f, 0.95f, -1.71f)
                curveToRelative(0.58f, -0.36f, 1.29f, -0.4f, 1.9f, -0.1f)
                curveToRelative(3.79f, 1.87f, 6.15f, 5.65f, 6.15f, 9.87f)
                curveToRelative(0f, 4.15f, -2.29f, 7.9f, -5.99f, 9.79f)
                curveToRelative(-0.61f, 0.32f, -1.01f, 1.0f, -1.01f, 1.74f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _WrenchSimple = it}
