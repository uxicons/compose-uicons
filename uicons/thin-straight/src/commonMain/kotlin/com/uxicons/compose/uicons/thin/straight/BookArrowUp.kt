package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Ts.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.1f, 16.19f)
                lineToRelative(-2.91f, -2.91f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.11f, -0.19f, -0.15f)
                verticalLineToRelative(10.86f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 13.14f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-2.87f, 2.87f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.87f, -2.87f)
                curveToRelative(0.77f, -0.77f, 2.02f, -0.77f, 2.79f, 0f)
                lineToRelative(2.91f, 2.91f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                lineTo(4.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(1f)
                lineTo(4.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(22f, 11.56f)
                lineToRelative(-0.04f, -0.04f)
                curveToRelative(-0.28f, -0.28f, -0.61f, -0.48f, -0.95f, -0.65f)
                lineTo(21f, 1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(7f, 1f)
                lineTo(7f, 19f)
                close()
                moveTo(6f, 1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(3f, 19.5f)
                curveToRelative(0.42f, -0.32f, 0.94f, -0.5f, 1.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 1f)
                close()
            }
        }.also { _BookArrowUp = it}
