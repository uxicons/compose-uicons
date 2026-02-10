package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Entrance: ImageVector? = null

val Icons.Ts.Entrance: ImageVector
    get() = _Entrance ?: UXIcon(name = "Entrance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.54f, 14.56f)
                lineToRelative(-2.69f, 2.77f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(2.56f, -2.64f)
                horizontalLineToRelative(-8.69f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.69f)
                lineToRelative(-2.56f, -2.64f)
                lineToRelative(0.72f, -0.7f)
                lineToRelative(2.69f, 2.78f)
                curveToRelative(0.28f, 0.28f, 0.43f, 0.65f, 0.43f, 1.05f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
                moveTo(16f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 3.9f)
                verticalLineToRelative(20.1f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(-4.98f)
                lineToRelative(1f, -1.03f)
                verticalLineToRelative(5.01f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.51f)
                lineToRelative(-1f, -1.03f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.55f)
                curveToRelative(0.11f, -0.56f, 0.41f, -1.06f, 0.86f, -1.43f)
                curveToRelative(0.58f, -0.48f, 1.34f, -0.67f, 2.08f, -0.52f)
                lineToRelative(7f, 1.4f)
                curveToRelative(1.17f, 0.23f, 2.01f, 1.26f, 2.01f, 2.45f)
                close()
                moveTo(23f, 3.9f)
                curveToRelative(0f, -0.71f, -0.51f, -1.33f, -1.21f, -1.47f)
                lineToRelative(-7f, -1.4f)
                curveToRelative(-0.44f, -0.09f, -0.9f, 0.03f, -1.25f, 0.31f)
                curveToRelative(-0.35f, 0.29f, -0.55f, 0.71f, -0.55f, 1.16f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _Entrance = it}
