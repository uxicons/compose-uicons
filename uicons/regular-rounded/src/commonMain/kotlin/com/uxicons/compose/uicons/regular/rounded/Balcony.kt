package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balcony: ImageVector? = null

val Icons.Rr.Balcony: ImageVector
    get() = _Balcony ?: UXIcon(name = "Balcony") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineToRelative(-1f)
                lineTo(20f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2.5f)
                lineTo(6f, 12f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 12f)
                close()
                moveTo(15.5f, 12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2.5f)
                lineTo(15.5f, 12f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                lineTo(6f, 10f)
                lineTo(6f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                lineTo(20f, 12f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Balcony = it}
