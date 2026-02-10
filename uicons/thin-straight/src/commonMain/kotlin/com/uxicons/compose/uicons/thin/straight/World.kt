package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Ts.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.63f, -0.93f, 5.05f, -2.48f, 6.94f)
                curveToRelative(-2.47f, -1.36f, -2.52f, -3.83f, -2.52f, -3.94f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                lineTo(14f, 4f)
                horizontalLineToRelative(3.77f)
                lineToRelative(0.62f, -0.94f)
                curveToRelative(2.79f, 2.0f, 4.61f, 5.25f, 4.61f, 8.94f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -0.26f, 0.02f, -0.5f, 0.04f, -0.76f)
                lineToRelative(4.75f, 4.75f)
                horizontalLineToRelative(4.71f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(13f, 22.95f)
                verticalLineToRelative(-5.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6.21f, 15f)
                lineTo(1.19f, 9.99f)
                curveTo(2.14f, 4.88f, 6.62f, 1f, 12f, 1f)
                curveToRelative(2.03f, 0f, 3.92f, 0.56f, 5.55f, 1.52f)
                lineToRelative(-0.32f, 0.48f)
                horizontalLineToRelative(-4.23f)
                lineTo(13f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.13f, 0.04f, 3.03f, 2.84f, 4.7f)
                curveToRelative(-1.78f, 1.81f, -4.17f, 3.0f, -6.84f, 3.25f)
                close()
            }
        }.also { _World = it}
