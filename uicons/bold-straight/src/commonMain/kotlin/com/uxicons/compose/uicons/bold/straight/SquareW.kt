package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Bs.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.46f, 5f)
                horizontalLineToRelative(3.04f)
                lineToRelative(-2.16f, 12.46f)
                curveToRelative(-0.16f, 0.81f, -0.79f, 1.43f, -1.61f, 1.55f)
                curveToRelative(-0.1f, 0.02f, -0.2f, 0.02f, -0.3f, 0.02f)
                curveToRelative(-0.7f, 0f, -1.36f, -0.39f, -1.7f, -1.01f)
                lineToRelative(-1.73f, -3.95f)
                lineToRelative(-1.7f, 3.87f)
                curveToRelative(-0.38f, 0.7f, -1.03f, 1.09f, -1.74f, 1.09f)
                curveToRelative(-0.1f, 0f, -0.2f, -0.01f, -0.3f, -0.03f)
                curveToRelative(-0.82f, -0.13f, -1.45f, -0.74f, -1.61f, -1.55f)
                lineToRelative(-2.16f, -12.46f)
                horizontalLineToRelative(3.04f)
                lineToRelative(1.47f, 8.45f)
                lineToRelative(0.25f, -0.57f)
                lineToRelative(2.75f, -6.27f)
                lineToRelative(2.75f, 6.27f)
                lineToRelative(0.25f, 0.57f)
                lineToRelative(1.47f, -8.44f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                lineTo(21f, 3.5f)
                close()
            }
        }.also { _SquareW = it}
