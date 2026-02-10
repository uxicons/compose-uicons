package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCircleInfo: ImageVector? = null

val Icons.Bs.FileCircleInfo: ImageVector
    get() = _FileCircleInfo ?: UXIcon(name = "FileCircleInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.14f, 19f)
                curveToRelative(0.19f, 1.09f, 0.59f, 2.1f, 1.16f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(12.38f, 0f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(3.36f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.03f, -0.5f, -0.03f)
                curveToRelative(-0.87f, 0f, -1.71f, 0.13f, -2.5f, 0.38f)
                verticalLineToRelative(-1.38f)
                horizontalLineToRelative(-5f)
                lineTo(10f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.14f)
                close()
            }
        }.also { _FileCircleInfo = it}
