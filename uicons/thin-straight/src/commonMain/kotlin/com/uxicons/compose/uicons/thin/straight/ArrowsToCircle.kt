package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToCircle: ImageVector? = null

val Icons.Ts.ArrowsToCircle: ImageVector
    get() = _ArrowsToCircle ?: UXIcon(name = "ArrowsToCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(8.29f, 9f)
                lineTo(0.06f, 0.77f)
                lineTo(0.77f, 0.06f)
                lineTo(8.99f, 8.28f)
                lineToRelative(0.01f, -5.28f)
                lineToRelative(1f, 0.0f)
                lineToRelative(-0.01f, 5.51f)
                curveToRelative(0f, 0.82f, -0.67f, 1.49f, -1.49f, 1.49f)
                lineTo(3f, 10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.29f)
                close()
                moveTo(14.01f, 8.51f)
                lineToRelative(-0.01f, -5.51f)
                lineToRelative(1f, -0.0f)
                lineToRelative(0.01f, 5.28f)
                lineTo(23.23f, 0.06f)
                lineToRelative(0.71f, 0.71f)
                lineTo(15.71f, 9f)
                horizontalLineToRelative(5.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.82f, 0f, -1.49f, -0.67f, -1.49f, -1.49f)
                close()
                moveTo(10f, 15.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.29f)
                lineTo(0.75f, 23.95f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(8.28f, 15.01f)
                lineToRelative(-5.28f, -0.01f)
                lineToRelative(0.0f, -1f)
                lineToRelative(5.51f, 0.01f)
                curveToRelative(0.82f, 0f, 1.49f, 0.67f, 1.49f, 1.49f)
                close()
                moveTo(23.24f, 23.95f)
                lineTo(15.01f, 15.72f)
                lineToRelative(-0.01f, 5.28f)
                lineToRelative(-1f, -0.0f)
                lineToRelative(0.01f, -5.51f)
                curveToRelative(0f, -0.82f, 0.67f, -1.49f, 1.49f, -1.49f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.29f)
                lineToRelative(8.24f, 8.24f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _ArrowsToCircle = it}
