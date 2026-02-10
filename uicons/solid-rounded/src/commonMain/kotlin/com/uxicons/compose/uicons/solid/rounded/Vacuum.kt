package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Sr.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(19f, 7.21f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -3.38f, -2.75f, -6.12f, -6.12f, -6.12f)
                curveToRelative(-3.03f, 0f, -5.57f, 2.17f, -6.05f, 5.16f)
                lineToRelative(-2.68f, 16.84f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.99f, 0f, 1.82f, -0.71f, 1.98f, -1.69f)
                lineToRelative(2.68f, -16.84f)
                curveToRelative(0.32f, -2.02f, 2.04f, -3.48f, 4.08f, -3.48f)
                curveToRelative(2.27f, 0f, 4.12f, 1.85f, 4.12f, 4.12f)
                verticalLineToRelative(0.88f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(1.02f)
                curveToRelative(-0.63f, -0.84f, -1.02f, -1.87f, -1.02f, -3f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.13f, 0f, 2.16f, 0.39f, 3f, 1.02f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -3.09f, -2.13f, -5.69f, -5f, -6.42f)
                close()
            }
        }.also { _Vacuum = it}
