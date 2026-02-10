package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Sr.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.03f, 0.39f)
                curveToRelative(-0.34f, -0.09f, -0.96f, 0.04f, -1.09f, 0.6f)
                curveToRelative(-0.19f, 0.88f, -1.0f, 1.51f, -1.94f, 1.51f)
                curveToRelative(-0.93f, 0f, -1.64f, -0.66f, -1.94f, -1.5f)
                curveToRelative(-0.24f, -0.68f, -0.73f, -0.7f, -1.06f, -0.62f)
                curveTo(3.83f, 1.72f, 0f, 6.42f, 0f, 12f)
                reflectiveCurveToRelative(3.83f, 10.28f, 9f, 11.62f)
                curveToRelative(0.33f, 0.09f, 0.82f, 0.06f, 1.06f, -0.62f)
                curveToRelative(0.3f, -0.84f, 1.0f, -1.5f, 1.94f, -1.5f)
                curveToRelative(0.94f, 0f, 1.75f, 0.64f, 1.94f, 1.51f)
                curveToRelative(0.12f, 0.56f, 0.75f, 0.69f, 1.09f, 0.6f)
                curveToRelative(5.16f, -1.34f, 8.97f, -6.04f, 8.97f, -11.61f)
                reflectiveCurveTo(20.18f, 1.73f, 15.03f, 0.39f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 9f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(5f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(16f, 19f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(19f, 15f)
                lineTo(5f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Manhole = it}
