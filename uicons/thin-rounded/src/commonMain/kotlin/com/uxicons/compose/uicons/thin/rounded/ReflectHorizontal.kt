package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Tr.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 0.5f)
                lineTo(12.5f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(11.5f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(9f, 12f)
                curveToRelative(0f, 0.56f, -0.24f, 1.1f, -0.66f, 1.48f)
                lineToRelative(-5.84f, 5.13f)
                curveToRelative(-0.28f, 0.26f, -0.63f, 0.39f, -1f, 0.39f)
                curveToRelative(-0.21f, 0f, -0.41f, -0.04f, -0.61f, -0.13f)
                curveToRelative(-0.55f, -0.24f, -0.9f, -0.77f, -0.9f, -1.37f)
                lineTo(-0.01f, 6.5f)
                curveToRelative(0f, -0.6f, 0.34f, -1.13f, 0.9f, -1.37f)
                curveToRelative(0.55f, -0.24f, 1.17f, -0.14f, 1.62f, 0.27f)
                lineToRelative(5.82f, 5.12f)
                curveToRelative(0.42f, 0.38f, 0.66f, 0.92f, 0.66f, 1.48f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, -0.28f, -0.12f, -0.54f, -0.33f, -0.73f)
                lineTo(1.85f, 6.14f)
                curveToRelative(-0.12f, -0.11f, -0.24f, -0.14f, -0.34f, -0.14f)
                reflectiveCurveToRelative(-0.17f, 0.03f, -0.21f, 0.04f)
                curveToRelative(-0.07f, 0.03f, -0.3f, 0.16f, -0.3f, 0.46f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.3f, 0.23f, 0.43f, 0.3f, 0.46f)
                curveToRelative(0.07f, 0.03f, 0.32f, 0.11f, 0.54f, -0.09f)
                lineToRelative(5.84f, -5.14f)
                curveToRelative(0.21f, -0.19f, 0.32f, -0.45f, 0.32f, -0.73f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.6f, -0.34f, 1.13f, -0.9f, 1.37f)
                curveToRelative(-0.2f, 0.09f, -0.41f, 0.13f, -0.61f, 0.13f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.14f, -1.01f, -0.4f)
                lineToRelative(-5.83f, -5.12f)
                curveToRelative(-0.42f, -0.38f, -0.66f, -0.92f, -0.66f, -1.48f)
                reflectiveCurveToRelative(0.24f, -1.1f, 0.66f, -1.48f)
                lineToRelative(5.84f, -5.13f)
                curveToRelative(0.44f, -0.4f, 1.06f, -0.5f, 1.61f, -0.26f)
                curveToRelative(0.55f, 0.24f, 0.9f, 0.77f, 0.9f, 1.37f)
                close()
            }
        }.also { _ReflectHorizontal = it}
