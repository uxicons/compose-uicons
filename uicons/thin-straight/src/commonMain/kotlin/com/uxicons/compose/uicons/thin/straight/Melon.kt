package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Ts.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.96f, 0.45f)
                lineToRelative(-0.35f, -0.35f)
                lineTo(0.09f, 19.61f)
                lineToRelative(0.35f, 0.35f)
                curveToRelative(2.69f, 2.69f, 6.22f, 4.03f, 9.76f, 4.03f)
                reflectiveCurveToRelative(7.07f, -1.34f, 9.76f, -4.03f)
                curveToRelative(5.38f, -5.38f, 5.38f, -14.13f, 0f, -19.51f)
                close()
                moveTo(14.52f, 6.59f)
                curveToRelative(0.95f, 1.04f, 1.48f, 2.38f, 1.48f, 3.8f)
                curveToRelative(0f, 1.5f, -0.58f, 2.91f, -1.64f, 3.97f)
                curveToRelative(-2.13f, 2.13f, -5.57f, 2.19f, -7.76f, 0.17f)
                lineToRelative(7.93f, -7.93f)
                close()
                moveTo(19.25f, 19.25f)
                curveToRelative(-4.87f, 4.87f, -12.72f, 4.99f, -17.74f, 0.35f)
                lineToRelative(4.37f, -4.37f)
                curveToRelative(1.27f, 1.18f, 2.88f, 1.77f, 4.5f, 1.77f)
                curveToRelative(1.69f, 0f, 3.39f, -0.65f, 4.68f, -1.93f)
                curveToRelative(1.25f, -1.25f, 1.94f, -2.91f, 1.94f, -4.68f)
                curveToRelative(0f, -1.69f, -0.63f, -3.28f, -1.77f, -4.5f)
                lineTo(19.6f, 1.51f)
                curveToRelative(4.64f, 5.01f, 4.52f, 12.87f, -0.35f, 17.74f)
                close()
            }
        }.also { _Melon = it}
