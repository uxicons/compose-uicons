package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Ts.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(-1.05f, 2.0f, -2.93f, 3.4f, -5.13f, 3.85f)
                verticalLineToRelative(2.15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.43f)
                curveToRelative(-2.96f, -1.05f, -5f, -3.9f, -5f, -7.07f)
                curveToRelative(0f, -1.37f, 0.37f, -2.65f, 1.01f, -3.76f)
                curveToRelative(-0.67f, -0.94f, -1.01f, -2.19f, -1.01f, -3.74f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 1.16f, 0.21f, 2.11f, 0.63f, 2.84f)
                curveToRelative(1.38f, -1.73f, 3.5f, -2.84f, 5.87f, -2.84f)
                horizontalLineToRelative(6.12f)
                curveToRelative(0.44f, -1.76f, 2.01f, -3.0f, 3.88f, -3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.43f)
                curveToRelative(2.48f, 0.88f, 4.33f, 3.0f, 4.85f, 5.57f)
                horizontalLineToRelative(1.15f)
                close()
                moveTo(23f, 11f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.06f, -0.43f)
                curveToRelative(-0.36f, -2.5f, -2.15f, -4.58f, -4.58f, -5.3f)
                lineToRelative(-0.36f, -0.11f)
                verticalLineToRelative(-3.12f)
                curveToRelative(-1.28f, 0.21f, -2.29f, 1.21f, -2.47f, 2.53f)
                lineToRelative(-0.06f, 0.43f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 2.85f, 1.91f, 5.42f, 4.64f, 6.23f)
                lineToRelative(0.36f, 0.11f)
                verticalLineToRelative(2.16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.43f, -0.06f)
                curveToRelative(2.16f, -0.31f, 4.01f, -1.67f, 4.95f, -3.65f)
                lineToRelative(0.14f, -0.28f)
                horizontalLineToRelative(1.49f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Pig = it}
