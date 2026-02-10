package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WonSign: ImageVector? = null

val Icons.Tr.WonSign: ImageVector
    get() = _WonSign ?: UXIcon(name = "WonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 14f)
                horizontalLineToRelative(-1.75f)
                lineTo(23.99f, 0.58f)
                curveToRelative(0.05f, -0.27f, -0.14f, -0.53f, -0.41f, -0.58f)
                curveToRelative(-0.27f, -0.05f, -0.53f, 0.14f, -0.58f, 0.41f)
                lineToRelative(-2.27f, 13.59f)
                horizontalLineToRelative(-7.16f)
                lineToRelative(-1.09f, -4.62f)
                curveToRelative(-0.11f, -0.45f, -0.87f, -0.45f, -0.97f, 0f)
                lineToRelative(-1.09f, 4.62f)
                lineTo(3.26f, 14f)
                lineTo(0.99f, 0.42f)
                curveTo(0.95f, 0.14f, 0.68f, -0.04f, 0.42f, 0f)
                curveTo(0.15f, 0.05f, -0.04f, 0.31f, 0f, 0.58f)
                lineTo(2.25f, 14f)
                lineTo(0.5f, 14f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.91f)
                lineToRelative(1.06f, 6.35f)
                curveToRelative(0.24f, 1.46f, 1.4f, 2.52f, 2.87f, 2.63f)
                curveToRelative(1.22f, 0.09f, 2.71f, -0.53f, 3.26f, -2.2f)
                lineToRelative(1.61f, -6.79f)
                horizontalLineToRelative(1.58f)
                lineToRelative(1.62f, 6.83f)
                curveToRelative(0.5f, 1.51f, 1.83f, 2.16f, 3f, 2.16f)
                curveToRelative(0.08f, 0f, 0.17f, 0f, 0.25f, 0f)
                curveToRelative(1.48f, -0.12f, 2.63f, -1.17f, 2.87f, -2.63f)
                lineToRelative(1.06f, -6.35f)
                horizontalLineToRelative(1.91f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8.64f, 21.51f)
                curveToRelative(-0.39f, 1.18f, -1.45f, 1.54f, -2.22f, 1.47f)
                curveToRelative(-0.78f, -0.06f, -1.76f, -0.57f, -1.96f, -1.8f)
                lineToRelative(-1.03f, -6.19f)
                horizontalLineToRelative(6.76f)
                lineToRelative(-1.54f, 6.51f)
                close()
                moveTo(11.44f, 14f)
                lineToRelative(0.55f, -2.33f)
                lineToRelative(0.55f, 2.33f)
                horizontalLineToRelative(-1.1f)
                close()
                moveTo(19.53f, 21.19f)
                curveToRelative(-0.21f, 1.23f, -1.19f, 1.74f, -1.96f, 1.8f)
                curveToRelative(-0.77f, 0.07f, -1.83f, -0.29f, -2.21f, -1.43f)
                lineToRelative(-1.55f, -6.56f)
                horizontalLineToRelative(6.76f)
                lineToRelative(-1.03f, 6.19f)
                close()
            }
        }.also { _WonSign = it}
