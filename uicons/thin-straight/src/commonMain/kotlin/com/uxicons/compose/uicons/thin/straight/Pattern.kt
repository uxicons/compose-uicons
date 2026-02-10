package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pattern: ImageVector? = null

val Icons.Ts.Pattern: ImageVector
    get() = _Pattern ?: UXIcon(name = "Pattern") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(7f, 10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(7f, 5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(20f, 4f)
                close()
                moveTo(19f, 9f)
                horizontalLineToRelative(-4f)
                lineTo(15f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(3.29f, 16.5f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.71f, -3.71f)
                lineToRelative(-3.71f, -3.71f)
                lineToRelative(-3.71f, 3.71f)
                close()
                moveTo(7f, 18.79f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.29f, 2.29f)
                close()
                moveTo(12.97f, 20f)
                horizontalLineToRelative(8.05f)
                lineToRelative(-4.03f, -6.44f)
                lineToRelative(-4.03f, 6.44f)
                close()
                moveTo(14.77f, 19f)
                lineToRelative(2.22f, -3.56f)
                lineToRelative(2.22f, 3.56f)
                horizontalLineToRelative(-4.45f)
                close()
            }
        }.also { _Pattern = it}
