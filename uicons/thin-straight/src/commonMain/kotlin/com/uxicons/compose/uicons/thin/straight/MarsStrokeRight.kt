package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Ts.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 10.94f)
                lineToRelative(-3.71f, -3.79f)
                lineToRelative(-0.71f, 0.7f)
                lineToRelative(3.57f, 3.65f)
                horizontalLineToRelative(-5.71f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.26f, -3.63f, -3.29f, -6.5f, -6.98f, -6.5f)
                curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                curveToRelative(3.69f, 0f, 6.72f, -2.87f, 6.98f, -6.5f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5.71f)
                lineToRelative(-3.57f, 3.65f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(3.7f, -3.79f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0.0f, -2.12f)
                close()
                moveTo(7f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(3.69f, 6f, 7f, 6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _MarsStrokeRight = it}
