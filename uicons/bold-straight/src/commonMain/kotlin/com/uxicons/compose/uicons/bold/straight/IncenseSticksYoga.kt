package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IncenseSticksYoga: ImageVector? = null

val Icons.Bs.IncenseSticksYoga: ImageVector
    get() = _IncenseSticksYoga ?: UXIcon(name = "IncenseSticksYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.4f, 15f)
                lineToRelative(2.57f, -13.72f)
                lineToRelative(-2.95f, -0.55f)
                lineToRelative(-2.68f, 14.28f)
                horizontalLineToRelative(-0.85f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-0.85f)
                lineTo(6.97f, 0.72f)
                lineToRelative(-2.95f, 0.55f)
                lineToRelative(2.57f, 13.72f)
                horizontalLineTo(0f)
                lineToRelative(1.29f, 3.19f)
                curveToRelative(0.8f, 1.33f, 1.69f, 2.03f, 2.64f, 2.4f)
                curveToRelative(-0.05f, 0.07f, -0.09f, 0.14f, -0.14f, 0.21f)
                lineToRelative(-1.29f, 3.19f)
                horizontalLineToRelative(3.24f)
                lineToRelative(0.68f, -1.76f)
                curveToRelative(0.65f, -1.04f, 1.14f, -1.23f, 2.58f, -1.24f)
                horizontalLineToRelative(6f)
                curveToRelative(1.49f, 0.03f, 1.99f, 0.26f, 2.6f, 1.24f)
                lineToRelative(0.68f, 1.76f)
                horizontalLineToRelative(3.22f)
                lineToRelative(-1.27f, -3.19f)
                curveToRelative(-0.05f, -0.08f, -0.1f, -0.14f, -0.15f, -0.22f)
                curveToRelative(0.96f, -0.37f, 1.86f, -1.07f, 2.65f, -2.39f)
                lineToRelative(1.27f, -3.19f)
                horizontalLineToRelative(-6.6f)
                close()
            }
        }.also { _IncenseSticksYoga = it}
