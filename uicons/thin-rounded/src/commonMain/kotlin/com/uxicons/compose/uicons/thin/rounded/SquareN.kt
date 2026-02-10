package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareN: ImageVector? = null

val Icons.Tr.SquareN: ImageVector
    get() = _SquareN ?: UXIcon(name = "SquareN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(19f, 4.5f)
                verticalLineToRelative(13.86f)
                curveToRelative(0f, 0.73f, -0.46f, 1.34f, -1.18f, 1.56f)
                curveToRelative(-0.73f, 0.22f, -1.5f, -0.05f, -1.91f, -0.67f)
                lineTo(7.25f, 5.29f)
                curveToRelative(-0.2f, -0.3f, -0.54f, -0.33f, -0.78f, -0.25f)
                curveToRelative(-0.11f, 0.03f, -0.47f, 0.18f, -0.47f, 0.6f)
                verticalLineToRelative(13.86f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5f, 5.64f)
                curveToRelative(0f, -0.73f, 0.46f, -1.34f, 1.18f, -1.56f)
                curveToRelative(0.73f, -0.22f, 1.5f, 0.05f, 1.91f, 0.67f)
                lineToRelative(8.66f, 13.97f)
                curveToRelative(0.2f, 0.3f, 0.53f, 0.33f, 0.78f, 0.25f)
                curveToRelative(0.11f, -0.03f, 0.47f, -0.18f, 0.47f, -0.6f)
                lineTo(18.0f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _SquareN = it}
