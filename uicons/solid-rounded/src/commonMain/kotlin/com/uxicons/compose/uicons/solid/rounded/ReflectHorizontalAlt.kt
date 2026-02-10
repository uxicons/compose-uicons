package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Sr.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.85f, 19.37f)
                curveToRelative(-0.24f, 0f, -0.48f, -0.05f, -0.71f, -0.14f)
                curveToRelative(-0.7f, -0.29f, -1.15f, -0.96f, -1.15f, -1.71f)
                lineTo(0f, 6.48f)
                curveToRelative(0f, -0.75f, 0.45f, -1.43f, 1.15f, -1.71f)
                curveToRelative(0.69f, -0.29f, 1.49f, -0.13f, 2.02f, 0.41f)
                lineToRelative(5.12f, 5.15f)
                curveToRelative(0.45f, 0.4f, 0.72f, 1.01f, 0.72f, 1.67f)
                curveToRelative(0f, 0.65f, -0.28f, 1.27f, -0.76f, 1.7f)
                lineToRelative(-5.07f, 5.12f)
                curveToRelative(-0.35f, 0.36f, -0.83f, 0.55f, -1.31f, 0.55f)
                close()
                moveTo(22.15f, 19.37f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.19f, -1.31f, -0.55f)
                lineToRelative(-5.12f, -5.16f)
                curveToRelative(-0.44f, -0.39f, -0.72f, -1.01f, -0.72f, -1.66f)
                curveToRelative(0f, -0.66f, 0.27f, -1.27f, 0.76f, -1.71f)
                lineToRelative(5.08f, -5.11f)
                curveToRelative(0.53f, -0.53f, 1.32f, -0.69f, 2.02f, -0.41f)
                curveToRelative(0.7f, 0.29f, 1.15f, 0.96f, 1.15f, 1.71f)
                verticalLineToRelative(11.04f)
                curveToRelative(0f, 0.75f, -0.45f, 1.43f, -1.15f, 1.71f)
                curveToRelative(-0.23f, 0.09f, -0.47f, 0.14f, -0.71f, 0.14f)
                close()
                moveTo(13f, 23f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(11f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _ReflectHorizontalAlt = it}
