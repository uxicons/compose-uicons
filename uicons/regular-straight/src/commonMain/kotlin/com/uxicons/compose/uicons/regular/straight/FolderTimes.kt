package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTimes: ImageVector? = null

val Icons.Rs.FolderTimes: ImageVector
    get() = _FolderTimes ?: UXIcon(name = "FolderTimes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(12.24f, 2f)
                lineTo(8.24f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 22f)
                lineTo(4.52f, 22f)
                curveToRelative(-0.41f, -0.62f, -0.74f, -1.29f, -0.99f, -2f)
                horizontalLineToRelative(-1.52f)
                lineTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1.52f)
                curveToRelative(-0.25f, 0.71f, -0.58f, 1.38f, -0.99f, 2f)
                horizontalLineToRelative(4.52f)
                lineTo(24f, 5f)
                close()
                moveTo(2f, 6f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.76f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 6f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(13f, 16.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                close()
            }
        }.also { _FolderTimes = it}
