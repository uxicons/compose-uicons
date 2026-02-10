package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileZipSave: ImageVector? = null

val Icons.Ss.FileZipSave: ImageVector
    get() = _FileZipSave ?: UXIcon(name = "FileZipSave") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(12f)
                lineTo(24f, 15f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(15f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(10f, 14f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(10f, 24f)
                lineTo(10f, 14f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 3f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 18f)
                verticalLineToRelative(-1f)
                lineToRelative(1f, -5f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, 5f)
                verticalLineToRelative(1f)
                lineTo(4f, 18f)
                close()
                moveTo(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
            }
        }.also { _FileZipSave = it}
