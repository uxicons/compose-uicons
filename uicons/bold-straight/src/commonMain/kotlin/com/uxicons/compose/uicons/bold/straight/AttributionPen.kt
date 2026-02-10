package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Bs.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(8.73f, 7.09f)
                lineToRelative(-5.73f, 0.91f)
                lineTo(0.62f, 17.23f)
                lineToRelative(5.28f, -5.28f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-5.28f, 5.28f)
                lineToRelative(9.26f, -2.36f)
                lineToRelative(0.91f, -5.73f)
                lineToRelative(-4.18f, -4.18f)
                close()
                moveTo(19.22f, 0.78f)
                curveToRelative(-1.04f, -1.04f, -2.72f, -1.04f, -3.76f, 0f)
                lineToRelative(-4.39f, 4.39f)
                lineToRelative(3.76f, 3.76f)
                lineToRelative(4.39f, -4.39f)
                curveToRelative(1.04f, -1.04f, 1.04f, -2.72f, 0f, -3.76f)
                close()
            }
        }.also { _AttributionPen = it}
