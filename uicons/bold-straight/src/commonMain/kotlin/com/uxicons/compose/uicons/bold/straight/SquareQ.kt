package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareQ: ImageVector? = null

val Icons.Bs.SquareQ: ImageVector
    get() = _SquareQ ?: UXIcon(name = "SquareQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.99f, 12.95f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -3.33f, -2.69f, -6.05f, -5.99f, -6.05f)
                reflectiveCurveToRelative(-6.01f, 2.71f, -6.01f, 6.05f)
                verticalLineToRelative(1.9f)
                curveToRelative(0f, 3.33f, 2.7f, 6.05f, 6.01f, 6.05f)
                curveToRelative(1.11f, 0f, 2.15f, -0.31f, 3.04f, -0.84f)
                lineToRelative(1.4f, 1.4f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.53f, -0.9f, 0.84f, -1.96f, 0.84f, -3.08f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.66f, 0f, -3.01f, -1.37f, -3.01f, -3.05f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0f, -1.68f, 1.35f, -3.05f, 3.01f, -3.05f)
                curveToRelative(1.68f, 0f, 2.99f, 1.34f, 2.99f, 3.05f)
                verticalLineToRelative(1.9f)
                curveToRelative(0f, 0.28f, -0.04f, 0.56f, -0.1f, 0.81f)
                lineToRelative(-1.32f, -1.32f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.34f, 1.34f)
                curveToRelative(-0.25f, 0.07f, -0.51f, 0.1f, -0.78f, 0.1f)
                close()
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
            }
        }.also { _SquareQ = it}
