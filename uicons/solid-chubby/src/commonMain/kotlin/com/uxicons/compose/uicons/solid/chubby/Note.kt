package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Note: ImageVector? = null

val Icons.Sc.Note: ImageVector
    get() = _Note ?: UXIcon(name = "Note") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.43f, 17.04f)
                lineToRelative(-5.74f, 5.74f)
                curveToRelative(-0.09f, -2.74f, 0.08f, -4.59f, 0.2f, -5.51f)
                curveToRelative(1.07f, -0.14f, 3.23f, -0.36f, 5.54f, -0.23f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 0.95f, -0.06f, 1.99f, -0.15f, 3.06f)
                curveToRelative(-3.6f, -0.24f, -6.86f, 0.32f, -7.0f, 0.34f)
                curveToRelative(-0.4f, 0.07f, -0.72f, 0.37f, -0.8f, 0.77f)
                curveToRelative(-0.02f, 0.1f, -0.5f, 2.36f, -0.35f, 6.71f)
                curveToRelative(-0.94f, 0.07f, -1.85f, 0.12f, -2.69f, 0.12f)
                curveToRelative(-4.5f, 0f, -9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.03f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(8f, 17.5f)
                curveToRelative(0f, -1.07f, -0.43f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.43f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.43f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.43f, 1.5f, -1.5f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, -1.07f, -0.43f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.43f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.43f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.43f, 1.5f, -1.5f)
                close()
                moveTo(8f, 6.5f)
                curveToRelative(0f, -1.07f, -0.43f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.43f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.43f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.43f, 1.5f, -1.5f)
                close()
            }
        }.also { _Note = it}
