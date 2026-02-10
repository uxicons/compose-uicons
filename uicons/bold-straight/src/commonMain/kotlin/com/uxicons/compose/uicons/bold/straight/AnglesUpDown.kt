package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Bs.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.05f, 10.57f)
                lineToRelative(-2.1f, -2.15f)
                lineTo(9.54f, 1.01f)
                curveToRelative(0.65f, -0.65f, 1.52f, -1.01f, 2.45f, -1.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.93f, 0.0f, 1.8f, 0.36f, 2.46f, 1.02f)
                lineToRelative(7.58f, 7.41f)
                lineToRelative(-2.1f, 2.15f)
                lineToRelative(-7.59f, -7.42f)
                curveToRelative(-0.14f, -0.13f, -0.28f, -0.15f, -0.36f, -0.15f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.09f, 0f, -0.23f, 0.03f, -0.35f, 0.14f)
                lineToRelative(-7.6f, 7.43f)
                close()
                moveTo(12.35f, 20.86f)
                curveToRelative(-0.12f, 0.12f, -0.27f, 0.14f, -0.35f, 0.14f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.08f, 0f, -0.22f, -0.02f, -0.36f, -0.15f)
                lineToRelative(-7.59f, -7.42f)
                lineToRelative(-2.1f, 2.15f)
                lineToRelative(7.58f, 7.41f)
                curveToRelative(0.66f, 0.66f, 1.53f, 1.02f, 2.46f, 1.02f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.93f, -0.0f, 1.8f, -0.36f, 2.45f, -1.01f)
                lineToRelative(7.59f, -7.42f)
                lineToRelative(-2.1f, -2.15f)
                lineToRelative(-7.6f, 7.43f)
                close()
            }
        }.also { _AnglesUpDown = it}
