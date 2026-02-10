package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUser: ImageVector? = null

val Icons.Ts.HouseUser: ImageVector
    get() = _HouseUser ?: UXIcon(name = "HouseUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 7.87f)
                lineTo(13.66f, 0.57f)
                curveToRelative(-0.98f, -0.77f, -2.34f, -0.77f, -3.32f, 0f)
                lineTo(1.03f, 7.87f)
                curveToRelative(-0.66f, 0.51f, -1.03f, 1.28f, -1.03f, 2.12f)
                verticalLineToRelative(14.01f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.83f, -0.38f, -1.61f, -1.03f, -2.12f)
                close()
                moveTo(17f, 23f)
                lineTo(7f, 23f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 23f)
                verticalLineToRelative(-13.01f)
                curveToRelative(0f, -0.52f, 0.24f, -1.02f, 0.65f, -1.33f)
                lineTo(10.96f, 1.36f)
                curveToRelative(0.61f, -0.48f, 1.47f, -0.48f, 2.08f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.41f, 0.32f, 0.65f, 0.81f, 0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                close()
                moveTo(12f, 7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _HouseUser = it}
