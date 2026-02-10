package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseMedical: ImageVector? = null

val Icons.Ts.HouseMedical: ImageVector
    get() = _HouseMedical ?: UXIcon(name = "HouseMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 8.02f)
                lineTo(13.54f, 0.55f)
                curveToRelative(-0.91f, -0.72f, -2.18f, -0.72f, -3.09f, 0f)
                lineTo(0.95f, 8.02f)
                curveToRelative(-0.61f, 0.48f, -0.95f, 1.19f, -0.95f, 1.97f)
                verticalLineToRelative(14f)
                lineTo(24f, 23.98f)
                lineTo(24f, 9.98f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.95f, -1.97f)
                close()
                moveTo(23f, 22.98f)
                lineTo(1f, 22.98f)
                lineTo(1f, 9.98f)
                curveToRelative(0f, -0.46f, 0.21f, -0.89f, 0.57f, -1.18f)
                lineTo(11.07f, 1.34f)
                curveToRelative(0.55f, -0.43f, 1.31f, -0.43f, 1.85f, 0f)
                lineToRelative(9.5f, 7.47f)
                curveToRelative(0.36f, 0.29f, 0.57f, 0.72f, 0.57f, 1.18f)
                verticalLineToRelative(13f)
                close()
                moveTo(14f, 7.98f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                lineTo(6f, 11.98f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                lineTo(14f, 7.98f)
                close()
                moveTo(17f, 12.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                lineTo(7f, 14.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _HouseMedical = it}
