package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCross: ImageVector? = null

val Icons.Ts.PhoneCross: ImageVector
    get() = _PhoneCross ?: UXIcon(name = "PhoneCross") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.24f, 4.5f)
                lineToRelative(3.76f, 3.76f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.76f, -3.76f)
                lineToRelative(-3.76f, 3.76f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.76f, -3.76f)
                lineToRelative(-3.76f, -3.76f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.76f, 3.76f)
                lineTo(23.29f, 0.03f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.76f, 3.76f)
                close()
                moveTo(17.56f, 13.84f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-2.88f, 2.88f)
                curveToRelative(-1.03f, 1.03f, -2.43f, 1.6f, -3.94f, 1.6f)
                curveTo(9.22f, 24f, 0.03f, 14.81f, 0.03f, 7.61f)
                curveTo(0.03f, 6.11f, 0.6f, 4.71f, 1.64f, 3.67f)
                lineTo(4.51f, 0.79f)
                lineToRelative(5.68f, 5.68f)
                lineToRelative(-3.37f, 3.37f)
                curveToRelative(1.51f, 3.56f, 3.92f, 5.97f, 7.36f, 7.37f)
                lineToRelative(3.38f, -3.38f)
                close()
                moveTo(21.82f, 19.52f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-3.13f, 3.13f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-3.92f, -1.5f, -6.73f, -4.31f, -8.36f, -8.35f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(3.13f, -3.13f)
                lineTo(4.51f, 2.21f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-0.85f, 0.84f, -1.31f, 1.99f, -1.31f, 3.23f)
                curveToRelative(0f, 6.62f, 8.77f, 15.39f, 15.39f, 15.39f)
                curveToRelative(1.24f, 0f, 2.39f, -0.47f, 3.23f, -1.31f)
                lineToRelative(2.17f, -2.17f)
                close()
            }
        }.also { _PhoneCross = it}
