package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResponsiveDesign: ImageVector? = null

val Icons.Rs.ResponsiveDesign: ImageVector
    get() = _ResponsiveDesign ?: UXIcon(name = "ResponsiveDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(21f, 7f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.02f, 0f, -1.92f, 0.51f, -2.46f, 1.29f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.1f, -0.45f, 0.48f, -0.8f, 0.96f, -0.8f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.59f)
                lineToRelative(8.59f, 8.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.59f)
                lineToRelative(-8.59f, -8.59f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(7f, 20f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ResponsiveDesign = it}
