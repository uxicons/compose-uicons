package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fireplace: ImageVector? = null

val Icons.Ss.Fireplace: ImageVector
    get() = _Fireplace ?: UXIcon(name = "Fireplace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.15f, 0.67f, -2.04f, 1.33f, -2.73f)
                curveToRelative(0f, 0f, -0.18f, 1.73f, 0.67f, 1.73f)
                curveToRelative(1.81f, 0f, 0.79f, -2.59f, 2f, -3.99f)
                curveToRelative(1.26f, 1.26f, 4f, 2.67f, 4f, 4.99f)
                close()
                moveTo(13.01f, 20.51f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.01f, -1.01f)
                lineToRelative(-1.01f, 1.01f)
                curveToRelative(-0.56f, 0.56f, -0.56f, 1.46f, 0f, 2.02f)
                curveToRelative(0.56f, 0.56f, 1.46f, 0.56f, 2.02f, 0f)
                curveToRelative(0.56f, -0.56f, 0.56f, -1.46f, 0f, -2.02f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-11.13f)
                curveToRelative(-0.92f, -0.57f, -3.29f, -1.87f, -6f, -1.87f)
                curveToRelative(-2.73f, 0f, -5.09f, 1.29f, -6f, 1.87f)
                verticalLineToRelative(11.13f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                lineTo(1f, 6f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(1f)
                close()
                moveTo(0.05f, 2.11f)
                curveTo(-0.22f, 1.04f, 0.59f, 0f, 1.7f, 0f)
                horizontalLineToRelative(20.59f)
                curveToRelative(1.11f, 0f, 1.92f, 1.04f, 1.65f, 2.11f)
                lineToRelative(-0.95f, 1.89f)
                lineTo(1f, 4f)
                lineTo(0.05f, 2.11f)
                close()
            }
        }.also { _Fireplace = it}
