package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareZ: ImageVector? = null

val Icons.Tr.SquareZ: ImageVector
    get() = _SquareZ ?: UXIcon(name = "SquareZ") {
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
                moveTo(6.24f, 17.51f)
                curveToRelative(-0.23f, 0.23f, -0.31f, 0.59f, -0.17f, 0.93f)
                curveToRelative(0.11f, 0.27f, 0.39f, 0.56f, 0.85f, 0.56f)
                horizontalLineToRelative(11.59f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.92f, 20.0f)
                curveToRelative(-0.79f, 0f, -1.47f, -0.45f, -1.77f, -1.18f)
                curveToRelative(-0.29f, -0.72f, -0.13f, -1.5f, 0.42f, -2.05f)
                lineToRelative(12.2f, -10.29f)
                curveToRelative(0.23f, -0.23f, 0.31f, -0.59f, 0.17f, -0.93f)
                curveToRelative(-0.11f, -0.27f, -0.39f, -0.56f, -0.85f, -0.56f)
                lineTo(5.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.59f)
                curveToRelative(0.79f, 0f, 1.47f, 0.45f, 1.77f, 1.18f)
                curveToRelative(0.29f, 0.72f, 0.13f, 1.5f, -0.42f, 2.05f)
                lineToRelative(-12.2f, 10.29f)
                close()
            }
        }.also { _SquareZ = it}
