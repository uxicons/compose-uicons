package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Tr.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.52f, 8.34f)
                curveToRelative(0.38f, 0.42f, 0.91f, 0.66f, 1.48f, 0.66f)
                reflectiveCurveToRelative(1.1f, -0.24f, 1.48f, -0.66f)
                lineToRelative(5.12f, -5.83f)
                curveToRelative(0.41f, -0.45f, 0.51f, -1.06f, 0.27f, -1.62f)
                reflectiveCurveToRelative(-0.77f, -0.9f, -1.37f, -0.9f)
                lineTo(6.5f, -0.01f)
                curveToRelative(-0.6f, 0f, -1.13f, 0.34f, -1.37f, 0.9f)
                reflectiveCurveToRelative(-0.14f, 1.17f, 0.26f, 1.61f)
                lineToRelative(5.13f, 5.84f)
                close()
                moveTo(6.04f, 1.3f)
                curveToRelative(0.03f, -0.07f, 0.16f, -0.3f, 0.46f, -0.3f)
                horizontalLineToRelative(11f)
                curveToRelative(0.3f, 0f, 0.43f, 0.23f, 0.46f, 0.3f)
                curveToRelative(0.03f, 0.07f, 0.12f, 0.32f, -0.1f, 0.55f)
                lineToRelative(-5.13f, 5.83f)
                curveToRelative(-0.38f, 0.42f, -1.09f, 0.42f, -1.46f, 0f)
                lineTo(6.13f, 1.84f)
                curveToRelative(-0.2f, -0.22f, -0.12f, -0.47f, -0.09f, -0.54f)
                close()
                moveTo(13.47f, 15.66f)
                curveToRelative(-0.75f, -0.84f, -2.2f, -0.84f, -2.95f, 0f)
                lineToRelative(-5.12f, 5.83f)
                curveToRelative(-0.41f, 0.45f, -0.51f, 1.06f, -0.27f, 1.62f)
                reflectiveCurveToRelative(0.77f, 0.9f, 1.37f, 0.9f)
                horizontalLineToRelative(11f)
                curveToRelative(0.6f, 0f, 1.13f, -0.34f, 1.37f, -0.9f)
                reflectiveCurveToRelative(0.14f, -1.17f, -0.26f, -1.61f)
                lineToRelative(-5.13f, -5.84f)
                close()
                moveTo(23.99f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 11.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _ReflectVertical = it}
