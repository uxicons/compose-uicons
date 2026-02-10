package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareM: ImageVector? = null

val Icons.Ts.SquareM: ImageVector
    get() = _SquareM ?: UXIcon(name = "SquareM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 5.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 5.5f)
                curveToRelative(0f, -0.25f, -0.1f, -0.41f, -0.3f, -0.48f)
                curveToRelative(-0.17f, -0.06f, -0.43f, -0.01f, -0.59f, 0.21f)
                lineToRelative(-6.12f, 9.66f)
                lineTo(5.87f, 5.22f)
                curveToRelative(-0.15f, -0.2f, -0.4f, -0.25f, -0.57f, -0.19f)
                curveToRelative(-0.19f, 0.06f, -0.3f, 0.23f, -0.3f, 0.48f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 5.5f)
                curveToRelative(0f, -0.69f, 0.38f, -1.23f, 0.99f, -1.43f)
                curveToRelative(0.63f, -0.2f, 1.31f, 0.04f, 1.71f, 0.59f)
                lineToRelative(5.3f, 8.37f)
                lineToRelative(5.29f, -8.35f)
                curveToRelative(0.41f, -0.57f, 1.09f, -0.81f, 1.72f, -0.61f)
                curveToRelative(0.61f, 0.2f, 0.99f, 0.74f, 0.99f, 1.43f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _SquareM = it}
