package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Tr.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.02f)
                lineTo(0.15f, 6.68f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(9.38f, 9.29f)
                curveToRelative(0.95f, 0.95f, 2.59f, 0.95f, 3.54f, 0.0f)
                lineToRelative(9.38f, -9.29f)
                curveToRelative(0.19f, -0.19f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                lineToRelative(-9.38f, 9.29f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.47f, 1.02f)
                close()
            }
        }.also { _AngleDown = it}
