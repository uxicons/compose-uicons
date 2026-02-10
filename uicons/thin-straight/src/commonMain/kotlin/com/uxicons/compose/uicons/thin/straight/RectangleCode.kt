package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleCode: ImageVector? = null

val Icons.Ts.RectangleCode: ImageVector
    get() = _RectangleCode ?: UXIcon(name = "RectangleCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(21.5f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 22f)
                close()
                moveTo(1f, 21f)
                lineTo(23f, 21f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 21f)
                close()
                moveTo(9.9f, 16.1f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.75f, 3.75f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(0.71f, -0.71f)
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
            }
        }.also { _RectangleCode = it}
