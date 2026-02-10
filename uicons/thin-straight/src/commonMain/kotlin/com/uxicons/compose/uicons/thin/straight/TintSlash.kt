package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Ts.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.3f, 19.59f)
                curveToRelative(2.68f, -3.96f, 2.18f, -9.25f, -1.23f, -12.66f)
                lineTo(12f, 0.01f)
                lineToRelative(-5.7f, 5.58f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.66f, -3.66f)
                close()
                moveTo(12f, 1.41f)
                lineToRelative(6.36f, 6.22f)
                curveToRelative(3.02f, 3.02f, 3.5f, 7.68f, 1.21f, 11.23f)
                lineTo(7.0f, 6.3f)
                lineTo(12f, 1.41f)
                close()
                moveTo(17.55f, 21.08f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-1.77f, 1.43f, -3.96f, 2.21f, -6.26f, 2.21f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-3.64f, -3.64f, -3.88f, -9.41f, -0.72f, -13.33f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(-2.77f, 3.52f, -2.53f, 8.66f, 0.72f, 11.91f)
                curveToRelative(1.7f, 1.7f, 3.96f, 2.64f, 6.36f, 2.64f)
                curveToRelative(2.04f, 0f, 3.97f, -0.68f, 5.55f, -1.92f)
                close()
            }
        }.also { _TintSlash = it}
