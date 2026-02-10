package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Terminal: ImageVector? = null

val Icons.Tr.Terminal: ImageVector
    get() = _Terminal ?: UXIcon(name = "Terminal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.26f, 10.23f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.57f, 0f, 3.54f)
                lineTo(0.85f, 21.86f)
                curveToRelative(-0.1f, 0.09f, -0.22f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.36f, -0.15f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.52f, 0.01f, -0.71f)
                lineTo(8.57f, 13.05f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.53f, 0f, -2.11f)
                lineTo(0.15f, 2.86f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.01f)
                lineTo(9.26f, 10.23f)
                close()
                moveTo(23.5f, 21f)
                lineTo(10.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Terminal = it}
