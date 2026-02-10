package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Inhaler: ImageVector? = null

val Icons.Ts.Inhaler: ImageVector
    get() = _Inhaler ?: UXIcon(name = "Inhaler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(1f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(5f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(5f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.98f, 2.36f)
                lineToRelative(-3.37f, 18.59f)
                curveToRelative(-0.22f, 1.19f, -1.25f, 2.05f, -2.46f, 2.05f)
                horizontalLineToRelative(-9.15f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4.69f)
                lineToRelative(2.38f, -12.95f)
                curveToRelative(0.22f, -1.19f, 1.25f, -2.05f, 2.46f, -2.05f)
                horizontalLineToRelative(3.49f)
                curveToRelative(0.59f, 0f, 1.15f, 0.26f, 1.54f, 0.72f)
                curveToRelative(0.38f, 0.46f, 0.54f, 1.05f, 0.43f, 1.64f)
                close()
                moveTo(21.76f, 9f)
                horizontalLineToRelative(-5.96f)
                lineToRelative(-1.28f, 7f)
                horizontalLineToRelative(-4.52f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8.15f)
                curveToRelative(0.73f, 0f, 1.35f, -0.52f, 1.48f, -1.23f)
                lineToRelative(2.13f, -11.77f)
                close()
                moveTo(22.78f, 1.36f)
                curveToRelative(-0.19f, -0.23f, -0.47f, -0.36f, -0.77f, -0.36f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(-0.72f, 0f, -1.34f, 0.52f, -1.48f, 1.23f)
                lineToRelative(-1.06f, 5.77f)
                horizontalLineToRelative(5.96f)
                lineToRelative(1.05f, -5.82f)
                curveToRelative(0.05f, -0.29f, -0.03f, -0.59f, -0.22f, -0.82f)
                close()
            }
        }.also { _Inhaler = it}
