package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Ts.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.02f, 5.89f)
                lineToRelative(1.96f, -2.75f)
                lineTo(20.86f, 0.03f)
                lineToRelative(-2.75f, 1.95f)
                lineToRelative(-0.4f, 3.6f)
                lineToRelative(-2.41f, 2.41f)
                horizontalLineToRelative(-7.29f)
                curveTo(3.59f, 8f, 0f, 11.59f, 0f, 16f)
                curveToRelative(0f, 2.14f, 0.83f, 4.15f, 2.34f, 5.66f)
                curveToRelative(1.51f, 1.51f, 3.52f, 2.34f, 5.66f, 2.34f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-7.29f)
                lineToRelative(2.41f, -2.41f)
                lineToRelative(3.6f, -0.4f)
                close()
                moveTo(19.05f, 2.54f)
                lineToRelative(1.7f, -1.21f)
                lineToRelative(1.92f, 1.92f)
                lineToRelative(-1.21f, 1.7f)
                lineToRelative(-2.71f, 0.3f)
                lineToRelative(0.3f, -2.71f)
                close()
                moveTo(15f, 16f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                curveToRelative(-1.87f, 0f, -3.63f, -0.73f, -4.95f, -2.05f)
                curveToRelative(-1.32f, -1.32f, -2.05f, -3.08f, -2.05f, -4.95f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                horizontalLineToRelative(6.29f)
                lineToRelative(-4.56f, 4.56f)
                curveToRelative(-0.49f, -0.35f, -1.09f, -0.56f, -1.74f, -0.56f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.65f, -0.21f, -1.25f, -0.56f, -1.74f)
                lineToRelative(4.56f, -4.56f)
                verticalLineToRelative(6.29f)
                close()
                moveTo(10f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Mandolin = it}
