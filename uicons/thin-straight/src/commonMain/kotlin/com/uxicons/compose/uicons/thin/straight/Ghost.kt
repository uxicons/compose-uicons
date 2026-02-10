package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Ts.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(9f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.24f)
                curveToRelative(0f, -1.52f, 1.24f, -2.76f, 2.76f, -2.76f)
                curveToRelative(1.51f, 0f, 2.74f, 1.24f, 2.74f, 2.76f)
                verticalLineToRelative(0.24f)
                horizontalLineToRelative(1f)
                reflectiveCurveToRelative(-0.0f, -0.41f, -0.01f, -0.5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(-0.01f, 0.08f, -0.01f, 0.5f, -0.01f, 0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.26f)
                curveToRelative(0f, -1.51f, 1.24f, -2.74f, 2.76f, -2.74f)
                curveToRelative(1.51f, 0f, 2.74f, 1.23f, 2.74f, 2.74f)
                verticalLineToRelative(0.26f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-14f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(18.26f, 20f)
                curveToRelative(-1.35f, 0f, -2.54f, 0.72f, -3.21f, 1.79f)
                curveToRelative(-0.6f, -1.07f, -1.74f, -1.79f, -3.05f, -1.79f)
                reflectiveCurveToRelative(-2.45f, 0.72f, -3.05f, 1.79f)
                curveToRelative(-0.66f, -1.07f, -1.84f, -1.79f, -3.19f, -1.79f)
                curveToRelative(-1.09f, 0f, -2.07f, 0.47f, -2.76f, 1.21f)
                verticalLineToRelative(-11.21f)
                curveTo(3f, 5.04f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(11.2f)
                curveToRelative(-0.68f, -0.74f, -1.66f, -1.2f, -2.74f, -1.2f)
                close()
            }
        }.also { _Ghost = it}
