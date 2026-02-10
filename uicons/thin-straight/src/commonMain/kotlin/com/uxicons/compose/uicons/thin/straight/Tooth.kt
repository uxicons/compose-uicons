package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Ts.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.51f, 24f)
                horizontalLineToRelative(-3.51f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3.51f)
                lineToRelative(-0.15f, -0.24f)
                curveTo(3.39f, 18.84f, 0f, 12.34f, 0f, 5.73f)
                curveToRelative(0f, -0.06f, 0.07f, -5.73f, 5.73f, -5.73f)
                curveToRelative(1.8f, 0f, 2.94f, 0.33f, 3.94f, 0.62f)
                curveToRelative(0.79f, 0.23f, 1.46f, 0.42f, 2.33f, 0.42f)
                reflectiveCurveToRelative(1.55f, -0.2f, 2.33f, -0.42f)
                curveToRelative(1.0f, -0.29f, 2.14f, -0.62f, 3.94f, -0.62f)
                curveToRelative(5.66f, 0f, 5.73f, 5.67f, 5.73f, 5.73f)
                curveToRelative(0f, 6.61f, -3.39f, 13.11f, -6.34f, 18.03f)
                lineToRelative(-0.15f, 0.24f)
                close()
                moveTo(15f, 23f)
                horizontalLineToRelative(1.94f)
                curveToRelative(2.85f, -4.78f, 6.06f, -11.02f, 6.06f, -17.27f)
                curveToRelative(0f, -0.19f, -0.07f, -4.73f, -4.73f, -4.73f)
                curveToRelative(-1.66f, 0f, -2.68f, 0.3f, -3.66f, 0.58f)
                curveToRelative(-0.82f, 0.24f, -1.6f, 0.46f, -2.61f, 0.46f)
                reflectiveCurveToRelative(-1.79f, -0.23f, -2.61f, -0.46f)
                curveToRelative(-0.99f, -0.29f, -2.01f, -0.58f, -3.66f, -0.58f)
                curveTo(1.07f, 1f, 1.0f, 5.54f, 1f, 5.73f)
                curveToRelative(0f, 6.26f, 3.2f, 12.49f, 6.06f, 17.27f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Tooth = it}
