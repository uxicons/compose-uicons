package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareHeart: ImageVector? = null

val Icons.Ts.SquareHeart: ImageVector
    get() = _SquareHeart ?: UXIcon(name = "SquareHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 7f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.43f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.43f, -2.75f, -1.43f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.57f, -3.25f, 3.5f)
                curveToRelative(0f, 3.36f, 5.48f, 7.25f, 5.71f, 7.41f)
                lineToRelative(0.29f, 0.2f)
                lineToRelative(0.29f, -0.2f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.05f, 5.71f, -7.41f)
                curveToRelative(0f, -1.93f, -1.46f, -3.5f, -3.25f, -3.5f)
                close()
                moveTo(12f, 16.88f)
                curveToRelative(-1.63f, -1.2f, -5f, -4.16f, -5f, -6.38f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                curveToRelative(1.32f, 0f, 2.25f, 0.92f, 2.25f, 2.23f)
                verticalLineToRelative(0.77f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0f, -1.31f, 0.93f, -2.23f, 2.25f, -2.23f)
                curveToRelative(1.24f, 0f, 2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, 2.22f, -3.37f, 5.18f, -5f, 6.38f)
                close()
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
            }
        }.also { _SquareHeart = it}
