package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareK: ImageVector? = null

val Icons.Tr.SquareK: ImageVector
    get() = _SquareK ?: UXIcon(name = "SquareK") {
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
                moveTo(18.88f, 4.83f)
                lineToRelative(-5.74f, 6.7f)
                lineToRelative(5.76f, 7.68f)
                curveToRelative(0.17f, 0.22f, 0.12f, 0.53f, -0.1f, 0.7f)
                curveToRelative(-0.09f, 0.07f, -0.2f, 0.1f, -0.3f, 0.1f)
                curveToRelative(-0.15f, 0f, -0.3f, -0.07f, -0.4f, -0.2f)
                lineToRelative(-5.85f, -7.8f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.27f)
                lineToRelative(5.85f, -6.83f)
                curveToRelative(0.18f, -0.21f, 0.5f, -0.23f, 0.7f, -0.05f)
                curveToRelative(0.21f, 0.18f, 0.23f, 0.49f, 0.06f, 0.7f)
                close()
            }
        }.also { _SquareK = it}
