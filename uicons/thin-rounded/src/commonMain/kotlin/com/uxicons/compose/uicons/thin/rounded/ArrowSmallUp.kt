package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallUp: ImageVector? = null

val Icons.Tr.ArrowSmallUp: ImageVector
    get() = _ArrowSmallUp ?: UXIcon(name = "ArrowSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                reflectiveCurveToRelative(0.01f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                close()
                moveTo(17.85f, 9.64f)
                lineToRelative(-4.08f, -3.92f)
                curveToRelative(-0.47f, -0.47f, -1.14f, -0.74f, -1.77f, -0.72f)
                curveToRelative(-0.67f, 0.01f, -1.3f, 0.27f, -1.76f, 0.74f)
                lineToRelative(-4.04f, 3.95f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                lineToRelative(4.05f, -3.96f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.28f, 0.56f, -0.36f)
                verticalLineToRelative(12.41f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(12.5f, 6.08f)
                curveToRelative(0.21f, 0.07f, 0.4f, 0.19f, 0.57f, 0.35f)
                lineToRelative(4.09f, 3.92f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.19f, 0.71f, -0.01f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                close()
            }
        }.also { _ArrowSmallUp = it}
