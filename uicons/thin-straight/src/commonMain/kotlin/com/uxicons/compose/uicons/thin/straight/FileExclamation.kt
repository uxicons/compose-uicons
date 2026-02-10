package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExclamation: ImageVector? = null

val Icons.Ts.FileExclamation: ImageVector
    get() = _FileExclamation ?: UXIcon(name = "FileExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 7.29f)
                verticalLineToRelative(16.71f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _FileExclamation = it}
