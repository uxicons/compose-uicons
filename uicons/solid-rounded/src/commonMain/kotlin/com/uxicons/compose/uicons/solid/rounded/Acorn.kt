package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Sr.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.94f, 6.5f)
                curveToRelative(-0.68f, -2.65f, -3.07f, -4.5f, -5.81f, -4.5f)
                horizontalLineToRelative(-4.13f)
                lineTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                lineTo(6.87f, 2f)
                curveTo(4.14f, 2f, 1.75f, 3.85f, 1.06f, 6.5f)
                curveToRelative(-0.16f, 0.6f, -0.02f, 1.23f, 0.36f, 1.72f)
                curveToRelative(0.38f, 0.49f, 0.96f, 0.78f, 1.59f, 0.78f)
                lineTo(20.99f, 9f)
                curveToRelative(0.62f, 0f, 1.2f, -0.28f, 1.59f, -0.78f)
                curveToRelative(0.38f, -0.49f, 0.51f, -1.12f, 0.36f, -1.72f)
                close()
                moveTo(20f, 11f)
                lineTo(4f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.41f)
                curveToRelative(0f, 4.7f, 4.14f, 7.65f, 6.61f, 8.98f)
                curveToRelative(0.75f, 0.41f, 1.57f, 0.61f, 2.39f, 0.61f)
                reflectiveCurveToRelative(1.64f, -0.2f, 2.39f, -0.61f)
                curveToRelative(2.47f, -1.34f, 6.61f, -4.28f, 6.61f, -8.98f)
                verticalLineToRelative(-2.41f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Acorn = it}
