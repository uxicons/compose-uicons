package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileZipSave: ImageVector? = null

val Icons.Bs.FileZipSave: ImageVector
    get() = _FileZipSave ?: UXIcon(name = "FileZipSave") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 21f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(14.38f, 0f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(4.34f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 21f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(6f, 13f)
                lineToRelative(-1f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                lineToRelative(-1f, -5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(9f)
                lineTo(12f, 24f)
                lineTo(12f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                lineToRelative(3f, 3f)
                close()
                moveTo(20f, 20f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FileZipSave = it}
