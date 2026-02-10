package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Ts.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(19.5f, 23f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(10.08f, 17.56f)
                lineTo(0.1f, 19.9f)
                lineTo(2.44f, 9.92f)
                lineToRelative(5.72f, -1.8f)
                lineTo(15.52f, 0.77f)
                curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
                curveToRelative(1.02f, 1.02f, 1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(-7.36f, 7.36f)
                lineToRelative(-1.8f, 5.72f)
                close()
                moveTo(9.14f, 8.56f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(7.09f, -7.09f)
                curveToRelative(0.63f, -0.63f, 0.63f, -1.67f, 0f, -2.3f)
                curveToRelative(-0.63f, -0.63f, -1.67f, -0.63f, -2.3f, 0f)
                lineToRelative(-7.09f, 7.09f)
                close()
                moveTo(9.3f, 16.71f)
                lineToRelative(1.57f, -5.01f)
                lineToRelative(-2.58f, -2.58f)
                lineToRelative(-5.01f, 1.57f)
                lineToRelative(-1.62f, 6.93f)
                lineToRelative(4.49f, -4.49f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.49f, 4.49f)
                lineToRelative(6.93f, -1.62f)
                close()
            }
        }.also { _AttributionPen = it}
