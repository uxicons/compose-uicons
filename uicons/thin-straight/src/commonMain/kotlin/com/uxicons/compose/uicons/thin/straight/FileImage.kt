package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Ts.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
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
                moveTo(3f, 2.5f)
                verticalLineToRelative(19.29f)
                lineToRelative(7.5f, -7.5f)
                lineToRelative(4f, 4f)
                lineToRelative(6.5f, -6.5f)
                verticalLineToRelative(-3.79f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(-9.79f)
                lineToRelative(-6.5f, 6.5f)
                lineToRelative(-4f, -4f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(17.79f)
                close()
            }
        }.also { _FileImage = it}
