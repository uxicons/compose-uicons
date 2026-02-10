package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Tr.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.94f, 9.19f)
                lineToRelative(-0.39f, -1.54f)
                curveToRelative(-0.39f, -1.56f, -1.79f, -2.65f, -3.4f, -2.65f)
                lineTo(6.01f, 5f)
                lineToRelative(0.28f, -1.26f)
                curveToRelative(0.36f, -1.61f, 1.76f, -2.74f, 3.42f, -2.74f)
                horizontalLineToRelative(7.79f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7.79f)
                curveToRelative(-2.12f, 0f, -3.93f, 1.45f, -4.39f, 3.52f)
                lineToRelative(-1.26f, 5.67f)
                curveTo(1.72f, 9.83f, 0f, 11.97f, 0f, 14.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.54f, -1.73f, -4.67f, -4.06f, -5.31f)
                close()
                moveTo(5.79f, 6f)
                horizontalLineToRelative(10.37f)
                curveToRelative(1.15f, 0f, 2.15f, 0.78f, 2.43f, 1.89f)
                lineToRelative(0.28f, 1.12f)
                curveToRelative(-0.12f, -0.01f, -0.24f, -0.01f, -0.36f, -0.01f)
                lineTo(5.5f, 9.0f)
                curveToRelative(-0.13f, 0f, -0.25f, 0.01f, -0.38f, 0.01f)
                lineToRelative(0.67f, -3.01f)
                close()
                moveTo(5.5f, 10f)
                horizontalLineToRelative(13f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 16f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(18.5f, 23f)
                lineTo(5.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                lineTo(23f, 17f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _Curling = it}
