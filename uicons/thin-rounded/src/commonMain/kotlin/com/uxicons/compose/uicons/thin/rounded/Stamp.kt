package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Tr.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 24f)
                lineTo(2.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(21.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(23.95f, 19.45f)
                curveToRelative(0f, -3.11f, -2.13f, -5.46f, -4.95f, -5.46f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.48f, 0f, -0.93f, -0.21f, -1.23f, -0.59f)
                curveToRelative(-0.3f, -0.37f, -0.42f, -0.86f, -0.32f, -1.33f)
                lineToRelative(0.22f, -1.0f)
                curveToRelative(0.65f, -3.02f, 1.27f, -5.87f, 1.27f, -7.08f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.34f, 0.71f, 4.61f, 1.47f, 8.08f)
                curveToRelative(0.1f, 0.47f, -0.01f, 0.95f, -0.31f, 1.33f)
                curveToRelative(-0.3f, 0.37f, -0.75f, 0.59f, -1.23f, 0.59f)
                horizontalLineToRelative(-2.92f)
                curveTo(2.12f, 14f, -0.04f, 16.34f, -0.04f, 19.45f)
                curveToRelative(0f, 0.62f, 0.41f, 1.54f, 1.54f, 1.54f)
                lineTo(22.41f, 21f)
                curveToRelative(1.13f, -0.0f, 1.54f, -0.93f, 1.54f, -1.54f)
                close()
                moveTo(7.92f, 15f)
                curveToRelative(0.79f, 0f, 1.52f, -0.35f, 2.01f, -0.96f)
                curveToRelative(0.49f, -0.61f, 0.68f, -1.4f, 0.51f, -2.17f)
                curveToRelative(-0.71f, -3.27f, -1.44f, -6.64f, -1.44f, -7.87f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.1f, -0.6f, 3.9f, -1.24f, 6.87f)
                lineToRelative(-0.22f, 1.0f)
                curveToRelative(-0.16f, 0.77f, 0.02f, 1.56f, 0.52f, 2.17f)
                reflectiveCurveToRelative(1.23f, 0.96f, 2.01f, 0.96f)
                horizontalLineToRelative(2.94f)
                curveToRelative(2.29f, 0f, 3.95f, 1.87f, 3.95f, 4.46f)
                curveToRelative(0f, 0.13f, -0.04f, 0.54f, -0.54f, 0.55f)
                lineTo(1.5f, 20.0f)
                curveToRelative(-0.46f, -0.0f, -0.54f, -0.35f, -0.54f, -0.55f)
                curveToRelative(0f, -2.58f, 1.7f, -4.46f, 4.04f, -4.46f)
                horizontalLineToRelative(2.92f)
                close()
            }
        }.also { _Stamp = it}
