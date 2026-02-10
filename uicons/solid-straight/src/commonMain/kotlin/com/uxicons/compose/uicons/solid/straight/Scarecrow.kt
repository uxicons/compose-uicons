package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scarecrow: ImageVector? = null

val Icons.Ss.Scarecrow: ImageVector
    get() = _Scarecrow ?: UXIcon(name = "Scarecrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(18f, 2f)
                verticalLineToRelative(2f)
                lineTo(6f, 4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.07f, -1.11f, 0.99f, -2f, 2.13f, -2f)
                horizontalLineToRelative(3.71f)
                curveToRelative(1.13f, 0f, 2.05f, 0.89f, 2.13f, 2f)
                horizontalLineToRelative(2.01f)
                close()
            }
        }.also { _Scarecrow = it}
