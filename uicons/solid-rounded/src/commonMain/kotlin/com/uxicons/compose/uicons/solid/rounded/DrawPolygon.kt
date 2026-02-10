package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawPolygon: ImageVector? = null

val Icons.Sr.DrawPolygon: ImageVector
    get() = _DrawPolygon ?: UXIcon(name = "DrawPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-0.41f, 0f, -0.81f, 0.08f, -1.17f, 0.23f)
                lineToRelative(-4.21f, -4.78f)
                curveToRelative(0.24f, -0.43f, 0.38f, -0.93f, 0.38f, -1.46f)
                curveToRelative(0f, -0.53f, -0.14f, -1.03f, -0.39f, -1.47f)
                lineToRelative(4.18f, -4.78f)
                curveToRelative(0.37f, 0.16f, 0.78f, 0.25f, 1.2f, 0.25f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                horizontalLineTo(5.83f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.42f, 2f, 2.83f)
                verticalLineToRelative(12.34f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.42f, -0.84f, 2.83f, -2f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.41f, 1.16f, 1.52f, 2f, 2.83f, 2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(5.83f, 4f)
                horizontalLineToRelative(12.34f)
                curveToRelative(0.05f, 0.13f, 0.1f, 0.26f, 0.17f, 0.38f)
                lineToRelative(-4.23f, 4.83f)
                curveToRelative(-0.34f, -0.14f, -0.72f, -0.21f, -1.11f, -0.21f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.4f, 0f, 0.77f, -0.08f, 1.12f, -0.22f)
                lineToRelative(4.24f, 4.8f)
                curveToRelative(-0.07f, 0.13f, -0.13f, 0.27f, -0.18f, 0.42f)
                horizontalLineTo(5.83f)
                curveToRelative(-0.3f, -0.85f, -0.98f, -1.53f, -1.83f, -1.83f)
                verticalLineTo(5.83f)
                curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f)
                close()
            }
        }.also { _DrawPolygon = it}
