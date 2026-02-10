package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCircleInfo: ImageVector? = null

val Icons.Ss.FileCircleInfo: ImageVector
    get() = _FileCircleInfo ?: UXIcon(name = "FileCircleInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(13f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(11.07f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.46f, 0.4f, 2.82f, 1.08f, 4f)
                close()
            }
        }.also { _FileCircleInfo = it}
