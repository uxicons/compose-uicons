package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilesMedical: ImageVector? = null

val Icons.Rs.FilesMedical: ImageVector
    get() = _FilesMedical ?: UXIcon(name = "FilesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 4.14f)
                lineTo(17.86f, 0f)
                horizontalLineToRelative(-7.86f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4f)
                lineTo(22f, 4.14f)
                close()
                moveTo(16f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(3f)
                close()
                moveTo(9f, 17f)
                lineTo(9f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(15.5f, 10f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _FilesMedical = it}
