package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DrawPolygon: ImageVector? = null

val Icons.Bs.DrawPolygon: ImageVector
    get() = _DrawPolygon ?: UXIcon(name = "DrawPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18f)
                curveToRelative(-0.22f, 0f, -0.43f, 0.03f, -0.64f, 0.07f)
                lineToRelative(-4.53f, -5.13f)
                curveToRelative(0.1f, -0.3f, 0.17f, -0.61f, 0.17f, -0.94f)
                reflectiveCurveToRelative(-0.07f, -0.65f, -0.17f, -0.94f)
                lineToRelative(4.53f, -5.13f)
                curveToRelative(0.21f, 0.04f, 0.42f, 0.07f, 0.64f, 0.07f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                lineTo(5.82f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(12.37f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                horizontalLineToRelative(12.37f)
                curveToRelative(0.41f, 1.16f, 1.51f, 2f, 2.82f, 2f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
                moveTo(5f, 18.78f)
                lineTo(5f, 5.22f)
                curveToRelative(0.08f, -0.07f, 0.15f, -0.14f, 0.22f, -0.22f)
                horizontalLineToRelative(11.95f)
                lineToRelative(-3.58f, 4.06f)
                curveToRelative(-0.19f, -0.04f, -0.39f, -0.06f, -0.59f, -0.06f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                curveToRelative(0.2f, 0f, 0.4f, -0.02f, 0.59f, -0.06f)
                lineToRelative(3.58f, 4.06f)
                lineTo(5.22f, 19f)
                curveToRelative(-0.07f, -0.08f, -0.14f, -0.15f, -0.22f, -0.22f)
                close()
            }
        }.also { _DrawPolygon = it}
