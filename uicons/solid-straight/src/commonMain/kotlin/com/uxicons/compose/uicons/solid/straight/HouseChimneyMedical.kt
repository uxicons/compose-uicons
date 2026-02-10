package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyMedical: ImageVector? = null

val Icons.Ss.HouseChimneyMedical: ImageVector
    get() = _HouseChimneyMedical ?: UXIcon(name = "HouseChimneyMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-0.87f, -0.68f)
                horizontalLineToRelative(0.02f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.45f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveToRelative(-0.73f, 0.57f, -1.15f, 1.44f, -1.15f, 2.36f)
                verticalLineToRelative(13.96f)
                lineTo(24f, 24f)
                lineTo(24f, 10.04f)
                curveToRelative(0f, -0.93f, -0.42f, -1.79f, -1.15f, -2.36f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
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
            }
        }.also { _HouseChimneyMedical = it}
