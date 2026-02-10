package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUser: ImageVector? = null

val Icons.Ss.FileUser: ImageVector
    get() = _FileUser ?: UXIcon(name = "FileUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.03f, 7f)
                horizontalLineToRelative(-7f)
                lineTo(15.03f, 0f)
                lineTo(5.03f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(3.97f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6.03f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(22.03f, 7f)
                close()
                moveTo(12.03f, 17f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(21.44f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17.03f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(14.03f, 13f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16.03f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8.03f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _FileUser = it}
