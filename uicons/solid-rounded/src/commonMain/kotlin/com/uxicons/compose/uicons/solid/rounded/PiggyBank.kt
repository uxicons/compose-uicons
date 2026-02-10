package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBank: ImageVector? = null

val Icons.Sr.PiggyBank: ImageVector
    get() = _PiggyBank ?: UXIcon(name = "PiggyBank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.43f, 11.05f)
                curveToRelative(-0.34f, -0.85f, -0.82f, -1.64f, -1.43f, -2.33f)
                verticalLineToRelative(-3.71f)
                curveToRelative(0f, -0.62f, -0.28f, -1.19f, -0.76f, -1.58f)
                curveToRelative(-0.48f, -0.38f, -1.09f, -0.51f, -1.68f, -0.37f)
                curveToRelative(-1.82f, 0.43f, -3.19f, 1.47f, -3.93f, 2.95f)
                horizontalLineToRelative(-5.36f)
                curveToRelative(-2.58f, 0f, -4.9f, 1.16f, -6.42f, 2.97f)
                curveToRelative(-1.2f, -0.17f, -1.05f, -1.97f, 0.15f, -1.97f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                curveToRelative(-3.19f, -0.01f, -4.13f, 4.41f, -1.27f, 5.71f)
                curveToRelative(-1.76f, 3.62f, -0.23f, 8.28f, 3.27f, 10.21f)
                verticalLineToRelative(0.08f)
                curveToRelative(0.0f, 3.35f, 4.74f, 4.12f, 5.83f, 1f)
                horizontalLineToRelative(2.34f)
                curveToRelative(1.09f, 3.12f, 5.83f, 2.35f, 5.83f, -1f)
                verticalLineToRelative(-0.09f)
                curveToRelative(1.56f, -0.9f, 2.77f, -2.3f, 3.43f, -3.95f)
                curveToRelative(0.82f, -0.17f, 1.57f, -0.85f, 1.57f, -1.95f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.11f, -0.75f, -1.78f, -1.57f, -1.95f)
                close()
                moveTo(18f, 13f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
                moveTo(6.05f, 4.51f)
                curveToRelative(-0.56f, -5.59f, 7.74f, -6.13f, 7.95f, -0.51f)
                horizontalLineToRelative(-4.73f)
                curveToRelative(-1.12f, 0f, -2.2f, 0.18f, -3.21f, 0.51f)
                close()
            }
        }.also { _PiggyBank = it}
