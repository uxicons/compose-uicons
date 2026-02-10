package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextInputLeft: ImageVector? = null

val Icons.Ss.TextInputLeft: ImageVector
    get() = _TextInputLeft ?: UXIcon(name = "TextInputLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                reflectiveCurveTo(4.5f, 0f, 4.5f, 0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.77f, 0f, 1.47f, 0.3f, 2f, 0.78f)
                curveTo(8.53f, 0.3f, 9.23f, 0f, 10f, 0f)
                horizontalLineToRelative(1.5f)
                reflectiveCurveToRelative(0f, 2f, 0f, 2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(15f)
                lineTo(7f, 21f)
                lineTo(7f, 3f)
                lineTo(3f, 3f)
                curveTo(1.35f, 3f, 0f, 4.35f, 0f, 6f)
                close()
                moveTo(6f, 22f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.77f, 0f, 1.47f, -0.3f, 2f, -0.78f)
                curveToRelative(0.53f, 0.48f, 1.23f, 0.78f, 2f, 0.78f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15f)
                reflectiveCurveToRelative(-15f, 0f, -15f, 0f)
                lineTo(9f, 3f)
                close()
                moveTo(13f, 9f)
                horizontalLineToRelative(3f)
                reflectiveCurveToRelative(0f, 8f, 0f, 8f)
                horizontalLineToRelative(2f)
                lineTo(18f, 9f)
                reflectiveCurveToRelative(3f, 0f, 3f, 0f)
                verticalLineToRelative(-2f)
                lineTo(13f, 7f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TextInputLeft = it}
