package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddImage: ImageVector? = null

val Icons.Ss.AddImage: ImageVector
    get() = _AddImage ?: UXIcon(name = "AddImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.59f, 16f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(6f)
                lineTo(0f, 22f)
                verticalLineToRelative(-4.04f)
                lineToRelative(7.69f, -7.69f)
                curveToRelative(0.32f, -0.32f, 0.84f, -0.32f, 1.16f, 0f)
                lineToRelative(5.73f, 5.73f)
                close()
                moveTo(16f, 7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6.28f, 8.85f)
                lineTo(0f, 15.13f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2.59f)
                lineToRelative(-5.73f, -5.74f)
                curveToRelative(-1.1f, -1.1f, -2.89f, -1.1f, -3.98f, 0f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _AddImage = it}
