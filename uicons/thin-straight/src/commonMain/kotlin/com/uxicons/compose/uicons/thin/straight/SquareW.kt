package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareW: ImageVector? = null

val Icons.Ts.SquareW: ImageVector
    get() = _SquareW ?: UXIcon(name = "SquareW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(18.46f, 4f)
                horizontalLineToRelative(1.01f)
                lineToRelative(-2.62f, 14.83f)
                curveToRelative(-0.12f, 0.61f, -0.58f, 1.06f, -1.19f, 1.16f)
                curveToRelative(-0.59f, 0.08f, -1.2f, -0.19f, -1.45f, -0.65f)
                lineToRelative(-2.21f, -5.04f)
                lineToRelative(-2.12f, 4.84f)
                curveToRelative(-0.29f, 0.55f, -0.8f, 0.84f, -1.33f, 0.86f)
                curveToRelative(-0.81f, 0.03f, -1.29f, -0.56f, -1.4f, -1.15f)
                lineToRelative(-2.62f, -14.86f)
                horizontalLineToRelative(1.01f)
                lineToRelative(2.59f, 14.68f)
                curveToRelative(0.03f, 0.17f, 0.18f, 0.3f, 0.36f, 0.33f)
                curveToRelative(0.19f, 0.03f, 0.37f, -0.08f, 0.49f, -0.29f)
                lineToRelative(3.02f, -6.9f)
                lineToRelative(3.11f, 7.08f)
                curveToRelative(0.02f, 0.04f, 0.22f, 0.14f, 0.41f, 0.11f)
                curveToRelative(0.18f, -0.03f, 0.32f, -0.16f, 0.35f, -0.35f)
                lineToRelative(2.59f, -14.65f)
                close()
            }
        }.also { _SquareW = it}
