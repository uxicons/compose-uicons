package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Tr.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.02f, 5.83f)
                lineTo(14.52f, 0.77f)
                curveToRelative(-1.53f, -1.03f, -3.5f, -1.03f, -5.03f, 0f)
                lineTo(1.98f, 5.83f)
                curveToRelative(-1.24f, 0.84f, -1.98f, 2.23f, -1.98f, 3.73f)
                verticalLineToRelative(9.94f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(5f, 14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 9.56f)
                curveToRelative(0f, -1.5f, -0.74f, -2.89f, -1.98f, -3.73f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(5f, 13f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.76f, -1.31f, 3.22f, -3f, 3.46f)
                lineTo(20f, 12.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(7.5f, 9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.46f)
                curveToRelative(-1.69f, -0.24f, -3f, -1.71f, -3f, -3.46f)
                lineTo(1f, 9.56f)
                curveToRelative(0f, -1.17f, 0.58f, -2.25f, 1.54f, -2.9f)
                lineTo(10.04f, 1.6f)
                curveToRelative(1.19f, -0.8f, 2.73f, -0.8f, 3.92f, 0f)
                lineToRelative(7.5f, 5.06f)
                curveToRelative(0.97f, 0.65f, 1.54f, 1.74f, 1.54f, 2.9f)
                verticalLineToRelative(9.94f)
                close()
            }
        }.also { _GarageOpen = it}
