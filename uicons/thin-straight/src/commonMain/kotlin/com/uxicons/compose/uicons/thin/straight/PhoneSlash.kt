package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Ts.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.53f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveToRelative(-2.72f, 0f, -6.03f, -1.45f, -9.02f, -3.85f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(2.79f, 2.22f, 5.83f, 3.56f, 8.31f, 3.56f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-1.15f, -0.44f, -2.2f, -1.01f, -3.17f, -1.68f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.77f, 0.52f, 1.61f, 0.97f, 2.51f, 1.34f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(23.94f, 0.76f)
                lineTo(0.76f, 23.94f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.09f, -5.09f)
                curveTo(1.92f, 14.81f, 0f, 10.9f, 0f, 7.61f)
                curveTo(0f, 6.1f, 0.57f, 4.71f, 1.6f, 3.67f)
                lineTo(4.48f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(0.67f, 1.57f, 1.53f, 2.94f, 2.57f, 4.08f)
                lineTo(23.24f, 0.06f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(5.85f, 17.44f)
                lineToRelative(2.81f, -2.81f)
                curveToRelative(-1.2f, -1.31f, -2.19f, -2.9f, -2.92f, -4.72f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.48f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 3.03f, 1.8f, 6.68f, 4.85f, 9.83f)
                close()
            }
        }.also { _PhoneSlash = it}
