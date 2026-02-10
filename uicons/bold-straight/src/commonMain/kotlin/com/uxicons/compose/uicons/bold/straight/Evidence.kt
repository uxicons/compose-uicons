package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Evidence: ImageVector? = null

val Icons.Bs.Evidence: ImageVector
    get() = _Evidence ?: UXIcon(name = "Evidence") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21.88f)
                lineToRelative(-6.0f, -6.0f)
                curveToRelative(1.22f, -1.66f, 1.95f, -3.69f, 1.95f, -5.91f)
                curveToRelative(0f, -5.5f, -4.47f, -9.97f, -9.97f, -9.97f)
                reflectiveCurveToRelative(-9.97f, 4.47f, -9.97f, 9.97f)
                reflectiveCurveToRelative(4.47f, 9.97f, 9.97f, 9.97f)
                curveToRelative(2.21f, 0f, 4.25f, -0.73f, 5.91f, -1.95f)
                lineToRelative(6.0f, 6.0f)
                close()
                moveTo(2.99f, 9.97f)
                curveToRelative(0f, -3.85f, 3.13f, -6.98f, 6.98f, -6.98f)
                reflectiveCurveToRelative(6.98f, 3.13f, 6.98f, 6.98f)
                reflectiveCurveToRelative(-3.13f, 6.98f, -6.98f, 6.98f)
                reflectiveCurveToRelative(-6.98f, -3.13f, -6.98f, -6.98f)
                close()
                moveTo(14.99f, 8.69f)
                curveToRelative(0f, 0.7f, -0.5f, 2.31f, -0.5f, 2.31f)
                curveToRelative(0f, 0.0f, -3.01f, 0f, -3.01f, 0f)
                curveToRelative(-0.28f, -0.83f, -0.48f, -2.1f, -0.48f, -2.99f)
                curveToRelative(0f, -1.5f, 0.62f, -2.49f, 1.5f, -2.49f)
                curveToRelative(1.0f, 0f, 2.49f, 0.18f, 2.49f, 3.17f)
                close()
                moveTo(11.5f, 12f)
                horizontalLineToRelative(2.8f)
                curveToRelative(0f, 1.25f, -0.15f, 2.99f, -1.44f, 2.99f)
                curveToRelative(-0.73f, 0f, -1.36f, -0.63f, -1.36f, -1.5f)
                curveToRelative(0.01f, -0.31f, 0f, -1.5f, 0f, -1.5f)
                close()
                moveTo(9.01f, 8.01f)
                curveToRelative(0f, 0.89f, -0.21f, 2.16f, -0.48f, 2.99f)
                curveToRelative(0f, 0f, -3.01f, 0.0f, -3.01f, 0f)
                curveToRelative(0f, 0f, -0.5f, -1.61f, -0.5f, -2.31f)
                curveToRelative(0f, -2.99f, 1.5f, -3.17f, 2.49f, -3.17f)
                curveToRelative(0.87f, 0f, 1.5f, 1.0f, 1.5f, 2.49f)
                close()
                moveTo(8.51f, 12f)
                reflectiveCurveToRelative(-0.01f, 1.19f, 0f, 1.5f)
                curveToRelative(0f, 0.87f, -0.62f, 1.5f, -1.36f, 1.5f)
                curveToRelative(-1.29f, 0f, -1.44f, -1.75f, -1.44f, -2.99f)
                close()
            }
        }.also { _Evidence = it}
