package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderArchive: ImageVector? = null

val Icons.Ss.FolderArchive: ImageVector
    get() = _FolderArchive ?: UXIcon(name = "FolderArchive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.5f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(8.5f, 21f)
                lineTo(2.5f, 21f)
                lineTo(2.5f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                close()
                moveTo(6.5f, 19f)
                horizontalLineToRelative(-2f)
                lineTo(4.5f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(13f, 24f)
                horizontalLineToRelative(11f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(21.5f, 21f)
                horizontalLineToRelative(-6f)
                lineTo(15.5f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                close()
                moveTo(19.5f, 19f)
                horizontalLineToRelative(-2f)
                lineTo(17.5f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _FolderArchive = it}
