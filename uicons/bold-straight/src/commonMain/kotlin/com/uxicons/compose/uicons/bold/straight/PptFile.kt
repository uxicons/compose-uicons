package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PptFile: ImageVector? = null

val Icons.Bs.PptFile: ImageVector
    get() = _PptFile ?: UXIcon(name = "PptFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.26f, 5.72f)
                lineToRelative(-0.01f, -1.47f)
                horizontalLineToRelative(0.71f)
                curveToRelative(0.41f, 0f, 0.76f, 0.34f, 0.76f, 0.73f)
                reflectiveCurveToRelative(-0.35f, 0.73f, -0.76f, 0.73f)
                lineToRelative(-0.71f, 0.0f)
                close()
                moveTo(10.45f, 5.72f)
                curveToRelative(0.41f, 0f, 0.76f, -0.34f, 0.76f, -0.73f)
                reflectiveCurveToRelative(-0.35f, -0.73f, -0.76f, -0.73f)
                horizontalLineToRelative(-0.71f)
                lineToRelative(0.01f, 1.47f)
                lineToRelative(0.71f, -0.0f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(14.5f)
                lineToRelative(-6.5f, 6.5f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(13.62f, 4.25f)
                horizontalLineToRelative(1.38f)
                verticalLineToRelative(4.82f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-4.82f)
                horizontalLineToRelative(1.38f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(8.48f, 9.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.72f, -0.0f)
                curveToRelative(1.11f, 0f, 2.01f, -0.89f, 2.01f, -1.99f)
                reflectiveCurveToRelative(-0.9f, -1.99f, -2.01f, -1.99f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6.07f)
                close()
                moveTo(3.0f, 9.07f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-2.1f)
                lineToRelative(0.72f, -0.0f)
                curveToRelative(1.11f, 0f, 2.01f, -0.89f, 2.01f, -1.99f)
                reflectiveCurveToRelative(-0.9f, -1.99f, -2.01f, -1.99f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(6.07f)
                close()
                moveTo(21.0f, 11f)
                lineTo(3f, 11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _PptFile = it}
