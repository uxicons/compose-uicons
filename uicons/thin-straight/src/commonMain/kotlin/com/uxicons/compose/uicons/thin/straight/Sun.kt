package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Ts.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.02f)
                curveToRelative(-0.07f, -0.92f, -0.31f, -1.79f, -0.7f, -2.58f)
                lineToRelative(4.35f, -2.53f)
                lineToRelative(-0.5f, -0.86f)
                lineToRelative(-4.35f, 2.53f)
                curveToRelative(-0.49f, -0.72f, -1.12f, -1.35f, -1.85f, -1.84f)
                lineToRelative(2.52f, -4.34f)
                lineToRelative(-0.86f, -0.5f)
                lineToRelative(-2.52f, 4.34f)
                curveToRelative(-0.79f, -0.39f, -1.66f, -0.63f, -2.57f, -0.69f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.02f)
                curveToRelative(-0.91f, 0.07f, -1.78f, 0.3f, -2.56f, 0.69f)
                lineTo(6.42f, 1.37f)
                lineToRelative(-0.86f, 0.5f)
                lineToRelative(2.52f, 4.33f)
                curveToRelative(-0.73f, 0.49f, -1.36f, 1.12f, -1.85f, 1.84f)
                lineTo(1.89f, 5.53f)
                lineToRelative(-0.5f, 0.86f)
                lineToRelative(4.33f, 2.52f)
                curveToRelative(-0.39f, 0.79f, -0.64f, 1.67f, -0.7f, 2.59f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.02f)
                curveToRelative(0.07f, 0.92f, 0.31f, 1.79f, 0.7f, 2.58f)
                lineToRelative(-4.32f, 2.52f)
                lineToRelative(0.5f, 0.86f)
                lineToRelative(4.32f, -2.52f)
                curveToRelative(0.49f, 0.72f, 1.11f, 1.34f, 1.83f, 1.83f)
                lineToRelative(-2.52f, 4.34f)
                lineToRelative(0.86f, 0.5f)
                lineToRelative(2.52f, -4.34f)
                curveToRelative(0.79f, 0.39f, 1.66f, 0.63f, 2.58f, 0.7f)
                verticalLineToRelative(5.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.02f)
                curveToRelative(0.93f, -0.07f, 1.8f, -0.31f, 2.6f, -0.7f)
                lineToRelative(2.52f, 4.34f)
                lineToRelative(0.86f, -0.5f)
                lineToRelative(-2.53f, -4.35f)
                curveToRelative(0.72f, -0.49f, 1.34f, -1.11f, 1.83f, -1.83f)
                lineToRelative(4.34f, 2.52f)
                lineToRelative(0.5f, -0.86f)
                lineToRelative(-4.34f, -2.52f)
                curveToRelative(0.39f, -0.79f, 0.63f, -1.66f, 0.69f, -2.57f)
                horizontalLineToRelative(5.02f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _Sun = it}
