package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsDownCurve: ImageVector? = null

val Icons.Ts.ArrowsDownCurve: ImageVector
    get() = _ArrowsDownCurve ?: UXIcon(name = "ArrowsDownCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                lineTo(24f, 23f)
                close()
                moveTo(12f, 21f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                curveToRelative(7.3f, -0.0f, 11.79f, -5.23f, 11.98f, -5.45f)
                lineToRelative(-0.77f, -0.65f)
                curveToRelative(-0.04f, 0.05f, -4.38f, 5.09f, -11.21f, 5.09f)
                curveToRelative(-6.82f, 0f, -11.18f, -5.04f, -11.22f, -5.1f)
                lineTo(0.02f, 15.55f)
                curveToRelative(0.19f, 0.22f, 4.68f, 5.45f, 11.98f, 5.45f)
                close()
                moveTo(8.36f, 12.56f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.58f, 0.58f, 1.52f, 0.58f, 2.1f, 0f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.0f, -8.7f)
                horizontalLineToRelative(-1f)
                lineToRelative(0.0f, 8.7f)
                lineToRelative(-3.15f, -3.15f)
                close()
                moveTo(19f, 1.3f)
                lineTo(19f, 10f)
                horizontalLineToRelative(1f)
                lineTo(20f, 1.3f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.71f, -0.71f)
                lineTo(20.55f, 0.43f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.15f, -3.15f)
                close()
                moveTo(4f, 1.3f)
                lineTo(4f, 10f)
                horizontalLineToRelative(1f)
                lineTo(5f, 1.3f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(0.71f, -0.71f)
                lineTo(5.55f, 0.43f)
                curveTo(4.97f, -0.15f, 4.03f, -0.14f, 3.45f, 0.43f)
                lineTo(0.15f, 3.73f)
                lineToRelative(0.71f, 0.71f)
                lineTo(4f, 1.3f)
                close()
            }
        }.also { _ArrowsDownCurve = it}
