package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGear: ImageVector? = null

val Icons.Ss.UserGear: ImageVector
    get() = _UserGear ?: UXIcon(name = "UserGear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(3f, 9.31f, 3f, 6f)
                close()
                moveTo(21.72f, 18.57f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(-0.71f, 0.8f, -1.65f, 1.38f, -2.73f, 1.6f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(-1.08f, -0.22f, -2.02f, -0.8f, -2.73f, -1.6f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(-1.0f, -1.73f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(-0.17f, -0.5f, -0.28f, -1.02f, -0.28f, -1.57f)
                reflectiveCurveToRelative(0.11f, -1.07f, 0.28f, -1.57f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(0.71f, -0.8f, 1.65f, -1.38f, 2.73f, -1.6f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.1f)
                curveToRelative(1.08f, 0.22f, 2.02f, 0.8f, 2.73f, 1.6f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(1.0f, 1.73f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(0.17f, 0.5f, 0.28f, 1.02f, 0.28f, 1.57f)
                reflectiveCurveToRelative(-0.11f, 1.07f, -0.28f, 1.57f)
                close()
                moveTo(18.5f, 17f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(8f, 17f)
                curveToRelative(0f, -1.05f, 0.19f, -2.06f, 0.52f, -3f)
                horizontalLineToRelative(-3.52f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                lineTo(11.35f, 24f)
                curveToRelative(-2.04f, -1.65f, -3.35f, -4.17f, -3.35f, -7f)
                close()
            }
        }.also { _UserGear = it}
