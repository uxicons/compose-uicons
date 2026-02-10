package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRight: ImageVector? = null

val Icons.Tr.ArrowUpRight: ImageVector
    get() = _ArrowUpRight ?: UXIcon(name = "ArrowUpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineTo(10.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.51f, 0f, 0.98f, 0.15f, 1.38f, 0.41f)
                lineTo(0.15f, 23.15f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineTo(22.59f, 2.12f)
                curveToRelative(0.26f, 0.4f, 0.41f, 0.87f, 0.41f, 1.38f)
                verticalLineTo(13.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }.also { _ArrowUpRight = it}
