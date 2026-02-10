package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortNumericDown: ImageVector? = null

val Icons.Ts.SortNumericDown: ImageVector
    get() = _SortNumericDown ?: UXIcon(name = "SortNumericDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.62f, 18.12f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.72f, 4.72f)
                curveToRelative(-0.29f, 0.3f, -0.69f, 0.46f, -1.11f, 0.46f)
                reflectiveCurveToRelative(-0.81f, -0.16f, -1.11f, -0.46f)
                lineTo(0.68f, 18.82f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.62f, 4.62f)
                lineTo(6f, 0f)
                horizontalLineToRelative(1f)
                lineTo(7f, 22.73f)
                lineToRelative(4.62f, -4.62f)
                close()
                moveTo(16.86f, 3.85f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(3.07f, -3.15f)
                horizontalLineToRelative(0.71f)
                lineToRelative(0.08f, 0.5f)
                lineTo(20.0f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(19.0f, 1.65f)
                lineToRelative(-2.14f, 2.2f)
                close()
                moveTo(19f, 14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.74f, 0f, 1.43f, -0.27f, 1.95f, -0.72f)
                curveToRelative(-0.29f, 2.23f, -1.83f, 3.72f, -3.95f, 3.72f)
                verticalLineToRelative(1f)
                curveToRelative(2.9f, 0f, 5f, -2.31f, 5f, -5.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _SortNumericDown = it}
