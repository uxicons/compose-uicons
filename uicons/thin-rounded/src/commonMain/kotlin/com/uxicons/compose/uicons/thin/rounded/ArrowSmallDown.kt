package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallDown: ImageVector? = null

val Icons.Tr.ArrowSmallDown: ImageVector
    get() = _ArrowSmallDown ?: UXIcon(name = "ArrowSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.85f, 14.36f)
                lineToRelative(-4.09f, 3.92f)
                curveToRelative(-0.48f, 0.47f, -1.13f, 0.71f, -1.76f, 0.72f)
                curveToRelative(-0.63f, 0f, -1.29f, -0.26f, -1.77f, -0.74f)
                lineToRelative(-4.04f, -3.94f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(4.04f, 3.95f)
                curveToRelative(0.17f, 0.17f, 0.36f, 0.29f, 0.56f, 0.36f)
                lineTo(11.5f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.42f)
                curveToRelative(0.2f, -0.07f, 0.4f, -0.19f, 0.56f, -0.35f)
                lineToRelative(4.09f, -3.93f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.01f, 0f, 0.02f, 0.0f, 0f, 0f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _ArrowSmallDown = it}
