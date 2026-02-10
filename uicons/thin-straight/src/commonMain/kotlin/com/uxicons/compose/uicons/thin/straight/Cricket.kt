package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cricket: ImageVector? = null

val Icons.Ts.Cricket: ImageVector
    get() = _Cricket ?: UXIcon(name = "Cricket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.9f, 11.26f)
                curveToRelative(-1.22f, -1.23f, -1.22f, -3.22f, 0.0f, -4.45f)
                lineToRelative(3.85f, -3.85f)
                lineToRelative(1.52f, 1.52f)
                lineToRelative(0.71f, -0.71f)
                lineTo(20.23f, 0.02f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.52f, 1.52f)
                lineToRelative(-3.85f, 3.85f)
                curveToRelative(-1.23f, 1.23f, -3.22f, 1.23f, -4.45f, 0.0f)
                lineToRelative(-0.35f, -0.35f)
                lineTo(0.28f, 17.86f)
                reflectiveCurveTo(-0.01f, 18.74f, -0.0f, 19.68f)
                curveToRelative(0.01f, 0.95f, 0.26f, 2.14f, 1.22f, 3.1f)
                curveToRelative(0.98f, 0.98f, 2.18f, 1.22f, 3.14f, 1.22f)
                curveToRelative(0.92f, 0f, 1.78f, -0.28f, 1.78f, -0.28f)
                lineToRelative(12.11f, -12.11f)
                lineToRelative(-0.35f, -0.35f)
                close()
                moveTo(5.6f, 22.84f)
                curveToRelative(-0.47f, 0.12f, -2.38f, 0.52f, -3.68f, -0.77f)
                curveToRelative(-1.29f, -1.29f, -0.89f, -3.21f, -0.77f, -3.68f)
                lineTo(9.31f, 10.25f)
                curveToRelative(0.57f, 0.61f, 0.69f, 1.38f, 0.69f, 1.93f)
                verticalLineToRelative(1.83f)
                horizontalLineToRelative(1.92f)
                curveToRelative(0.51f, 0.01f, 1.23f, 0.13f, 1.84f, 0.69f)
                lineTo(5.6f, 22.84f)
                close()
                moveTo(14.46f, 13.98f)
                curveToRelative(-0.67f, -0.63f, -1.54f, -0.97f, -2.54f, -0.98f)
                horizontalLineToRelative(-0.92f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0f, -1.05f, -0.34f, -1.95f, -0.98f, -2.63f)
                lineToRelative(2.39f, -2.39f)
                curveToRelative(1.08f, 0.84f, 2.48f, 1.08f, 3.74f, 0.7f)
                curveToRelative(-0.37f, 1.26f, -0.14f, 2.66f, 0.7f, 3.74f)
                lineToRelative(-2.39f, 2.39f)
                close()
                moveTo(21f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(21f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Cricket = it}
