package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputNumeric: ImageVector? = null

val Icons.Tr.InputNumeric: ImageVector
    get() = _InputNumeric ?: UXIcon(name = "InputNumeric") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 7.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.79f)
                lineToRelative(-1.15f, 1.15f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2f, -2f)
                curveToRelative(0.14f, -0.14f, 0.36f, -0.19f, 0.55f, -0.11f)
                reflectiveCurveToRelative(0.31f, 0.26f, 0.31f, 0.46f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 7.5f)
                curveTo(0f, 5.02f, 2.02f, 3f, 4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(23f, 7.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 7.5f)
                close()
            }
        }.also { _InputNumeric = it}
