package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Ts.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                lineTo(5f, 19f)
                lineTo(5f, 1f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1f)
                lineTo(20f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(20f, 24f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineToRelative(1.5f)
                lineTo(4f, 19f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.19f, -1.5f, 0.5f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(2.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(19f, 20f)
                verticalLineToRelative(3f)
                lineTo(2.5f, 23f)
                close()
                moveTo(23.42f, 11.89f)
                lineToRelative(-2.87f, 2.87f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.87f, -2.87f)
                curveToRelative(0.06f, -0.06f, 0.11f, -0.12f, 0.15f, -0.19f)
                lineTo(12f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.86f)
                curveToRelative(-0.04f, -0.07f, -0.09f, -0.13f, -0.15f, -0.19f)
                lineToRelative(-2.91f, -2.91f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.91f, 2.91f)
                curveToRelative(0.77f, 0.77f, 0.77f, 2.02f, 0f, 2.79f)
                close()
            }
        }.also { _BookArrowRight = it}
