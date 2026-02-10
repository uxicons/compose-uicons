package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr1: ImageVector? = null

val Icons.Tr.Tr1: ImageVector
    get() = _Tr1 ?: UXIcon(name = "Tr1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.31f, -0.24f, -0.43f, -0.31f, -0.46f)
                curveToRelative(-0.07f, -0.03f, -0.33f, -0.11f, -0.55f, 0.11f)
                lineTo(6.89f, 7.81f)
                curveToRelative(-0.17f, 0.22f, -0.48f, 0.25f, -0.7f, 0.08f)
                curveToRelative(-0.22f, -0.17f, -0.25f, -0.48f, -0.08f, -0.7f)
                lineTo(11.4f, 0.48f)
                curveTo(11.88f, 0.0f, 12.5f, -0.12f, 13.07f, 0.12f)
                curveToRelative(0.57f, 0.24f, 0.93f, 0.77f, 0.93f, 1.39f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
            }
        }.also { _Tr1 = it}
