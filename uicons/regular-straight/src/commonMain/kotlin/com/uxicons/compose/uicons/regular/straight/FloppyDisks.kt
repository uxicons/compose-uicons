package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDisks: ImageVector? = null

val Icons.Rs.FloppyDisks: ImageVector
    get() = _FloppyDisks ?: UXIcon(name = "FloppyDisks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(13.5f, 14f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.12f, 3.98f)
                lineToRelative(-3.1f, -3.11f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                lineTo(7f, -0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(20f)
                lineTo(24f, 6.11f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(10f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22f, 18f)
                lineTo(6f, 18f)
                lineTo(6f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                lineTo(18f, 2.01f)
                curveToRelative(0.23f, 0.02f, 0.44f, 0.13f, 0.6f, 0.29f)
                lineToRelative(3.1f, 3.11f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                verticalLineToRelative(11.89f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(17f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(16.82f)
                close()
            }
        }.also { _FloppyDisks = it}
