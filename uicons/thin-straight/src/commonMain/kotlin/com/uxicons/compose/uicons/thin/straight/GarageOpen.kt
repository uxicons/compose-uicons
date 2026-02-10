package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Ts.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.05f, 8.03f)
                lineTo(13.54f, 0.57f)
                curveToRelative(-0.91f, -0.72f, -2.18f, -0.72f, -3.09f, 0f)
                lineTo(0.95f, 8.03f)
                curveToRelative(-0.61f, 0.48f, -0.95f, 1.19f, -0.95f, 1.97f)
                verticalLineToRelative(14f)
                lineTo(5f, 24f)
                lineTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(5f)
                lineTo(24f, 10f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.95f, -1.97f)
                close()
                moveTo(5f, 14f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(5f, 14f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-3f)
                lineTo(20f, 12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                lineTo(1f, 23f)
                lineTo(1f, 10f)
                curveToRelative(0f, -0.46f, 0.21f, -0.89f, 0.57f, -1.18f)
                lineTo(11.07f, 1.35f)
                curveToRelative(0.55f, -0.43f, 1.31f, -0.43f, 1.85f, 0f)
                lineToRelative(9.5f, 7.47f)
                curveToRelative(0.36f, 0.29f, 0.57f, 0.72f, 0.57f, 1.18f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _GarageOpen = it}
