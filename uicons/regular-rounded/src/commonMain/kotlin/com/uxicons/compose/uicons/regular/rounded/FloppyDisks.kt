package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDisks: ImageVector? = null

val Icons.Rr.FloppyDisks: ImageVector
    get() = _FloppyDisks ?: UXIcon(name = "FloppyDisks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.13f, 4.15f)
                lineToRelative(-3.24f, -3.27f)
                curveToRelative(-0.42f, -0.43f, -1.38f, -0.89f, -2.13f, -0.89f)
                horizontalLineToRelative(-8.76f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 6.27f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.87f, -2.11f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                lineTo(11f, 2f)
                close()
                moveTo(22f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(6f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.17f)
                lineToRelative(2.71f, 2.73f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.7f)
                verticalLineToRelative(8.73f)
                close()
                moveTo(18f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveTo(4.04f, 24f, 0f, 19.96f, 0f, 15f)
                lineTo(0f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(14f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 14f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _FloppyDisks = it}
