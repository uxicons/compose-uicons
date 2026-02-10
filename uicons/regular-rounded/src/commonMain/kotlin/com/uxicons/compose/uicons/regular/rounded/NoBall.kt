package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoBall: ImageVector? = null

val Icons.Rr.NoBall: ImageVector
    get() = _NoBall ?: UXIcon(name = "NoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(2.05f, -2.74f, 1.84f, -6.65f, -0.65f, -9.14f)
                curveToRelative(-2.49f, -2.49f, -6.4f, -2.7f, -9.14f, -0.65f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(14.57f, 10.53f)
                lineTo(12.59f, 9.1f)
                curveToRelative(-0.35f, -0.26f, -0.82f, -0.26f, -1.18f, 0f)
                lineToRelative(-0.52f, 0.38f)
                lineToRelative(-1.65f, -1.65f)
                curveToRelative(0.3f, -0.2f, 0.61f, -0.35f, 0.94f, -0.48f)
                lineToRelative(1.23f, 0.89f)
                curveToRelative(0.35f, 0.26f, 0.82f, 0.26f, 1.18f, 0f)
                lineToRelative(1.23f, -0.89f)
                curveToRelative(0.63f, 0.24f, 1.21f, 0.61f, 1.72f, 1.12f)
                curveToRelative(0.11f, 0.11f, 0.19f, 0.23f, 0.28f, 0.35f)
                lineToRelative(-0.45f, 1.45f)
                curveToRelative(-0.13f, 0.41f, 0.03f, 0.86f, 0.38f, 1.11f)
                lineToRelative(1.23f, 0.86f)
                curveToRelative(-0.04f, 0.88f, -0.3f, 1.75f, -0.8f, 2.51f)
                lineToRelative(-1.7f, -1.7f)
                lineToRelative(0.46f, -1.41f)
                curveToRelative(0.13f, -0.41f, -0.01f, -0.86f, -0.36f, -1.12f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(12.69f, 16.93f)
                lineTo(14.35f, 18.59f)
                curveToRelative(-1.38f, 0.49f, -2.95f, 0.59f, -4.6f, 0.04f)
                curveToRelative(-2.04f, -0.69f, -3.68f, -2.33f, -4.37f, -4.37f)
                curveToRelative(-0.56f, -1.65f, -0.46f, -3.21f, 0.04f, -4.6f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(-0.58f, 0.41f)
                curveToRelative(0.05f, 0.89f, 0.32f, 1.71f, 0.77f, 2.42f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f)
                lineToRelative(0.5f, 1.48f)
                curveToRelative(0.39f, 0.1f, 0.8f, 0.17f, 1.23f, 0.17f)
                curveToRelative(0.24f, 0f, 0.46f, -0.04f, 0.69f, -0.07f)
                close()
            }
        }.also { _NoBall = it}
