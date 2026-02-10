package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandyCane: ImageVector? = null

val Icons.Ss.CandyCane: ImageVector
    get() = _CandyCane ?: UXIcon(name = "CandyCane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.64f, 6f)
                curveToRelative(1.39f, -2.32f, 2.04f, -3.17f, 2.45f, -3.62f)
                curveTo(12.38f, 0.99f, 14.12f, 0.16f, 16f, 0.02f)
                lineTo(16f, 5.82f)
                curveToRelative(-0.13f, 0.04f, -0.26f, 0.11f, -0.38f, 0.18f)
                horizontalLineToRelative(-6.98f)
                close()
                moveTo(4.15f, 14f)
                curveToRelative(-0.81f, 1.47f, -1.58f, 2.88f, -2.21f, 4f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.51f, -0.92f, 1.05f, -1.9f, 1.58f, -2.88f)
                curveToRelative(0.21f, -0.39f, 0.42f, -0.76f, 0.61f, -1.12f)
                lineTo(4.15f, 14f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(5.87f)
                curveToRelative(-0.29f, -1.52f, -1.06f, -2.92f, -2.24f, -4.01f)
                curveToRelative(-1.03f, -0.96f, -2.28f, -1.59f, -3.63f, -1.85f)
                lineTo(18f, 6f)
                close()
                moveTo(0.83f, 20f)
                curveToRelative(-0.17f, 0.31f, -0.27f, 0.49f, -0.27f, 0.49f)
                lineToRelative(-0.5f, 0.9f)
                lineToRelative(5.09f, 2.64f)
                lineToRelative(0.47f, -0.85f)
                reflectiveCurveToRelative(0.73f, -1.31f, 1.77f, -3.18f)
                lineTo(0.83f, 20f)
                close()
                moveTo(18.09f, 8f)
                curveToRelative(-0.08f, 0.19f, -0.2f, 0.37f, -0.35f, 0.53f)
                lineToRelative(-1f, 1.39f)
                lineToRelative(4.81f, 3.28f)
                lineToRelative(0.58f, -0.74f)
                curveToRelative(1.07f, -1.37f, 1.69f, -2.9f, 1.82f, -4.46f)
                horizontalLineToRelative(-5.87f)
                close()
                moveTo(7.47f, 8f)
                curveToRelative(-0.63f, 1.1f, -1.36f, 2.42f, -2.23f, 4f)
                horizontalLineToRelative(6.55f)
                curveToRelative(1.05f, -1.88f, 1.8f, -3.14f, 2.33f, -4f)
                lineTo(7.47f, 8f)
                close()
            }
        }.also { _CandyCane = it}
