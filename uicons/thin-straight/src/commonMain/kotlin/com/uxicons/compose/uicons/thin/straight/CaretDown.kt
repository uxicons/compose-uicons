package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretDown: ImageVector? = null

val Icons.Ts.CaretDown: ImageVector
    get() = _CaretDown ?: UXIcon(name = "CaretDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.98f, 16f)
                curveToRelative(-0.56f, 0f, -1.1f, -0.24f, -1.48f, -0.66f)
                lineToRelative(-5.8f, -6.34f)
                horizontalLineToRelative(14.55f)
                lineToRelative(-5.8f, 6.35f)
                curveToRelative(-0.36f, 0.4f, -0.89f, 0.64f, -1.44f, 0.65f)
                horizontalLineToRelative(-0.03f)
                close()
                moveTo(6.97f, 10f)
                lineToRelative(4.27f, 4.67f)
                curveToRelative(0.19f, 0.22f, 0.51f, 0.33f, 0.75f, 0.33f)
                curveToRelative(0.27f, -0.01f, 0.53f, -0.12f, 0.71f, -0.33f)
                lineToRelative(4.28f, -4.67f)
                lineTo(6.96f, 10f)
                close()
            }
        }.also { _CaretDown = it}
