package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Tr.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.5f, 24f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.11f, -0.46f, -0.3f)
                curveToRelative(-0.11f, -0.25f, 0.01f, -0.55f, 0.26f, -0.66f)
                lineToRelative(21.5f, -9.32f)
                curveToRelative(0.74f, -0.3f, 1.22f, -0.98f, 1.2f, -1.71f)
                curveToRelative(-0.02f, -0.69f, -0.48f, -1.33f, -1.19f, -1.61f)
                lineTo(0.3f, 0.96f)
                curveTo(0.05f, 0.85f, -0.07f, 0.55f, 0.04f, 0.3f)
                curveTo(0.15f, 0.05f, 0.45f, -0.07f, 0.7f, 0.04f)
                lineToRelative(21.5f, 9.44f)
                curveToRelative(1.06f, 0.43f, 1.77f, 1.42f, 1.8f, 2.51f)
                curveToRelative(0.03f, 1.14f, -0.7f, 2.2f, -1.81f, 2.65f)
                lineTo(0.7f, 23.96f)
                curveToRelative(-0.07f, 0.03f, -0.13f, 0.04f, -0.2f, 0.04f)
                close()
            }
        }.also { _GreaterThan = it}
