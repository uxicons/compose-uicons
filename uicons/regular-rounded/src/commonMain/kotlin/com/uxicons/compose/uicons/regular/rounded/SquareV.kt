package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareV: ImageVector? = null

val Icons.Rr.SquareV: ImageVector
    get() = _SquareV ?: UXIcon(name = "SquareV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(18.94f, 6.33f)
                lineToRelative(-3.83f, 10.5f)
                curveToRelative(-0.47f, 1.33f, -1.69f, 2.19f, -3.11f, 2.19f)
                reflectiveCurveToRelative(-2.64f, -0.86f, -3.11f, -2.2f)
                lineToRelative(-3.83f, -10.49f)
                curveToRelative(-0.19f, -0.52f, 0.08f, -1.09f, 0.6f, -1.28f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.6f)
                lineToRelative(3.83f, 10.5f)
                curveToRelative(0.29f, 0.81f, 1.01f, 0.88f, 1.23f, 0.88f)
                reflectiveCurveToRelative(0.94f, -0.06f, 1.23f, -0.87f)
                lineToRelative(3.83f, -10.51f)
                curveToRelative(0.19f, -0.52f, 0.76f, -0.78f, 1.28f, -0.6f)
                curveToRelative(0.52f, 0.19f, 0.79f, 0.76f, 0.6f, 1.28f)
                close()
            }
        }.also { _SquareV = it}
