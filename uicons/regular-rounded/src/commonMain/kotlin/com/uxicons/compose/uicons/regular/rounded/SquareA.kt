package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareA: ImageVector? = null

val Icons.Rr.SquareA: ImageVector
    get() = _SquareA ?: UXIcon(name = "SquareA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.02f, -0.08f)
                lineTo(5.02f, -0.08f)
                curveTo(2.26f, -0.08f, 0.02f, 2.17f, 0.02f, 4.92f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24.02f, 4.92f)
                curveTo(24.02f, 2.17f, 21.78f, -0.08f, 19.02f, -0.08f)
                close()
                moveTo(22.02f, 18.92f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5.02f, 21.92f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2.02f, 4.92f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(15.13f, 7.11f)
                curveToRelative(-0.47f, -1.33f, -1.7f, -2.2f, -3.11f, -2.2f)
                reflectiveCurveToRelative(-2.64f, 0.86f, -3.11f, 2.19f)
                lineToRelative(-3.83f, 10.5f)
                curveToRelative(-0.19f, 0.52f, 0.08f, 1.09f, 0.6f, 1.28f)
                curveToRelative(0.52f, 0.19f, 1.09f, -0.08f, 1.28f, -0.6f)
                lineToRelative(1.2f, -3.28f)
                horizontalLineToRelative(7.73f)
                lineToRelative(1.2f, 3.28f)
                curveToRelative(0.15f, 0.41f, 0.53f, 0.66f, 0.94f, 0.66f)
                curveToRelative(0.11f, 0f, 0.23f, -0.02f, 0.34f, -0.06f)
                curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f)
                lineToRelative(-3.83f, -10.49f)
                close()
                moveTo(8.88f, 13f)
                lineToRelative(1.91f, -5.23f)
                curveToRelative(0.29f, -0.81f, 1.01f, -0.87f, 1.23f, -0.87f)
                reflectiveCurveToRelative(0.94f, 0.06f, 1.23f, 0.88f)
                lineToRelative(1.9f, 5.22f)
                horizontalLineToRelative(-6.27f)
                close()
            }
        }.also { _SquareA = it}
