package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WonSign: ImageVector? = null

val Icons.Rr.WonSign: ImageVector
    get() = _WonSign ?: UXIcon(name = "WonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 14f)
                horizontalLineToRelative(-1.16f)
                lineTo(23.99f, 1.15f)
                curveToRelative(0.09f, -0.54f, -0.28f, -1.06f, -0.82f, -1.15f)
                curveToRelative(-0.55f, -0.1f, -1.06f, 0.28f, -1.15f, 0.82f)
                lineToRelative(-2.2f, 13.18f)
                horizontalLineToRelative(-5.81f)
                lineToRelative(-1.04f, -4.24f)
                curveToRelative(-0.11f, -0.45f, -0.51f, -0.76f, -0.97f, -0.76f)
                reflectiveCurveToRelative(-0.86f, 0.31f, -0.97f, 0.76f)
                lineToRelative(-1.04f, 4.24f)
                lineTo(4.18f, 14f)
                lineTo(1.99f, 0.82f)
                curveTo(1.9f, 0.28f, 1.38f, -0.09f, 0.84f, 0f)
                curveTo(0.29f, 0.09f, -0.08f, 0.61f, 0.01f, 1.15f)
                lineTo(2.16f, 14f)
                lineTo(1f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.49f)
                lineToRelative(0.84f, 5.04f)
                curveToRelative(0.27f, 1.64f, 1.57f, 2.82f, 3.22f, 2.95f)
                curveToRelative(1.66f, 0.13f, 3.12f, -0.84f, 3.67f, -2.49f)
                lineToRelative(1.35f, -5.5f)
                horizontalLineToRelative(0.88f)
                lineToRelative(1.37f, 5.57f)
                curveToRelative(0.49f, 1.48f, 1.82f, 2.43f, 3.35f, 2.43f)
                curveToRelative(0.1f, 0f, 0.2f, 0f, 0.29f, -0.01f)
                curveToRelative(1.65f, -0.13f, 2.95f, -1.32f, 3.22f, -2.95f)
                lineToRelative(0.84f, -5.04f)
                horizontalLineToRelative(1.49f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.29f, 20.94f)
                curveToRelative(-0.28f, 0.85f, -1f, 1.09f, -1.59f, 1.05f)
                curveToRelative(-0.58f, -0.05f, -1.26f, -0.41f, -1.41f, -1.29f)
                lineToRelative(-0.78f, -4.71f)
                horizontalLineToRelative(4.99f)
                lineToRelative(-1.21f, 4.94f)
                close()
                moveTo(18.69f, 20.71f)
                curveToRelative(-0.15f, 0.88f, -0.82f, 1.24f, -1.41f, 1.29f)
                curveToRelative(-0.58f, 0.04f, -1.31f, -0.21f, -1.57f, -0.98f)
                lineToRelative(-1.23f, -5.02f)
                horizontalLineToRelative(4.98f)
                lineToRelative(-0.78f, 4.71f)
                close()
            }
        }.also { _WonSign = it}
