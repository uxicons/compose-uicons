package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenPlay: ImageVector? = null

val Icons.Sr.ScreenPlay: ImageVector
    get() = _ScreenPlay ?: UXIcon(name = "ScreenPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 20f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(10.36f, 6.54f)
                curveToRelative(-0.19f, -0.1f, -0.4f, 0.01f, -0.41f, 0.24f)
                verticalLineToRelative(4.44f)
                curveToRelative(0.02f, 0.23f, 0.2f, 0.34f, 0.41f, 0.24f)
                lineToRelative(4.0f, -2.22f)
                curveToRelative(0.2f, -0.14f, 0.2f, -0.35f, 0f, -0.48f)
                lineToRelative(-4.0f, -2.22f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 13f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 18f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16.5f, 9f)
                curveToRelative(0f, -0.83f, -0.45f, -1.59f, -1.17f, -1.99f)
                lineToRelative(-4.0f, -2.22f)
                curveToRelative(-1.44f, -0.87f, -3.44f, 0.31f, -3.38f, 1.99f)
                verticalLineToRelative(4.44f)
                curveToRelative(-0.06f, 1.68f, 1.94f, 2.86f, 3.38f, 1.99f)
                lineToRelative(4.0f, -2.22f)
                curveToRelative(0.72f, -0.4f, 1.17f, -1.17f, 1.17f, -1.99f)
                close()
                moveTo(24f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(13f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(4f, 22f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(1f, 21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(3f, 23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ScreenPlay = it}
