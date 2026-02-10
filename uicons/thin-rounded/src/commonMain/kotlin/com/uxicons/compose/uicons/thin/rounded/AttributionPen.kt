package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Tr.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(19.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(0.15f, 19.85f)
                curveToRelative(-0.12f, -0.12f, -0.17f, -0.3f, -0.13f, -0.47f)
                lineToRelative(1.72f, -7.34f)
                curveToRelative(0.3f, -1.29f, 1.28f, -2.34f, 2.55f, -2.74f)
                lineToRelative(3.94f, -1.24f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineTo(15.52f, 0.77f)
                curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
                curveToRelative(1.02f, 1.02f, 1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(-7.29f, 7.29f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(-1.24f, 3.94f)
                curveToRelative(-0.4f, 1.27f, -1.45f, 2.24f, -2.74f, 2.55f)
                lineToRelative(-7.34f, 1.72f)
                reflectiveCurveToRelative(-0.08f, 0.01f, -0.11f, 0.01f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                close()
                moveTo(9.14f, 8.56f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(7.09f, -7.09f)
                curveToRelative(0.63f, -0.63f, 0.63f, -1.67f, 0f, -2.3f)
                curveToRelative(-0.63f, -0.63f, -1.67f, -0.63f, -2.3f, 0f)
                lineToRelative(-7.09f, 7.09f)
                close()
                moveTo(1.39f, 17.91f)
                lineToRelative(3.76f, -3.76f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-3.76f, 3.76f)
                lineToRelative(5.64f, -1.32f)
                curveToRelative(0.95f, -0.22f, 1.72f, -0.94f, 2.02f, -1.87f)
                lineToRelative(1.16f, -3.68f)
                lineToRelative(-2.65f, -2.65f)
                lineToRelative(-3.68f, 1.16f)
                curveToRelative(-0.93f, 0.29f, -1.65f, 1.07f, -1.87f, 2.02f)
                lineToRelative(-1.32f, 5.64f)
                close()
            }
        }.also { _AttributionPen = it}
