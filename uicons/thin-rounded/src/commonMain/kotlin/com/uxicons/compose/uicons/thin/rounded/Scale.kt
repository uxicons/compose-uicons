package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scale: ImageVector? = null

val Icons.Tr.Scale: ImageVector
    get() = _Scale ?: UXIcon(name = "Scale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.01f, 0f, -0.02f, 0.01f, -0.03f, 0.01f)
                curveToRelative(-1.1f, -1.23f, -2.69f, -2.01f, -4.47f, -2.01f)
                reflectiveCurveToRelative(-3.37f, 0.78f, -4.47f, 2.01f)
                curveToRelative(-0.01f, 0f, -0.02f, -0.01f, -0.03f, -0.01f)
                horizontalLineToRelative(-3f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.76f)
                lineToRelative(1.32f, -3.31f)
                curveToRelative(0.1f, -0.26f, -0.02f, -0.55f, -0.28f, -0.65f)
                curveToRelative(-0.26f, -0.1f, -0.55f, 0.02f, -0.65f, 0.28f)
                lineToRelative(-1.47f, 3.69f)
                horizontalLineToRelative(-3.16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.31f)
                curveToRelative(-0.51f, 0.88f, -0.81f, 1.91f, -0.81f, 3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.09f, -0.3f, -2.12f, -0.81f, -3f)
                horizontalLineToRelative(2.31f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Scale = it}
