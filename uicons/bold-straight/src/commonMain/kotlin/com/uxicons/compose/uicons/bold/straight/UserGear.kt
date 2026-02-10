package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGear: ImageVector? = null

val Icons.Bs.UserGear: ImageVector
    get() = _UserGear ?: UXIcon(name = "UserGear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(9f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, -0.28f, -0.03f, -0.56f, -0.08f, -0.82f)
                lineToRelative(1.52f, -0.88f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(-1.52f, 0.88f)
                curveToRelative(-0.42f, -0.36f, -0.9f, -0.64f, -1.42f, -0.82f)
                verticalLineToRelative(-1.76f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.76f)
                curveToRelative(-0.53f, 0.19f, -1.01f, 0.47f, -1.42f, 0.82f)
                lineToRelative(-1.52f, -0.88f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(1.52f, 0.88f)
                curveToRelative(-0.05f, 0.27f, -0.08f, 0.54f, -0.08f, 0.82f)
                reflectiveCurveToRelative(0.03f, 0.56f, 0.08f, 0.82f)
                lineToRelative(-1.52f, 0.88f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(1.52f, -0.88f)
                curveToRelative(0.42f, 0.36f, 0.9f, 0.64f, 1.42f, 0.82f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.76f)
                curveToRelative(0.53f, -0.19f, 1.01f, -0.47f, 1.42f, -0.82f)
                lineToRelative(1.52f, 0.88f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(-1.52f, -0.88f)
                curveToRelative(0.05f, -0.27f, 0.08f, -0.54f, 0.08f, -0.82f)
                close()
                moveTo(17.5f, 19.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5.5f, 14f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                close()
            }
        }.also { _UserGear = it}
