package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveTriangle: ImageVector? = null

val Icons.Tr.WaveTriangle: ImageVector
    get() = _WaveTriangle ?: UXIcon(name = "WaveTriangle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 22f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.18f, -0.0f, -0.35f, -0.11f, -0.43f, -0.27f)
                lineTo(6.97f, 3.52f)
                lineTo(0.93f, 13.75f)
                curveToRelative(-0.14f, 0.24f, -0.45f, 0.32f, -0.69f, 0.18f)
                curveToRelative(-0.24f, -0.14f, -0.32f, -0.45f, -0.18f, -0.69f)
                lineTo(6.57f, 2.25f)
                curveToRelative(0.09f, -0.16f, 0.28f, -0.24f, 0.44f, -0.25f)
                curveToRelative(0.18f, 0.0f, 0.35f, 0.11f, 0.43f, 0.27f)
                lineToRelative(9.58f, 18.21f)
                lineToRelative(6.04f, -10.23f)
                curveToRelative(0.14f, -0.24f, 0.45f, -0.32f, 0.69f, -0.18f)
                curveToRelative(0.24f, 0.14f, 0.32f, 0.45f, 0.18f, 0.69f)
                lineToRelative(-6.5f, 11f)
                curveToRelative(-0.09f, 0.15f, -0.25f, 0.25f, -0.43f, 0.25f)
                close()
            }
        }.also { _WaveTriangle = it}
