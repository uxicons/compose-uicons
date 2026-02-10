package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Effect: ImageVector? = null

val Icons.Ts.Effect: ImageVector
    get() = _Effect ?: UXIcon(name = "Effect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(16.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.28f, 0f, 2.39f, -0.7f, 3f, -1.73f)
                curveToRelative(0.61f, 1.03f, 1.72f, 1.73f, 3f, 1.73f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4.62f)
                lineToRelative(4.51f, 16.28f)
                curveToRelative(-1.25f, 0.53f, -2.13f, 1.78f, -2.13f, 3.22f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.14f, 0f, -0.27f, 0.03f, -0.4f, 0.04f)
                lineTo(15.66f, 1f)
                horizontalLineToRelative(8.34f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(3.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(12f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(9f, 17.05f)
                curveToRelative(-1.07f, 0.15f, -1.97f, 0.79f, -2.5f, 1.68f)
                curveToRelative(-0.53f, -0.89f, -1.43f, -1.52f, -2.5f, -1.68f)
                lineTo(4f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(16.05f)
                close()
            }
        }.also { _Effect = it}
