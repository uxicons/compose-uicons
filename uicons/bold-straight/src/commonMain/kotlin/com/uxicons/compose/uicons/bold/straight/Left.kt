package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Bs.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 24.04f)
                lineTo(0.98f, 14.35f)
                curveTo(0.34f, 13.71f, 0f, 12.88f, 0f, 12f)
                curveToRelative(0f, -0.88f, 0.35f, -1.71f, 0.97f, -2.33f)
                horizontalLineToRelative(0.02f)
                reflectiveCurveTo(11f, -0.01f, 11f, -0.01f)
                verticalLineTo(7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(10f)
                horizontalLineTo(11f)
                verticalLineToRelative(7.04f)
                close()
                moveTo(3.08f, 11.8f)
                curveToRelative(-0.07f, 0.07f, -0.08f, 0.15f, -0.08f, 0.2f)
                reflectiveCurveToRelative(0.01f, 0.14f, 0.09f, 0.21f)
                lineToRelative(4.91f, 4.75f)
                verticalLineToRelative(-2.96f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2.95f)
                lineTo(3.08f, 11.8f)
                close()
            }
        }.also { _Left = it}
