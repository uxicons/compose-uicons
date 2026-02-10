package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cloud: ImageVector? = null

val Icons.Sc.Cloud: ImageVector
    get() = _Cloud ?: UXIcon(name = "Cloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 10.07f)
                curveToRelative(-0.09f, -4.03f, -3.34f, -7.28f, -7.32f, -7.28f)
                curveToRelative(-4.04f, 0f, -7.32f, 3.34f, -7.32f, 7.45f)
                curveToRelative(0f, 0.27f, 0.01f, 0.54f, 0.04f, 0.81f)
                curveToRelative(-2.15f, 0.61f, -3.71f, 2.62f, -3.71f, 4.99f)
                curveToRelative(0f, 2.85f, 2.28f, 5.18f, 5.09f, 5.18f)
                horizontalLineToRelative(11.26f)
                curveToRelative(3.11f, 0f, 5.65f, -2.58f, 5.65f, -5.75f)
                curveToRelative(0f, -2.43f, -1.51f, -4.58f, -3.7f, -5.39f)
                close()
            }
        }.also { _Cloud = it}
