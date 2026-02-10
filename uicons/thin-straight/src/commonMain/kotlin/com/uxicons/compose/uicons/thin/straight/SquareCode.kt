package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareCode: ImageVector? = null

val Icons.Ts.SquareCode: ImageVector
    get() = _SquareCode ?: UXIcon(name = "SquareCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.19f, 16.81f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.75f, 3.75f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(18.56f, 13.06f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.75f, -3.75f)
                close()
                moveTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
            }
        }.also { _SquareCode = it}
