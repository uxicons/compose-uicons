package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilesMedical: ImageVector? = null

val Icons.Ss.FilesMedical: ImageVector
    get() = _FilesMedical ?: UXIcon(name = "FilesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(17f)
                reflectiveCurveToRelative(13f, 0f, 13f, 0f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 0.14f)
                verticalLineToRelative(3.86f)
                horizontalLineToRelative(3.86f)
                lineTo(18f, 0.14f)
                close()
                moveTo(22f, 6f)
                verticalLineToRelative(13f)
                lineTo(7f, 19f)
                lineTo(7f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                close()
                moveTo(18f, 10f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FilesMedical = it}
