package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectVertical: ImageVector? = null

val Icons.Sr.ReflectVertical: ImageVector
    get() = _ReflectVertical ?: UXIcon(name = "ReflectVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(13.69f, 8.25f)
                lineToRelative(4.81f, -5.11f)
                curveToRelative(0.51f, -0.56f, 0.64f, -1.33f, 0.33f, -2.02f)
                reflectiveCurveToRelative(-0.96f, -1.12f, -1.72f, -1.12f)
                lineTo(6.88f, -0f)
                curveToRelative(-0.75f, 0f, -1.41f, 0.43f, -1.72f, 1.12f)
                reflectiveCurveToRelative(-0.18f, 1.46f, 0.34f, 2.03f)
                lineToRelative(4.79f, 5.08f)
                curveToRelative(0.44f, 0.49f, 1.06f, 0.76f, 1.71f, 0.76f)
                reflectiveCurveToRelative(1.27f, -0.28f, 1.69f, -0.75f)
                close()
                moveTo(18.84f, 22.88f)
                curveToRelative(0.3f, -0.69f, 0.18f, -1.46f, -0.34f, -2.03f)
                lineToRelative(-4.79f, -5.08f)
                curveToRelative(-0.87f, -0.97f, -2.57f, -0.95f, -3.4f, -0.02f)
                lineToRelative(-4.81f, 5.11f)
                curveToRelative(-0.51f, 0.56f, -0.64f, 1.33f, -0.33f, 2.02f)
                reflectiveCurveToRelative(0.96f, 1.12f, 1.72f, 1.12f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.75f, 0f, 1.41f, -0.43f, 1.72f, -1.12f)
                close()
            }
        }.also { _ReflectVertical = it}
