package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderArchive: ImageVector? = null

val Icons.Rs.FolderArchive: ImageVector
    get() = _FolderArchive ?: UXIcon(name = "FolderArchive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 20f)
                horizontalLineToRelative(5f)
                lineTo(9f, 10f)
                lineTo(4f, 10f)
                verticalLineToRelative(10f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(4.5f, 6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.3f, -2f, 0.78f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(11f, 22f)
                close()
                moveTo(22f, 22f)
                lineTo(13f, 22f)
                lineTo(13f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(15f, 20f)
                horizontalLineToRelative(5f)
                lineTo(20f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(10f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15.5f, 6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _FolderArchive = it}
