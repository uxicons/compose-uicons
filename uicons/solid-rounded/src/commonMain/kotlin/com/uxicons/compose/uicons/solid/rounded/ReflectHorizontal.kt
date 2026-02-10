package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Sr.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                lineTo(13f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(3.15f, 18.5f)
                lineToRelative(5.08f, -4.79f)
                curveToRelative(0.49f, -0.43f, 0.76f, -1.06f, 0.76f, -1.71f)
                reflectiveCurveToRelative(-0.28f, -1.28f, -0.75f, -1.69f)
                lineTo(3.14f, 5.49f)
                curveToRelative(-0.56f, -0.51f, -1.33f, -0.63f, -2.02f, -0.33f)
                curveToRelative(-0.69f, 0.3f, -1.12f, 0.96f, -1.12f, 1.72f)
                verticalLineToRelative(10.25f)
                curveToRelative(0f, 0.75f, 0.43f, 1.41f, 1.12f, 1.72f)
                curveToRelative(0.25f, 0.11f, 0.51f, 0.16f, 0.76f, 0.16f)
                curveToRelative(0.46f, 0f, 0.91f, -0.17f, 1.27f, -0.5f)
                close()
                moveTo(22.88f, 18.84f)
                curveToRelative(0.69f, -0.3f, 1.12f, -0.96f, 1.12f, -1.72f)
                lineTo(24f, 6.88f)
                curveToRelative(0f, -0.75f, -0.43f, -1.41f, -1.12f, -1.72f)
                curveToRelative(-0.69f, -0.3f, -1.46f, -0.18f, -2.03f, 0.34f)
                lineToRelative(-5.08f, 4.79f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.06f, -0.76f, 1.71f)
                reflectiveCurveToRelative(0.28f, 1.27f, 0.75f, 1.69f)
                lineToRelative(5.11f, 4.81f)
                curveToRelative(0.36f, 0.33f, 0.8f, 0.5f, 1.26f, 0.5f)
                curveToRelative(0.26f, 0f, 0.52f, -0.05f, 0.76f, -0.16f)
                close()
            }
        }.also { _ReflectHorizontal = it}
