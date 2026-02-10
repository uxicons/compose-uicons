package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RightFromBracket: ImageVector? = null

val Icons.Sr.RightFromBracket: ImageVector
    get() = _RightFromBracket ?: UXIcon(name = "RightFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 24f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16.1f, 21.19f)
                lineToRelative(6.75f, -6.35f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.02f, -0.02f)
                curveToRelative(1.55f, -1.55f, 1.54f, -4.07f, -0.03f, -5.64f)
                lineToRelative(-6.75f, -6.28f)
                curveToRelative(-0.87f, -0.87f, -2.11f, -1.12f, -3.25f, -0.65f)
                curveToRelative(-1.13f, 0.47f, -1.84f, 1.52f, -1.85f, 2.75f)
                verticalLineToRelative(2.05f)
                lineToRelative(-2f, -0.01f)
                curveToRelative(-2.19f, 0f, -3.97f, 1.78f, -3.97f, 3.97f)
                verticalLineToRelative(1.98f)
                curveToRelative(0f, 2.19f, 1.78f, 3.97f, 3.96f, 3.97f)
                lineToRelative(2.04f, 0.02f)
                verticalLineToRelative(2.07f)
                curveToRelative(0.01f, 1.23f, 0.71f, 2.28f, 1.85f, 2.74f)
                curveToRelative(0.38f, 0.16f, 0.77f, 0.23f, 1.16f, 0.23f)
                curveToRelative(0.77f, 0f, 1.5f, -0.3f, 2.06f, -0.86f)
                close()
                moveTo(22.16f, 14.11f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _RightFromBracket = it}
