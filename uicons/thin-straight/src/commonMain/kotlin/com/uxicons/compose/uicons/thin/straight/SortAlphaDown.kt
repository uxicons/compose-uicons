package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlphaDown: ImageVector? = null

val Icons.Ts.SortAlphaDown: ImageVector
    get() = _SortAlphaDown ?: UXIcon(name = "SortAlphaDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.32f, 18.82f)
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
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(4.89f)
                lineToRelative(-4.89f, 6.84f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(4.89f, -6.84f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(22f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 5f)
                lineTo(21f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _SortAlphaDown = it}
