package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Ts.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.79f, 15.46f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-7.83f, 7.83f)
                lineTo(0f, 24f)
                verticalLineToRelative(-4.66f)
                lineToRelative(7.83f, -7.83f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-7.54f, 7.54f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(3.24f)
                lineToRelative(7.54f, -7.54f)
                close()
                moveTo(14.68f, 13.97f)
                lineToRelative(9.27f, 9.27f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.05f, 0.75f)
                lineTo(0.75f, 0.05f)
                lineToRelative(9.27f, 9.27f)
                lineTo(18.38f, 0.96f)
                curveToRelative(1.28f, -1.28f, 3.37f, -1.28f, 4.66f, 0f)
                curveToRelative(1.28f, 1.28f, 1.28f, 3.37f, 0f, 4.66f)
                lineToRelative(-8.35f, 8.35f)
                close()
                moveTo(16.22f, 4.54f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(2.86f, -2.86f)
                curveToRelative(0.89f, -0.9f, 0.89f, -2.35f, 0f, -3.24f)
                curveToRelative(-0.89f, -0.9f, -2.35f, -0.9f, -3.24f, 0f)
                lineToRelative(-2.86f, 2.86f)
                close()
                moveTo(10.73f, 10.03f)
                lineToRelative(3.24f, 3.24f)
                lineToRelative(4.78f, -4.78f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(-4.78f, 4.78f)
                close()
            }
        }.also { _PenSlash = it}
