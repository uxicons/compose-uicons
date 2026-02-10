package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Tr.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.85f, 13.15f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-5.63f, -5.61f)
                lineToRelative(-0.01f, 15.25f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineToRelative(0.01f, -15.25f)
                lineToRelative(-5.66f, 5.61f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.19f, -0.71f, -0.0f)
                reflectiveCurveToRelative(-0.19f, -0.51f, 0.0f, -0.71f)
                lineToRelative(5.73f, -5.68f)
                curveToRelative(0.6f, -0.6f, 1.66f, -0.6f, 2.27f, 0.0f)
                lineToRelative(5.71f, 5.68f)
                close()
                moveTo(12f, 0f)
                curveTo(5.55f, 0f, 0.29f, 5.04f, 0.01f, 11.48f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(0.29f, 0.0f, 0.51f, -0.2f, 0.52f, -0.48f)
                curveTo(1.26f, 5.62f, 6.09f, 1f, 12f, 1f)
                reflectiveCurveToRelative(10.74f, 4.62f, 10.99f, 10.52f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.48f, 0.5f, 0.48f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.24f, 0.48f, -0.52f)
                curveToRelative(-0.28f, -6.44f, -5.54f, -11.48f, -11.99f, -11.48f)
                close()
            }
        }.also { _ArrowUpToArc = it}
