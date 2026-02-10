package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointOfSaleBill: ImageVector? = null

val Icons.Rs.PointOfSaleBill: ImageVector
    get() = _PointOfSaleBill ?: UXIcon(name = "PointOfSaleBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(4f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(12.09f)
                lineToRelative(-3.13f, -1.9f)
                lineToRelative(-2.87f, 1.81f)
                lineToRelative(-2f, -1.26f)
                verticalLineToRelative(-2.43f)
                lineToRelative(2f, 1.25f)
                lineToRelative(2.8f, -1.76f)
                lineToRelative(1.2f, 0.73f)
                lineTo(22f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-2.25f, 0f, -4.11f, 1.67f, -4.43f, 3.84f)
                curveToRelative(0.57f, 0.55f, 0.93f, 1.31f, 0.93f, 2.16f)
                verticalLineToRelative(16f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.1f, 0.61f, -2.06f, 1.5f, -2.58f)
                verticalLineToRelative(-0.42f)
                curveTo(1.5f, 2.24f, 3.74f, 0f, 6.5f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-14f)
                close()
                moveTo(11.18f, 5.02f)
                curveToRelative(0.27f, -1.15f, 0.85f, -2.19f, 1.64f, -3.02f)
                horizontalLineToRelative(-6.32f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.06f, 0f, 0.12f, 0.01f, 0.18f, 0.02f)
                close()
            }
        }.also { _PointOfSaleBill = it}
