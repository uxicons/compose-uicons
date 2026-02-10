package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Ts.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 10.02f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 1.29f)
                lineToRelative(3.65f, 3.57f)
                lineToRelative(0.7f, -0.71f)
                lineTo(13.06f, 0.44f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, -0.0f)
                lineToRelative(-3.79f, 3.71f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(3.65f, -3.57f)
                lineTo(11.5f, 7f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.02f)
                curveToRelative(-3.63f, 0.26f, -6.5f, 3.29f, -6.5f, 6.98f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -3.69f, -2.87f, -6.72f, -6.5f, -6.98f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _MarsStrokeUp = it}
