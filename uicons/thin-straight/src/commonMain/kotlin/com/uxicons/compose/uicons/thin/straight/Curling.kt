package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Curling: ImageVector? = null

val Icons.Ts.Curling: ImageVector
    get() = _Curling ?: UXIcon(name = "Curling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.94f, 9.19f)
                lineToRelative(-1.05f, -4.19f)
                lineTo(6.01f, 5f)
                lineToRelative(0.63f, -2.83f)
                curveToRelative(0.15f, -0.69f, 0.76f, -1.17f, 1.46f, -1.17f)
                horizontalLineToRelative(8.9f)
                lineTo(17.0f, 0f)
                lineTo(8.1f, 0f)
                curveToRelative(-1.18f, 0f, -2.19f, 0.81f, -2.44f, 1.96f)
                lineToRelative(-1.61f, 7.24f)
                curveTo(1.72f, 9.83f, 0f, 11.97f, 0f, 14.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.54f, -1.73f, -4.67f, -4.06f, -5.31f)
                close()
                moveTo(5.79f, 6f)
                horizontalLineToRelative(12.32f)
                lineToRelative(0.75f, 3.01f)
                curveToRelative(-0.12f, -0.01f, -0.24f, -0.01f, -0.36f, -0.01f)
                lineTo(5.5f, 9f)
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
