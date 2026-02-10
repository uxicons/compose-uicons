package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseMedical: ImageVector? = null

val Icons.Ss.HouseMedical: ImageVector
    get() = _HouseMedical ?: UXIcon(name = "HouseMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 10.04f)
                verticalLineToRelative(13.96f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                curveToRelative(0f, -0.93f, 0.42f, -1.79f, 1.15f, -2.36f)
                lineTo(10.15f, 0.64f)
                curveToRelative(1.09f, -0.85f, 2.61f, -0.85f, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                curveToRelative(0.73f, 0.57f, 1.15f, 1.43f, 1.15f, 2.36f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _HouseMedical = it}
