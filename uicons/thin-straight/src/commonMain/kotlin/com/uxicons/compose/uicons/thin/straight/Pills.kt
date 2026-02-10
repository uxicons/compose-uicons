package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Ts.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.64f, 12.5f)
                curveToRelative(0.4f, -0.54f, 0.85f, -1.04f, 1.36f, -1.47f)
                verticalLineToRelative(-5.03f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(0f, 2.69f, 0f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(1.72f, 0f, 3.27f, -0.73f, 4.36f, -1.89f)
                curveToRelative(-0.2f, -0.3f, -0.37f, -0.62f, -0.52f, -0.94f)
                curveToRelative(-0.92f, 1.11f, -2.29f, 1.84f, -3.84f, 1.84f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(9.64f)
                close()
                moveTo(6f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5.5f)
                lineTo(1f, 11.5f)
                verticalLineToRelative(-5.5f)
                curveTo(1f, 3.24f, 3.24f, 1f, 6f, 1f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(1.34f, 0f, 2.56f, 0.48f, 3.52f, 1.27f)
                lineToRelative(-7.74f, 7.74f)
                curveToRelative(-0.8f, -0.95f, -1.27f, -2.18f, -1.27f, -3.52f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-1.34f, 0f, -2.56f, -0.48f, -3.52f, -1.27f)
                lineToRelative(7.74f, -7.74f)
                curveToRelative(0.8f, 0.95f, 1.27f, 2.18f, 1.27f, 3.52f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }.also { _Pills = it}
