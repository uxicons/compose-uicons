package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Rr.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(5.5f, 3.15f)
                curveToRelative(-0.52f, -0.57f, -0.65f, -1.34f, -0.34f, -2.03f)
                reflectiveCurveToRelative(0.96f, -1.12f, 1.72f, -1.12f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.75f, 0f, 1.41f, 0.43f, 1.72f, 1.12f)
                reflectiveCurveToRelative(0.18f, 1.46f, -0.33f, 2.02f)
                lineToRelative(-4.81f, 5.11f)
                curveToRelative(-0.42f, 0.47f, -1.04f, 0.75f, -1.69f, 0.75f)
                reflectiveCurveToRelative(-1.27f, -0.28f, -1.71f, -0.76f)
                lineTo(5.5f, 3.15f)
                close()
                moveTo(7.16f, 2f)
                lineToRelative(4.6f, 4.88f)
                curveToRelative(0.19f, 0.21f, 0.3f, 0.19f, 0.46f, 0.02f)
                lineToRelative(4.61f, -4.9f)
                lineTo(7.17f, 2f)
                close()
                moveTo(18.49f, 20.85f)
                curveToRelative(0.52f, 0.57f, 0.65f, 1.34f, 0.34f, 2.03f)
                reflectiveCurveToRelative(-0.96f, 1.12f, -1.72f, 1.12f)
                lineTo(6.88f, 24f)
                curveToRelative(-0.75f, 0f, -1.41f, -0.43f, -1.72f, -1.12f)
                reflectiveCurveToRelative(-0.18f, -1.46f, 0.33f, -2.02f)
                lineToRelative(4.81f, -5.11f)
                curveToRelative(0.84f, -0.93f, 2.53f, -0.95f, 3.4f, 0.02f)
                lineToRelative(4.79f, 5.08f)
                close()
            }
        }.also { _ReflectVertical = it}
