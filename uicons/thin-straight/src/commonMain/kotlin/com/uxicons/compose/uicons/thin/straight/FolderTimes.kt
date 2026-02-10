package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTimes: ImageVector? = null

val Icons.Ts.FolderTimes: ImageVector
    get() = _FolderTimes ?: UXIcon(name = "FolderTimes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                lineTo(12.12f, 3f)
                lineTo(8.12f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                lineTo(0f, 23f)
                lineTo(6.72f, 23f)
                curveToRelative(-0.35f, -0.3f, -0.67f, -0.64f, -0.96f, -1f)
                lineTo(1f, 22f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4.76f)
                curveToRelative(-0.29f, 0.36f, -0.61f, 0.69f, -0.96f, 1f)
                horizontalLineToRelative(6.72f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 7f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.88f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 7f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(12.5f, 16.79f)
                lineToRelative(1.35f, 1.35f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-1.65f, -1.65f)
                verticalLineToRelative(-3.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.79f)
                close()
            }
        }.also { _FolderTimes = it}
