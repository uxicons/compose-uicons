package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleUp: ImageVector? = null

val Icons.Tr.AngleUp: ImageVector
    get() = _AngleUp ?: UXIcon(name = "AngleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 18.17f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.14f)
                lineToRelative(-9.38f, -9.29f)
                curveToRelative(-0.95f, -0.95f, -2.59f, -0.95f, -3.54f, -0.0f)
                lineTo(0.85f, 18.03f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.19f, -0.71f, -0.0f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineToRelative(9.38f, -9.29f)
                curveToRelative(1.32f, -1.32f, 3.62f, -1.32f, 4.95f, 0.0f)
                lineToRelative(9.38f, 9.29f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                close()
            }
        }.also { _AngleUp = it}
