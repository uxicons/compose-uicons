package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDisks: ImageVector? = null

val Icons.Ts.FloppyDisks: ImageVector
    get() = _FloppyDisks ?: UXIcon(name = "FloppyDisks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 23f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -0.89f, 0.39f, -1.68f, 1f, -2.23f)
                verticalLineToRelative(19.23f)
                close()
                moveTo(24f, 5.17f)
                verticalLineToRelative(15.84f)
                lineTo(3f, 21f)
                lineTo(3f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(12.84f)
                lineToRelative(5.17f, 5.17f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(9f)
                lineTo(17f, 1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6f)
                close()
                moveTo(23f, 5.58f)
                lineToRelative(-4.58f, -4.58f)
                horizontalLineToRelative(-0.42f)
                verticalLineToRelative(7f)
                lineTo(7f, 8f)
                lineTo(7f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(19f)
                lineTo(23f, 5.58f)
                close()
                moveTo(16f, 14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _FloppyDisks = it}
