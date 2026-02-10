package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhonePause: ImageVector? = null

val Icons.Tr.PhonePause: ImageVector
    get() = _PhonePause ?: UXIcon(name = "PhonePause") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(21f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(18f, 7.5f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(22.23f, 22.27f)
                lineToRelative(0.98f, -1.12f)
                curveToRelative(1.05f, -1.05f, 1.05f, -2.76f, -0.05f, -3.85f)
                lineToRelative(-2.45f, -1.87f)
                curveToRelative(-1.02f, -1.02f, -2.79f, -1.02f, -3.8f, -0.0f)
                lineToRelative(-1.53f, 1.49f)
                curveToRelative(-3.68f, -1.5f, -6.68f, -4.5f, -8.29f, -8.3f)
                lineToRelative(1.49f, -1.52f)
                curveToRelative(1.05f, -1.05f, 1.05f, -2.76f, 0.04f, -3.76f)
                lineToRelative(-1.96f, -2.54f)
                curveToRelative(-1.02f, -1.02f, -2.81f, -0.99f, -3.78f, -0.02f)
                lineToRelative(-1.18f, 1.02f)
                curveTo(0.6f, 2.89f, 0f, 4.37f, 0f, 5.98f)
                curveToRelative(0f, 7.75f, 10.28f, 18.02f, 18.02f, 18.02f)
                curveToRelative(1.6f, 0f, 3.09f, -0.6f, 4.21f, -1.73f)
                close()
                moveTo(5.91f, 1.45f)
                lineToRelative(1.96f, 2.54f)
                curveToRelative(0.66f, 0.66f, 0.66f, 1.73f, -0.01f, 2.4f)
                lineToRelative(-1.72f, 1.77f)
                curveToRelative(-0.14f, 0.14f, -0.18f, 0.35f, -0.1f, 0.54f)
                curveToRelative(1.73f, 4.31f, 5.11f, 7.69f, 9.29f, 9.28f)
                curveToRelative(0.18f, 0.07f, 0.39f, 0.03f, 0.53f, -0.11f)
                lineToRelative(1.76f, -1.72f)
                reflectiveCurveToRelative(0.0f, -0.0f, 0.01f, -0.0f)
                curveToRelative(0.64f, -0.64f, 1.7f, -0.68f, 2.44f, 0.04f)
                lineToRelative(2.45f, 1.87f)
                curveToRelative(0.66f, 0.66f, 0.66f, 1.73f, -0.02f, 2.42f)
                lineToRelative(-0.98f, 1.12f)
                curveToRelative(-0.91f, 0.91f, -2.15f, 1.41f, -3.48f, 1.41f)
                curveTo(10.86f, 23f, 1f, 13.14f, 1f, 5.98f)
                curveToRelative(0f, -1.33f, 0.5f, -2.57f, 1.39f, -3.46f)
                lineToRelative(1.18f, -1.02f)
                curveToRelative(0.34f, -0.34f, 0.78f, -0.5f, 1.22f, -0.5f)
                curveToRelative(0.42f, 0f, 0.83f, 0.15f, 1.13f, 0.45f)
                close()
            }
        }.also { _PhonePause = it}
