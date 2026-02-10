package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cycling: ImageVector? = null

val Icons.Bs.Cycling: ImageVector
    get() = _Cycling ?: UXIcon(name = "Cycling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.53f, 15.0f)
                lineTo(17.67f, 12f)
                horizontalLineToRelative(2.85f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.49f)
                lineToRelative(-4.61f, -2.56f)
                curveToRelative(-1.65f, -0.92f, -3.77f, -0.34f, -4.73f, 1.32f)
                lineToRelative(-1.18f, 2.1f)
                curveToRelative(-0.52f, 0.85f, -0.65f, 1.9f, -0.35f, 2.85f)
                curveToRelative(0.28f, 0.92f, 0.93f, 1.68f, 1.79f, 2.1f)
                lineToRelative(1.56f, 1.01f)
                verticalLineToRelative(4.18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.82f)
                lineToRelative(-3.21f, -2.05f)
                curveToRelative(-0.33f, -0.23f, -0.37f, -0.36f, -0.2f, -0.76f)
                lineToRelative(1.2f, -2.13f)
                curveToRelative(0.14f, -0.23f, 0.44f, -0.32f, 0.68f, -0.18f)
                lineToRelative(2.82f, 1.56f)
                curveToRelative(-0.31f, 0.64f, -0.38f, 1.36f, -0.16f, 2.06f)
                lineToRelative(2.03f, 3.35f)
                curveToRelative(-1.0f, 0.83f, -1.66f, 2.06f, -1.66f, 3.46f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.0f, -4.48f, -4.47f, -4.5f)
                close()
                moveTo(19.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _Cycling = it}
