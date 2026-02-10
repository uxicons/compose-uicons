package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpFromBracket: ImageVector? = null

val Icons.Sr.UpFromBracket: ImageVector
    get() = _UpFromBracket ?: UXIcon(name = "UpFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(16.97f, 15.01f)
                lineToRelative(0.02f, -2.04f)
                horizontalLineToRelative(2.07f)
                curveToRelative(1.23f, -0.01f, 2.28f, -0.71f, 2.74f, -1.85f)
                reflectiveCurveToRelative(0.22f, -2.38f, -0.63f, -3.22f)
                lineTo(14.84f, 1.16f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.01f, -0.02f, -0.02f)
                curveToRelative(-1.55f, -1.55f, -4.07f, -1.54f, -5.64f, 0.03f)
                lineTo(2.9f, 7.91f)
                curveToRelative(-0.87f, 0.87f, -1.12f, 2.11f, -0.65f, 3.25f)
                curveToRelative(0.47f, 1.13f, 1.52f, 1.84f, 2.75f, 1.85f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-0.01f, 2f)
                curveToRelative(0f, 2.19f, 1.78f, 3.97f, 3.97f, 3.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(2.19f, 0f, 3.97f, -1.78f, 3.97f, -3.96f)
                close()
            }
        }.also { _UpFromBracket = it}
