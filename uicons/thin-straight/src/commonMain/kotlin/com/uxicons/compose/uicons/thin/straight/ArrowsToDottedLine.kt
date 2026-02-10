package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDottedLine: ImageVector? = null

val Icons.Ts.ArrowsToDottedLine: ImageVector
    get() = _ArrowsToDottedLine ?: UXIcon(name = "ArrowsToDottedLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(6f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(2f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12.5f, 7.78f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 7.78f)
                lineToRelative(-3.77f, -3.77f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.79f, 3.79f)
                curveToRelative(0.32f, 0.32f, 0.73f, 0.49f, 1.18f, 0.49f)
                reflectiveCurveToRelative(0.86f, -0.17f, 1.18f, -0.49f)
                lineToRelative(3.79f, -3.79f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.77f, 3.77f)
                close()
                moveTo(10.82f, 15.49f)
                lineToRelative(-3.79f, 3.79f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.77f, -3.77f)
                verticalLineToRelative(7.78f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.78f)
                lineToRelative(3.77f, 3.77f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(-0.63f, -0.63f, -1.73f, -0.63f, -2.36f, 0f)
                close()
            }
        }.also { _ArrowsToDottedLine = it}
