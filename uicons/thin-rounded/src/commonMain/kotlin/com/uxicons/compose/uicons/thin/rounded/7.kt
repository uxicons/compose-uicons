package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr7: ImageVector? = null

val Icons.Tr.Tr7: ImageVector
    get() = _Tr7 ?: UXIcon(name = "Tr7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 24f)
                curveToRelative(-0.08f, 0f, -0.17f, -0.02f, -0.25f, -0.07f)
                curveToRelative(-0.24f, -0.14f, -0.32f, -0.44f, -0.19f, -0.68f)
                lineTo(18.9f, 2.52f)
                curveToRelative(0.15f, -0.31f, 0.14f, -0.7f, -0.06f, -1.01f)
                curveToRelative(-0.2f, -0.32f, -0.54f, -0.51f, -0.91f, -0.51f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.43f)
                curveToRelative(0.72f, 0f, 1.38f, 0.37f, 1.76f, 0.98f)
                curveToRelative(0.38f, 0.61f, 0.41f, 1.37f, 0.09f, 2.01f)
                lineTo(7.93f, 23.75f)
                curveToRelative(-0.09f, 0.16f, -0.26f, 0.25f, -0.43f, 0.25f)
                close()
            }
        }.also { _Tr7 = it}
