package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Rr.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                lineTo(0f, 13f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 13f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 16f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 13f)
                close()
                moveTo(10f, 22f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(15.33f, 7.01f)
                lineToRelative(-4.0f, -2.22f)
                curveToRelative(-1.44f, -0.87f, -3.44f, 0.31f, -3.38f, 1.99f)
                verticalLineToRelative(4.44f)
                curveToRelative(-0.06f, 1.68f, 1.94f, 2.86f, 3.38f, 1.99f)
                lineToRelative(4.0f, -2.22f)
                curveToRelative(1.54f, -0.8f, 1.54f, -3.19f, 0f, -3.98f)
                close()
                moveTo(14.36f, 9.24f)
                lineToRelative(-4.0f, 2.22f)
                curveToRelative(-0.12f, 0.06f, -0.21f, 0.03f, -0.28f, -0.0f)
                curveToRelative(-0.06f, -0.04f, -0.14f, -0.11f, -0.14f, -0.24f)
                lineTo(9.95f, 6.78f)
                curveToRelative(0f, -0.13f, 0.07f, -0.2f, 0.14f, -0.24f)
                curveToRelative(0.04f, -0.02f, 0.08f, -0.04f, 0.14f, -0.04f)
                curveToRelative(0.04f, 0f, 0.09f, 0.01f, 0.14f, 0.04f)
                lineToRelative(4.0f, 2.22f)
                curveToRelative(0.12f, 0.07f, 0.14f, 0.17f, 0.14f, 0.24f)
                reflectiveCurveToRelative(-0.03f, 0.18f, -0.14f, 0.24f)
                close()
                moveTo(24f, 22.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(13f, 23.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(4f, 22.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 23.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(3f, 21.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ScreenPlay = it}
