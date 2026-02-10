package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddImage: ImageVector? = null

val Icons.Rs.AddImage: ImageVector
    get() = _AddImage ?: UXIcon(name = "AddImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 20f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10.13f)
                lineToRelative(4.28f, -4.28f)
                curveToRelative(1.1f, -1.1f, 2.89f, -1.1f, 3.98f, 0f)
                lineToRelative(5.73f, 5.74f)
                verticalLineToRelative(1.41f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(-5.73f, -5.73f)
                curveToRelative(-0.32f, -0.32f, -0.84f, -0.32f, -1.16f, 0f)
                lineToRelative(-5.69f, 5.69f)
                verticalLineToRelative(4.04f)
                close()
                moveTo(15f, 3.5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(15f, 5.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
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
            }
        }.also { _AddImage = it}
