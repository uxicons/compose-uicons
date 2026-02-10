package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallLeft: ImageVector? = null

val Icons.Tr.ArrowSmallLeft: ImageVector
    get() = _ArrowSmallLeft ?: UXIcon(name = "ArrowSmallLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 12f)
                curveToRelative(-0.0f, 0.02f, -0.0f, -0.01f, 0f, 0f)
                horizontalLineToRelative(0f)
                close()
                moveTo(18.5f, 11.5f)
                lineTo(6.09f, 11.5f)
                curveToRelative(0.07f, -0.21f, 0.2f, -0.4f, 0.36f, -0.56f)
                lineToRelative(3.95f, -4.04f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-3.94f, 4.04f)
                curveToRelative(-0.48f, 0.47f, -0.74f, 1.14f, -0.74f, 1.77f)
                curveToRelative(0.01f, 0.62f, 0.25f, 1.28f, 0.72f, 1.76f)
                lineToRelative(3.92f, 4.09f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.12f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.21f, -0.51f, 0.01f, -0.71f)
                lineToRelative(-3.93f, -4.09f)
                curveToRelative(-0.16f, -0.16f, -0.28f, -0.36f, -0.35f, -0.56f)
                horizontalLineToRelative(12.42f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowSmallLeft = it}
