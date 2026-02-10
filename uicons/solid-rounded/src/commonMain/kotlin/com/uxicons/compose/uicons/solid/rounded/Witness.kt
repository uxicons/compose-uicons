package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Witness: ImageVector? = null

val Icons.Sr.Witness: ImageVector
    get() = _Witness ?: UXIcon(name = "Witness") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 9f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(-15f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16.36f, 10.0f)
                curveToRelative(-0.73f, 0.01f, -1.38f, -0.64f, -1.36f, -1.38f)
                verticalLineToRelative(-6.12f)
                curveToRelative(-0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, -0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.15f)
                lineToRelative(-2.13f, 1.71f)
                curveToRelative(-0.27f, 0.19f, -0.57f, 0.29f, -0.86f, 0.29f)
                close()
                moveTo(14.82f, 16f)
                curveToRelative(-0.68f, -2.86f, -3.25f, -5f, -6.32f, -5f)
                reflectiveCurveToRelative(-5.64f, 2.14f, -6.32f, 5f)
                horizontalLineToRelative(12.64f)
                close()
            }
        }.also { _Witness = it}
