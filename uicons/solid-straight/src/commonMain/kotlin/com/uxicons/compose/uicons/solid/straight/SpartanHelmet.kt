package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpartanHelmet: ImageVector? = null

val Icons.Ss.SpartanHelmet: ImageVector
    get() = _SpartanHelmet ?: UXIcon(name = "SpartanHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.0f, 24f)
                verticalLineTo(15.23f)
                curveToRelative(-1.39f, -0.96f, -3.0f, -2.38f, -3.0f, -3.79f)
                curveToRelative(0f, -1.5f, 1f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.54f, 0f, 1.08f, 0.25f, 1.5f, 0.62f)
                lineToRelative(1f, 1.12f)
                lineToRelative(1f, -1.12f)
                curveToRelative(0.42f, -0.37f, 0.96f, -0.62f, 1.5f, -0.62f)
                curveToRelative(1.5f, 0f, 2.5f, 1f, 2.5f, 2.5f)
                curveToRelative(0f, 1.42f, -1.61f, 2.84f, -3.0f, 3.8f)
                verticalLineToRelative(8.76f)
                lineToRelative(8.83f, -2.39f)
                lineToRelative(-1.83f, -4.93f)
                curveToRelative(0.3f, -0.87f, 0.99f, -3.13f, 0.99f, -5.71f)
                curveTo(21.99f, 3.38f, 12.71f, 0.24f, 12.31f, 0.1f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-0.31f, 0.1f)
                curveToRelative(-0.4f, 0.13f, -9.66f, 3.28f, -9.66f, 10.86f)
                curveToRelative(0f, 2.58f, 0.69f, 4.84f, 0.99f, 5.71f)
                lineToRelative(-1.85f, 4.93f)
                lineToRelative(8.83f, 2.39f)
                close()
            }
        }.also { _SpartanHelmet = it}
