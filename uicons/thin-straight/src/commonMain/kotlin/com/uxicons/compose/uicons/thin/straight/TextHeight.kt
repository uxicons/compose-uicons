package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Ts.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1f)
                lineTo(11f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 1f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 4f)
                verticalLineToRelative(-1.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(18.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(20f, 22.71f)
                lineTo(20f, 8.29f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.29f, -3.29f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.15f, -3.15f)
                verticalLineToRelative(14.41f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                close()
            }
        }.also { _TextHeight = it}
