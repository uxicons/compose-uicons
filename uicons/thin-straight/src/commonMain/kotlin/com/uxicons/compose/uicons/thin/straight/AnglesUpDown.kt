package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Ts.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.49f, 9.62f)
                lineToRelative(-0.7f, -0.71f)
                lineTo(10.11f, 0.78f)
                curveToRelative(0.5f, -0.5f, 1.17f, -0.78f, 1.89f, -0.78f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.71f, 0.0f, 1.39f, 0.28f, 1.89f, 0.78f)
                lineToRelative(8.31f, 8.12f)
                lineToRelative(-0.7f, 0.71f)
                lineTo(13.19f, 1.49f)
                curveToRelative(-0.32f, -0.32f, -0.74f, -0.49f, -1.19f, -0.49f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.45f, 0f, -0.87f, 0.17f, -1.19f, 0.49f)
                lineTo(2.49f, 9.62f)
                close()
                moveTo(13.19f, 22.51f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.49f, -1.19f, 0.49f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.45f, 0f, -0.87f, -0.17f, -1.19f, -0.49f)
                lineTo(2.49f, 14.38f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(8.31f, 8.12f)
                curveToRelative(0.51f, 0.5f, 1.18f, 0.78f, 1.89f, 0.78f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.71f, 0f, 1.39f, -0.28f, 1.89f, -0.78f)
                lineToRelative(8.32f, -8.13f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-8.32f, 8.13f)
                close()
            }
        }.also { _AnglesUpDown = it}
